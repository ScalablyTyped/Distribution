package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueListItemSearchResults extends js.Object {
  val Count: scala.Double
  var MoreResults: scala.Boolean
  def Add(Index: scala.Double, ValueListItem: IValueListItem): scala.Unit
  def Clone(): IValueListItemSearchResults
  def Item(Index: scala.Double): IValueListItem
  def Remove(Index: scala.Double): scala.Unit
}

