package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultEventLogOperationsAsync extends StObject {
  
  def Clear(): Unit = js.native
  def Clear(successCallback: js.Function0[Unit]): Unit = js.native
  def Clear(
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def Clear(
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def Clear(successCallback: js.Function0[Unit], errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  def Clear(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def Clear(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def Clear(successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def ClearRange(FirstEventID: Double, LastEventID: Double): Unit = js.native
  def ClearRange(FirstEventID: Double, LastEventID: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def ClearRange(
    FirstEventID: Double,
    LastEventID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ClearRange(
    FirstEventID: Double,
    LastEventID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ClearRange(
    FirstEventID: Double,
    LastEventID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ClearRange(
    FirstEventID: Double,
    LastEventID: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ClearRange(
    FirstEventID: Double,
    LastEventID: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ClearRange(
    FirstEventID: Double,
    LastEventID: Double,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def ClearRange_32bit(FirstEventID: String, LastEventID: String): Unit = js.native
  def ClearRange_32bit(FirstEventID: String, LastEventID: String, successCallback: js.Function0[Unit]): Unit = js.native
  def ClearRange_32bit(
    FirstEventID: String,
    LastEventID: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ClearRange_32bit(
    FirstEventID: String,
    LastEventID: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ClearRange_32bit(
    FirstEventID: String,
    LastEventID: String,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ClearRange_32bit(
    FirstEventID: String,
    LastEventID: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ClearRange_32bit(
    FirstEventID: String,
    LastEventID: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ClearRange_32bit(
    FirstEventID: String,
    LastEventID: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def ExportAll(): Unit = js.native
  def ExportAll(successCallback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def ExportAll(
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ExportAll(
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ExportAll(
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ExportAll(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ExportAll(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ExportAll(successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def ExportRange(FirstEventID: Double, LastEventID: Double, DeleteEventsAfterExporting: Boolean): Unit = js.native
  def ExportRange(
    FirstEventID: Double,
    LastEventID: Double,
    DeleteEventsAfterExporting: Boolean,
    successCallback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def ExportRange(
    FirstEventID: Double,
    LastEventID: Double,
    DeleteEventsAfterExporting: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ExportRange(
    FirstEventID: Double,
    LastEventID: Double,
    DeleteEventsAfterExporting: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ExportRange(
    FirstEventID: Double,
    LastEventID: Double,
    DeleteEventsAfterExporting: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ExportRange(
    FirstEventID: Double,
    LastEventID: Double,
    DeleteEventsAfterExporting: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ExportRange(
    FirstEventID: Double,
    LastEventID: Double,
    DeleteEventsAfterExporting: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ExportRange(
    FirstEventID: Double,
    LastEventID: Double,
    DeleteEventsAfterExporting: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def ExportRange_32bit(FirstEventID: String, LastEventID: String, DeleteEventsAfterExporting: Boolean): Unit = js.native
  def ExportRange_32bit(
    FirstEventID: String,
    LastEventID: String,
    DeleteEventsAfterExporting: Boolean,
    successCallback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def ExportRange_32bit(
    FirstEventID: String,
    LastEventID: String,
    DeleteEventsAfterExporting: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ExportRange_32bit(
    FirstEventID: String,
    LastEventID: String,
    DeleteEventsAfterExporting: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ExportRange_32bit(
    FirstEventID: String,
    LastEventID: String,
    DeleteEventsAfterExporting: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ExportRange_32bit(
    FirstEventID: String,
    LastEventID: String,
    DeleteEventsAfterExporting: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ExportRange_32bit(
    FirstEventID: String,
    LastEventID: String,
    DeleteEventsAfterExporting: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ExportRange_32bit(
    FirstEventID: String,
    LastEventID: String,
    DeleteEventsAfterExporting: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetIDRange(): Unit = js.native
  def GetIDRange(successCallback: js.Function1[/* result */ IIDRange, Unit]): Unit = js.native
  def GetIDRange(
    successCallback: js.Function1[/* result */ IIDRange, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetIDRange(
    successCallback: js.Function1[/* result */ IIDRange, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetIDRange(
    successCallback: js.Function1[/* result */ IIDRange, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetIDRange(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetIDRange(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetIDRange(successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def IsLoggingEnabled(): Unit = js.native
  def IsLoggingEnabled(successCallback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def IsLoggingEnabled(
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def IsLoggingEnabled(
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsLoggingEnabled(
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsLoggingEnabled(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def IsLoggingEnabled(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsLoggingEnabled(successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def SetLoggingEnabled(Enabled: Boolean): Unit = js.native
  def SetLoggingEnabled(Enabled: Boolean, successCallback: js.Function0[Unit]): Unit = js.native
  def SetLoggingEnabled(
    Enabled: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SetLoggingEnabled(
    Enabled: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetLoggingEnabled(
    Enabled: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetLoggingEnabled(
    Enabled: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SetLoggingEnabled(
    Enabled: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetLoggingEnabled(Enabled: Boolean, successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
}
