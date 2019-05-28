package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeoffontSettings extends js.Object {
  var onDefaultFixedFontSizeChanged: chromeLib.chromeNs.fontSettingsNs.DefaultFixedFontSizeChangedEvent = js.native
  var onDefaultFontSizeChanged: chromeLib.chromeNs.fontSettingsNs.DefaultFontSizeChangedEvent = js.native
  var onFontChanged: chromeLib.chromeNs.fontSettingsNs.FontChangedEvent = js.native
  var onMinimumFontSizeChanged: chromeLib.chromeNs.fontSettingsNs.MinimumFontSizeChangedEvent = js.native
  def clearDefaultFixedFontSize(details: js.Object): scala.Unit = js.native
  def clearDefaultFixedFontSize(details: js.Object, callback: js.Function): scala.Unit = js.native
  def clearDefaultFontSize(): scala.Unit = js.native
  def clearDefaultFontSize(details: js.Object): scala.Unit = js.native
  def clearDefaultFontSize(details: js.Object, callback: js.Function): scala.Unit = js.native
  def clearFont(details: chromeLib.chromeNs.fontSettingsNs.FontDetails): scala.Unit = js.native
  def clearFont(details: chromeLib.chromeNs.fontSettingsNs.FontDetails, callback: js.Function): scala.Unit = js.native
  def clearMinimumFontSize(): scala.Unit = js.native
  def clearMinimumFontSize(details: js.Object): scala.Unit = js.native
  def clearMinimumFontSize(details: js.Object, callback: js.Function): scala.Unit = js.native
  def getDefaultFixedFontSize(): scala.Unit = js.native
  def getDefaultFixedFontSize(details: js.Object): scala.Unit = js.native
  def getDefaultFixedFontSize(
    details: js.Object,
    callback: js.Function1[/* details */ chromeLib.chromeNs.fontSettingsNs.FontSizeDetails, scala.Unit]
  ): scala.Unit = js.native
  def getDefaultFontSize(): scala.Unit = js.native
  def getDefaultFontSize(details: js.Object): scala.Unit = js.native
  def getDefaultFontSize(
    details: js.Object,
    callback: js.Function1[/* options */ chromeLib.chromeNs.fontSettingsNs.FontSizeDetails, scala.Unit]
  ): scala.Unit = js.native
  def getFont(details: chromeLib.chromeNs.fontSettingsNs.FontDetails): scala.Unit = js.native
  def getFont(
    details: chromeLib.chromeNs.fontSettingsNs.FontDetails,
    callback: js.Function1[/* details */ chromeLib.chromeNs.fontSettingsNs.FontDetailsResult, scala.Unit]
  ): scala.Unit = js.native
  def getFontList(
    callback: js.Function1[/* results */ js.Array[chromeLib.chromeNs.fontSettingsNs.FontName], scala.Unit]
  ): scala.Unit = js.native
  def getMinimumFontSize(): scala.Unit = js.native
  def getMinimumFontSize(details: chromeLib.chromeNs.fontSettingsNs.FontSizeDetails): scala.Unit = js.native
  def getMinimumFontSize(
    details: chromeLib.chromeNs.fontSettingsNs.FontSizeDetails,
    callback: js.Function1[/* options */ chromeLib.chromeNs.fontSettingsNs.FontSizeDetails, scala.Unit]
  ): scala.Unit = js.native
  def setDefaultFixedFontSize(details: chromeLib.chromeNs.fontSettingsNs.SetFontSizeDetails): scala.Unit = js.native
  def setDefaultFixedFontSize(details: chromeLib.chromeNs.fontSettingsNs.SetFontSizeDetails, callback: js.Function): scala.Unit = js.native
  def setDefaultFontSize(details: chromeLib.chromeNs.fontSettingsNs.DefaultFontSizeDetails): scala.Unit = js.native
  def setDefaultFontSize(details: chromeLib.chromeNs.fontSettingsNs.DefaultFontSizeDetails, callback: js.Function): scala.Unit = js.native
  def setFont(details: chromeLib.chromeNs.fontSettingsNs.SetFontDetails): scala.Unit = js.native
  def setFont(details: chromeLib.chromeNs.fontSettingsNs.SetFontDetails, callback: js.Function): scala.Unit = js.native
  def setMinimumFontSize(details: chromeLib.chromeNs.fontSettingsNs.SetFontSizeDetails): scala.Unit = js.native
  def setMinimumFontSize(details: chromeLib.chromeNs.fontSettingsNs.SetFontSizeDetails, callback: js.Function): scala.Unit = js.native
}

