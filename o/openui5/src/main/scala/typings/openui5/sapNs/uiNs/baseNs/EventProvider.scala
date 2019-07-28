package typings.openui5.sapNs.uiNs.baseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.base.EventProvider")
@js.native
/**
  * Creates an instance of EventProvider.
  */
abstract class EventProvider () extends Object {
  /**
    * Attaches an event handler to the event with the given identifier.
    * @param sEventId The identifier of the event to listen for
    * @param oData An object that will be passed to the handler along with the event object when the event
    * is fired
    * @param fnFunction The handler function to call when the event occurs. This function will be called
    * in the context of the                      <code>oListener</code> instance (if present) or on the
    * event provider instance. The event                      object ({@link sap.ui.base.Event}) is
    * provided as first argument of the handler. Handlers must not change                      the content
    * of the event. The second argument is the specified <code>oData</code> instance (if present).
    * @param oListener The object that wants to be notified when the event occurs (<code>this</code>
    * context within the                       handler function). If it is not specified, the handler
    * function is called in the context of the event provider.
    * @returns Returns <code>this</code> to allow method chaining
    */
  def attachEvent(sEventId: String, oData: js.Any, fnFunction: js.Any): EventProvider = js.native
  def attachEvent(sEventId: String, oData: js.Any, fnFunction: js.Any, oListener: js.Any): EventProvider = js.native
  /**
    * Attaches an event handler, called one time only, to the event with the given identifier.When the
    * event occurs, the handler function is called and the handler registration is automatically removed
    * afterwards.
    * @param sEventId The identifier of the event to listen for
    * @param oData An object that will be passed to the handler along with the event object when the event
    * is fired
    * @param fnFunction The handler function to call when the event occurs. This function will be called
    * in the context of the                      <code>oListener</code> instance (if present) or on the
    * event provider instance. The event                      object ({@link sap.ui.base.Event}) is
    * provided as first argument of the handler. Handlers must not change                      the content
    * of the event. The second argument is the specified <code>oData</code> instance (if present).
    * @param oListener The object that wants to be notified when the event occurs (<code>this</code>
    * context within the                       handler function). If it is not specified, the handler
    * function is called in the context of the event provider.
    * @returns Returns <code>this</code> to allow method chaining
    */
  def attachEventOnce(sEventId: String, oData: js.Any, fnFunction: js.Any): EventProvider = js.native
  def attachEventOnce(sEventId: String, oData: js.Any, fnFunction: js.Any, oListener: js.Any): EventProvider = js.native
  /**
    * Removes a previously attached event handler from the event with the given identifier.The passed
    * parameters must match those used for registration with {@link #attachEvent} beforehand.
    * @param sEventId The identifier of the event to detach from
    * @param fnFunction The handler function to detach from the event
    * @param oListener The object that wanted to be notified when the event occurred
    * @returns Returns <code>this</code> to allow method chaining
    */
  def detachEvent(sEventId: String, fnFunction: js.Any): EventProvider = js.native
  def detachEvent(sEventId: String, fnFunction: js.Any, oListener: js.Any): EventProvider = js.native
  /**
    * Fires an {@link sap.ui.base.Event event} with the given settings and notifies all attached event
    * handlers.
    * @param sEventId The identifier of the event to fire
    * @param mParameters The parameters which should be carried by the event
    * @param bAllowPreventDefault Defines whether function <code>preventDefault</code> is supported on the
    * fired event
    * @param bEnableEventBubbling Defines whether event bubbling is enabled on the fired event. Set to
    * <code>true</code> the event is also forwarded to the parent(s)                                  of
    * the event provider ({@link #getEventingParent}) until the bubbling of the event is stopped or no
    * parent is available anymore.
    * @returns Returns <code>this</code> to allow method chaining. When <code>preventDefault</code> is
    * supported on the fired event                                            the function returns
    * <code>true</code> if the default action should be executed, <code>false</code> otherwise.
    */
  def fireEvent(sEventId: String): EventProvider | Boolean = js.native
  def fireEvent(sEventId: String, mParameters: js.Any): EventProvider | Boolean = js.native
  def fireEvent(sEventId: String, mParameters: js.Any, bAllowPreventDefault: Boolean): EventProvider | Boolean = js.native
  def fireEvent(
    sEventId: String,
    mParameters: js.Any,
    bAllowPreventDefault: Boolean,
    bEnableEventBubbling: Boolean
  ): EventProvider | Boolean = js.native
  /**
    * Returns the parent in the eventing hierarchy of this object.Per default this returns null, but if
    * eventing is used in objects, which are hierarchicallystructured, this can be overwritten to make the
    * object hierarchy visible to the eventing andenables the use of event bubbling within this object
    * hierarchy.
    * @returns The parent event provider
    */
  def getEventingParent(): EventProvider = js.native
  /**
    * Returns whether there are any registered event handlers for the event with the given identifier.
    * @param sEventId The identifier of the event
    * @returns Whether there are any registered event handlers
    */
  def hasListeners(sEventId: String): Boolean = js.native
}

