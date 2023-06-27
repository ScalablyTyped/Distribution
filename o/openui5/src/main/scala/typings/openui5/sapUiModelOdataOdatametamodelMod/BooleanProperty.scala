package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanProperty
  extends StObject
     with AbstractProperty
     with Property {
  
  /**
    * The type name
    */
  var `type`: EdmDotBoolean
}
object BooleanProperty {
  
  inline def apply(name: String): BooleanProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.Boolean")
    __obj.asInstanceOf[BooleanProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BooleanProperty] (val x: Self) extends AnyVal {
    
    inline def setType(value: EdmDotBoolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
