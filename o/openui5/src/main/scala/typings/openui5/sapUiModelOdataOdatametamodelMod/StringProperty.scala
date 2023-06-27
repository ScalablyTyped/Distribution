package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotString
import typings.openui5.openui5Strings.`false`
import typings.openui5.openui5Strings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringProperty
  extends StObject
     with AbstractProperty
     with Property {
  
  /**
    * Whether the string requires a fixed length
    */
  var fixedLength: js.UndefOr[`false` | `true`] = js.undefined
  
  /**
    * The maximal length of the string
    */
  var maxLength: js.UndefOr[String] = js.undefined
  
  /**
    * The type name
    */
  var `type`: EdmDotString
  
  /**
    * Whether Unicode characters are used instead of ASCII characters
    */
  var unicode: js.UndefOr[`false` | `true`] = js.undefined
}
object StringProperty {
  
  inline def apply(name: String): StringProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.String")
    __obj.asInstanceOf[StringProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringProperty] (val x: Self) extends AnyVal {
    
    inline def setFixedLength(value: `false` | `true`): Self = StObject.set(x, "fixedLength", value.asInstanceOf[js.Any])
    
    inline def setFixedLengthUndefined: Self = StObject.set(x, "fixedLength", js.undefined)
    
    inline def setMaxLength(value: String): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setType(value: EdmDotString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnicode(value: `false` | `true`): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
  }
}
