package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.LocalBusyIndicator")
@js.native
class LocalBusyIndicator protected () extends Control {
  /**
    * Constructor for a new LocalBusyIndicator.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>height</code>.This property is the height of the control that
    * has tobe covered. With this height the position of the animation can beproperly set.Default value is
    * <code>100px</code>.
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  /**
    * Gets current value of property <code>width</code>.This property is the width of the control that has
    * tobe covered. With this width the position of the animation can beproperly set.Default value is
    * <code>100px</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Sets a new value for property <code>height</code>.This property is the height of the control that
    * has tobe covered. With this height the position of the animation can beproperly set.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>100px</code>.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): LocalBusyIndicator = js.native
  /**
    * Sets a new value for property <code>width</code>.This property is the width of the control that has
    * tobe covered. With this width the position of the animation can beproperly set.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>100px</code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): LocalBusyIndicator = js.native
}

