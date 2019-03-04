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
    Clone: js.Function0[IAccessControlEntryKeys],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IAccessControlEntryKey]
  ): IAccessControlEntryKeys = {
    val __obj = js.Dynamic.literal(Clone = Clone, Count = Count, Item = Item)
  
    __obj.asInstanceOf[IAccessControlEntryKeys]
  }
}

