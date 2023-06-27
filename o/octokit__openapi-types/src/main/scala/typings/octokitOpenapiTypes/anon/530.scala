package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `530` extends StObject {
  
  var login: js.UndefOr[`529`] = js.undefined
}
object `530` {
  
  inline def apply(): `530` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`530`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `530`] (val x: Self) extends AnyVal {
    
    inline def setLogin(value: `529`): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
  }
}
