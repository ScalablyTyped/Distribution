package typings
package atPhosphorWidgetsLib.libLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/layout", "Layout")
@js.native
/**
  * Construct a new layout.
  *
  * @param options - The options for initializing the layout.
  */
abstract class Layout ()
  extends atPhosphorAlgorithmLib.libIterMod.IIterable[atPhosphorWidgetsLib.libWidgetMod.Widget]
     with atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  def this(options: atPhosphorWidgetsLib.libLayoutMod.LayoutNs.IOptions) = this()
  var _disposed: js.Any = js.native
  var _fitPolicy: js.Any = js.native
  var _parent: js.Any = js.native
  /**
    * Get the fit policy for the layout.
    *
    * #### Notes
    * The fit policy controls the computed size constraints which are
    * applied to the parent widget by the layout.
    *
    * Some layout implementations may ignore the fit policy.
    */
  /**
    * Set the fit policy for the layout.
    *
    * #### Notes
    * The fit policy controls the computed size constraints which are
    * applied to the parent widget by the layout.
    *
    * Some layout implementations may ignore the fit policy.
    *
    * Changing the fit policy will clear the current size constraint
    * for the parent widget and then re-fit the parent.
    */
  var fitPolicy: atPhosphorWidgetsLib.libLayoutMod.LayoutNs.FitPolicy = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * Get the parent widget of the layout.
    */
  /**
    * Set the parent widget of the layout.
    *
    * #### Notes
    * This is set automatically when installing the layout on the parent
    * widget. The parent widget should not be set directly by user code.
    */
  var parent: atPhosphorWidgetsLib.libWidgetMod.Widget | scala.Null = js.native
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
    * Perform layout initialization which requires the parent widget.
    *
    * #### Notes
    * This method is invoked immediately after the layout is installed
    * on the parent widget.
    *
    * The default implementation reparents all of the widgets to the
    * layout parent widget.
    *
    * Subclasses should reimplement this method and attach the child
    * widget nodes to the parent widget's node.
    */
  /* protected */ def init(): scala.Unit = js.native
  /**
    * Get an iterator over the object's values.
    *
    * @returns An iterator which yields the object's values.
    *
    * #### Notes
    * Depending on the iterable, the returned iterator may or may not be
    * a new object. A collection or other container-like object should
    * typically return a new iterator, while an iterator itself should
    * normally return `this`.
    */
  /* CompleteClass */
  override def iter(): atPhosphorAlgorithmLib.libIterMod.IIterator[atPhosphorWidgetsLib.libWidgetMod.Widget] = js.native
  /**
    * A message handler invoked on an `'after-attach'` message.
    *
    * #### Notes
    * The default implementation of this method forwards the message
    * to all widgets. It assumes all widget nodes are attached to the
    * parent widget node.
    *
    * This may be reimplemented by subclasses as needed.
    */
  /* protected */ def onAfterAttach(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on an `'after-detach'` message.
    *
    * #### Notes
    * The default implementation of this method forwards the message
    * to all widgets. It assumes all widget nodes are attached to the
    * parent widget node.
    *
    * This may be reimplemented by subclasses as needed.
    */
  /* protected */ def onAfterDetach(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on an `'after-hide'` message.
    *
    * #### Notes
    * The default implementation of this method forwards the message to
    * all non-hidden widgets. It assumes all widget nodes are attached
    * to the parent widget node.
    *
    * This may be reimplemented by subclasses as needed.
    */
  /* protected */ def onAfterHide(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on an `'after-show'` message.
    *
    * #### Notes
    * The default implementation of this method forwards the message to
    * all non-hidden widgets. It assumes all widget nodes are attached
    * to the parent widget node.
    *
    * This may be reimplemented by subclasses as needed.
    */
  /* protected */ def onAfterShow(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on a `'before-attach'` message.
    *
    * #### Notes
    * The default implementation of this method forwards the message
    * to all widgets. It assumes all widget nodes are attached to the
    * parent widget node.
    *
    * This may be reimplemented by subclasses as needed.
    */
  /* protected */ def onBeforeAttach(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on a `'before-detach'` message.
    *
    * #### Notes
    * The default implementation of this method forwards the message
    * to all widgets. It assumes all widget nodes are attached to the
    * parent widget node.
    *
    * This may be reimplemented by subclasses as needed.
    */
  /* protected */ def onBeforeDetach(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on a `'before-hide'` message.
    *
    * #### Notes
    * The default implementation of this method forwards the message to
    * all non-hidden widgets. It assumes all widget nodes are attached
    * to the parent widget node.
    *
    * This may be reimplemented by subclasses as needed.
    */
  /* protected */ def onBeforeHide(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on a `'before-show'` message.
    *
    * #### Notes
    * The default implementation of this method forwards the message to
    * all non-hidden widgets. It assumes all widget nodes are attached
    * to the parent widget node.
    *
    * This may be reimplemented by subclasses as needed.
    */
  /* protected */ def onBeforeShow(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * A message handler invoked on a `'child-hidden'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onChildHidden(msg: atPhosphorWidgetsLib.libWidgetMod.WidgetNs.ChildMessage): scala.Unit = js.native
  /**
    * A message handler invoked on a `'child-removed'` message.
    *
    * #### Notes
    * This will remove the child widget from the layout.
    *
    * Subclasses should **not** typically reimplement this method.
    */
  /* protected */ def onChildRemoved(msg: atPhosphorWidgetsLib.libWidgetMod.WidgetNs.ChildMessage): scala.Unit = js.native
  /**
    * A message handler invoked on a `'child-shown'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* protected */ def onChildShown(msg: atPhosphorWidgetsLib.libWidgetMod.WidgetNs.ChildMessage): scala.Unit = js.native
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
    * The layout should ensure that its widgets are resized according
    * to the specified layout space, and that they are sent a `'resize'`
    * message if appropriate.
    *
    * The default implementation of this method sends an `UnknownSize`
    * resize message to all widgets.
    *
    * This may be reimplemented by subclasses as needed.
    */
  /* protected */ def onResize(msg: atPhosphorWidgetsLib.libWidgetMod.WidgetNs.ResizeMessage): scala.Unit = js.native
  /**
    * A message handler invoked on an `'update-request'` message.
    *
    * #### Notes
    * The layout should ensure that its widgets are resized according
    * to the available layout space, and that they are sent a `'resize'`
    * message if appropriate.
    *
    * The default implementation of this method sends an `UnknownSize`
    * resize message to all widgets.
    *
    * This may be reimplemented by subclasses as needed.
    */
  /* protected */ def onUpdateRequest(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * Process a message sent to the parent widget.
    *
    * @param msg - The message sent to the parent widget.
    *
    * #### Notes
    * This method is called by the parent widget to process a message.
    *
    * Subclasses may reimplement this method as needed.
    */
  def processParentMessage(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * Remove a widget from the layout.
    *
    * @param widget - The widget to remove from the layout.
    *
    * #### Notes
    * A widget is automatically removed from the layout when its `parent`
    * is set to `null`. This method should only be invoked directly when
    * removing a widget from a layout which has yet to be installed on a
    * parent widget.
    *
    * This method should *not* modify the widget's `parent`.
    */
  def removeWidget(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Unit = js.native
}

