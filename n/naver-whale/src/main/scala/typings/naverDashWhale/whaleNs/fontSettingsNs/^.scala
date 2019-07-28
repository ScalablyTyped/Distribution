package typings.naverDashWhale.whaleNs.fontSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fontSettings")
@js.native
object ^ extends js.Object {
  var onDefaultFixedFontSizeChanged: typings.chrome.chromeNs.fontSettingsNs.DefaultFixedFontSizeChangedEvent = js.native
  var onDefaultFontSizeChanged: typings.chrome.chromeNs.fontSettingsNs.DefaultFontSizeChangedEvent = js.native
  var onFontChanged: typings.chrome.chromeNs.fontSettingsNs.FontChangedEvent = js.native
  var onMinimumFontSizeChanged: typings.chrome.chromeNs.fontSettingsNs.MinimumFontSizeChangedEvent = js.native
  def clearDefaultFixedFontSize(details: js.Object): Unit = js.native
  def clearDefaultFixedFontSize(details: js.Object, callback: js.Function): Unit = js.native
  def clearDefaultFontSize(): Unit = js.native
  def clearDefaultFontSize(details: js.Object): Unit = js.native
  def clearDefaultFontSize(details: js.Object, callback: js.Function): Unit = js.native
  def clearFont(details: typings.chrome.chromeNs.fontSettingsNs.FontDetails): Unit = js.native
  def clearFont(details: typings.chrome.chromeNs.fontSettingsNs.FontDetails, callback: js.Function): Unit = js.native
  def clearMinimumFontSize(): Unit = js.native
  def clearMinimumFontSize(details: js.Object): Unit = js.native
  def clearMinimumFontSize(details: js.Object, callback: js.Function): Unit = js.native
  def getDefaultFixedFontSize(): Unit = js.native
  def getDefaultFixedFontSize(details: js.Object): Unit = js.native
  def getDefaultFixedFontSize(
    details: js.Object,
    callback: js.Function1[/* details */ typings.chrome.chromeNs.fontSettingsNs.FontSizeDetails, Unit]
  ): Unit = js.native
  def getDefaultFontSize(): Unit = js.native
  def getDefaultFontSize(details: js.Object): Unit = js.native
  def getDefaultFontSize(
    details: js.Object,
    callback: js.Function1[/* options */ typings.chrome.chromeNs.fontSettingsNs.FontSizeDetails, Unit]
  ): Unit = js.native
  def getFont(details: typings.chrome.chromeNs.fontSettingsNs.FontDetails): Unit = js.native
  def getFont(
    details: typings.chrome.chromeNs.fontSettingsNs.FontDetails,
    callback: js.Function1[/* details */ typings.chrome.chromeNs.fontSettingsNs.FontDetailsResult, Unit]
  ): Unit = js.native
  def getFontList(
    callback: js.Function1[/* results */ js.Array[typings.chrome.chromeNs.fontSettingsNs.FontName], Unit]
  ): Unit = js.native
  def getMinimumFontSize(): Unit = js.native
  def getMinimumFontSize(details: typings.chrome.chromeNs.fontSettingsNs.FontSizeDetails): Unit = js.native
  def getMinimumFontSize(
    details: typings.chrome.chromeNs.fontSettingsNs.FontSizeDetails,
    callback: js.Function1[/* options */ typings.chrome.chromeNs.fontSettingsNs.FontSizeDetails, Unit]
  ): Unit = js.native
  def setDefaultFixedFontSize(details: typings.chrome.chromeNs.fontSettingsNs.SetFontSizeDetails): Unit = js.native
  def setDefaultFixedFontSize(details: typings.chrome.chromeNs.fontSettingsNs.SetFontSizeDetails, callback: js.Function): Unit = js.native
  def setDefaultFontSize(details: typings.chrome.chromeNs.fontSettingsNs.DefaultFontSizeDetails): Unit = js.native
  def setDefaultFontSize(details: typings.chrome.chromeNs.fontSettingsNs.DefaultFontSizeDetails, callback: js.Function): Unit = js.native
  def setFont(details: typings.chrome.chromeNs.fontSettingsNs.SetFontDetails): Unit = js.native
  def setFont(details: typings.chrome.chromeNs.fontSettingsNs.SetFontDetails, callback: js.Function): Unit = js.native
  def setMinimumFontSize(details: typings.chrome.chromeNs.fontSettingsNs.SetFontSizeDetails): Unit = js.native
  def setMinimumFontSize(details: typings.chrome.chromeNs.fontSettingsNs.SetFontSizeDetails, callback: js.Function): Unit = js.native
}

