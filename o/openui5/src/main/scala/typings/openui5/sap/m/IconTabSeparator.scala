package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconTabSeparator extends Element {
  /**
    * Gets current value of property <code>icon</code>.The icon to display for this separator. If no icon
    * is given, a separator line is used instead.Default value is <code></code>.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>iconDensityAware</code>.If set to true, it sends one or more
    * requests,trying to get the density perfect version of the image if this version ofthe image doesn't
    * exist on the server. Default value is set to true.If bandwidth is key for the application, set this
    * value to false.Default value is <code>true</code>.
    * @returns Value of property <code>iconDensityAware</code>
    */
  def getIconDensityAware(): Boolean = js.native
  /**
    * Sets a new value for property <code>icon</code>.The icon to display for this separator. If no icon
    * is given, a separator line is used instead.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code></code>.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): IconTabSeparator = js.native
  /**
    * Sets a new value for property <code>iconDensityAware</code>.If set to true, it sends one or more
    * requests,trying to get the density perfect version of the image if this version ofthe image doesn't
    * exist on the server. Default value is set to true.If bandwidth is key for the application, set this
    * value to false.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bIconDensityAware New value for property <code>iconDensityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconDensityAware(bIconDensityAware: Boolean): IconTabSeparator = js.native
}

