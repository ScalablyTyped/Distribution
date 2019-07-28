package typings.atOracleOraclejet.ojdvtDashBaseMod

import typings.atOracleOraclejet.Anon_LabelAndValue
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.trackResize
import typings.atOracleOraclejet.atOracleOraclejetStrings.trackResizeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dvtBaseComponent[SP /* <: dvtBaseComponentSettableProperties */] extends baseComponent[SP] {
  var onTrackResizeChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off], _]) | Null = js.native
  var trackResize: on | off = js.native
  @JSName("translations")
  var translations_dvtBaseComponent: Anon_LabelAndValue = js.native
  def addEventListener(
    `type`: trackResizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _]
  ): Unit = js.native
  def addEventListener(
    `type`: trackResizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_trackResize(property: trackResize): on | off = js.native
  def setProperties(properties: dvtBaseComponentSettablePropertiesLenient): Unit = js.native
  def setProperty(property: trackResize, value: off): Unit = js.native
  def setProperty(property: trackResize, value: on): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_LabelAndValue): Unit = js.native
}

