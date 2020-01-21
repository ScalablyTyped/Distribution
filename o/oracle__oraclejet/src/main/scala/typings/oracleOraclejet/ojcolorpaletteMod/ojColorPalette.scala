package typings.oracleOraclejet.ojcolorpaletteMod

import typings.oracleOraclejet.AnonAction
import typings.oracleOraclejet.AnonActionElement
import typings.oracleOraclejet.AnonColorLabel
import typings.oracleOraclejet.AnonLabelNone
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojcolorMod.^
import typings.oracleOraclejet.ojcolorpaletteMod.ojColorPalette.ojAnimateEnd
import typings.oracleOraclejet.ojcolorpaletteMod.ojColorPalette.ojAnimateStart
import typings.oracleOraclejet.ojeditablevalueMod.editableValue
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.grid
import typings.oracleOraclejet.oracleOraclejetStrings.labelDisplay
import typings.oracleOraclejet.oracleOraclejetStrings.labelDisplayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.labelledBy
import typings.oracleOraclejet.oracleOraclejetStrings.labelledByChanged
import typings.oracleOraclejet.oracleOraclejetStrings.layout
import typings.oracleOraclejet.oracleOraclejetStrings.layoutChanged
import typings.oracleOraclejet.oracleOraclejetStrings.lg
import typings.oracleOraclejet.oracleOraclejetStrings.list
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.palette
import typings.oracleOraclejet.oracleOraclejetStrings.paletteChanged
import typings.oracleOraclejet.oracleOraclejetStrings.sm
import typings.oracleOraclejet.oracleOraclejetStrings.swatchSize
import typings.oracleOraclejet.oracleOraclejetStrings.swatchSizeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.xs
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojColorPalette extends editableValue[^, ojColorPaletteSettableProperties, ^, ^] {
  var labelDisplay: auto | off = js.native
  var labelledBy: String | Null = js.native
  var layout: grid | list = js.native
  var onLabelDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | off], _]) | Null = js.native
  var onLabelledByChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onLayoutChanged: (js.Function1[/* event */ JetElementCustomEvent[grid | list], _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojColorPalette: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojColorPalette: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onPaletteChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[AnonColorLabel]], _]) | Null = js.native
  var onSwatchSizeChanged: (js.Function1[/* event */ JetElementCustomEvent[xs | sm | lg], _]) | Null = js.native
  var palette: js.Array[AnonColorLabel] = js.native
  var swatchSize: xs | sm | lg = js.native
  @JSName("translations")
  var translations_ojColorPalette: AnonLabelNone = js.native
  def addEventListener(
    `type`: labelDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | off], _]
  ): Unit = js.native
  def addEventListener(
    `type`: labelDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | off], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: layoutChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[grid | list], _]
  ): Unit = js.native
  def addEventListener(
    `type`: layoutChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[grid | list], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: swatchSizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[xs | sm | lg], _]
  ): Unit = js.native
  def addEventListener(
    `type`: swatchSizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[xs | sm | lg], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(
    `type`: labelledByChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(
    `type`: labelledByChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paletteChanged(
    `type`: paletteChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[AnonColorLabel]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paletteChanged(
    `type`: paletteChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[AnonColorLabel]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_labelDisplay(property: labelDisplay): auto | off = js.native
  @JSName("getProperty")
  def getProperty_labelledBy(property: labelledBy): String | Null = js.native
  @JSName("getProperty")
  def getProperty_layout(property: layout): grid | list = js.native
  @JSName("getProperty")
  def getProperty_palette(property: palette): js.Array[AnonColorLabel] = js.native
  @JSName("getProperty")
  def getProperty_swatchSize(property: swatchSize): xs | sm | lg = js.native
  def setProperties(properties: ojColorPaletteSettablePropertiesLenient): Unit = js.native
  def setProperty(property: labelDisplay, value: auto): Unit = js.native
  def setProperty(property: labelDisplay, value: off): Unit = js.native
  def setProperty(property: layout, value: grid): Unit = js.native
  def setProperty(property: layout, value: list): Unit = js.native
  def setProperty(property: swatchSize, value: lg): Unit = js.native
  def setProperty(property: swatchSize, value: sm): Unit = js.native
  def setProperty(property: swatchSize, value: xs): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_palette(property: palette, value: js.Array[AnonColorLabel]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonLabelNone): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojcolorpalette", "ojColorPalette")
@js.native
object ojColorPalette extends js.Object {
  type ojAnimateEnd = CustomEvent[AnonAction]
  type ojAnimateStart = CustomEvent[AnonActionElement]
}

