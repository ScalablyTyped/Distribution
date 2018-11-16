package typings
package plottableLib.buildSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src", "Formatters")
@js.native
object FormattersNs extends js.Object {
  def currency(): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def currency(precision: scala.Double): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def currency(precision: scala.Double, symbol: java.lang.String): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def currency(precision: scala.Double, symbol: java.lang.String, prefix: scala.Boolean): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def fixed(): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def fixed(precision: scala.Double): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def general(): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def general(maxNumberOfDecimalPlaces: scala.Double): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def identity(): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def multiTime(): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def percentage(): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def percentage(precision: scala.Double): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def shortScale(): js.Function1[/* num */ scala.Double, java.lang.String] = js.native
  def shortScale(precision: scala.Double): js.Function1[/* num */ scala.Double, java.lang.String] = js.native
  def siSuffix(): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def siSuffix(numberOfSignificantFigures: scala.Double): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def time(specifier: java.lang.String): plottableLib.buildSrcCoreFormattersMod.Formatter = js.native
  def time(specifier: java.lang.String, useUTC: scala.Boolean): plottableLib.buildSrcCoreFormattersMod.Formatter = js.native
}

