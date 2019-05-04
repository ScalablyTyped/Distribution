package typings
package atPhosphorWidgetsLib.libLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/layout", "LayoutItem")
@js.native
class LayoutItem protected ()
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * Construct a new layout item.
    *
    * @param widget - The widget to be managed by the item.
    *
    * #### Notes
    * The widget will be set to absolute positioning.
    */
  def this(widget: atPhosphorWidgetsLib.libWidgetMod.Widget) = this()
  var _disposed: js.Any = js.native
  var _height: js.Any = js.native
  var _left: js.Any = js.native
  var _maxHeight: js.Any = js.native
  var _maxWidth: js.Any = js.native
  var _minHeight: js.Any = js.native
  var _minWidth: js.Any = js.native
  var _top: js.Any = js.native
  var _width: js.Any = js.native
  /**
    * Whether the managed widget is attached.
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
    * Whether the managed widget is hidden.
    */
  val isHidden: scala.Boolean = js.native
  /**
    * Whether the managed widget is visible.
    */
  val isVisible: scala.Boolean = js.native
  /**
    * The computed maximum height of the widget.
    *
    * #### Notes
    * This value can be updated by calling the `fit` method.
    */
  val maxHeight: scala.Double = js.native
  /**
    * The computed maximum width of the widget.
    *
    * #### Notes
    * This value can be updated by calling the `fit` method.
    */
  val maxWidth: scala.Double = js.native
  /**
    * The computed minimum height of the widget.
    *
    * #### Notes
    * This value can be updated by calling the `fit` method.
    */
  val minHeight: scala.Double = js.native
  /**
    * The computed minimum width of the widget.
    *
    * #### Notes
    * This value can be updated by calling the `fit` method.
    */
  val minWidth: scala.Double = js.native
  /**
    * The widget managed by the layout item.
    */
  val widget: atPhosphorWidgetsLib.libWidgetMod.Widget = js.native
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
    * Update the computed size limits of the managed widget.
    */
  def fit(): scala.Unit = js.native
  /**
    * Update the position and size of the managed widget.
    *
    * @param left - The left edge position of the layout box.
    *
    * @param top - The top edge position of the layout box.
    *
    * @param width - The width of the layout box.
    *
    * @param height - The height of the layout box.
    */
  def update(left: scala.Double, top: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
}

