package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.QuickView")
@js.native
class QuickView protected () extends QuickViewBase {
  /**
    * Constructor for a new QuickView.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterClose</code> event of this
    * <code>sap.m.QuickView</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.QuickView</code> itself.This event fires after the QuickView is closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.QuickView</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterClose(oData: js.Any, fnFunction: js.Any): QuickView = js.native
  def attachAfterClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): QuickView = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterOpen</code> event of this
    * <code>sap.m.QuickView</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.QuickView</code> itself.This event fires after the QuickView is opened.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.QuickView</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterOpen(oData: js.Any, fnFunction: js.Any): QuickView = js.native
  def attachAfterOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): QuickView = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>beforeClose</code> event of this
    * <code>sap.m.QuickView</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.QuickView</code> itself.This event fires before the QuickView is closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.QuickView</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachBeforeClose(oData: js.Any, fnFunction: js.Any): QuickView = js.native
  def attachBeforeClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): QuickView = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>beforeOpen</code> event of this
    * <code>sap.m.QuickView</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.QuickView</code> itself.This event fires before the QuickView is opened.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.QuickView</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachBeforeOpen(oData: js.Any, fnFunction: js.Any): QuickView = js.native
  def attachBeforeOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): QuickView = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterClose</code> event of this
    * <code>sap.m.QuickView</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterClose(fnFunction: js.Any, oListener: js.Any): QuickView = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterOpen</code> event of this
    * <code>sap.m.QuickView</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterOpen(fnFunction: js.Any, oListener: js.Any): QuickView = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>beforeClose</code> event of this
    * <code>sap.m.QuickView</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachBeforeClose(fnFunction: js.Any, oListener: js.Any): QuickView = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>beforeOpen</code> event of this
    * <code>sap.m.QuickView</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachBeforeOpen(fnFunction: js.Any, oListener: js.Any): QuickView = js.native
  /**
    * Fires event <code>afterClose</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>This parameter refers
    * to the control, which opens the QuickView.</li><li><code>origin</code> of type
    * <code>sap.m.Button</code>This parameter contains the control,which triggers the close of the
    * QuickView.It is undefined when running on desktop or tablet.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterClose(mArguments: js.Any): QuickView = js.native
  /**
    * Fires event <code>afterOpen</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>This parameter refers
    * to the control, which opens the QuickView.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterOpen(mArguments: js.Any): QuickView = js.native
  /**
    * Fires event <code>beforeClose</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>This parameter refers
    * to the control, which opens the QuickView.</li><li><code>origin</code> of type
    * <code>sap.m.Button</code>This parameter contains the control,which triggers the close of the
    * QuickView.It is undefined when running on desktop or tablet.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireBeforeClose(mArguments: js.Any): QuickView = js.native
  /**
    * Fires event <code>beforeOpen</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>This parameter refers
    * to the control, which opens the QuickView.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireBeforeOpen(mArguments: js.Any): QuickView = js.native
  /**
    * Gets current value of property <code>placement</code>.This property is reused from sap.m.Popover and
    * only takes effect when running on desktop or tablet. Please refer the documentation of the placement
    * property of sap.m.Popover.Default value is <code>Right</code>.
    * @returns Value of property <code>placement</code>
    */
  def getPlacement(): PlacementType = js.native
  /**
    * Gets current value of property <code>width</code>.The width of the QuickView. The property takes
    * effect only when running on desktop or tablet.Default value is <code>320px</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Opens the QuickView.
    * @param oControl The control which opens the QuickView.
    * @returns Pointer to the control instance for chaining
    */
  def openBy(oControl: openui5Lib.sapNs.uiNs.coreNs.Control): QuickView = js.native
  /**
    * The method sets placement position of the QuickView.
    * @param sPlacement The side from which the QuickView appears relative to the control that opens it.
    * @returns Pointer to the control instance for chaining.
    */
  def setPlacement(sPlacement: PlacementType): QuickView = js.native
  /**
    * The method sets the width of the QuickView.Works only on desktop or tablet.
    * @param sWidth The new width of the QuickView.
    * @returns Pointer to the control instance for chaining
    */
  def setWidth(sWidth: js.Any): QuickView = js.native
}

