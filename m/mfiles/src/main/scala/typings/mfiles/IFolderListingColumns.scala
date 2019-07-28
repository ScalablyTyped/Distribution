package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderListingColumns extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, FolderListingColumn: IFolderListingColumn): Unit = js.native
  def Item(Index: Double): IFolderListingColumn = js.native
  def Item(Index: Double, value: IFolderListingColumn): Unit = js.native
  def Remove(Index: Double): Unit = js.native
}

