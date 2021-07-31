package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an individual tab and the state it should have.
	 *
	 * @remarks
  *
  * **Requirement set**: Ribbon 1.1
  */
trait Tab extends StObject {
  
  /**
    * Specifies the controls in the tab, such as menu items, buttons, etc.
    */
  var controls: js.Array[Control]
  
  /**
    * Identifier of the tab as specified in the manifest.
    */
  var id: String
}
object Tab {
  
  @scala.inline
  def apply(controls: js.Array[Control], id: String): Tab = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  
  @scala.inline
  implicit class TabMutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControls(value: js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
