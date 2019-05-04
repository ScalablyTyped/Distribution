package typings
package atPhosphorWidgetsLib.libPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/panel", "Panel")
@js.native
/**
  * Construct a new panel.
  *
  * @param options - The options for initializing the panel.
  */
class Panel ()
  extends atPhosphorWidgetsLib.libWidgetMod.Widget {
  def this(options: atPhosphorWidgetsLib.libPanelMod.PanelNs.IOptions) = this()
  /**
    * A read-only array of the widgets in the panel.
    */
  val widgets: js.Array[atPhosphorWidgetsLib.libWidgetMod.Widget] = js.native
  /**
    * Add a widget to the end of the panel.
    *
    * @param widget - The widget to add to the panel.
    *
    * #### Notes
    * If the widget is already contained in the panel, it will be moved.
    */
  def addWidget(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Unit = js.native
  /**
    * Insert a widget at the specified index.
    *
    * @param index - The index at which to insert the widget.
    *
    * @param widget - The widget to insert into to the panel.
    *
    * #### Notes
    * If the widget is already contained in the panel, it will be moved.
    */
  def insertWidget(index: scala.Double, widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Unit = js.native
}

