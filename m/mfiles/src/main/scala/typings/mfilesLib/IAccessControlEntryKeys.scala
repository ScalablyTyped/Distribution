package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntryKeys extends js.Object {
  val Count: scala.Double
  def Clone(): IAccessControlEntryKeys
  def Item(Index: scala.Double): IAccessControlEntryKey
}

object IAccessControlEntryKeys {
  @scala.inline
  def apply(
    Clone: () => IAccessControlEntryKeys,
    Count: scala.Double,
    Item: scala.Double => IAccessControlEntryKey
  ): IAccessControlEntryKeys = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IAccessControlEntryKeys]
  }
}

