package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.nodeRedRuntimeStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends StObject {
  
  /**
    * Absolute path to deploy button image or `null` to remove image
    */
  var icon: String = js.native
  
  /**
    * Deploy button label
    */
  var label: String = js.native
  
  var `type`: simple = js.native
}
object Label {
  
  @scala.inline
  def apply(icon: String, label: String, `type`: simple): Label = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: simple): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
