package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollContainer extends Control {
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: Control): ScrollContainer = js.native
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): ScrollContainer = js.native
  /**
    * Gets content of aggregation <code>content</code>.The content of the ScrollContainer.
    */
  def getContent(): js.Array[Control] = js.native
  /**
    * Gets current value of property <code>focusable</code>.Whether the scroll container can be
    * focused.Note that it should be set to "true" when there are no focusable elements inside or when
    * keyboard interaction requires an additional tab stop on the container.Default value is
    * <code>false</code>.
    * @returns Value of property <code>focusable</code>
    */
  def getFocusable(): Boolean = js.native
  /**
    * Gets current value of property <code>height</code>.The height of the ScrollContainer.By default the
    * height equals the content height. If only horizontal scrolling is used, do not set the height or
    * make sure the height is always larger than the height of the content.Note that when a percentage is
    * given, for the height to work as expected, the height of the surrounding container must be
    * defined.Default value is <code>auto</code>.
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  /**
    * Gets current value of property <code>horizontal</code>.Whether horizontal scrolling should be
    * possible.Default value is <code>true</code>.
    * @returns Value of property <code>horizontal</code>
    */
  def getHorizontal(): Boolean = js.native
  /**
    * Gets current value of property <code>vertical</code>.Whether vertical scrolling should be
    * possible.Note that this is off by default because typically a Page is used as fullscreen element
    * which can handle vertical scrolling. If this is not the case and vertical scrolling is required,
    * this flag needs to be set to "true".Important: it is not supported to have nested controls that both
    * enable scrolling into the same dimension.Default value is <code>false</code>.
    * @returns Value of property <code>vertical</code>
    */
  def getVertical(): Boolean = js.native
  /**
    * Gets current value of property <code>width</code>.The width of the ScrollContainer.If not set, it
    * consumes the complete available width, behaving like normal HTML block elements. If only vertical
    * scrolling is enabled, make sure the content always fits or wraps.Default value is <code>auto</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
    * returns its index if found or -1 otherwise.
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: Control): Double = js.native
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: Control, iIndex: Double): ScrollContainer = js.native
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[Control] = js.native
  def removeContent(vContent: String): Control = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: Double): Control = js.native
  def removeContent(vContent: Control): Control = js.native
  /**
    * Scrolls to the given position.When called while the control is not rendered (yet), the scrolling
    * position is still applied, but there is no animation.
    * @param x The horizontal pixel position to scroll to.        Scrolling to the right happens with
    * positive values. In right-to-left mode scrolling starts at the right side and higher values scroll
    * to the left.        If only vertical scrolling is enabled, give 0 as value.
    * @param y The vertical pixel position to scroll to.        Scrolling down happens with positive
    * values.        If only horizontal scrolling is enabled, give 0 as value.
    * @param time The duration of animated scrolling.        To scroll immediately without animation, give
    * 0 as value. 0 is also the default value, when this optional parameter is omitted.
    */
  def scrollTo(x: Double, y: Double, time: Double): ScrollContainer = js.native
  def scrollToElement(element: Element): ScrollContainer = js.native
  def scrollToElement(element: Element, time: Double): ScrollContainer = js.native
  /**
    * Scrolls to an element(DOM or sap.ui.core.Element) within the page if the element is rendered.
    * @since 1.30
    * @param element The element to which should be scrolled.
    * @param time The duration of animated scrolling. To scroll immediately without animation, give 0 as
    * value or leave it default.
    * @returns <code>this</code> to facilitate method chaining.
    */
  def scrollToElement(element: HTMLElement): ScrollContainer = js.native
  def scrollToElement(element: HTMLElement, time: Double): ScrollContainer = js.native
  /**
    * Sets a new value for property <code>focusable</code>.Whether the scroll container can be
    * focused.Note that it should be set to "true" when there are no focusable elements inside or when
    * keyboard interaction requires an additional tab stop on the container.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bFocusable New value for property <code>focusable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFocusable(bFocusable: Boolean): ScrollContainer = js.native
  /**
    * Sets a new value for property <code>height</code>.The height of the ScrollContainer.By default the
    * height equals the content height. If only horizontal scrolling is used, do not set the height or
    * make sure the height is always larger than the height of the content.Note that when a percentage is
    * given, for the height to work as expected, the height of the surrounding container must be
    * defined.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>auto</code>.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): ScrollContainer = js.native
  /**
    * Sets a new value for property <code>horizontal</code>.Whether horizontal scrolling should be
    * possible.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bHorizontal New value for property <code>horizontal</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHorizontal(bHorizontal: Boolean): ScrollContainer = js.native
  /**
    * Sets a new value for property <code>vertical</code>.Whether vertical scrolling should be
    * possible.Note that this is off by default because typically a Page is used as fullscreen element
    * which can handle vertical scrolling. If this is not the case and vertical scrolling is required,
    * this flag needs to be set to "true".Important: it is not supported to have nested controls that both
    * enable scrolling into the same dimension.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bVertical New value for property <code>vertical</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVertical(bVertical: Boolean): ScrollContainer = js.native
  /**
    * Sets a new value for property <code>width</code>.The width of the ScrollContainer.If not set, it
    * consumes the complete available width, behaving like normal HTML block elements. If only vertical
    * scrolling is enabled, make sure the content always fits or wraps.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>auto</code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): ScrollContainer = js.native
}

