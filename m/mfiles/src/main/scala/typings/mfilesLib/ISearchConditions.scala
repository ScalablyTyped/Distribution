package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchConditions extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, SearchCondition: ISearchCondition): scala.Unit = js.native
  def AppendFromExportedSearchString(ExportedSearchString: java.lang.String): scala.Unit = js.native
  def Clone(): ISearchConditions = js.native
  def GetAsExportedSearchString(SearchFlags: mfilesLib.MFilesNs.MFSearchFlags): java.lang.String = js.native
  def Item(Index: scala.Double): ISearchCondition = js.native
  def Item(Index: scala.Double, value: ISearchCondition): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

