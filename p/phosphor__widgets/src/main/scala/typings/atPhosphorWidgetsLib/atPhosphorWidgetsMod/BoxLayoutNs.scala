package typings
package atPhosphorWidgetsLib.atPhosphorWidgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "BoxLayout")
@js.native
object BoxLayoutNs extends js.Object {
  /**
    * Get the box layout size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box layout size basis for the widget.
    */
  def getSizeBasis(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Double = js.native
  /**
    * Get the box layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box layout stretch factor for the widget.
    */
  def getStretch(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Double = js.native
  /**
    * Set the box layout size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the size basis.
    */
  def setSizeBasis(widget: atPhosphorWidgetsLib.libWidgetMod.Widget, value: scala.Double): scala.Unit = js.native
  /**
    * Set the box layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: atPhosphorWidgetsLib.libWidgetMod.Widget, value: scala.Double): scala.Unit = js.native
}

