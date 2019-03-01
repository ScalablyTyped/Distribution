package typings
package atOracleOraclejetLib.ojtimeaxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTimeAxis
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponent[ojTimeAxisSettableProperties] {
  var converter: atOracleOraclejetLib.ojtimeaxisMod.ojTimeAxisNs.Converters | atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] = js.native
  var end: java.lang.String = js.native
  var onConverterChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.ojtimeaxisMod.ojTimeAxisNs.Converters | atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]
    ], 
    _
  ]) | scala.Null = js.native
  var onEndChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onScaleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.seconds | atOracleOraclejetLib.atOracleOraclejetLibStrings.minutes | atOracleOraclejetLib.atOracleOraclejetLibStrings.hours | atOracleOraclejetLib.atOracleOraclejetLibStrings.days | atOracleOraclejetLib.atOracleOraclejetLibStrings.weeks | atOracleOraclejetLib.atOracleOraclejetLibStrings.months | atOracleOraclejetLib.atOracleOraclejetLibStrings.quarters | atOracleOraclejetLib.atOracleOraclejetLibStrings.years
    ], 
    _
  ]) | scala.Null = js.native
  var onStartChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var scale: atOracleOraclejetLib.atOracleOraclejetLibStrings.seconds | atOracleOraclejetLib.atOracleOraclejetLibStrings.minutes | atOracleOraclejetLib.atOracleOraclejetLibStrings.hours | atOracleOraclejetLib.atOracleOraclejetLibStrings.days | atOracleOraclejetLib.atOracleOraclejetLibStrings.weeks | atOracleOraclejetLib.atOracleOraclejetLibStrings.months | atOracleOraclejetLib.atOracleOraclejetLibStrings.quarters | atOracleOraclejetLib.atOracleOraclejetLibStrings.years = js.native
  var start: java.lang.String = js.native
  @JSName("translations")
  var translations_ojTimeAxis: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scaleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.seconds | atOracleOraclejetLib.atOracleOraclejetLibStrings.minutes | atOracleOraclejetLib.atOracleOraclejetLibStrings.hours | atOracleOraclejetLib.atOracleOraclejetLibStrings.days | atOracleOraclejetLib.atOracleOraclejetLibStrings.weeks | atOracleOraclejetLib.atOracleOraclejetLibStrings.months | atOracleOraclejetLib.atOracleOraclejetLibStrings.quarters | atOracleOraclejetLib.atOracleOraclejetLibStrings.years
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scaleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.seconds | atOracleOraclejetLib.atOracleOraclejetLibStrings.minutes | atOracleOraclejetLib.atOracleOraclejetLibStrings.hours | atOracleOraclejetLib.atOracleOraclejetLibStrings.days | atOracleOraclejetLib.atOracleOraclejetLibStrings.weeks | atOracleOraclejetLib.atOracleOraclejetLibStrings.months | atOracleOraclejetLib.atOracleOraclejetLibStrings.quarters | atOracleOraclejetLib.atOracleOraclejetLibStrings.years
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.converterChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.ojtimeaxisMod.ojTimeAxisNs.Converters | atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.converterChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.ojtimeaxisMod.ojTimeAxisNs.Converters | atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.endChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.endChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.startChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.startChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_converter(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.converter): atOracleOraclejetLib.ojtimeaxisMod.ojTimeAxisNs.Converters | atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_end(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.end): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_scale(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scale): atOracleOraclejetLib.atOracleOraclejetLibStrings.seconds | atOracleOraclejetLib.atOracleOraclejetLibStrings.minutes | atOracleOraclejetLib.atOracleOraclejetLibStrings.hours | atOracleOraclejetLib.atOracleOraclejetLibStrings.days | atOracleOraclejetLib.atOracleOraclejetLibStrings.weeks | atOracleOraclejetLib.atOracleOraclejetLibStrings.months | atOracleOraclejetLib.atOracleOraclejetLibStrings.quarters | atOracleOraclejetLib.atOracleOraclejetLibStrings.years = js.native
  @JSName("getProperty")
  def getProperty_start(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.start): java.lang.String = js.native
  def setProperties(properties: ojTimeAxisSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scale,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.days
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scale,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.hours
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scale,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.minutes
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scale,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.months
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scale,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.quarters
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scale,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.seconds
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scale,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.weeks
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scale,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.years
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.converter,
    value: atOracleOraclejetLib.ojtimeaxisMod.ojTimeAxisNs.Converters
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.converter,
    value: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_end(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.end, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_start(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.start, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue
  ): scala.Unit = js.native
}

