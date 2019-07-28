package typings.atOracleOraclejet.ojtimeaxisMod

import typings.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.converter
import typings.atOracleOraclejet.atOracleOraclejetStrings.converterChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.days
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.endChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.hours
import typings.atOracleOraclejet.atOracleOraclejetStrings.minutes
import typings.atOracleOraclejet.atOracleOraclejetStrings.months
import typings.atOracleOraclejet.atOracleOraclejetStrings.quarters
import typings.atOracleOraclejet.atOracleOraclejetStrings.scale
import typings.atOracleOraclejet.atOracleOraclejetStrings.scaleChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.seconds
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.startChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.atOracleOraclejetStrings.weeks
import typings.atOracleOraclejet.atOracleOraclejetStrings.years
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponent
import typings.atOracleOraclejet.ojtimeaxisMod.ojTimeAxisNs.Converters
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTimeAxis extends dvtBaseComponent[ojTimeAxisSettableProperties] {
  var converter: Converters | Converter[String] = js.native
  var end: String = js.native
  var onConverterChanged: (js.Function1[/* event */ JetElementCustomEvent[Converters | Converter[String]], _]) | Null = js.native
  var onEndChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onScaleChanged: (js.Function1[
    /* event */ JetElementCustomEvent[seconds | minutes | hours | days | weeks | months | quarters | years], 
    _
  ]) | Null = js.native
  var onStartChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years = js.native
  var start: String = js.native
  @JSName("translations")
  var translations_ojTimeAxis: Anon_ComponentNameLabelAndValue = js.native
  def addEventListener(
    `type`: scaleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[seconds | minutes | hours | days | weeks | months | quarters | years], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: scaleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[seconds | minutes | hours | days | weeks | months | quarters | years], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Converters | Converter[String]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Converters | Converter[String]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(
    `type`: endChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(
    `type`: endChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(
    `type`: startChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(
    `type`: startChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converters | Converter[String] = js.native
  @JSName("getProperty")
  def getProperty_end(property: end): String = js.native
  @JSName("getProperty")
  def getProperty_scale(property: scale): seconds | minutes | hours | days | weeks | months | quarters | years = js.native
  @JSName("getProperty")
  def getProperty_start(property: start): String = js.native
  def setProperties(properties: ojTimeAxisSettablePropertiesLenient): Unit = js.native
  def setProperty(property: scale, value: days): Unit = js.native
  def setProperty(property: scale, value: hours): Unit = js.native
  def setProperty(property: scale, value: minutes): Unit = js.native
  def setProperty(property: scale, value: months): Unit = js.native
  def setProperty(property: scale, value: quarters): Unit = js.native
  def setProperty(property: scale, value: seconds): Unit = js.native
  def setProperty(property: scale, value: weeks): Unit = js.native
  def setProperty(property: scale, value: years): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converters): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_end(property: end, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_start(property: start, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_ComponentNameLabelAndValue): Unit = js.native
}

