package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.ScrollBar")
@js.native
class ScrollBar protected () extends Control {
  /**
    * Constructor for a new ScrollBar.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>scroll</code> event of this
    * <code>sap.ui.core.ScrollBar</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.core.ScrollBar</code> itself.Scroll event.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.core.ScrollBar</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachScroll(oData: js.Any, fnFunction: js.Any): ScrollBar = js.native
  def attachScroll(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ScrollBar = js.native
  /**
    * Binds the mouse wheel scroll event of the control that has the scrollbar to the scrollbar itself.
    * @param oOwnerDomRef Dom ref of the control that uses the scrollbar
    */
  def bind(oOwnerDomRef: String): Unit = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>scroll</code> event of this
    * <code>sap.ui.core.ScrollBar</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachScroll(fnFunction: js.Any, oListener: js.Any): ScrollBar = js.native
  /**
    * Fires event <code>scroll</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>action</code> of type <code>sap.ui.core.ScrollBarAction</code>Actions are:
    * Click on track, button, drag of thumb, or mouse wheel click.</li><li><code>forward</code> of type
    * <code>boolean</code>Direction of scrolling: back (up) or forward
    * (down).</li><li><code>newScrollPos</code> of type <code>int</code>Current Scroll position either in
    * pixels or in steps.</li><li><code>oldScrollPos</code> of type <code>int</code>Old Scroll position -
    * can be in pixels or in steps.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireScroll(mArguments: js.Any): ScrollBar = js.native
  /**
    * Gets current value of property <code>contentSize</code>.Size of the scrollable content (in pixels).
    * @returns Value of property <code>contentSize</code>
    */
  def getContentSize(): js.Any = js.native
  /**
    * Gets current value of property <code>scrollPosition</code>.Scroll position in steps or pixels.
    * @returns Value of property <code>scrollPosition</code>
    */
  def getScrollPosition(): Double = js.native
  /**
    * Gets current value of property <code>size</code>.Size of the Scrollbar (in pixels).
    * @returns Value of property <code>size</code>
    */
  def getSize(): js.Any = js.native
  /**
    * Gets current value of property <code>steps</code>.Number of steps to scroll. Used if the size of the
    * content is not known as the data is loaded dynamically.
    * @returns Value of property <code>steps</code>
    */
  def getSteps(): Double = js.native
  /**
    * Gets current value of property <code>vertical</code>.Orientation. Defines if the Scrollbar is
    * vertical or horizontal.Default value is <code>true</code>.
    * @returns Value of property <code>vertical</code>
    */
  def getVertical(): Boolean = js.native
  /**
    * Page Down is used to scroll one page forward.
    */
  def pageDown(): Unit = js.native
  /**
    * Page Up is used to scroll one page back.
    */
  def pageUp(): Unit = js.native
  /**
    * Sets a new value for property <code>contentSize</code>.Size of the scrollable content (in
    * pixels).When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sContentSize New value for property <code>contentSize</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContentSize(sContentSize: js.Any): ScrollBar = js.native
  /**
    * Sets a new value for property <code>scrollPosition</code>.Scroll position in steps or pixels.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param iScrollPosition New value for property <code>scrollPosition</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setScrollPosition(iScrollPosition: Double): ScrollBar = js.native
  /**
    * Sets a new value for property <code>size</code>.Size of the Scrollbar (in pixels).When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sSize New value for property <code>size</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSize(sSize: js.Any): ScrollBar = js.native
  /**
    * Sets a new value for property <code>steps</code>.Number of steps to scroll. Used if the size of the
    * content is not known as the data is loaded dynamically.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.
    * @param iSteps New value for property <code>steps</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSteps(iSteps: Double): ScrollBar = js.native
  /**
    * Sets a new value for property <code>vertical</code>.Orientation. Defines if the Scrollbar is
    * vertical or horizontal.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>true</code>.
    * @param bVertical New value for property <code>vertical</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVertical(bVertical: Boolean): ScrollBar = js.native
  /**
    * Unbinds the mouse wheel scroll event of the control that has the scrollbar
    * @param oOwnerDomRef Dom ref of the Control that uses the scrollbar
    */
  def unbind(oOwnerDomRef: String): Unit = js.native
}

