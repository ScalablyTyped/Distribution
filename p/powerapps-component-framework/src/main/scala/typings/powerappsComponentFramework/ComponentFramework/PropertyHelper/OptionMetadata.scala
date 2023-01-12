package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Option Item Metadata
  */
trait OptionMetadata extends StObject {
  
  var Color: String
  
  var Label: String
  
  var Value: Double
}
object OptionMetadata {
  
  inline def apply(Color: String, Label: String, Value: Double): OptionMetadata = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionMetadata] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
