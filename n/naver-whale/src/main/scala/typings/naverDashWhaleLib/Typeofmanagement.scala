package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmanagement extends js.Object {
  var onDisabled: chromeLib.chromeNs.managementNs.ManagementDisabledEvent = js.native
  var onEnabled: chromeLib.chromeNs.managementNs.ManagementEnabledEvent = js.native
  var onInstalled: chromeLib.chromeNs.managementNs.ManagementInstalledEvent = js.native
  var onUninstalled: chromeLib.chromeNs.managementNs.ManagementUninstalledEvent = js.native
  def createAppShortcut(id: java.lang.String): scala.Unit = js.native
  def createAppShortcut(id: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def generateAppForLink(url: java.lang.String, title: java.lang.String): scala.Unit = js.native
  def generateAppForLink(
    url: java.lang.String,
    title: java.lang.String,
    callback: js.Function1[/* result */ chromeLib.chromeNs.managementNs.ExtensionInfo, scala.Unit]
  ): scala.Unit = js.native
  def get(id: java.lang.String): scala.Unit = js.native
  def get(
    id: java.lang.String,
    callback: js.Function1[/* result */ chromeLib.chromeNs.managementNs.ExtensionInfo, scala.Unit]
  ): scala.Unit = js.native
  def getAll(): scala.Unit = js.native
  def getAll(
    callback: js.Function1[/* result */ js.Array[chromeLib.chromeNs.managementNs.ExtensionInfo], scala.Unit]
  ): scala.Unit = js.native
  def getPermissionWarningsById(id: java.lang.String): scala.Unit = js.native
  def getPermissionWarningsById(
    id: java.lang.String,
    callback: js.Function1[/* permissionWarnings */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getPermissionWarningsByManifest(manifestStr: java.lang.String): scala.Unit = js.native
  def getPermissionWarningsByManifest(
    manifestStr: java.lang.String,
    callback: js.Function1[/* permissionwarnings */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getSelf(): scala.Unit = js.native
  def getSelf(callback: js.Function1[/* result */ chromeLib.chromeNs.managementNs.ExtensionInfo, scala.Unit]): scala.Unit = js.native
  def launchApp(id: java.lang.String): scala.Unit = js.native
  def launchApp(id: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setEnabled(id: java.lang.String, enabled: scala.Boolean): scala.Unit = js.native
  def setEnabled(id: java.lang.String, enabled: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setLaunchType(id: java.lang.String, launchType: java.lang.String): scala.Unit = js.native
  def setLaunchType(id: java.lang.String, launchType: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def uninstall(id: java.lang.String): scala.Unit = js.native
  def uninstall(id: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def uninstall(id: java.lang.String, options: chromeLib.chromeNs.managementNs.UninstallOptions): scala.Unit = js.native
  def uninstall(
    id: java.lang.String,
    options: chromeLib.chromeNs.managementNs.UninstallOptions,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def uninstallSelf(): scala.Unit = js.native
  def uninstallSelf(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def uninstallSelf(options: chromeLib.chromeNs.managementNs.UninstallOptions): scala.Unit = js.native
  def uninstallSelf(options: chromeLib.chromeNs.managementNs.UninstallOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

