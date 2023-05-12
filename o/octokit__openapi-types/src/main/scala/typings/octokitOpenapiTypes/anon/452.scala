package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `452` extends StObject {
  
  var login: js.UndefOr[`451`] = js.undefined
}
object `452` {
  
  inline def apply(): `452` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`452`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `452`] (val x: Self) extends AnyVal {
    
    inline def setLogin(value: `451`): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
  }
}
