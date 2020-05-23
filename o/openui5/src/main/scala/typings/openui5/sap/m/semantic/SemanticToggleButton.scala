package typings.openui5.sap.m.semantic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SemanticToggleButton extends SemanticButton {
  /**
    * Gets current value of property <code>pressed</code>.The property is “true” when the control is
    * toggled. The default state of this property is "false".Default value is <code>false</code>.
    * @returns Value of property <code>pressed</code>
    */
  def getPressed(): Boolean = js.native
  /**
    * Sets a new value for property <code>pressed</code>.The property is “true” when the control is
    * toggled. The default state of this property is "false".When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bPressed New value for property <code>pressed</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPressed(bPressed: Boolean): SemanticToggleButton = js.native
}

