package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlListComponentKeys extends js.Object {
  val Count: Double
  def Clone(): IAccessControlListComponentKeys
  def Item(Index: Double): IAccessControlListComponentKey
}

object IAccessControlListComponentKeys {
  @scala.inline
  def apply(
    Clone: () => IAccessControlListComponentKeys,
    Count: Double,
    Item: Double => IAccessControlListComponentKey
  ): IAccessControlListComponentKeys = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IAccessControlListComponentKeys]
  }
}

