package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataFunctionCall extends js.Object {
  val DataFunction: mfilesLib.MFilesNs.MFDataFunction
  def SetDataDate(): scala.Unit
  def SetDataDaysFrom(): scala.Unit
  def SetDataDaysTo(): scala.Unit
  def SetDataInitialCharGroup(Locale: scala.Double): scala.Unit
  def SetDataIntegerSegment(SegmentSize: scala.Double): scala.Unit
  def SetDataLeftChars(Characters: scala.Double): scala.Unit
  def SetDataMonth(): scala.Unit
  def SetDataNoOp(): scala.Unit
  def SetDataYear(): scala.Unit
  def SetDataYearAndMonth(): scala.Unit
}

object IDataFunctionCall {
  @scala.inline
  def apply(
    DataFunction: mfilesLib.MFilesNs.MFDataFunction,
    SetDataDate: () => scala.Unit,
    SetDataDaysFrom: () => scala.Unit,
    SetDataDaysTo: () => scala.Unit,
    SetDataInitialCharGroup: scala.Double => scala.Unit,
    SetDataIntegerSegment: scala.Double => scala.Unit,
    SetDataLeftChars: scala.Double => scala.Unit,
    SetDataMonth: () => scala.Unit,
    SetDataNoOp: () => scala.Unit,
    SetDataYear: () => scala.Unit,
    SetDataYearAndMonth: () => scala.Unit
  ): IDataFunctionCall = {
    val __obj = js.Dynamic.literal(DataFunction = DataFunction, SetDataDate = js.Any.fromFunction0(SetDataDate), SetDataDaysFrom = js.Any.fromFunction0(SetDataDaysFrom), SetDataDaysTo = js.Any.fromFunction0(SetDataDaysTo), SetDataInitialCharGroup = js.Any.fromFunction1(SetDataInitialCharGroup), SetDataIntegerSegment = js.Any.fromFunction1(SetDataIntegerSegment), SetDataLeftChars = js.Any.fromFunction1(SetDataLeftChars), SetDataMonth = js.Any.fromFunction0(SetDataMonth), SetDataNoOp = js.Any.fromFunction0(SetDataNoOp), SetDataYear = js.Any.fromFunction0(SetDataYear), SetDataYearAndMonth = js.Any.fromFunction0(SetDataYearAndMonth))
  
    __obj.asInstanceOf[IDataFunctionCall]
  }
}

