package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.WholeNumberMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property Interface for context.parameters.[property_key], when property manifest type is Whole.None
  */
trait WholeNumberProperty
  extends StObject
     with NumberProperty {
  
  @JSName("attributes")
  var attributes_WholeNumberProperty: js.UndefOr[WholeNumberMetadata] = js.undefined
}
object WholeNumberProperty {
  
  inline def apply(error: Boolean, errorMessage: String, `type`: String): WholeNumberProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WholeNumberProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WholeNumberProperty] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: WholeNumberMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
  }
}
