package typings
package atOracleOraclejetLib.ojchartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSparkChartSettableProperties[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  var animationDuration: scala.Double | scala.Null
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var areaColor: java.lang.String
  var areaSvgClassName: java.lang.String
  var areaSvgStyle: js.Object
  var as: java.lang.String
  var barGapRatio: scala.Double
  var baselineScaling: atOracleOraclejetLib.atOracleOraclejetLibStrings.zero | atOracleOraclejetLib.atOracleOraclejetLibStrings.min
  var color: java.lang.String
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var firstColor: java.lang.String
  var highColor: java.lang.String
  var lastColor: java.lang.String
  var lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
  var lineType: atOracleOraclejetLib.atOracleOraclejetLibStrings.curved | atOracleOraclejetLib.atOracleOraclejetLibStrings.stepped | atOracleOraclejetLib.atOracleOraclejetLibStrings.centeredStepped | atOracleOraclejetLib.atOracleOraclejetLibStrings.segmented | atOracleOraclejetLib.atOracleOraclejetLibStrings.centeredSegmented | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.straight
  var lineWidth: scala.Double
  var lowColor: java.lang.String
  var markerShape: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
  var markerSize: scala.Double
  var referenceObjects: js.Array[atOracleOraclejetLib.ojchartMod.ojSparkChartNs.ReferenceObject]
  var svgClassName: java.lang.String
  var svgStyle: js.Object
  var tooltip: atOracleOraclejetLib.Anon_ContextRenderer
  @JSName("translations")
  var translations_ojSparkChartSettableProperties: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithArea | atOracleOraclejetLib.atOracleOraclejetLibStrings.bar | atOracleOraclejetLib.atOracleOraclejetLibStrings.line
  var visualEffects: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
}

