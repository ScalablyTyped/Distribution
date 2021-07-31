package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFolderListingColumns extends StObject {
  
  def Add(Index: Double, FolderListingColumn: IFolderListingColumn): Unit = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IFolderListingColumn = js.native
  def Item(Index: Double, value: IFolderListingColumn): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
}
