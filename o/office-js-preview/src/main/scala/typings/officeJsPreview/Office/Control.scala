package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an individual control or command and the state it should have.
  */
trait Control extends StObject {
  
  /**
    * Indicates whether the control should be enabled or disabled. The default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifier of the control as specified in the manifest.
    */
  var id: String
  
  /**
    * Indicates whether the control should be visible or hidden. The default is true.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Control {
  
  @scala.inline
  def apply(id: String): Control = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
  
  @scala.inline
  implicit class ControlMutableBuilder[Self <: Control] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
