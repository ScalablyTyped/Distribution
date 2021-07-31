package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultDataSetOperationsAsync extends StObject {
  
  def GetDataSetExportingStatus(ID: Double): Unit = js.native
  def GetDataSetExportingStatus(ID: Double, successCallback: js.Function1[/* result */ IDataSetExportingStatus, Unit]): Unit = js.native
  def GetDataSetExportingStatus(
    ID: Double,
    successCallback: js.Function1[/* result */ IDataSetExportingStatus, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetDataSetExportingStatus(
    ID: Double,
    successCallback: js.Function1[/* result */ IDataSetExportingStatus, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetDataSetExportingStatus(
    ID: Double,
    successCallback: js.Function1[/* result */ IDataSetExportingStatus, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetDataSetExportingStatus(
    ID: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetDataSetExportingStatus(
    ID: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetDataSetExportingStatus(ID: Double, successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def GetDataSets(): Unit = js.native
  def GetDataSets(successCallback: js.Function1[/* result */ IDataSets, Unit]): Unit = js.native
  def GetDataSets(
    successCallback: js.Function1[/* result */ IDataSets, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetDataSets(
    successCallback: js.Function1[/* result */ IDataSets, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetDataSets(
    successCallback: js.Function1[/* result */ IDataSets, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetDataSets(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetDataSets(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetDataSets(successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def GetReportAccessCredentials(): Unit = js.native
  def GetReportAccessCredentials(successCallback: js.Function1[/* result */ IReportAccessCredentials, Unit]): Unit = js.native
  def GetReportAccessCredentials(
    successCallback: js.Function1[/* result */ IReportAccessCredentials, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetReportAccessCredentials(
    successCallback: js.Function1[/* result */ IReportAccessCredentials, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetReportAccessCredentials(
    successCallback: js.Function1[/* result */ IReportAccessCredentials, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetReportAccessCredentials(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetReportAccessCredentials(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetReportAccessCredentials(successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def StartDataSetExport(ID: Double): Unit = js.native
  def StartDataSetExport(ID: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def StartDataSetExport(
    ID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def StartDataSetExport(
    ID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def StartDataSetExport(
    ID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def StartDataSetExport(
    ID: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def StartDataSetExport(
    ID: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def StartDataSetExport(ID: Double, successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
}
