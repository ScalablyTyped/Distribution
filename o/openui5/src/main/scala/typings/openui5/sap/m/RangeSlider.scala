package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSlider extends Slider {
  
  /**
    * Gets current value of property <code>inputsAsTooltips</code>.Indicates whether an Input fields
    * should be used as tooltips for the handles.Default value is <code>false</code>.
    * @returns Value of property <code>inputsAsTooltips</code>
    */
  def getInputsAsTooltips(): Boolean = js.native
  
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
  def setInputsAsTooltips(bInputsAsTooltips: Boolean): RangeSlider = js.native
  
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
