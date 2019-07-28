package typings.mfiles

import typings.mfiles.MFilesNs.MFOfflineTransitionResultFlags
import typings.mfiles.MFilesNs.MFOnlineTransitionResultFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultClientOperationsAsync extends js.Object {
  def DisableCheckInReminderForCallingProcess(): Unit = js.native
  def DisableCheckInReminderForCallingProcess(successCallback: js.Function0[Unit]): Unit = js.native
  def DisableCheckInReminderForCallingProcess(
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DisableCheckInReminderForCallingProcess(
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def EnableCheckInReminderForCallingProcess(): Unit = js.native
  def EnableCheckInReminderForCallingProcess(successCallback: js.Function0[Unit]): Unit = js.native
  def EnableCheckInReminderForCallingProcess(
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def EnableCheckInReminderForCallingProcess(
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsOffline(): Unit = js.native
  def IsOffline(successCallback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def IsOffline(
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def IsOffline(
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsOnline(): Unit = js.native
  def IsOnline(successCallback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def IsOnline(
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def IsOnline(
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetVaultToOffline(ParentWindow: Double): Unit = js.native
  def SetVaultToOffline(
    ParentWindow: Double,
    successCallback: js.Function1[/* result */ MFOfflineTransitionResultFlags, Unit]
  ): Unit = js.native
  def SetVaultToOffline(
    ParentWindow: Double,
    successCallback: js.Function1[/* result */ MFOfflineTransitionResultFlags, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SetVaultToOffline(
    ParentWindow: Double,
    successCallback: js.Function1[/* result */ MFOfflineTransitionResultFlags, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetVaultToOnline(ParentWindow: Double): Unit = js.native
  def SetVaultToOnline(
    ParentWindow: Double,
    successCallback: js.Function1[/* result */ MFOnlineTransitionResultFlags, Unit]
  ): Unit = js.native
  def SetVaultToOnline(
    ParentWindow: Double,
    successCallback: js.Function1[/* result */ MFOnlineTransitionResultFlags, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SetVaultToOnline(
    ParentWindow: Double,
    successCallback: js.Function1[/* result */ MFOnlineTransitionResultFlags, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}

