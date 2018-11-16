package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultDataSetOperationsAsync extends js.Object {
  def GetDataSetExportingStatus(ID: scala.Double): scala.Unit = js.native
  def GetDataSetExportingStatus(ID: scala.Double, successCallback: js.Function1[/* result */ IDataSetExportingStatus, scala.Unit]): scala.Unit = js.native
  def GetDataSetExportingStatus(
    ID: scala.Double,
    successCallback: js.Function1[/* result */ IDataSetExportingStatus, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetDataSetExportingStatus(
    ID: scala.Double,
    successCallback: js.Function1[/* result */ IDataSetExportingStatus, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetDataSets(): scala.Unit = js.native
  def GetDataSets(successCallback: js.Function1[/* result */ IDataSets, scala.Unit]): scala.Unit = js.native
  def GetDataSets(
    successCallback: js.Function1[/* result */ IDataSets, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetDataSets(
    successCallback: js.Function1[/* result */ IDataSets, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetReportAccessCredentials(): scala.Unit = js.native
  def GetReportAccessCredentials(successCallback: js.Function1[/* result */ IReportAccessCredentials, scala.Unit]): scala.Unit = js.native
  def GetReportAccessCredentials(
    successCallback: js.Function1[/* result */ IReportAccessCredentials, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetReportAccessCredentials(
    successCallback: js.Function1[/* result */ IReportAccessCredentials, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def StartDataSetExport(ID: scala.Double): scala.Unit = js.native
  def StartDataSetExport(ID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def StartDataSetExport(
    ID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def StartDataSetExport(
    ID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

