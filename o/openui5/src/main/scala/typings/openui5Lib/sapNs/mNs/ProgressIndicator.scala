package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ProgressIndicator")
@js.native
class ProgressIndicator protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new ProgressIndicator.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>displayValue</code>.Specifies the text value to be displayed in
    * the bar.
    * @returns Value of property <code>displayValue</code>
    */
  def getDisplayValue(): java.lang.String = js.native
  /**
    * Gets current value of property <code>enabled</code>.Switches enabled state of the control. Disabled
    * fields have different colors, and cannot be focused.Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>height</code>.Specifies the height of the control. The default
    * value depends on the theme. Suggested size for normal use is 2.5rem (40px). Suggested size for small
    * size (like for use in ObjectHeader) is 1.375rem (22px).
    * @since 1.15.0
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  /**
    * Gets current value of property <code>percentValue</code>.Specifies the numerical value in percent
    * for the length of the progress bar.Default value is <code>0</code>.
    * @returns Value of property <code>percentValue</code>
    */
  def getPercentValue(): scala.Double = js.native
  /**
    * Gets current value of property <code>showValue</code>.Indicates whether the displayValue should be
    * shown in the ProgressIndicator.Default value is <code>true</code>.
    * @returns Value of property <code>showValue</code>
    */
  def getShowValue(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>state</code>.Specifies the state of the bar. Enumeration
    * sap.ui.core.ValueState provides Error (red), Warning (yellow), Success (green), None (blue) (default
    * value).Default value is <code>None</code>.
    * @returns Value of property <code>state</code>
    */
  def getState(): openui5Lib.sapNs.uiNs.coreNs.ValueState = js.native
  /**
    * Gets current value of property <code>textDirection</code>.Specifies the element's text
    * directionality with enumerated options (RTL or LTR). By default, the control inherits text direction
    * from the DOM.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): openui5Lib.sapNs.uiNs.coreNs.TextDirection = js.native
  /**
    * Gets current value of property <code>width</code>.Specifies the width of the control.Default value
    * is <code>100%</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Sets a new value for property <code>displayValue</code>.Specifies the text value to be displayed in
    * the bar.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sDisplayValue New value for property <code>displayValue</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDisplayValue(sDisplayValue: java.lang.String): ProgressIndicator = js.native
  /**
    * Sets a new value for property <code>enabled</code>.Switches enabled state of the control. Disabled
    * fields have different colors, and cannot be focused.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: scala.Boolean): ProgressIndicator = js.native
  /**
    * Sets a new value for property <code>height</code>.Specifies the height of the control. The default
    * value depends on the theme. Suggested size for normal use is 2.5rem (40px). Suggested size for small
    * size (like for use in ObjectHeader) is 1.375rem (22px).When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.15.0
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): ProgressIndicator = js.native
  /**
    * Sets a new value for property <code>percentValue</code>.Specifies the numerical value in percent for
    * the length of the progress bar.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>0</code>.
    * @param fPercentValue New value for property <code>percentValue</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPercentValue(fPercentValue: scala.Double): ProgressIndicator = js.native
  /**
    * Sets a new value for property <code>showValue</code>.Indicates whether the displayValue should be
    * shown in the ProgressIndicator.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bShowValue New value for property <code>showValue</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowValue(bShowValue: scala.Boolean): ProgressIndicator = js.native
  /**
    * Sets a new value for property <code>state</code>.Specifies the state of the bar. Enumeration
    * sap.ui.core.ValueState provides Error (red), Warning (yellow), Success (green), None (blue) (default
    * value).When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>None</code>.
    * @param sState New value for property <code>state</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setState(sState: openui5Lib.sapNs.uiNs.coreNs.ValueState): ProgressIndicator = js.native
  /**
    * Sets a new value for property <code>textDirection</code>.Specifies the element's text directionality
    * with enumerated options (RTL or LTR). By default, the control inherits text direction from the
    * DOM.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: openui5Lib.sapNs.uiNs.coreNs.TextDirection): ProgressIndicator = js.native
  /**
    * Sets a new value for property <code>width</code>.Specifies the width of the control.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>100%</code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): ProgressIndicator = js.native
}

