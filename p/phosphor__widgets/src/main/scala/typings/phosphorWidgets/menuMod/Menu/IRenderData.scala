package typings.phosphorWidgets.menuMod.Menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the data to render a menu item.
  */
trait IRenderData extends js.Object {
  /**
    * Whether the item is the active item.
    */
  val active: Boolean
  /**
    * Whether the item should be collapsed.
    */
  val collapsed: Boolean
  /**
    * The item to be rendered.
    */
  val item: IItem
}

object IRenderData {
  @scala.inline
  def apply(active: Boolean, collapsed: Boolean, item: IItem): IRenderData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRenderData]
  }
}

