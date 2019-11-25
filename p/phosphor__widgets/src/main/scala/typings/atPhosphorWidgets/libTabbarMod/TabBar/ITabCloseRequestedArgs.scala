package typings.atPhosphorWidgets.libTabbarMod.TabBar

import typings.atPhosphorWidgets.libTitleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `tabCloseRequested` signal.
  */
trait ITabCloseRequestedArgs[T] extends js.Object {
  /**
    * The index of the tab to close.
    */
  val index: Double
  /**
    * The title for the tab.
    */
  val title: Title[T]
}

object ITabCloseRequestedArgs {
  @scala.inline
  def apply[T](index: Double, title: Title[T]): ITabCloseRequestedArgs[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITabCloseRequestedArgs[T]]
  }
}

