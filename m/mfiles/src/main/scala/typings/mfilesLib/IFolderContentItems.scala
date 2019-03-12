package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderContentItems extends js.Object {
  val Count: scala.Double
  val MoreResults: scala.Boolean
  def Item(Index: scala.Double): IFolderContentItem
}

object IFolderContentItems {
  @scala.inline
  def apply(Count: scala.Double, Item: scala.Double => IFolderContentItem, MoreResults: scala.Boolean): IFolderContentItems = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item), MoreResults = MoreResults)
  
    __obj.asInstanceOf[IFolderContentItems]
  }
}

