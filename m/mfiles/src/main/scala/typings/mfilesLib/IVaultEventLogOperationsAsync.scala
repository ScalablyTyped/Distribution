package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultEventLogOperationsAsync extends js.Object {
  def Clear(): scala.Unit = js.native
  def Clear(successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def Clear(
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def Clear(
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ClearRange(FirstEventID: scala.Double, LastEventID: scala.Double): scala.Unit = js.native
  def ClearRange(FirstEventID: scala.Double, LastEventID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ClearRange(
    FirstEventID: scala.Double,
    LastEventID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ClearRange(
    FirstEventID: scala.Double,
    LastEventID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ClearRange_32bit(FirstEventID: java.lang.String, LastEventID: java.lang.String): scala.Unit = js.native
  def ClearRange_32bit(
    FirstEventID: java.lang.String,
    LastEventID: java.lang.String,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ClearRange_32bit(
    FirstEventID: java.lang.String,
    LastEventID: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ClearRange_32bit(
    FirstEventID: java.lang.String,
    LastEventID: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ExportAll(): scala.Unit = js.native
  def ExportAll(successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def ExportAll(
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ExportAll(
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ExportRange(FirstEventID: scala.Double, LastEventID: scala.Double, DeleteEventsAfterExporting: scala.Boolean): scala.Unit = js.native
  def ExportRange(
    FirstEventID: scala.Double,
    LastEventID: scala.Double,
    DeleteEventsAfterExporting: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def ExportRange(
    FirstEventID: scala.Double,
    LastEventID: scala.Double,
    DeleteEventsAfterExporting: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ExportRange(
    FirstEventID: scala.Double,
    LastEventID: scala.Double,
    DeleteEventsAfterExporting: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ExportRange_32bit(
    FirstEventID: java.lang.String,
    LastEventID: java.lang.String,
    DeleteEventsAfterExporting: scala.Boolean
  ): scala.Unit = js.native
  def ExportRange_32bit(
    FirstEventID: java.lang.String,
    LastEventID: java.lang.String,
    DeleteEventsAfterExporting: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def ExportRange_32bit(
    FirstEventID: java.lang.String,
    LastEventID: java.lang.String,
    DeleteEventsAfterExporting: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ExportRange_32bit(
    FirstEventID: java.lang.String,
    LastEventID: java.lang.String,
    DeleteEventsAfterExporting: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetIDRange(): scala.Unit = js.native
  def GetIDRange(successCallback: js.Function1[/* result */ IIDRange, scala.Unit]): scala.Unit = js.native
  def GetIDRange(
    successCallback: js.Function1[/* result */ IIDRange, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetIDRange(
    successCallback: js.Function1[/* result */ IIDRange, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def IsLoggingEnabled(): scala.Unit = js.native
  def IsLoggingEnabled(successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def IsLoggingEnabled(
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def IsLoggingEnabled(
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetLoggingEnabled(Enabled: scala.Boolean): scala.Unit = js.native
  def SetLoggingEnabled(Enabled: scala.Boolean, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def SetLoggingEnabled(
    Enabled: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetLoggingEnabled(
    Enabled: scala.Boolean,
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

