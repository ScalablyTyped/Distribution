package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonContenttypeCreatedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ContenttypeCreatedat
}
object ApplicationjsonContenttypeCreatedat {
  
  inline def apply(applicationSlashjson: ContenttypeCreatedat): ApplicationjsonContenttypeCreatedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonContenttypeCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonContenttypeCreatedat] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: ContenttypeCreatedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
