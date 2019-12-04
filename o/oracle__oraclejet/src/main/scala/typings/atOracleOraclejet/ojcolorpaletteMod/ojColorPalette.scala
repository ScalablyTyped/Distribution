package typings.atOracleOraclejet.ojcolorpaletteMod

import typings.atOracleOraclejet.Anon_Action
import typings.atOracleOraclejet.Anon_ActionElement
import typings.atOracleOraclejet.Anon_ColorLabel
import typings.atOracleOraclejet.Anon_LabelNone
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.grid
import typings.atOracleOraclejet.atOracleOraclejetStrings.labelDisplay
import typings.atOracleOraclejet.atOracleOraclejetStrings.labelDisplayChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.labelledBy
import typings.atOracleOraclejet.atOracleOraclejetStrings.labelledByChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.layout
import typings.atOracleOraclejet.atOracleOraclejetStrings.layoutChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.lg
import typings.atOracleOraclejet.atOracleOraclejetStrings.list
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.palette
import typings.atOracleOraclejet.atOracleOraclejetStrings.paletteChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.sm
import typings.atOracleOraclejet.atOracleOraclejetStrings.swatchSize
import typings.atOracleOraclejet.atOracleOraclejetStrings.swatchSizeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.atOracleOraclejetStrings.xs
import typings.atOracleOraclejet.ojcolorMod.^
import typings.atOracleOraclejet.ojcolorpaletteMod.ojColorPalette.ojAnimateEnd
import typings.atOracleOraclejet.ojcolorpaletteMod.ojColorPalette.ojAnimateStart
import typings.atOracleOraclejet.ojeditablevalueMod.editableValue
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
  var onPaletteChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Anon_ColorLabel]], _]) | Null = js.native
  var onSwatchSizeChanged: (js.Function1[/* event */ JetElementCustomEvent[xs | sm | lg], _]) | Null = js.native
  var palette: js.Array[Anon_ColorLabel] = js.native
  var swatchSize: xs | sm | lg = js.native
  @JSName("translations")
  var translations_ojColorPalette: Anon_LabelNone = js.native
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Anon_ColorLabel]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paletteChanged(
    `type`: paletteChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Anon_ColorLabel]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_labelDisplay(property: labelDisplay): auto | off = js.native
  @JSName("getProperty")
  def getProperty_labelledBy(property: labelledBy): String | Null = js.native
  @JSName("getProperty")
  def getProperty_layout(property: layout): grid | list = js.native
  @JSName("getProperty")
  def getProperty_palette(property: palette): js.Array[Anon_ColorLabel] = js.native
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
  def setProperty_palette(property: palette, value: js.Array[Anon_ColorLabel]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_LabelNone): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojcolorpalette", "ojColorPalette")
@js.native
object ojColorPalette extends js.Object {
  type ojAnimateEnd = CustomEvent[Anon_Action]
  type ojAnimateStart = CustomEvent[Anon_ActionElement]
}

