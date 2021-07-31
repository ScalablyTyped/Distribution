package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultEventLogOperations extends StObject {
  
  def Clear(): Unit
  
  def ClearRange(FirstEventID: Double, LastEventID: Double): Unit
  
  def ClearRange_32bit(FirstEventID: String, LastEventID: String): Unit
  
  def ExportAll(): String
  
  def ExportRange(FirstEventID: Double, LastEventID: Double, DeleteEventsAfterExporting: Boolean): String
  
  def ExportRange_32bit(FirstEventID: String, LastEventID: String, DeleteEventsAfterExporting: Boolean): String
  
  def GetIDRange(): IIDRange
  
  def IsLoggingEnabled(): Boolean
  
  def SetLoggingEnabled(Enabled: Boolean): Unit
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
  implicit class IVaultEventLogOperationsMutableBuilder[Self <: IVaultEventLogOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearRange(value: (Double, Double) => Unit): Self = StObject.set(x, "ClearRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClearRange_32bit(value: (String, String) => Unit): Self = StObject.set(x, "ClearRange_32bit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExportAll(value: () => String): Self = StObject.set(x, "ExportAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExportRange(value: (Double, Double, Boolean) => String): Self = StObject.set(x, "ExportRange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExportRange_32bit(value: (String, String, Boolean) => String): Self = StObject.set(x, "ExportRange_32bit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetIDRange(value: () => IIDRange): Self = StObject.set(x, "GetIDRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLoggingEnabled(value: () => Boolean): Self = StObject.set(x, "IsLoggingEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLoggingEnabled(value: Boolean => Unit): Self = StObject.set(x, "SetLoggingEnabled", js.Any.fromFunction1(value))
  }
}
