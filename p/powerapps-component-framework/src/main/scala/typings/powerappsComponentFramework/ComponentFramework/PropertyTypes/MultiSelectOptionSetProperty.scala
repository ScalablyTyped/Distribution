package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.OptionSetMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property Interface for context.parameters.[property_key], when property manifest type is MultiSelectOptionSet
  */
trait MultiSelectOptionSetProperty
  extends StObject
     with Property {
  
  @JSName("attributes")
  var attributes_MultiSelectOptionSetProperty: js.UndefOr[OptionSetMetadata] = js.undefined
  
  @JSName("raw")
  var raw_MultiSelectOptionSetProperty: js.Array[Double] | Null
}
object MultiSelectOptionSetProperty {
  
  inline def apply(error: Boolean, errorMessage: String, `type`: String): MultiSelectOptionSetProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectOptionSetProperty]
  }
  
  extension [Self <: MultiSelectOptionSetProperty](x: Self) {
    
    inline def setAttributes(value: OptionSetMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRaw(value: js.Array[Double]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawNull: Self = StObject.set(x, "raw", null)
    
    inline def setRawVarargs(value: Double*): Self = StObject.set(x, "raw", js.Array(value*))
  }
}
