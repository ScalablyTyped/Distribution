package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.TwoOptionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property Interface for context.parameters.[property_key], when property manifest type is TwoOptions
  */
trait TwoOptionsProperty
  extends StObject
     with Property {
  
  @JSName("attributes")
  var attributes_TwoOptionsProperty: js.UndefOr[TwoOptionMetadata] = js.undefined
  
  @JSName("raw")
  var raw_TwoOptionsProperty: Boolean
}
object TwoOptionsProperty {
  
  inline def apply(error: Boolean, errorMessage: String, raw: Boolean, `type`: String): TwoOptionsProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoOptionsProperty]
  }
  
  extension [Self <: TwoOptionsProperty](x: Self) {
    
    inline def setAttributes(value: TwoOptionMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
