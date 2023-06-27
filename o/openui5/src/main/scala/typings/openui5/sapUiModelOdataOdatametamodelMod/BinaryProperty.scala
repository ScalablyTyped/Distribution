package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotBinary
import typings.openui5.openui5Strings.`false`
import typings.openui5.openui5Strings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryProperty
  extends StObject
     with AbstractProperty
     with Property {
  
  /**
    * Whether the length can vary
    */
  var fixedLength: js.UndefOr[`false` | `true`] = js.undefined
  
  /**
    * The maximum size of the binary data
    */
  var maxLength: js.UndefOr[String] = js.undefined
  
  /**
    * The type name
    */
  var `type`: EdmDotBinary
}
object BinaryProperty {
  
  inline def apply(name: String): BinaryProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.Binary")
    __obj.asInstanceOf[BinaryProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinaryProperty] (val x: Self) extends AnyVal {
    
    inline def setFixedLength(value: `false` | `true`): Self = StObject.set(x, "fixedLength", value.asInstanceOf[js.Any])
    
    inline def setFixedLengthUndefined: Self = StObject.set(x, "fixedLength", js.undefined)
    
    inline def setMaxLength(value: String): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setType(value: EdmDotBinary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
