package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderListingColumns extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, FolderListingColumn: IFolderListingColumn): scala.Unit = js.native
  def Item(Index: scala.Double): IFolderListingColumn = js.native
  def Item(Index: scala.Double, value: IFolderListingColumn): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

