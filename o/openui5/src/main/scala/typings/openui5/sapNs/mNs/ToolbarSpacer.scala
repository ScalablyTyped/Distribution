package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ToolbarSpacer")
@js.native
class ToolbarSpacer protected () extends Control {
  /**
    * Constructor for a new ToolbarSpacer.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Flexible Spacer Class Name
    */
  var flexClass: js.Any = js.native
  /**
    * Gets current value of property <code>width</code>.Defines the width of the horizontal space.Note:
    * Empty("") value makes the space flexible which means it covers the remaining space between toolbar
    * items.This feature can be used to push next item to the edge of the toolbar.Default value is
    * <code></code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Sets a new value for property <code>width</code>.Defines the width of the horizontal space.Note:
    * Empty("") value makes the space flexible which means it covers the remaining space between toolbar
    * items.This feature can be used to push next item to the edge of the toolbar.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): ToolbarSpacer = js.native
}

