package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotSingle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleProperty
  extends StObject
     with AbstractProperty
     with Property {
  
  /**
    * The type name
    */
  var `type`: EdmDotSingle
}
object SingleProperty {
  
  inline def apply(name: String): SingleProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.Single")
    __obj.asInstanceOf[SingleProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleProperty] (val x: Self) extends AnyVal {
    
    inline def setType(value: EdmDotSingle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
