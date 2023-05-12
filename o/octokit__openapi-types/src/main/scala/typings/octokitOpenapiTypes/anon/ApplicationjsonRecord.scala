package typings.octokitOpenapiTypes.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRecord extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Record[String, scala.Nothing]
}
object ApplicationjsonRecord {
  
  inline def apply(applicationSlashjson: Record[String, scala.Nothing]): ApplicationjsonRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRecord] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Record[String, scala.Nothing]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
