package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotDouble
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleProperty
  extends StObject
     with AbstractProperty
     with Property {
  
  /**
    * The type name
    */
  var `type`: EdmDotDouble
}
object DoubleProperty {
  
  inline def apply(name: String): DoubleProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.Double")
    __obj.asInstanceOf[DoubleProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoubleProperty] (val x: Self) extends AnyVal {
    
    inline def setType(value: EdmDotDouble): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
