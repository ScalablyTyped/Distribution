package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViews extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): IView
}

object IViews {
  @scala.inline
  def apply(Count: scala.Double, Item: scala.Double => IView): IViews = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IViews]
  }
}

