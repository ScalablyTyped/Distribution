package typings.mfiles

import typings.mfiles.MFiles.MFDataFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataFunctionCall extends StObject {
  
  val DataFunction: MFDataFunction = js.native
  
  def SetDataDate(): Unit = js.native
  
  def SetDataDaysFrom(): Unit = js.native
  
  def SetDataDaysTo(): Unit = js.native
  
  def SetDataInitialCharGroup(Locale: Double): Unit = js.native
  
  def SetDataIntegerSegment(SegmentSize: Double): Unit = js.native
  
  def SetDataLeftChars(Characters: Double): Unit = js.native
  
  def SetDataMonth(): Unit = js.native
  
  def SetDataNoOp(): Unit = js.native
  
  def SetDataYear(): Unit = js.native
  
  def SetDataYearAndMonth(): Unit = js.native
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
    val __obj = js.Dynamic.literal(DataFunction = DataFunction.asInstanceOf[js.Any], SetDataDate = js.Any.fromFunction0(SetDataDate), SetDataDaysFrom = js.Any.fromFunction0(SetDataDaysFrom), SetDataDaysTo = js.Any.fromFunction0(SetDataDaysTo), SetDataInitialCharGroup = js.Any.fromFunction1(SetDataInitialCharGroup), SetDataIntegerSegment = js.Any.fromFunction1(SetDataIntegerSegment), SetDataLeftChars = js.Any.fromFunction1(SetDataLeftChars), SetDataMonth = js.Any.fromFunction0(SetDataMonth), SetDataNoOp = js.Any.fromFunction0(SetDataNoOp), SetDataYear = js.Any.fromFunction0(SetDataYear), SetDataYearAndMonth = js.Any.fromFunction0(SetDataYearAndMonth))
    __obj.asInstanceOf[IDataFunctionCall]
  }
  
  @scala.inline
  implicit class IDataFunctionCallMutableBuilder[Self <: IDataFunctionCall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFunction(value: MFDataFunction): Self = StObject.set(x, "DataFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDataDate(value: () => Unit): Self = StObject.set(x, "SetDataDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDataDaysFrom(value: () => Unit): Self = StObject.set(x, "SetDataDaysFrom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDataDaysTo(value: () => Unit): Self = StObject.set(x, "SetDataDaysTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDataInitialCharGroup(value: Double => Unit): Self = StObject.set(x, "SetDataInitialCharGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDataIntegerSegment(value: Double => Unit): Self = StObject.set(x, "SetDataIntegerSegment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDataLeftChars(value: Double => Unit): Self = StObject.set(x, "SetDataLeftChars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDataMonth(value: () => Unit): Self = StObject.set(x, "SetDataMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDataNoOp(value: () => Unit): Self = StObject.set(x, "SetDataNoOp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDataYear(value: () => Unit): Self = StObject.set(x, "SetDataYear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDataYearAndMonth(value: () => Unit): Self = StObject.set(x, "SetDataYearAndMonth", js.Any.fromFunction0(value))
  }
}
