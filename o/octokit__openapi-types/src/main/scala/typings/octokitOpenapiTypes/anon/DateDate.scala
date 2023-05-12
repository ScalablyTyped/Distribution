package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateDate extends StObject {
  
  /** Format: date-time */
  var date: js.UndefOr[String] = js.undefined
  
  /** Format: email */
  var email: String | Null
  
  /** @description The git author's name. */
  var name: String
  
  var username: js.UndefOr[String] = js.undefined
}
object DateDate {
  
  inline def apply(name: String): DateDate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], email = null)
    __obj.asInstanceOf[DateDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateDate] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
