package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMentionscount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Mentionscount
}
object ApplicationjsonMentionscount {
  
  inline def apply(applicationSlashjson: Mentionscount): ApplicationjsonMentionscount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMentionscount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonMentionscount] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Mentionscount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
