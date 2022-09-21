package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `494` extends StObject {
  
  /** If `true` pull requests are omitted from the response (empty array). */
  var exclude_pull_requests: js.UndefOr[Boolean] = js.undefined
}
object `494` {
  
  inline def apply(): `494` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`494`]
  }
  
  extension [Self <: `494`](x: Self) {
    
    inline def setExclude_pull_requests(value: Boolean): Self = StObject.set(x, "exclude_pull_requests", value.asInstanceOf[js.Any])
    
    inline def setExclude_pull_requestsUndefined: Self = StObject.set(x, "exclude_pull_requests", js.undefined)
  }
}
