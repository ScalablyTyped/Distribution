package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotInt32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Int32Property
  extends StObject
     with AbstractProperty
     with Property {
  
  /**
    * The type name
    */
  var `type`: EdmDotInt32
}
object Int32Property {
  
  inline def apply(name: String): Int32Property = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.Int32")
    __obj.asInstanceOf[Int32Property]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Int32Property] (val x: Self) extends AnyVal {
    
    inline def setType(value: EdmDotInt32): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
