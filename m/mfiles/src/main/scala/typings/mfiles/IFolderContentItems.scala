package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderContentItems extends js.Object {
  val Count: Double
  val MoreResults: Boolean
  def Item(Index: Double): IFolderContentItem
}

object IFolderContentItems {
  @scala.inline
  def apply(Count: Double, Item: Double => IFolderContentItem, MoreResults: Boolean): IFolderContentItems = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item), MoreResults = MoreResults)
  
    __obj.asInstanceOf[IFolderContentItems]
  }
}

