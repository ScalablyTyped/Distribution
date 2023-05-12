package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `543` extends StObject {
  
  var exclude_pull_requests: js.UndefOr[Boolean] = js.undefined
}
object `543` {
  
  inline def apply(): `543` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`543`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `543`] (val x: Self) extends AnyVal {
    
    inline def setExclude_pull_requests(value: Boolean): Self = StObject.set(x, "exclude_pull_requests", value.asInstanceOf[js.Any])
    
    inline def setExclude_pull_requestsUndefined: Self = StObject.set(x, "exclude_pull_requests", js.undefined)
  }
}
