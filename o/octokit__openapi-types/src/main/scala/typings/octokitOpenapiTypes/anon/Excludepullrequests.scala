package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Excludepullrequests extends StObject {
  
  /** If `true` pull requests are omitted from the response (empty array). */
  var exclude_pull_requests: js.UndefOr[Boolean] = js.undefined
}
object Excludepullrequests {
  
  inline def apply(): Excludepullrequests = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Excludepullrequests]
  }
  
  extension [Self <: Excludepullrequests](x: Self) {
    
    inline def setExclude_pull_requests(value: Boolean): Self = StObject.set(x, "exclude_pull_requests", value.asInstanceOf[js.Any])
    
    inline def setExclude_pull_requestsUndefined: Self = StObject.set(x, "exclude_pull_requests", js.undefined)
  }
}
