package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVersionComments extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): IVersionComment
}

object IVersionComments {
  @scala.inline
  def apply(Count: scala.Double, Item: scala.Double => IVersionComment): IVersionComments = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IVersionComments]
  }
}

