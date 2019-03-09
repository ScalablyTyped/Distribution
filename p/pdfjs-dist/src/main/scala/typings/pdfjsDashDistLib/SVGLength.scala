package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGLength extends js.Object {
  val SVG_LENGTHTYPE_CM: scala.Double
  val SVG_LENGTHTYPE_EMS: scala.Double
  val SVG_LENGTHTYPE_EXS: scala.Double
  val SVG_LENGTHTYPE_IN: scala.Double
  val SVG_LENGTHTYPE_MM: scala.Double
  val SVG_LENGTHTYPE_NUMBER: scala.Double
  val SVG_LENGTHTYPE_PC: scala.Double
  val SVG_LENGTHTYPE_PERCENTAGE: scala.Double
  val SVG_LENGTHTYPE_PT: scala.Double
  val SVG_LENGTHTYPE_PX: scala.Double
  val SVG_LENGTHTYPE_UNKNOWN: scala.Double
  val unitType: scala.Double
  var value: scala.Double
  var valueAsString: java.lang.String
  var valueInSpecifiedUnits: scala.Double
  def convertToSpecifiedUnits(unitType: scala.Double): scala.Unit
  def newValueSpecifiedUnits(unitType: scala.Double, valueInSpecifiedUnits: scala.Double): scala.Unit
}

@JSGlobal("SVGLength")
@js.native
object SVGLength
  extends org.scalablytyped.runtime.Instantiable0[SVGLength] {
  val SVG_LENGTHTYPE_CM: scala.Double = js.native
  val SVG_LENGTHTYPE_EMS: scala.Double = js.native
  val SVG_LENGTHTYPE_EXS: scala.Double = js.native
  val SVG_LENGTHTYPE_IN: scala.Double = js.native
  val SVG_LENGTHTYPE_MM: scala.Double = js.native
  val SVG_LENGTHTYPE_NUMBER: scala.Double = js.native
  val SVG_LENGTHTYPE_PC: scala.Double = js.native
  val SVG_LENGTHTYPE_PERCENTAGE: scala.Double = js.native
  val SVG_LENGTHTYPE_PT: scala.Double = js.native
  val SVG_LENGTHTYPE_PX: scala.Double = js.native
  val SVG_LENGTHTYPE_UNKNOWN: scala.Double = js.native
}

