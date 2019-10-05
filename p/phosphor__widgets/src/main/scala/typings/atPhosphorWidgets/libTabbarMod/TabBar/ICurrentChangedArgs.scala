package typings.atPhosphorWidgets.libTabbarMod.TabBar

import typings.atPhosphorWidgets.libTitleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `currentChanged` signal.
  */
trait ICurrentChangedArgs[T] extends js.Object {
  /**
    * The currently selected index.
    */
  val currentIndex: Double
  /**
    * The currently selected title.
    */
  val currentTitle: Title[T] | Null
  /**
    * The previously selected index.
    */
  val previousIndex: Double
  /**
    * The previously selected title.
    */
  val previousTitle: Title[T] | Null
}

object ICurrentChangedArgs {
  @scala.inline
  def apply[T](
    currentIndex: Double,
    previousIndex: Double,
    currentTitle: Title[T] = null,
    previousTitle: Title[T] = null
  ): ICurrentChangedArgs[T] = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex, previousIndex = previousIndex)
    if (currentTitle != null) __obj.updateDynamic("currentTitle")(currentTitle)
    if (previousTitle != null) __obj.updateDynamic("previousTitle")(previousTitle)
    __obj.asInstanceOf[ICurrentChangedArgs[T]]
  }
}

