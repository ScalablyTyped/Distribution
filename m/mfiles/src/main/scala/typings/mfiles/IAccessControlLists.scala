package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlLists extends js.Object {
  val Count: Double
  def Item(Index: Double): IAccessControlList
}

object IAccessControlLists {
  @scala.inline
  def apply(Count: Double, Item: Double => IAccessControlList): IAccessControlLists = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IAccessControlLists]
  }
}

