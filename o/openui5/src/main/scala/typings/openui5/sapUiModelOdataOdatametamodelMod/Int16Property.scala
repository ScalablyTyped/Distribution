package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotInt16
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Int16Property
  extends StObject
     with AbstractProperty
     with Property {
  
  /**
    * The type name
    */
  var `type`: EdmDotInt16
}
object Int16Property {
  
  inline def apply(name: String): Int16Property = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.Int16")
    __obj.asInstanceOf[Int16Property]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Int16Property] (val x: Self) extends AnyVal {
    
    inline def setType(value: EdmDotInt16): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
