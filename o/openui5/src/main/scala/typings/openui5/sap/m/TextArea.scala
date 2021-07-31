package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Wrapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextArea
  extends StObject
     with InputBase {
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>liveChange</code> event of this
    * <code>sap.m.TextArea</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.TextArea</code> itself.Is fired whenever the user has modified the text shown on the
    * text area.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TextArea</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachLiveChange(oData: js.Any, fnFunction: js.Any): TextArea = js.native
  def attachLiveChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TextArea = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>liveChange</code> event of this
    * <code>sap.m.TextArea</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachLiveChange(fnFunction: js.Any, oListener: js.Any): TextArea = js.native
  
  /**
    * Fires event <code>liveChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>value</code> of type <code>string</code>The new <code>value</code> of the
    * control.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireLiveChange(mArguments: js.Any): TextArea = js.native
  
  /**
    * Gets current value of property <code>cols</code>.Defines the visible width of the control, in
    * average character widths.<b>Note:</b> The <code>width</code> property wins over the
    * <code>cols</code> property, if both are set.Default value is <code>20</code>.
    * @returns Value of property <code>cols</code>
    */
  def getCols(): Double = js.native
  
  /**
    * Gets current value of property <code>growing</code>.Indicates the ability of the control to
    * automatically grow and shrink dynamically with its content.<b>Note:</b> The <code>height</code>
    * property is ignored, if this property set to <code>true</code>.Default value is <code>false</code>.
    * @since 1.38.0
    * @returns Value of property <code>growing</code>
    */
  def getGrowing(): Boolean = js.native
  
  /**
    * Gets current value of property <code>growingMaxLines</code>.Defines the maximum number of lines that
    * the control can grow.Default value is <code>0</code>.
    * @since 1.38.0
    * @returns Value of property <code>growingMaxLines</code>
    */
  def getGrowingMaxLines(): Double = js.native
  
  /**
    * Gets current value of property <code>height</code>.Defines the height of the control.
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  
  /**
    * Gets current value of property <code>maxLength</code>.Defines the maximum number of characters that
    * the <code>value</code> can be.Default value is <code>0</code>.
    * @returns Value of property <code>maxLength</code>
    */
  def getMaxLength(): Double = js.native
  
  /**
    * Gets current value of property <code>rows</code>.Defines the number of visible text lines for the
    * control.<b>Note:</b> The <code>height</code> property wins over the <code>rows</code> property, if
    * both are set.Default value is <code>2</code>.
    * @returns Value of property <code>rows</code>
    */
  def getRows(): Double = js.native
  
  /**
    * Gets current value of property <code>valueLiveUpdate</code>.Indicates when the <code>value</code>
    * property gets updated with the user changes. Setting it to <code>true</code> updates the
    * <code>value</code> property whenever the user has modified the text shown on the text area.Default
    * value is <code>false</code>.
    * @since 1.30
    * @returns Value of property <code>valueLiveUpdate</code>
    */
  def getValueLiveUpdate(): Boolean = js.native
  
  /**
    * Gets current value of property <code>wrapping</code>.Indicates how the control wraps the text, e.g.
    * <code>Soft</code>, <code>Hard</code>, <code>Off</code>.Default value is <code>None</code>.
    * @returns Value of property <code>wrapping</code>
    */
  def getWrapping(): Wrapping = js.native
  
  /**
    * Sets a new value for property <code>cols</code>.Defines the visible width of the control, in average
    * character widths.<b>Note:</b> The <code>width</code> property wins over the <code>cols</code>
    * property, if both are set.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>20</code>.
    * @param iCols New value for property <code>cols</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCols(iCols: Double): TextArea = js.native
  
  /**
    * Sets a new value for property <code>growing</code>.Indicates the ability of the control to
    * automatically grow and shrink dynamically with its content.<b>Note:</b> The <code>height</code>
    * property is ignored, if this property set to <code>true</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @since 1.38.0
    * @param bGrowing New value for property <code>growing</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setGrowing(bGrowing: Boolean): TextArea = js.native
  
  /**
    * Sets a new value for property <code>growingMaxLines</code>.Defines the maximum number of lines that
    * the control can grow.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>0</code>.
    * @since 1.38.0
    * @param iGrowingMaxLines New value for property <code>growingMaxLines</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setGrowingMaxLines(iGrowingMaxLines: Double): TextArea = js.native
  
  /**
    * Sets a new value for property <code>height</code>.Defines the height of the control.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): TextArea = js.native
  
  /**
    * Sets a new value for property <code>maxLength</code>.Defines the maximum number of characters that
    * the <code>value</code> can be.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>0</code>.
    * @param iMaxLength New value for property <code>maxLength</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxLength(iMaxLength: Double): TextArea = js.native
  
  /**
    * Sets a new value for property <code>rows</code>.Defines the number of visible text lines for the
    * control.<b>Note:</b> The <code>height</code> property wins over the <code>rows</code> property, if
    * both are set.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>2</code>.
    * @param iRows New value for property <code>rows</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRows(iRows: Double): TextArea = js.native
  
  /**
    * Sets a new value for property <code>valueLiveUpdate</code>.Indicates when the <code>value</code>
    * property gets updated with the user changes. Setting it to <code>true</code> updates the
    * <code>value</code> property whenever the user has modified the text shown on the text area.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @since 1.30
    * @param bValueLiveUpdate New value for property <code>valueLiveUpdate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueLiveUpdate(bValueLiveUpdate: Boolean): TextArea = js.native
  
  /**
    * Sets a new value for property <code>wrapping</code>.Indicates how the control wraps the text, e.g.
    * <code>Soft</code>, <code>Hard</code>, <code>Off</code>.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>None</code>.
    * @param sWrapping New value for property <code>wrapping</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWrapping(sWrapping: Wrapping): TextArea = js.native
}
