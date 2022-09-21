package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.StringMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property Interface for context.parameters.[property_key], when property manifest type starts from SingleLine
  */
trait StringProperty
  extends StObject
     with Property {
  
  @JSName("attributes")
  var attributes_StringProperty: js.UndefOr[StringMetadata] = js.undefined
  
  @JSName("raw")
  var raw_StringProperty: String | Null
}
object StringProperty {
  
  inline def apply(error: Boolean, errorMessage: String, `type`: String): StringProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringProperty]
  }
  
  extension [Self <: StringProperty](x: Self) {
    
    inline def setAttributes(value: StringMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawNull: Self = StObject.set(x, "raw", null)
  }
}
