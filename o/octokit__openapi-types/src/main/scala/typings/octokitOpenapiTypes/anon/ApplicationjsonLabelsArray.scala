package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLabelsArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: LabelsArray
}
object ApplicationjsonLabelsArray {
  
  inline def apply(applicationSlashjson: LabelsArray): ApplicationjsonLabelsArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLabelsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonLabelsArray] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: LabelsArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
