package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCvssvectorstringCweids extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CvssvectorstringCweids
}
object ApplicationjsonCvssvectorstringCweids {
  
  inline def apply(applicationSlashjson: CvssvectorstringCweids): ApplicationjsonCvssvectorstringCweids = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCvssvectorstringCweids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCvssvectorstringCweids] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: CvssvectorstringCweids): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
