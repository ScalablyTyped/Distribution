package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViews extends js.Object {
  val Count: Double
  def Item(Index: Double): IView
}

object IViews {
  @scala.inline
  def apply(Count: Double, Item: Double => IView): IViews = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IViews]
  }
}

