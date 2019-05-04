package typings
package atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layout config object for a split area.
  */
trait ISplitAreaConfig extends AreaConfig {
  /**
    * The children in the split area.
    */
  var children: js.Array[AreaConfig]
  /**
    * The orientation of the split area.
    */
  var orientation: atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.horizontal | atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.vertical
  /**
    * The relative sizes of the children.
    */
  var sizes: js.Array[scala.Double]
  /**
    * The discriminated type of the config object.
    */
  var `type`: atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`split-area`
}

object ISplitAreaConfig {
  @scala.inline
  def apply(
    children: js.Array[AreaConfig],
    orientation: atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.horizontal | atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.vertical,
    sizes: js.Array[scala.Double],
    `type`: atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`split-area`
  ): ISplitAreaConfig = {
    val __obj = js.Dynamic.literal(children = children, orientation = orientation.asInstanceOf[js.Any], sizes = sizes)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ISplitAreaConfig]
  }
}

