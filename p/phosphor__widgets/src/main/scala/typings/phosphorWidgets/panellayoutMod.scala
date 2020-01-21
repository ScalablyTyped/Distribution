package typings.phosphorWidgets

import typings.phosphorWidgets.layoutMod.Layout
import typings.phosphorWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/panellayout", JSImport.Namespace)
@js.native
object panellayoutMod extends js.Object {
  @js.native
  class PanelLayout () extends Layout {
    var _widgets: js.Any = js.native
    /**
      * A read-only array of the widgets in the layout.
      */
    val widgets: js.Array[Widget] = js.native
    /**
      * Add a widget to the end of the layout.
      *
      * @param widget - The widget to add to the layout.
      *
      * #### Notes
      * If the widget is already contained in the layout, it will be moved.
      */
    def addWidget(widget: Widget): Unit = js.native
    /**
      * Attach a widget to the parent's DOM node.
      *
      * @param index - The current index of the widget in the layout.
      *
      * @param widget - The widget to attach to the parent.
      *
      * #### Notes
      * This method is called automatically by the panel layout at the
      * appropriate time. It should not be called directly by user code.
      *
      * The default implementation adds the widgets's node to the parent's
      * node at the proper location, and sends the appropriate attach
      * messages to the widget if the parent is attached to the DOM.
      *
      * Subclasses may reimplement this method to control how the widget's
      * node is added to the parent's node.
      */
    /* protected */ def attachWidget(index: Double, widget: Widget): Unit = js.native
    /**
      * Detach a widget from the parent's DOM node.
      *
      * @param index - The previous index of the widget in the layout.
      *
      * @param widget - The widget to detach from the parent.
      *
      * #### Notes
      * This method is called automatically by the panel layout at the
      * appropriate time. It should not be called directly by user code.
      *
      * The default implementation removes the widget's node from the
      * parent's node, and sends the appropriate detach messages to the
      * widget if the parent is attached to the DOM.
      *
      * Subclasses may reimplement this method to control how the widget's
      * node is removed from the parent's node.
      */
    /* protected */ def detachWidget(index: Double, widget: Widget): Unit = js.native
    /**
      * Insert a widget into the layout at the specified index.
      *
      * @param index - The index at which to insert the widget.
      *
      * @param widget - The widget to insert into the layout.
      *
      * #### Notes
      * The index will be clamped to the bounds of the widgets.
      *
      * If the widget is already added to the layout, it will be moved.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral.
      */
    def insertWidget(index: Double, widget: Widget): Unit = js.native
    /**
      * Move a widget in the parent's DOM node.
      *
      * @param fromIndex - The previous index of the widget in the layout.
      *
      * @param toIndex - The current index of the widget in the layout.
      *
      * @param widget - The widget to move in the parent.
      *
      * #### Notes
      * This method is called automatically by the panel layout at the
      * appropriate time. It should not be called directly by user code.
      *
      * The default implementation moves the widget's node to the proper
      * location in the parent's node and sends the appropriate attach and
      * detach messages to the widget if the parent is attached to the DOM.
      *
      * Subclasses may reimplement this method to control how the widget's
      * node is moved in the parent's node.
      */
    /* protected */ def moveWidget(fromIndex: Double, toIndex: Double, widget: Widget): Unit = js.native
    /**
      * Remove the widget at a given index from the layout.
      *
      * @param index - The index of the widget to remove.
      *
      * #### Notes
      * A widget is automatically removed from the layout when its `parent`
      * is set to `null`. This method should only be invoked directly when
      * removing a widget from a layout which has yet to be installed on a
      * parent widget.
      *
      * This method does *not* modify the widget's `parent`.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral.
      */
    def removeWidgetAt(index: Double): Unit = js.native
  }
  
}

