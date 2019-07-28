package typings.mfiles

import typings.mfiles.MFilesNs.MFDataFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataFunctionCall extends js.Object {
  val DataFunction: MFDataFunction
  def SetDataDate(): Unit
  def SetDataDaysFrom(): Unit
  def SetDataDaysTo(): Unit
  def SetDataInitialCharGroup(Locale: Double): Unit
  def SetDataIntegerSegment(SegmentSize: Double): Unit
  def SetDataLeftChars(Characters: Double): Unit
  def SetDataMonth(): Unit
  def SetDataNoOp(): Unit
  def SetDataYear(): Unit
  def SetDataYearAndMonth(): Unit
}

object IDataFunctionCall {
  @scala.inline
  def apply(
    DataFunction: MFDataFunction,
    SetDataDate: () => Unit,
    SetDataDaysFrom: () => Unit,
    SetDataDaysTo: () => Unit,
    SetDataInitialCharGroup: Double => Unit,
    SetDataIntegerSegment: Double => Unit,
    SetDataLeftChars: Double => Unit,
    SetDataMonth: () => Unit,
    SetDataNoOp: () => Unit,
    SetDataYear: () => Unit,
    SetDataYearAndMonth: () => Unit
  ): IDataFunctionCall = {
    val __obj = js.Dynamic.literal(DataFunction = DataFunction, SetDataDate = js.Any.fromFunction0(SetDataDate), SetDataDaysFrom = js.Any.fromFunction0(SetDataDaysFrom), SetDataDaysTo = js.Any.fromFunction0(SetDataDaysTo), SetDataInitialCharGroup = js.Any.fromFunction1(SetDataInitialCharGroup), SetDataIntegerSegment = js.Any.fromFunction1(SetDataIntegerSegment), SetDataLeftChars = js.Any.fromFunction1(SetDataLeftChars), SetDataMonth = js.Any.fromFunction0(SetDataMonth), SetDataNoOp = js.Any.fromFunction0(SetDataNoOp), SetDataYear = js.Any.fromFunction0(SetDataYear), SetDataYearAndMonth = js.Any.fromFunction0(SetDataYearAndMonth))
  
    __obj.asInstanceOf[IDataFunctionCall]
  }
}

