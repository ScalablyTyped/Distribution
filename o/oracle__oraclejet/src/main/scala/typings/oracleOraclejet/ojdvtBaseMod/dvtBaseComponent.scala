package typings.oracleOraclejet.ojdvtBaseMod

import typings.oracleOraclejet.anon.LabelCountWithTotal
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.trackResize
import typings.oracleOraclejet.oracleOraclejetStrings.trackResizeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dvtBaseComponent[SP /* <: dvtBaseComponentSettableProperties */] extends baseComponent[SP] {
  
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
  
  var onTrackResizeChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off], _]) | Null = js.native
  
  def setProperties(properties: dvtBaseComponentSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: trackResize, value: off): Unit = js.native
  def setProperty(property: trackResize, value: on): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelCountWithTotal): Unit = js.native
  
  var trackResize: on | off = js.native
  
  @JSName("translations")
  var translations_dvtBaseComponent: LabelCountWithTotal = js.native
}
