package typings.naverDashWhale.whaleNs.browsingDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.browsingData")
@js.native
object ^ extends js.Object {
  def remove(
    options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions,
    dataToRemove: typings.chrome.chromeNs.browsingDataNs.DataTypeSet
  ): Unit = js.native
  def remove(
    options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions,
    dataToRemove: typings.chrome.chromeNs.browsingDataNs.DataTypeSet,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def removeAppcache(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions): Unit = js.native
  def removeAppcache(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  def removeCache(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions): Unit = js.native
  def removeCache(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  def removeCookies(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions): Unit = js.native
  def removeCookies(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  def removeDownloads(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions): Unit = js.native
  def removeDownloads(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  def removeFileSystems(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions): Unit = js.native
  def removeFileSystems(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  def removeFormData(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions): Unit = js.native
  def removeFormData(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  def removeHistory(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions): Unit = js.native
  def removeHistory(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  def removeIndexedDB(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions): Unit = js.native
  def removeIndexedDB(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  def removeLocalStorage(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions): Unit = js.native
  def removeLocalStorage(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  def removePasswords(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions): Unit = js.native
  def removePasswords(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  def removePluginData(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions): Unit = js.native
  def removePluginData(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  def removeWebSQL(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions): Unit = js.native
  def removeWebSQL(options: typings.chrome.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  def settings(callback: js.Function1[/* result */ typings.chrome.chromeNs.browsingDataNs.SettingsCallback, Unit]): Unit = js.native
}

