package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import typings.openui5.sapNs.uiNs.coreNs.TextAlign
import typings.openui5.sapNs.uiNs.coreNs.TextDirection
import typings.std.HTMLElement
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Text")
@js.native
/**
  * Constructor for a new Text.Accepts an object literal <code>mSettings</code> that defines
  * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
  * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
  * object.
  * @param sId ID for the new control, generated automatically if no ID is given
  * @param mSettings Initial settings for the new control
  */
class Text () extends Control {
  def this(mSettings: js.Any) = this()
  /**
    * Constructor for a new Text.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Determines per instance whether line height should be cached or not.Default value is true.
    * @since 1.22
    */
  var cacheLineHeight: Boolean = js.native
  /**
    * Ellipsis(…) text to indicate more text when clampText function is used.Can be overwritten with
    * 3dots(...) if fonts do not support this UTF-8 character.
    * @since 1.13.2
    */
  var ellipsis: String = js.native
  /**
    * Defines whether browser supports native line clamp or not
    * @since 1.13.2
    */
  var hasNativeLineClamp: js.Any = js.native
  /**
    * Default line height value as a number when line-height is normal.This value is required during
    * max-height calculation for the browsers that do not support line-clamping.It is better to define
    * line-height in CSS instead of "normal" to get consistent maxLines results since normal
    * line-heightnot only varies from browser to browser but they also vary from one font face to another
    * and can also vary within a given face.Default value is 1.2
    * @since 1.22
    */
  var normalLineHeight: Double = js.native
  /**
    * Binds property <code>text</code> to model data.See {@link sap.ui.base.ManagedObject#bindProperty
    * ManagedObject.bindProperty} for a detailed description of the possible properties of
    * <code>oBindingInfo</code>
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindText(oBindingInfo: js.Any): Text = js.native
  /**
    * Decides whether the control can use native line clamp feature or not.In RTL mode native line clamp
    * feature is not supported.
    * @since 1.20
    */
  def canUseNativeLineClamp(): Boolean = js.native
  /**
    * Sets the max-height to support maxLines property.
    * @since 1.22
    * @param oDomRef DOM reference of the text container.
    * @returns calculated max height value
    */
  def clampHeight(oDomRef: HTMLElement): Number = js.native
  /**
    * Clamps the wrapping text according to max lines and returns the found ellipsis position.Parameters
    * can be used for better performance.
    * @since 1.20
    * @param oDomRef DOM reference of the text container.
    * @param iStartPos Start point of the ellipsis search.
    * @param iEndPos End point of the ellipsis search.
    * @returns Returns found ellipsis position or undefined
    */
  def clampText(oDomRef: HTMLElement): Double | js.Any = js.native
  def clampText(oDomRef: HTMLElement, iStartPos: Double): Double | js.Any = js.native
  def clampText(oDomRef: HTMLElement, iStartPos: Double, iEndPos: Double): Double | js.Any = js.native
  /**
    * Returns the max height according to max lines and line height calculation.This is not calculated
    * max-height!
    * @since 1.22
    * @param oDomRef DOM reference of the text container.
    */
  def getClampHeight(oDomRef: HTMLElement): Number = js.native
  /**
    * Caches and returns the computed line height of the text.
    * @since 1.22
    * @param oDomRef DOM reference of the text container.
    * @returns returns calculated line-height
    */
  def getLineHeight(oDomRef: HTMLElement): Number = js.native
  /**
    * Gets current value of property <code>maxLines</code>.Limits the number of lines for wrapping
    * texts.Note: The multi-line overflow indicator depends on the browser line clamping support. For such
    * browsers, this will be shown as ellipsis, for the other browsers the overflow will just be hidden.
    * @since 1.13.2
    * @returns Value of property <code>maxLines</code>
    */
  def getMaxLines(): Double = js.native
  /**
    * Gets current value of property <code>text</code>.Determines the text to be displayed.Default value
    * is <code></code>.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  /**
    * Gets current value of property <code>textAlign</code>.Sets the horizontal alignment of the
    * text.Default value is <code>Begin</code>.
    * @returns Value of property <code>textAlign</code>
    */
  def getTextAlign(): TextAlign = js.native
  /**
    * Gets current value of property <code>textDirection</code>.Available options for the text direction
    * are LTR and RTL. By default the control inherits the text direction from its parent control.Default
    * value is <code>Inherit</code>.
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): TextDirection = js.native
  /**
    * Returns the text node container's DOM reference.This can be different from getDomRef when inner
    * wrapper is needed.
    * @since 1.22
    */
  def getTextDomRef(): HTMLElement | js.Any = js.native
  /**
    * Gets current value of property <code>width</code>.Sets the width of the Text control. By default,
    * the Text control uses the full width available. Set this property to restrict the width to a custom
    * value.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Gets current value of property <code>wrapping</code>.Enables text wrapping.Default value is
    * <code>true</code>.
    * @returns Value of property <code>wrapping</code>
    */
  def getWrapping(): Boolean = js.native
  /**
    * Determines whether max lines should be rendered or not.
    * @since 1.22
    */
  def hasMaxLines(): HTMLElement | js.Any = js.native
  /**
    * Sets a new value for property <code>maxLines</code>.Limits the number of lines for wrapping
    * texts.Note: The multi-line overflow indicator depends on the browser line clamping support. For such
    * browsers, this will be shown as ellipsis, for the other browsers the overflow will just be
    * hidden.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @since 1.13.2
    * @param iMaxLines New value for property <code>maxLines</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxLines(iMaxLines: Double): Text = js.native
  /**
    * To prevent from the layout thrashing of the textContent call, this methodfirst tries to set the
    * nodeValue of the first child if it exists.
    * @since 1.30.3
    * @param oDomRef DOM reference of the text node container.
    * @param sNodeValue new Node value.
    */
  def setNodeValue(oDomRef: HTMLElement): Unit = js.native
  def setNodeValue(oDomRef: HTMLElement, sNodeValue: String): Unit = js.native
  /**
    * Sets a new value for property <code>text</code>.Determines the text to be displayed.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): Text = js.native
  /**
    * Sets a new value for property <code>textAlign</code>.Sets the horizontal alignment of the text.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>Begin</code>.
    * @param sTextAlign New value for property <code>textAlign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextAlign(sTextAlign: TextAlign): Text = js.native
  /**
    * Sets a new value for property <code>textDirection</code>.Available options for the text direction
    * are LTR and RTL. By default the control inherits the text direction from its parent control.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>Inherit</code>.
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: TextDirection): Text = js.native
  /**
    * Sets a new value for property <code>width</code>.Sets the width of the Text control. By default, the
    * Text control uses the full width available. Set this property to restrict the width to a custom
    * value.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Text = js.native
  /**
    * Sets a new value for property <code>wrapping</code>.Enables text wrapping.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bWrapping New value for property <code>wrapping</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWrapping(bWrapping: Boolean): Text = js.native
  /**
    * Unbinds property <code>text</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindText(): Text = js.native
}

