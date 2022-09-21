package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.DateTimeMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property Interface for context.parameters.[property_key], when property manifest type starts from DateTime
  */
trait DateTimeProperty
  extends StObject
     with Property {
  
  @JSName("attributes")
  var attributes_DateTimeProperty: js.UndefOr[DateTimeMetadata] = js.undefined
  
  @JSName("raw")
  var raw_DateTimeProperty: js.Date | Null
}
object DateTimeProperty {
  
  inline def apply(error: Boolean, errorMessage: String, `type`: String): DateTimeProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeProperty]
  }
  
  extension [Self <: DateTimeProperty](x: Self) {
    
    inline def setAttributes(value: DateTimeMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRaw(value: js.Date): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawNull: Self = StObject.set(x, "raw", null)
  }
}
