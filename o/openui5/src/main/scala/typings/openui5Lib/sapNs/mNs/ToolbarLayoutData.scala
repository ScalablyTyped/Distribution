package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ToolbarLayoutData")
@js.native
class ToolbarLayoutData protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.LayoutData {
  /**
    * Constructor for a new ToolbarLayoutData.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>maxWidth</code>.Sets the maximum width of the toolbar item.
    * @returns Value of property <code>maxWidth</code>
    */
  def getMaxWidth(): js.Any = js.native
  /**
    * Gets current value of property <code>minWidth</code>.Sets the minimum width of the toolbar item.
    * @returns Value of property <code>minWidth</code>
    */
  def getMinWidth(): js.Any = js.native
  /**
    * Gets current value of property <code>shrinkable</code>.Determines whether the control, when in a
    * toolbar, is shrinkable or not. For controls with fixed width (100px, 5rem, etc...) this property is
    * ignored.Note: Nested layout controls should not be shrinkable.Default value is <code>false</code>.
    * @returns Value of property <code>shrinkable</code>
    */
  def getShrinkable(): scala.Boolean = js.native
  /**
    * Sets a new value for property <code>maxWidth</code>.Sets the maximum width of the toolbar item.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sMaxWidth New value for property <code>maxWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxWidth(sMaxWidth: js.Any): ToolbarLayoutData = js.native
  /**
    * Sets a new value for property <code>minWidth</code>.Sets the minimum width of the toolbar item.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sMinWidth New value for property <code>minWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMinWidth(sMinWidth: js.Any): ToolbarLayoutData = js.native
  /**
    * Sets a new value for property <code>shrinkable</code>.Determines whether the control, when in a
    * toolbar, is shrinkable or not. For controls with fixed width (100px, 5rem, etc...) this property is
    * ignored.Note: Nested layout controls should not be shrinkable.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bShrinkable New value for property <code>shrinkable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShrinkable(bShrinkable: scala.Boolean): ToolbarLayoutData = js.native
}

