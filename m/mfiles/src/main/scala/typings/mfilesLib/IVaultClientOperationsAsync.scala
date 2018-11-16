package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultClientOperationsAsync extends js.Object {
  def DisableCheckInReminderForCallingProcess(): scala.Unit = js.native
  def DisableCheckInReminderForCallingProcess(successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def DisableCheckInReminderForCallingProcess(
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DisableCheckInReminderForCallingProcess(
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def EnableCheckInReminderForCallingProcess(): scala.Unit = js.native
  def EnableCheckInReminderForCallingProcess(successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def EnableCheckInReminderForCallingProcess(
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def EnableCheckInReminderForCallingProcess(
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def IsOffline(): scala.Unit = js.native
  def IsOffline(successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def IsOffline(
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def IsOffline(
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def IsOnline(): scala.Unit = js.native
  def IsOnline(successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def IsOnline(
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def IsOnline(
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetVaultToOffline(ParentWindow: scala.Double): scala.Unit = js.native
  def SetVaultToOffline(
    ParentWindow: scala.Double,
    successCallback: js.Function1[/* result */ mfilesLib.MFilesNs.MFOfflineTransitionResultFlags, scala.Unit]
  ): scala.Unit = js.native
  def SetVaultToOffline(
    ParentWindow: scala.Double,
    successCallback: js.Function1[/* result */ mfilesLib.MFilesNs.MFOfflineTransitionResultFlags, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetVaultToOffline(
    ParentWindow: scala.Double,
    successCallback: js.Function1[/* result */ mfilesLib.MFilesNs.MFOfflineTransitionResultFlags, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetVaultToOnline(ParentWindow: scala.Double): scala.Unit = js.native
  def SetVaultToOnline(
    ParentWindow: scala.Double,
    successCallback: js.Function1[/* result */ mfilesLib.MFilesNs.MFOnlineTransitionResultFlags, scala.Unit]
  ): scala.Unit = js.native
  def SetVaultToOnline(
    ParentWindow: scala.Double,
    successCallback: js.Function1[/* result */ mfilesLib.MFilesNs.MFOnlineTransitionResultFlags, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetVaultToOnline(
    ParentWindow: scala.Double,
    successCallback: js.Function1[/* result */ mfilesLib.MFilesNs.MFOnlineTransitionResultFlags, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

