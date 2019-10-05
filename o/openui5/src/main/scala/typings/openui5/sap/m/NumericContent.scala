package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.NumericContent")
@js.native
class NumericContent protected () extends Control {
  /**
    * Constructor for a new sap.m.GenericTile control.Accepts an object literal <code>mSettings</code>
    * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.m.NumericContent</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.NumericContent</code> itself.The event is fired when the user chooses the
    * numeric content.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.NumericContent</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): NumericContent = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): NumericContent = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.m.NumericContent</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): NumericContent = js.native
  /**
    * Fires event <code>press</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): NumericContent = js.native
  /**
    * Gets current value of property <code>animateTextChange</code>.If set to true, the change of the
    * value will be animated.Default value is <code>true</code>.
    * @returns Value of property <code>animateTextChange</code>
    */
  def getAnimateTextChange(): Boolean = js.native
  /**
    * Gets current value of property <code>formatterValue</code>.If set to true, the value parameter
    * contains a numeric value and scale. If set to false (default), the value parameter contains a
    * numeric value only.Default value is <code>false</code>.
    * @returns Value of property <code>formatterValue</code>
    */
  def getFormatterValue(): Boolean = js.native
  /**
    * Gets current value of property <code>icon</code>.The icon to be displayed as a graphical element
    * within the control. This can be an image or an icon from the icon font.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>iconDescription</code>.Description of an icon that is used in
    * the tooltip.
    * @returns Value of property <code>iconDescription</code>
    */
  def getIconDescription(): String = js.native
  /**
    * Gets current value of property <code>indicator</code>.The indicator arrow that shows value
    * deviation.Default value is <code>None</code>.
    * @returns Value of property <code>indicator</code>
    */
  def getIndicator(): DeviationIndicator = js.native
  /**
    * Gets current value of property <code>nullifyValue</code>.If set to true, the omitted value property
    * is set to 0.Default value is <code>true</code>.
    * @returns Value of property <code>nullifyValue</code>
    */
  def getNullifyValue(): Boolean = js.native
  /**
    * Gets current value of property <code>scale</code>.The scaling prefix. Financial characters can be
    * used for currencies and counters. The SI prefixes can be used for units. If the scaling prefix
    * contains more than three characters, only the first three characters are displayed.
    * @returns Value of property <code>scale</code>
    */
  def getScale(): String = js.native
  /**
    * Gets current value of property <code>size</code>.Updates the size of the chart. If not set then the
    * default size is applied based on the device tile.Default value is <code>Auto</code>.
    * @returns Value of property <code>size</code>
    */
  def getSize(): Size = js.native
  /**
    * Gets current value of property <code>state</code>.Indicates the load status.Default value is
    * <code>Loaded</code>.
    * @returns Value of property <code>state</code>
    */
  def getState(): LoadState = js.native
  /**
    * Gets current value of property <code>truncateValueTo</code>.The number of characters to display for
    * the value property.Default value is <code>4</code>.
    * @returns Value of property <code>truncateValueTo</code>
    */
  def getTruncateValueTo(): Double = js.native
  /**
    * Gets current value of property <code>value</code>.The actual value.
    * @returns Value of property <code>value</code>
    */
  def getValue(): String = js.native
  /**
    * Gets current value of property <code>valueColor</code>.The semantic color of the value.Default value
    * is <code>Neutral</code>.
    * @returns Value of property <code>valueColor</code>
    */
  def getValueColor(): ValueColor = js.native
  /**
    * Gets current value of property <code>width</code>.The width of the chart. If it is not set, the size
    * of the control is defined by the size property.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Gets current value of property <code>withMargin</code>.If the value is set to false, the content
    * will fit to the whole size of the control.Default value is <code>true</code>.
    * @returns Value of property <code>withMargin</code>
    */
  def getWithMargin(): Boolean = js.native
  /**
    * Sets a new value for property <code>animateTextChange</code>.If set to true, the change of the value
    * will be animated.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>true</code>.
    * @param bAnimateTextChange New value for property <code>animateTextChange</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAnimateTextChange(bAnimateTextChange: Boolean): NumericContent = js.native
  /**
    * Sets a new value for property <code>formatterValue</code>.If set to true, the value parameter
    * contains a numeric value and scale. If set to false (default), the value parameter contains a
    * numeric value only.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>false</code>.
    * @param bFormatterValue New value for property <code>formatterValue</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFormatterValue(bFormatterValue: Boolean): NumericContent = js.native
  /**
    * Sets a new value for property <code>iconDescription</code>.Description of an icon that is used in
    * the tooltip.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sIconDescription New value for property <code>iconDescription</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconDescription(sIconDescription: String): NumericContent = js.native
  /**
    * Sets a new value for property <code>indicator</code>.The indicator arrow that shows value
    * deviation.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>None</code>.
    * @param sIndicator New value for property <code>indicator</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIndicator(sIndicator: DeviationIndicator): NumericContent = js.native
  /**
    * Sets a new value for property <code>nullifyValue</code>.If set to true, the omitted value property
    * is set to 0.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bNullifyValue New value for property <code>nullifyValue</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNullifyValue(bNullifyValue: Boolean): NumericContent = js.native
  /**
    * Sets a new value for property <code>scale</code>.The scaling prefix. Financial characters can be
    * used for currencies and counters. The SI prefixes can be used for units. If the scaling prefix
    * contains more than three characters, only the first three characters are displayed.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sScale New value for property <code>scale</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setScale(sScale: String): NumericContent = js.native
  /**
    * Sets a new value for property <code>size</code>.Updates the size of the chart. If not set then the
    * default size is applied based on the device tile.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Auto</code>.
    * @param sSize New value for property <code>size</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSize(sSize: Size): NumericContent = js.native
  /**
    * Sets a new value for property <code>state</code>.Indicates the load status.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Loaded</code>.
    * @param sState New value for property <code>state</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setState(sState: LoadState): NumericContent = js.native
  /**
    * Sets a new value for property <code>truncateValueTo</code>.The number of characters to display for
    * the value property.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>4</code>.
    * @param iTruncateValueTo New value for property <code>truncateValueTo</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTruncateValueTo(iTruncateValueTo: Double): NumericContent = js.native
  /**
    * Sets a new value for property <code>value</code>.The actual value.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: String): NumericContent = js.native
  /**
    * Sets a new value for property <code>valueColor</code>.The semantic color of the value.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>Neutral</code>.
    * @param sValueColor New value for property <code>valueColor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueColor(sValueColor: ValueColor): NumericContent = js.native
  /**
    * Sets a new value for property <code>width</code>.The width of the chart. If it is not set, the size
    * of the control is defined by the size property.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): NumericContent = js.native
  /**
    * Sets a new value for property <code>withMargin</code>.If the value is set to false, the content will
    * fit to the whole size of the control.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bWithMargin New value for property <code>withMargin</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWithMargin(bWithMargin: Boolean): NumericContent = js.native
}

