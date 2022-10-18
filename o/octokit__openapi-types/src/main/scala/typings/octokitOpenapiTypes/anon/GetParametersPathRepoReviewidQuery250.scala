package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathRepoReviewidQuery250 extends StObject {
  
  /** List comments for a specific pull request review. */
  var get: ParametersPathRepoReviewidQuery250
}
object GetParametersPathRepoReviewidQuery250 {
  
  inline def apply(get: ParametersPathRepoReviewidQuery250): GetParametersPathRepoReviewidQuery250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathRepoReviewidQuery250]
  }
  
  extension [Self <: GetParametersPathRepoReviewidQuery250](x: Self) {
    
    inline def setGet(value: ParametersPathRepoReviewidQuery250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
