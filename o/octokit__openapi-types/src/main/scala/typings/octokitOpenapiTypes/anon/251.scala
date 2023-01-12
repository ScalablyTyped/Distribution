package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `251` extends StObject {
  
  /** @description The new Git author email. */
  var email: js.UndefOr[String] = js.undefined
  
  /** @description The new Git author name. */
  var name: js.UndefOr[String] = js.undefined
}
object `251` {
  
  inline def apply(): `251` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`251`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `251`] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
