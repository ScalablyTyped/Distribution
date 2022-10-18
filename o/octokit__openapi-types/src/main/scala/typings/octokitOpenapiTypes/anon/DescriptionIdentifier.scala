package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionIdentifier extends StObject {
  
  /** @description A short explanation of what this action would do. The maximum size is 40 characters. */
  var description: String
  
  /** @description A reference for the action on the integrator's system. The maximum size is 20 characters. */
  var identifier: String
  
  /** @description The text to be displayed on a button in the web UI. The maximum size is 20 characters. */
  var label: String
}
object DescriptionIdentifier {
  
  inline def apply(description: String, identifier: String, label: String): DescriptionIdentifier = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionIdentifier]
  }
  
  extension [Self <: DescriptionIdentifier](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
