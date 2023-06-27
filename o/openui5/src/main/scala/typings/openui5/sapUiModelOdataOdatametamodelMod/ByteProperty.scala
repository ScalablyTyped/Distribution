package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotByte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteProperty
  extends StObject
     with AbstractProperty
     with Property {
  
  /**
    * The type name
    */
  var `type`: EdmDotByte
}
object ByteProperty {
  
  inline def apply(name: String): ByteProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.Byte")
    __obj.asInstanceOf[ByteProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ByteProperty] (val x: Self) extends AnyVal {
    
    inline def setType(value: EdmDotByte): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
