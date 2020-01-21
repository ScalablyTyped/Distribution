package typings.oracleOraclejet.ojtimeaxisMod

import typings.oracleOraclejet.AnonComponentNameLabelAndValue
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typings.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.oracleOraclejetStrings.converter
import typings.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typings.oracleOraclejet.oracleOraclejetStrings.days
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.endChanged
import typings.oracleOraclejet.oracleOraclejetStrings.hours
import typings.oracleOraclejet.oracleOraclejetStrings.minutes
import typings.oracleOraclejet.oracleOraclejetStrings.months
import typings.oracleOraclejet.oracleOraclejetStrings.quarters
import typings.oracleOraclejet.oracleOraclejetStrings.scale
import typings.oracleOraclejet.oracleOraclejetStrings.scaleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.seconds
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.startChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.weeks
import typings.oracleOraclejet.oracleOraclejetStrings.years
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTimeAxis_ extends dvtBaseComponent[ojTimeAxisSettableProperties] {
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
  var translations_ojTimeAxis_ : AnonComponentNameLabelAndValue = js.native
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
  def setProperty_translations(property: translations, value: AnonComponentNameLabelAndValue): Unit = js.native
}

