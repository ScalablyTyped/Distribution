package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expectedheadsha extends StObject {
  
  /** @description The expected SHA of the pull request's HEAD ref. This is the most recent commit on the pull request's branch. If the expected SHA does not match the pull request's HEAD, you will receive a `422 Unprocessable Entity` status. You can use the "[List commits](https://docs.github.com/rest/reference/repos#list-commits)" endpoint to find the most recent commit SHA. Default: SHA of the pull request's current HEAD ref. */
  var expected_head_sha: js.UndefOr[String] = js.undefined
}
object Expectedheadsha {
  
  inline def apply(): Expectedheadsha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expectedheadsha]
  }
  
  extension [Self <: Expectedheadsha](x: Self) {
    
    inline def setExpected_head_sha(value: String): Self = StObject.set(x, "expected_head_sha", value.asInstanceOf[js.Any])
    
    inline def setExpected_head_shaUndefined: Self = StObject.set(x, "expected_head_sha", js.undefined)
  }
}
