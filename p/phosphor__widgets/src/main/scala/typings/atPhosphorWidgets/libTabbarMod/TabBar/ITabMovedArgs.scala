package typings.atPhosphorWidgets.libTabbarMod.TabBar

import typings.atPhosphorWidgets.libTitleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `tabMoved` signal.
  */
trait ITabMovedArgs[T] extends js.Object {
  /**
    * The previous index of the tab.
    */
  val fromIndex: Double
  /**
    * The title for the tab.
    */
  val title: Title[T]
  /**
    * The current index of the tab.
    */
  val toIndex: Double
}

object ITabMovedArgs {
  @scala.inline
  def apply[T](fromIndex: Double, title: Title[T], toIndex: Double): ITabMovedArgs[T] = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex, title = title, toIndex = toIndex)
  
    __obj.asInstanceOf[ITabMovedArgs[T]]
  }
}

