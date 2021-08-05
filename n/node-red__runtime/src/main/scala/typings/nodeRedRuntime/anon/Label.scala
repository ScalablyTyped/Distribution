package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.nodeRedRuntimeStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  /**
    * Absolute path to deploy button image or `null` to remove image
    */
  var icon: String
  
  /**
    * Deploy button label
    */
  var label: String
  
  var `type`: simple
}
object Label {
  
  inline def apply(icon: String, label: String): Label = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("simple")
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setType(value: simple): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
