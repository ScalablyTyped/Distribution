package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVersionComments extends js.Object {
  val Count: Double
  def Item(Index: Double): IVersionComment
}

object IVersionComments {
  @scala.inline
  def apply(Count: Double, Item: Double => IVersionComment): IVersionComments = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IVersionComments]
  }
}

