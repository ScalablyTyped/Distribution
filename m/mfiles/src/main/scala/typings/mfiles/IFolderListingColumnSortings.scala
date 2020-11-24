package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFolderListingColumnSortings extends js.Object {
  
  def Add(Index: Double, FolderListingColumnSorting: IFolderListingColumnSorting): Unit = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IFolderListingColumnSorting = js.native
  def Item(Index: Double, value: IFolderListingColumnSorting): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
}
