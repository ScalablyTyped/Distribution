package typings.phosphorWidgets.tabbarMod.TabBar

import typings.phosphorWidgets.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the data to render a tab.
  */
trait IRenderData[T] extends js.Object {
  /**
    * Whether the tab is the current tab.
    */
  val current: Boolean
  /**
    * The title associated with the tab.
    */
  val title: Title[T]
  /**
    * The z-index for the tab.
    */
  val zIndex: Double
}

object IRenderData {
  @scala.inline
  def apply[T](current: Boolean, title: Title[T], zIndex: Double): IRenderData[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRenderData[T]]
  }
}

