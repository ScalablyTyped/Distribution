package typings
package atPhosphorWidgetsLib.libBoxpanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/boxpanel", "BoxPanel")
@js.native
/**
  * Construct a new box panel.
  *
  * @param options - The options for initializing the box panel.
  */
class BoxPanel ()
  extends atPhosphorWidgetsLib.libPanelMod.Panel {
  def this(options: atPhosphorWidgetsLib.libBoxpanelMod.BoxPanelNs.IOptions) = this()
  /**
    * Get the content alignment for the box panel.
    *
    * #### Notes
    * This is the alignment of the widgets in the layout direction.
    *
    * The alignment has no effect if the widgets can expand to fill the
    * entire box layout.
    */
  /**
    * Set the content alignment for the box panel.
    *
    * #### Notes
    * This is the alignment of the widgets in the layout direction.
    *
    * The alignment has no effect if the widgets can expand to fill the
    * entire box layout.
    */
  var alignment: atPhosphorWidgetsLib.libBoxpanelMod.BoxPanelNs.Alignment = js.native
  /**
    * Get the layout direction for the box panel.
    */
  /**
    * Set the layout direction for the box panel.
    */
  var direction: atPhosphorWidgetsLib.libBoxpanelMod.BoxPanelNs.Direction = js.native
  /**
    * Get the inter-element spacing for the box panel.
    */
  /**
    * Set the inter-element spacing for the box panel.
    */
  var spacing: scala.Double = js.native
}

