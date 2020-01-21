package typings.phosphorWidgets

import typings.phosphorWidgets.panellayoutMod.PanelLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/stackedlayout", JSImport.Namespace)
@js.native
object stackedlayoutMod extends js.Object {
  @js.native
  class StackedLayout () extends PanelLayout {
    var _box: js.Any = js.native
    var _dirty: js.Any = js.native
    /**
      * Fit the layout to the total size required by the widgets.
      */
    var _fit: js.Any = js.native
    var _items: js.Any = js.native
    /**
      * Update the layout position and size of the widgets.
      *
      * The parent offset dimensions should be `-1` if unknown.
      */
    var _update: js.Any = js.native
  }
  
}

