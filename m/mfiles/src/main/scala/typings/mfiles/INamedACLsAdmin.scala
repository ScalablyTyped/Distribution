package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamedACLsAdmin extends js.Object {
  val Count: Double
  def Item(Index: Double): INamedACLAdmin
}

object INamedACLsAdmin {
  @scala.inline
  def apply(Count: Double, Item: Double => INamedACLAdmin): INamedACLsAdmin = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[INamedACLsAdmin]
  }
}

