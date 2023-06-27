package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotSByte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SByteProperty
  extends StObject
     with AbstractProperty
     with Property {
  
  /**
    * The type name
    */
  var `type`: EdmDotSByte
}
object SByteProperty {
  
  inline def apply(name: String): SByteProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.SByte")
    __obj.asInstanceOf[SByteProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SByteProperty] (val x: Self) extends AnyVal {
    
    inline def setType(value: EdmDotSByte): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
