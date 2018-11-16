package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.RangeSlider")
@js.native
class RangeSlider protected () extends Slider {
  /**
         * Constructor for a new <code>sap.m.RangeSlider</code>.Accepts an object literal
         * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
         * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
         * of the syntax of the settings object.
         * @param sId ID for the new control, generated automatically if no ID is given.
         * @param mSettings Initial settings for the new control.
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new <code>sap.m.RangeSlider</code>.Accepts an object literal
         * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
         * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
         * of the syntax of the settings object.
         * @param sId ID for the new control, generated automatically if no ID is given.
         * @param mSettings Initial settings for the new control.
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Gets current value of property <code>inputsAsTooltips</code>.Indicates whether an Input fields
         * should be used as tooltips for the handles.Default value is <code>false</code>.
         * @returns Value of property <code>inputsAsTooltips</code>
        */
  def getInputsAsTooltips(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>range</code>.Determines the range in which the user can select
         * values.If the value is lower/higher than the allowed minimum/maximum,a warning message will be
         * output to the console.Default value is <code>[]</code>.
         * @returns Value of property <code>range</code>
        */
  def getRange(): js.Any = js.native
  /**
         * Sets a new value for property <code>inputsAsTooltips</code>.Indicates whether an Input fields should
         * be used as tooltips for the handles.When called with a value of <code>null</code> or
         * <code>undefined</code>, the default value of the property will be restored.Default value is
         * <code>false</code>.
         * @param bInputsAsTooltips New value for property <code>inputsAsTooltips</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setInputsAsTooltips(bInputsAsTooltips: scala.Boolean): RangeSlider = js.native
  /**
         * Sets a new value for property <code>range</code>.Determines the range in which the user can select
         * values.If the value is lower/higher than the allowed minimum/maximum,a warning message will be
         * output to the console.When called with a value of <code>null</code> or <code>undefined</code>, the
         * default value of the property will be restored.Default value is <code>[]</code>.
         * @param oRange New value for property <code>range</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setRange(oRange: js.Any): RangeSlider = js.native
}

