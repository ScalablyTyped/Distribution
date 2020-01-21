package typings.phosphorWidgets.commandpaletteMod.CommandPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The render data for a command palette item.
  */
trait IItemRenderData extends js.Object {
  /**
    * Whether the item is the active item.
    */
  val active: Boolean
  /**
    * The indices of the matched characters in the label.
    */
  val indices: js.Array[Double] | Null
  /**
    * The command palette item to render.
    */
  val item: IItem
}

object IItemRenderData {
  @scala.inline
  def apply(active: Boolean, item: IItem, indices: js.Array[Double] = null): IItemRenderData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemRenderData]
  }
}

