package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExportStructureItems extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, ExportStructureItem: IExportStructureItem): scala.Unit = js.native
  def Clone(): IExportStructureItems = js.native
  def Item(Index: scala.Double): IExportStructureItem = js.native
  def Item(Index: scala.Double, value: IExportStructureItem): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

