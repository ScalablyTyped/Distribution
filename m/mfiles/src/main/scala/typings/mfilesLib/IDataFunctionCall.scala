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
    SetDataDate: js.Function0[scala.Unit],
    SetDataDaysFrom: js.Function0[scala.Unit],
    SetDataDaysTo: js.Function0[scala.Unit],
    SetDataInitialCharGroup: js.Function1[scala.Double, scala.Unit],
    SetDataIntegerSegment: js.Function1[scala.Double, scala.Unit],
    SetDataLeftChars: js.Function1[scala.Double, scala.Unit],
    SetDataMonth: js.Function0[scala.Unit],
    SetDataNoOp: js.Function0[scala.Unit],
    SetDataYear: js.Function0[scala.Unit],
    SetDataYearAndMonth: js.Function0[scala.Unit]
  ): IDataFunctionCall = {
    val __obj = js.Dynamic.literal(DataFunction = DataFunction, SetDataDate = SetDataDate, SetDataDaysFrom = SetDataDaysFrom, SetDataDaysTo = SetDataDaysTo, SetDataInitialCharGroup = SetDataInitialCharGroup, SetDataIntegerSegment = SetDataIntegerSegment, SetDataLeftChars = SetDataLeftChars, SetDataMonth = SetDataMonth, SetDataNoOp = SetDataNoOp, SetDataYear = SetDataYear, SetDataYearAndMonth = SetDataYearAndMonth)
  
    __obj.asInstanceOf[IDataFunctionCall]
  }
}

