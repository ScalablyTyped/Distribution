package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateEmail extends StObject {
  
  var date: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object DateEmail {
  
  inline def apply(): DateEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateEmail]
  }
  
  extension [Self <: DateEmail](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
