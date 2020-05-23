package typings.openui5.sap.m.semantic

import typings.openui5.sap.ui.core.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SemanticControl extends Element {
  /**
    * Gets current value of property <code>visible</code>.See {@link sap.ui.core.Control#visible}Default
    * value is <code>true</code>.
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): Boolean = js.native
  /**
    * Sets a new value for property <code>visible</code>.See {@link sap.ui.core.Control#visible}When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>true</code>.
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: Boolean): SemanticControl = js.native
}

