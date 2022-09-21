package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.NumberMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property Interface for context.parameters.[property_key], when property manifest type is Whole.None|FP|Decimal
  */
trait NumberProperty
  extends StObject
     with Property {
  
  @JSName("attributes")
  var attributes_NumberProperty: js.UndefOr[NumberMetadata] = js.undefined
  
  @JSName("raw")
  var raw_NumberProperty: Double | Null
}
object NumberProperty {
  
  inline def apply(error: Boolean, errorMessage: String, `type`: String): NumberProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberProperty]
  }
  
  extension [Self <: NumberProperty](x: Self) {
    
    inline def setAttributes(value: NumberMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRaw(value: Double): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawNull: Self = StObject.set(x, "raw", null)
  }
}
