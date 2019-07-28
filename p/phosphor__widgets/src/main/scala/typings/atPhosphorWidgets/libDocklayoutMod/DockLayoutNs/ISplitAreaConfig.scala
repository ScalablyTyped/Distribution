package typings.atPhosphorWidgets.libDocklayoutMod.DockLayoutNs

import typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`split-area`
import typings.atPhosphorWidgets.atPhosphorWidgetsStrings.horizontal
import typings.atPhosphorWidgets.atPhosphorWidgetsStrings.vertical
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
  var orientation: horizontal | vertical
  /**
    * The relative sizes of the children.
    */
  var sizes: js.Array[Double]
  /**
    * The discriminated type of the config object.
    */
  var `type`: `split-area`
}

object ISplitAreaConfig {
  @scala.inline
  def apply(
    children: js.Array[AreaConfig],
    orientation: horizontal | vertical,
    sizes: js.Array[Double],
    `type`: `split-area`
  ): ISplitAreaConfig = {
    val __obj = js.Dynamic.literal(children = children, orientation = orientation.asInstanceOf[js.Any], sizes = sizes)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ISplitAreaConfig]
  }
}

