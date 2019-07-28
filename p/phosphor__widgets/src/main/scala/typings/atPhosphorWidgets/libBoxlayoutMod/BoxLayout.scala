package typings.atPhosphorWidgets.libBoxlayoutMod

import typings.atPhosphorWidgets.libBoxlayoutMod.BoxLayoutNs.Alignment
import typings.atPhosphorWidgets.libBoxlayoutMod.BoxLayoutNs.Direction
import typings.atPhosphorWidgets.libBoxlayoutMod.BoxLayoutNs.IOptions
import typings.atPhosphorWidgets.libPanellayoutMod.PanelLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/boxlayout", "BoxLayout")
@js.native
/**
  * Construct a new box layout.
  *
  * @param options - The options for initializing the layout.
  */
class BoxLayout () extends PanelLayout {
  def this(options: IOptions) = this()
  var _alignment: js.Any = js.native
  var _box: js.Any = js.native
  var _direction: js.Any = js.native
  var _dirty: js.Any = js.native
  /**
    * Fit the layout to the total size required by the widgets.
    */
  var _fit: js.Any = js.native
  var _fixed: js.Any = js.native
  var _items: js.Any = js.native
  var _sizers: js.Any = js.native
  var _spacing: js.Any = js.native
  /**
    * Update the layout position and size of the widgets.
    *
    * The parent offset dimensions should be `-1` if unknown.
    */
  var _update: js.Any = js.native
  /**
    * Get the content alignment for the box layout.
    *
    * #### Notes
    * This is the alignment of the widgets in the layout direction.
    *
    * The alignment has no effect if the widgets can expand to fill the
    * entire box layout.
    */
  /**
    * Set the content alignment for the box layout.
    *
    * #### Notes
    * This is the alignment of the widgets in the layout direction.
    *
    * The alignment has no effect if the widgets can expand to fill the
    * entire box layout.
    */
  var alignment: Alignment = js.native
  /**
    * Get the layout direction for the box layout.
    */
  /**
    * Set the layout direction for the box layout.
    */
  var direction: Direction = js.native
  /**
    * Get the inter-element spacing for the box layout.
    */
  /**
    * Set the inter-element spacing for the box layout.
    */
  var spacing: Double = js.native
}

