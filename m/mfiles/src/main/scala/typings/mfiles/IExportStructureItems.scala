package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExportStructureItems extends js.Object {
  
  def Add(Index: Double, ExportStructureItem: IExportStructureItem): Unit = js.native
  
  def Clone(): IExportStructureItems = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IExportStructureItem = js.native
  def Item(Index: Double, value: IExportStructureItem): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
}
