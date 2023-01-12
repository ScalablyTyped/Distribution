package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEmails extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Emails
}
object ApplicationjsonEmails {
  
  inline def apply(applicationSlashjson: Emails): ApplicationjsonEmails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEmails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonEmails] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Emails): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
