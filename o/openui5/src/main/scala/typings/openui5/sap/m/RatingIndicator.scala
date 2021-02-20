package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RatingIndicator extends Control {
  
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): RatingIndicator = js.native
  def addAriaDescribedBy(vAriaDescribedBy: Control): RatingIndicator = js.native
  
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): RatingIndicator = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): RatingIndicator = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>change</code> event of this
    * <code>sap.m.RatingIndicator</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.RatingIndicator</code> itself.The event is fired when the user has done a
    * rating.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.RatingIndicator</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachChange(oData: js.Any, fnFunction: js.Any): RatingIndicator = js.native
  def attachChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): RatingIndicator = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>liveChange</code> event of this
    * <code>sap.m.RatingIndicator</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.RatingIndicator</code> itself.This event is triggered during the dragging
    * period, each time the rating value changes.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.RatingIndicator</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachLiveChange(oData: js.Any, fnFunction: js.Any): RatingIndicator = js.native
  def attachLiveChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): RatingIndicator = js.native
  
  /**
    * Binds property <code>value</code> to model data.See {@link sap.ui.base.ManagedObject#bindProperty
    * ManagedObject.bindProperty} for a detailed description of the possible properties of
    * <code>oBindingInfo</code>
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindValue(oBindingInfo: js.Any): RatingIndicator = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>change</code> event of this
    * <code>sap.m.RatingIndicator</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachChange(fnFunction: js.Any, oListener: js.Any): RatingIndicator = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>liveChange</code> event of this
    * <code>sap.m.RatingIndicator</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachLiveChange(fnFunction: js.Any, oListener: js.Any): RatingIndicator = js.native
  
  /**
    * Fires event <code>change</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>value</code> of type <code>int</code>The rated value</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireChange(mArguments: js.Any): RatingIndicator = js.native
  
  /**
    * Fires event <code>liveChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>value</code> of type <code>float</code>The current value of the rating
    * after a live change event.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireLiveChange(mArguments: js.Any): RatingIndicator = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaDescribedBy</code>.
    */
  def getAriaDescribedBy(): js.Array[_] = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  
  /**
    * Gets current value of property <code>enabled</code>.Value "true" is required to let the user rate
    * with this control. It is recommended to set this parameter to "false" for the "Small" size which is
    * meant for indicating a value onlyDefault value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  
  /**
    * Gets current value of property <code>iconHovered</code>.The URI to the icon font icon or image that
    * will be displayed for hovered rating symbols. A star icon will be used if the property is not set
    * @returns Value of property <code>iconHovered</code>
    */
  def getIconHovered(): js.Any = js.native
  
  /**
    * Gets current value of property <code>iconSelected</code>.The URI to the icon font icon or image that
    * will be displayed for selected rating symbols. A star icon will be used if the property is not set
    * @returns Value of property <code>iconSelected</code>
    */
  def getIconSelected(): js.Any = js.native
  
  /**
    * Gets current value of property <code>iconSize</code>.The Size of the image or icon to be displayed.
    * The default value depends on the theme. Please be sure that the size is corresponding to a full
    * pixel value as some browsers don't support subpixel calculations. Recommended size is 1.375rem
    * (22px) for normal, 1rem (16px) for small, and 2rem (32px) for large icons correspondingly.
    * @returns Value of property <code>iconSize</code>
    */
  def getIconSize(): js.Any = js.native
  
  /**
    * Gets current value of property <code>iconUnselected</code>.The URI to the icon font icon or image
    * that will be displayed for all unselected rating symbols. A star icon will be used if the property
    * is not set
    * @returns Value of property <code>iconUnselected</code>
    */
  def getIconUnselected(): js.Any = js.native
  
  /**
    * Gets current value of property <code>maxValue</code>.The number of displayed rating symbolsDefault
    * value is <code>5</code>.
    * @returns Value of property <code>maxValue</code>
    */
  def getMaxValue(): Double = js.native
  
  /**
    * Gets current value of property <code>value</code>.The indicated value of the ratingDefault value is
    * <code>0</code>.
    * @returns Value of property <code>value</code>
    */
  def getValue(): Double = js.native
  
  /**
    * Gets current value of property <code>visualMode</code>.Defines how float values are visualized:
    * Full, Half (see enumeration RatingIndicatorVisualMode)Default value is <code>Half</code>.
    * @returns Value of property <code>visualMode</code>
    */
  def getVisualMode(): RatingIndicatorVisualMode = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaDescribedBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaDescribedBy(): js.Array[_] = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
    * @returns The removed ariaDescribedBy or <code>null</code>
    */
  def removeAriaDescribedBy(vAriaDescribedBy: Double): js.Any = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Control): js.Any = js.native
  
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  
  /**
    * Sets a new value for property <code>enabled</code>.Value "true" is required to let the user rate
    * with this control. It is recommended to set this parameter to "false" for the "Small" size which is
    * meant for indicating a value onlyWhen called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): RatingIndicator = js.native
  
  /**
    * Sets a new value for property <code>iconHovered</code>.The URI to the icon font icon or image that
    * will be displayed for hovered rating symbols. A star icon will be used if the property is not
    * setWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sIconHovered New value for property <code>iconHovered</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconHovered(sIconHovered: js.Any): RatingIndicator = js.native
  
  /**
    * Sets a new value for property <code>iconSelected</code>.The URI to the icon font icon or image that
    * will be displayed for selected rating symbols. A star icon will be used if the property is not
    * setWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sIconSelected New value for property <code>iconSelected</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconSelected(sIconSelected: js.Any): RatingIndicator = js.native
  
  /**
    * Sets the icon size value. The method is automatically updating the UI components if the control has
    * been rendered before.
    * @param sIconSize undefined
    * @returns Returns <code>this</code> to facilitate method chaining.
    */
  def setIconSize(sIconSize: js.Any): RatingIndicator = js.native
  
  /**
    * Sets a new value for property <code>iconUnselected</code>.The URI to the icon font icon or image
    * that will be displayed for all unselected rating symbols. A star icon will be used if the property
    * is not setWhen called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sIconUnselected New value for property <code>iconUnselected</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconUnselected(sIconUnselected: js.Any): RatingIndicator = js.native
  
  /**
    * Sets a new value for property <code>maxValue</code>.The number of displayed rating symbolsWhen
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>5</code>.
    * @param iMaxValue New value for property <code>maxValue</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxValue(iMaxValue: Double): RatingIndicator = js.native
  
  /**
    * Sets the rating value. The method is automatically checking whether the value is in the valid range
    * of 0-{@link #getMaxValue maxValue} and if it is a valid number. Calling the setter with null or
    * undefined will reset the value to it's default.
    * @param fValue The rating value to be set.
    * @returns Returns <code>this</code> to facilitate method chaining.
    */
  def setValue(fValue: Double): RatingIndicator = js.native
  
  /**
    * Sets a new value for property <code>visualMode</code>.Defines how float values are visualized: Full,
    * Half (see enumeration RatingIndicatorVisualMode)When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Half</code>.
    * @param sVisualMode New value for property <code>visualMode</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisualMode(sVisualMode: RatingIndicatorVisualMode): RatingIndicator = js.native
  
  /**
    * Unbinds property <code>value</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindValue(): RatingIndicator = js.native
}
