package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLabelsArrayTotalcountNumber extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: LabelsArrayTotalcountNumber
}
object ApplicationjsonLabelsArrayTotalcountNumber {
  
  inline def apply(applicationSlashjson: LabelsArrayTotalcountNumber): ApplicationjsonLabelsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLabelsArrayTotalcountNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonLabelsArrayTotalcountNumber] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: LabelsArrayTotalcountNumber): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
