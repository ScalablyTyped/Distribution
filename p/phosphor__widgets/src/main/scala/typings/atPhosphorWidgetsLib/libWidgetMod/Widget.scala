package typings
package atPhosphorWidgetsLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/widget", "Widget")
@js.native
/**
  * Construct a new widget.
  *
  * @param options - The options for initializing the widget.
  */
class Widget ()
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IObservableDisposable
     with atPhosphorMessagingLib.atPhosphorMessagingMod.IMessageHandler {
  def this(options: atPhosphorWidgetsLib.libWidgetMod.WidgetNs.IOptions) = this()
  var _disposed: js.Any = js.native
  var _flags: js.Any = js.native
  var _layout: js.Any = js.native
  var _parent: js.Any = js.native
  /**
    * The dataset for the widget's DOM node.
    */
  val dataset: stdLib.DOMStringMap = js.native
  /**
    * A signal emitted when the object is disposed.
    */
  /* CompleteClass */
  override val disposed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * Get the id of the widget's DOM node.
    */
  /**
    * Set the id of the widget's DOM node.
    */
  var id: java.lang.String = js.native
  /**
    * Test whether the widget's node is attached to the DOM.
    */
  val isAttached: scala.Boolean = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * Test whether the widget is explicitly hidden.
    */
  val isHidden: scala.Boolean = js.native
  /**
    * Test whether the widget is visible.
    *
    * #### Notes
    * A widget is visible when it is attached to the DOM, is not
    * explicitly hidden, and has no explicitly hidden ancestors.
    */
  val isVisible: scala.Boolean = js.native
  /**
    * Get the layout for the widget.
    */
  /**
    * Set the layout for the widget.
    *
    * #### Notes
    * The layout is single-use only. It cannot be changed after the
    * first assignment.
    *
    * The layout is disposed automatically when the widget is disposed.
    */
  var layout: atPhosphorWidgetsLib.libLayoutMod.Layout | scala.Null = js.native
  /**
    * Get the DOM node owned by the widget.
    */
  val node: stdLib.HTMLElement = js.native
  /**
    * Get the parent of the widget.
    */
  /**
    * Set the parent of the widget.
    *
    * #### Notes
    * Children are typically added to a widget by using a layout, which
    * means user code will not normally set the parent widget directly.
    *
    * The widget will be automatically removed from its old parent.
    *
    * This is a no-op if there is no effective parent change.
    */
  var parent: Widget | scala.Null = js.native
  /**
    * The title object for the widget.
    *
    * #### Notes
    * The title object is used by some container widgets when displaying
    * the widget alongside some title, such as a tab panel or side bar.
    *
    * Since not all widgets will use the title, it is created on demand.
    *
    * The `owner` property of the title is set to this widget.
    */
  val title: atPhosphorWidgetsLib.libTitleMod.Title[Widget] = js.native
  /**
    * Post an `'activate-request'` message to the widget.
    *
    * #### Notes
    * This is a simple convenience method for posting the message.
    */
  def activate(): scala.Unit = js.native
  /**
    * Add a class name to the widget's DOM node.
    *
    * @param name - The class name to add to the node.
    *
    * #### Notes
    * If the class name is already added to the node, this is a no-op.
    *
    * The class name must not contain whitespace.
    */
  def addClass(name: java.lang.String): scala.Unit = js.native
  /**
    * Create an iterator over the widget's children.
    *
    * @returns A new iterator over the children of the widget.
    *
    * #### Notes
    * The widget must have a populated layout in order to have children.
    *
    * If a layout is not installed, the returned iterator will be empty.
    */
  def children(): atPhosphorAlgorithmLib.libIterMod.IIterator[Widget] = js.native
  /**
    * Clear the given widget flag.
    *
    * #### Notes
    * This will not typically be called directly by user code.
    */
  def clearFlag(flag: atPhosphorWidgetsLib.libWidgetMod.WidgetNs.Flag): scala.Unit = js.native
  /**
    * Send a `'close-request'` message to the widget.
    *
    * #### Notes
    * This is a simple convenience method for sending the message.
    */
  def close(): scala.Unit = js.native
  /**
    * Test whether a widget is a descendant of this widget.
    *
    * @param widget - The descendant widget of interest.
    *
    * @returns `true` if the widget is a descendant, `false` otherwise.
    */
  def contains(widget: Widget): scala.Boolean = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Post a `'fit-request'` message to the widget.
    *
    * #### Notes
    * This is a simple convenience method for posting the message.
    */
  def fit(): scala.Unit = js.native
  /**
    * Test whether the widget's DOM node has the given class name.
    *
    * @param name - The class name of interest.
    *
    * @returns `true` if the node has the class, `false` otherwise.
    */
  def hasClass(name: java.lang.String): scala.Boolean = js.native
  /**
    * Hide the widget and make it hidden to its parent widget.
    *
    * #### Notes
    * This causes the [[isHidden]] property to be `true`.
    *
    * If the widget is explicitly hidden, this is a no-op.
    */
  def hide(): scala.Unit = js.native
  /**
    * Invoke the message processing routine of the widget's layout.
    *
    * @param msg - The message to dispatch to the layout.
    *
    * #### Notes
    * This is a no-op if the widget does not have a layout.
    *
    * This will not typically be called directly by user code.
    */
  /* protected */ def notifyLayout(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on an `'activate-request'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onActivateRequest(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on an `'after-attach'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onAfterAttach(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on an `'after-detach'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onAfterDetach(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on an `'after-hide'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onAfterHide(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on an `'after-show'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onAfterShow(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on a `'before-attach'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onBeforeAttach(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on a `'before-detach'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onBeforeDetach(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on a `'before-hide'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onBeforeHide(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on a `'before-show'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onBeforeShow(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on a `'child-added'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onChildAdded(msg: atPhosphorWidgetsLib.libWidgetMod.WidgetNs.ChildMessage): scala.Unit = js.native
  /**
    * A message handler invoked on a `'child-removed'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onChildRemoved(msg: atPhosphorWidgetsLib.libWidgetMod.WidgetNs.ChildMessage): scala.Unit = js.native
  /**
    * A message handler invoked on a `'close-request'` message.
    *
    * #### Notes
    * The default implementation unparents or detaches the widget.
    */
  /* protected */ def onCloseRequest(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on a `'fit-request'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onFitRequest(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on a `'resize'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onResize(msg: atPhosphorWidgetsLib.libWidgetMod.WidgetNs.ResizeMessage): scala.Unit = js.native
  /**
    * A message handler invoked on an `'update-request'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onUpdateRequest(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * Process a message sent to the handler.
    *
    * @param msg - The message to be processed.
    */
  /* CompleteClass */
  override def processMessage(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * Remove a class name from the widget's DOM node.
    *
    * @param name - The class name to remove from the node.
    *
    * #### Notes
    * If the class name is not yet added to the node, this is a no-op.
    *
    * The class name must not contain whitespace.
    */
  def removeClass(name: java.lang.String): scala.Unit = js.native
  /**
    * Set the given widget flag.
    *
    * #### Notes
    * This will not typically be called directly by user code.
    */
  def setFlag(flag: atPhosphorWidgetsLib.libWidgetMod.WidgetNs.Flag): scala.Unit = js.native
  /**
    * Show or hide the widget according to a boolean value.
    *
    * @param hidden - `true` to hide the widget, or `false` to show it.
    *
    * #### Notes
    * This is a convenience method for `hide()` and `show()`.
    */
  def setHidden(hidden: scala.Boolean): scala.Unit = js.native
  /**
    * Show the widget and make it visible to its parent widget.
    *
    * #### Notes
    * This causes the [[isHidden]] property to be `false`.
    *
    * If the widget is not explicitly hidden, this is a no-op.
    */
  def show(): scala.Unit = js.native
  /**
    * Test whether the given widget flag is set.
    *
    * #### Notes
    * This will not typically be called directly by user code.
    */
  def testFlag(flag: atPhosphorWidgetsLib.libWidgetMod.WidgetNs.Flag): scala.Boolean = js.native
  /**
    * Toggle a class name on the widget's DOM node.
    *
    * @param name - The class name to toggle on the node.
    *
    * @param force - Whether to force add the class (`true`) or force
    *   remove the class (`false`). If not provided, the presence of
    *   the class will be toggled from its current state.
    *
    * @returns `true` if the class is now present, `false` otherwise.
    *
    * #### Notes
    * The class name must not contain whitespace.
    */
  def toggleClass(name: java.lang.String): scala.Boolean = js.native
  def toggleClass(name: java.lang.String, force: scala.Boolean): scala.Boolean = js.native
  /**
    * Post an `'update-request'` message to the widget.
    *
    * #### Notes
    * This is a simple convenience method for posting the message.
    */
  def update(): scala.Unit = js.native
}

