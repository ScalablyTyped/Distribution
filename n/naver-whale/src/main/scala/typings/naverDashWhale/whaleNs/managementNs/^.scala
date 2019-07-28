package typings.naverDashWhale.whaleNs.managementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.management")
@js.native
object ^ extends js.Object {
  var onDisabled: typings.chrome.chromeNs.managementNs.ManagementDisabledEvent = js.native
  var onEnabled: typings.chrome.chromeNs.managementNs.ManagementEnabledEvent = js.native
  var onInstalled: typings.chrome.chromeNs.managementNs.ManagementInstalledEvent = js.native
  var onUninstalled: typings.chrome.chromeNs.managementNs.ManagementUninstalledEvent = js.native
  def createAppShortcut(id: String): Unit = js.native
  def createAppShortcut(id: String, callback: js.Function0[Unit]): Unit = js.native
  def generateAppForLink(url: String, title: String): Unit = js.native
  def generateAppForLink(
    url: String,
    title: String,
    callback: js.Function1[/* result */ typings.chrome.chromeNs.managementNs.ExtensionInfo, Unit]
  ): Unit = js.native
  def get(id: String): Unit = js.native
  def get(
    id: String,
    callback: js.Function1[/* result */ typings.chrome.chromeNs.managementNs.ExtensionInfo, Unit]
  ): Unit = js.native
  def getAll(): Unit = js.native
  def getAll(
    callback: js.Function1[/* result */ js.Array[typings.chrome.chromeNs.managementNs.ExtensionInfo], Unit]
  ): Unit = js.native
  def getPermissionWarningsById(id: String): Unit = js.native
  def getPermissionWarningsById(id: String, callback: js.Function1[/* permissionWarnings */ js.Array[String], Unit]): Unit = js.native
  def getPermissionWarningsByManifest(manifestStr: String): Unit = js.native
  def getPermissionWarningsByManifest(manifestStr: String, callback: js.Function1[/* permissionwarnings */ js.Array[String], Unit]): Unit = js.native
  def getSelf(): Unit = js.native
  def getSelf(callback: js.Function1[/* result */ typings.chrome.chromeNs.managementNs.ExtensionInfo, Unit]): Unit = js.native
  def launchApp(id: String): Unit = js.native
  def launchApp(id: String, callback: js.Function0[Unit]): Unit = js.native
  def setEnabled(id: String, enabled: Boolean): Unit = js.native
  def setEnabled(id: String, enabled: Boolean, callback: js.Function0[Unit]): Unit = js.native
  def setLaunchType(id: String, launchType: String): Unit = js.native
  def setLaunchType(id: String, launchType: String, callback: js.Function0[Unit]): Unit = js.native
  def uninstall(id: String): Unit = js.native
  def uninstall(id: String, callback: js.Function0[Unit]): Unit = js.native
  def uninstall(id: String, options: typings.chrome.chromeNs.managementNs.UninstallOptions): Unit = js.native
  def uninstall(
    id: String,
    options: typings.chrome.chromeNs.managementNs.UninstallOptions,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def uninstallSelf(): Unit = js.native
  def uninstallSelf(callback: js.Function0[Unit]): Unit = js.native
  def uninstallSelf(options: typings.chrome.chromeNs.managementNs.UninstallOptions): Unit = js.native
  def uninstallSelf(options: typings.chrome.chromeNs.managementNs.UninstallOptions, callback: js.Function0[Unit]): Unit = js.native
}

