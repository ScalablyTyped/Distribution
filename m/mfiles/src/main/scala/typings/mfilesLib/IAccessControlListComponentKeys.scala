package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlListComponentKeys extends js.Object {
  val Count: scala.Double
  def Clone(): IAccessControlListComponentKeys
  def Item(Index: scala.Double): IAccessControlListComponentKey
}

object IAccessControlListComponentKeys {
  @scala.inline
  def apply(
    Clone: () => IAccessControlListComponentKeys,
    Count: scala.Double,
    Item: scala.Double => IAccessControlListComponentKey
  ): IAccessControlListComponentKeys = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IAccessControlListComponentKeys]
  }
}

