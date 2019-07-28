package typings.atPhosphorWidgets.libWidgetMod

import typings.atPhosphorMessaging.atPhosphorMessagingMod.ConflatableMessage
import typings.atPhosphorMessaging.atPhosphorMessagingMod.Message
import typings.atPhosphorWidgets.libWidgetMod.WidgetNs.Flag
import typings.atPhosphorWidgets.libWidgetMod.WidgetNs.ResizeMessage
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/widget", "Widget")
@js.native
object WidgetNs extends js.Object {
  /**
    * A message class for child related messages.
    */
  @js.native
  class ChildMessage protected () extends Message {
    /**
      * Construct a new child message.
      *
      * @param type - The message type.
      *
      * @param child - The child widget for the message.
      */
    def this(`type`: String, child: Widget) = this()
    /**
      * The child widget for the message.
      */
    val child: Widget = js.native
  }
  
  @js.native
  sealed trait Flag extends js.Object
  
  /**
    * An options object for initializing a widget.
    */
  trait IOptions extends js.Object {
    /**
      * The optional node to use for the widget.
      *
      * If a node is provided, the widget will assume full ownership
      * and control of the node, as if it had created the node itself.
      *
      * The default is a new `<div>`.
      */
    var node: js.UndefOr[HTMLElement] = js.undefined
  }
  
  /**
    * A message class for `'resize'` messages.
    */
  @js.native
  class ResizeMessage protected () extends Message {
    /**
      * Construct a new resize message.
      *
      * @param width - The **offset width** of the widget, or `-1` if
      *   the width is not known.
      *
      * @param height - The **offset height** of the widget, or `-1` if
      *   the height is not known.
      */
    def this(width: Double, height: Double) = this()
    /**
      * The offset height of the widget.
      *
      * #### Notes
      * This will be `-1` if the height is unknown.
      */
    val height: Double = js.native
    /**
      * The offset width of the widget.
      *
      * #### Notes
      * This will be `-1` if the width is unknown.
      */
    val width: Double = js.native
  }
  
  /**
    * Attach a widget to a host DOM node.
    *
    * @param widget - The widget of interest.
    *
    * @param host - The DOM node to use as the widget's host.
    *
    * @param ref - The child of `host` to use as the reference element.
    *   If this is provided, the widget will be inserted before this
    *   node in the host. The default is `null`, which will cause the
    *   widget to be added as the last child of the host.
    *
    * #### Notes
    * This will throw an error if the widget is not a root widget, if
    * the widget is already attached, or if the host is not attached
    * to the DOM.
    */
  def attach(widget: Widget, host: HTMLElement): Unit = js.native
  def attach(widget: Widget, host: HTMLElement, ref: HTMLElement): Unit = js.native
  /**
    * Detach the widget from its host DOM node.
    *
    * @param widget - The widget of interest.
    *
    * #### Notes
    * This will throw an error if the widget is not a root widget,
    * or if the widget is not attached to the DOM.
    */
  def detach(widget: Widget): Unit = js.native
  /**
    * An enum of widget bit flags.
    */
  @js.native
  object Flag extends js.Object {
    /**
      * A layout cannot be set on the widget.
      */
    @js.native
    sealed trait DisallowLayout extends Flag
    
    /**
      * The widget is attached to the DOM.
      */
    @js.native
    sealed trait IsAttached extends Flag
    
    /**
      * The widget has been disposed.
      */
    @js.native
    sealed trait IsDisposed extends Flag
    
    /**
      * The widget is hidden.
      */
    @js.native
    sealed trait IsHidden extends Flag
    
    /**
      * The widget is visible.
      */
    @js.native
    sealed trait IsVisible extends Flag
    
    /* 16 */ val DisallowLayout: typings.atPhosphorWidgets.libWidgetMod.WidgetNs.Flag.DisallowLayout with Double = js.native
    /* 2 */ val IsAttached: typings.atPhosphorWidgets.libWidgetMod.WidgetNs.Flag.IsAttached with Double = js.native
    /* 1 */ val IsDisposed: typings.atPhosphorWidgets.libWidgetMod.WidgetNs.Flag.IsDisposed with Double = js.native
    /* 4 */ val IsHidden: typings.atPhosphorWidgets.libWidgetMod.WidgetNs.Flag.IsHidden with Double = js.native
    /* 8 */ val IsVisible: typings.atPhosphorWidgets.libWidgetMod.WidgetNs.Flag.IsVisible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Flag with Double] = js.native
  }
  
  /**
    * A collection of stateless messages related to widgets.
    */
  @JSName("Msg")
  @js.native
  object MsgNs extends js.Object {
    /**
      * A singleton conflatable `'activate-request'` message.
      *
      * #### Notes
      * This message should be dispatched to a widget when it should
      * perform the actions necessary to activate the widget, which
      * may include focusing its node or descendant node.
      */
    val ActivateRequest: ConflatableMessage = js.native
    /**
      * A singleton `'after-attach'` message.
      *
      * #### Notes
      * This message is sent to a widget after it is attached.
      */
    val AfterAttach: Message = js.native
    /**
      * A singleton `'after-detach'` message.
      *
      * #### Notes
      * This message is sent to a widget after it is detached.
      */
    val AfterDetach: Message = js.native
    /**
      * A singleton `'after-hide'` message.
      *
      * #### Notes
      * This message is sent to a widget after it becomes not-visible.
      *
      * This message is **not** sent when the widget is being detached.
      */
    val AfterHide: Message = js.native
    /**
      * A singleton `'after-show'` message.
      *
      * #### Notes
      * This message is sent to a widget after it becomes visible.
      *
      * This message is **not** sent when the widget is being attached.
      */
    val AfterShow: Message = js.native
    /**
      * A singleton `'before-attach'` message.
      *
      * #### Notes
      * This message is sent to a widget before it is attached.
      */
    val BeforeAttach: Message = js.native
    /**
      * A singleton `'before-detach'` message.
      *
      * #### Notes
      * This message is sent to a widget before it is detached.
      */
    val BeforeDetach: Message = js.native
    /**
      * A singleton `'before-hide'` message.
      *
      * #### Notes
      * This message is sent to a widget before it becomes not-visible.
      *
      * This message is **not** sent when the widget is being detached.
      */
    val BeforeHide: Message = js.native
    /**
      * A singleton `'before-show'` message.
      *
      * #### Notes
      * This message is sent to a widget before it becomes visible.
      *
      * This message is **not** sent when the widget is being attached.
      */
    val BeforeShow: Message = js.native
    /**
      * A singleton conflatable `'close-request'` message.
      *
      * #### Notes
      * This message should be dispatched to a widget when it should close
      * and remove itself from the widget hierarchy.
      */
    val CloseRequest: ConflatableMessage = js.native
    /**
      * A singleton conflatable `'fit-request'` message.
      *
      * #### Notes
      * For widgets with a layout, this message will inform the layout to
      * recalculate its size constraints to fit the space requirements of
      * its child widgets, and to update their position and size. Not all
      * layouts will respond to messages of this type.
      */
    val FitRequest: ConflatableMessage = js.native
    /**
      * A singleton `'parent-changed'` message.
      *
      * #### Notes
      * This message is sent to a widget when its parent has changed.
      */
    val ParentChanged: Message = js.native
    /**
      * A singleton conflatable `'update-request'` message.
      *
      * #### Notes
      * This message can be dispatched to supporting widgets in order to
      * update their content based on the current widget state. Not all
      * widgets will respond to messages of this type.
      *
      * For widgets with a layout, this message will inform the layout to
      * update the position and size of its child widgets.
      */
    val UpdateRequest: ConflatableMessage = js.native
  }
  
  /**
    * The namespace for the `ResizeMessage` class statics.
    */
  @JSName("ResizeMessage")
  @js.native
  object ResizeMessageNs extends js.Object {
    /**
      * A singleton `'resize'` message with an unknown size.
      */
    val UnknownSize: ResizeMessage = js.native
  }
  
}

