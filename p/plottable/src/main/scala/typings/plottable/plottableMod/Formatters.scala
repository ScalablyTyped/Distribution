package typings.plottable.plottableMod

import typings.plottable.buildSrcCoreFormattersMod.Formatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Formatters")
@js.native
object Formatters extends js.Object {
  def currency(): js.Function1[/* d */ js.Any, String] = js.native
  def currency(precision: Double): js.Function1[/* d */ js.Any, String] = js.native
  def currency(precision: Double, symbol: String): js.Function1[/* d */ js.Any, String] = js.native
  def currency(precision: Double, symbol: String, prefix: Boolean): js.Function1[/* d */ js.Any, String] = js.native
  def fixed(): js.Function1[/* d */ js.Any, String] = js.native
  def fixed(precision: Double): js.Function1[/* d */ js.Any, String] = js.native
  def general(): js.Function1[/* d */ js.Any, String] = js.native
  def general(maxNumberOfDecimalPlaces: Double): js.Function1[/* d */ js.Any, String] = js.native
  def identity(): js.Function1[/* d */ js.Any, String] = js.native
  def multiTime(): js.Function1[/* d */ js.Any, String] = js.native
  def percentage(): js.Function1[/* d */ js.Any, String] = js.native
  def percentage(precision: Double): js.Function1[/* d */ js.Any, String] = js.native
  def shortScale(): js.Function1[/* num */ Double, String] = js.native
  def shortScale(precision: Double): js.Function1[/* num */ Double, String] = js.native
  def siSuffix(): js.Function1[/* d */ js.Any, String] = js.native
  def siSuffix(numberOfSignificantFigures: Double): js.Function1[/* d */ js.Any, String] = js.native
  def time(specifier: String): Formatter = js.native
  def time(specifier: String, useUTC: Boolean): Formatter = js.native
}

