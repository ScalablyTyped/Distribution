package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultEventLogOperations extends js.Object {
  
  def Clear(): Unit = js.native
  
  def ClearRange(FirstEventID: Double, LastEventID: Double): Unit = js.native
  
  def ClearRange_32bit(FirstEventID: String, LastEventID: String): Unit = js.native
  
  def ExportAll(): String = js.native
  
  def ExportRange(FirstEventID: Double, LastEventID: Double, DeleteEventsAfterExporting: Boolean): String = js.native
  
  def ExportRange_32bit(FirstEventID: String, LastEventID: String, DeleteEventsAfterExporting: Boolean): String = js.native
  
  def GetIDRange(): IIDRange = js.native
  
  def IsLoggingEnabled(): Boolean = js.native
  
  def SetLoggingEnabled(Enabled: Boolean): Unit = js.native
}
object IVaultEventLogOperations {
  
  @scala.inline
  def apply(
    Clear: () => Unit,
    ClearRange: (Double, Double) => Unit,
    ClearRange_32bit: (String, String) => Unit,
    ExportAll: () => String,
    ExportRange: (Double, Double, Boolean) => String,
    ExportRange_32bit: (String, String, Boolean) => String,
    GetIDRange: () => IIDRange,
    IsLoggingEnabled: () => Boolean,
    SetLoggingEnabled: Boolean => Unit
  ): IVaultEventLogOperations = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), ClearRange = js.Any.fromFunction2(ClearRange), ClearRange_32bit = js.Any.fromFunction2(ClearRange_32bit), ExportAll = js.Any.fromFunction0(ExportAll), ExportRange = js.Any.fromFunction3(ExportRange), ExportRange_32bit = js.Any.fromFunction3(ExportRange_32bit), GetIDRange = js.Any.fromFunction0(GetIDRange), IsLoggingEnabled = js.Any.fromFunction0(IsLoggingEnabled), SetLoggingEnabled = js.Any.fromFunction1(SetLoggingEnabled))
    __obj.asInstanceOf[IVaultEventLogOperations]
  }
  
  @scala.inline
  implicit class IVaultEventLogOperationsOps[Self <: IVaultEventLogOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearRange(value: (Double, Double) => Unit): Self = this.set("ClearRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClearRange_32bit(value: (String, String) => Unit): Self = this.set("ClearRange_32bit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExportAll(value: () => String): Self = this.set("ExportAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExportRange(value: (Double, Double, Boolean) => String): Self = this.set("ExportRange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExportRange_32bit(value: (String, String, Boolean) => String): Self = this.set("ExportRange_32bit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetIDRange(value: () => IIDRange): Self = this.set("GetIDRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLoggingEnabled(value: () => Boolean): Self = this.set("IsLoggingEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLoggingEnabled(value: Boolean => Unit): Self = this.set("SetLoggingEnabled", js.Any.fromFunction1(value))
  }
}
