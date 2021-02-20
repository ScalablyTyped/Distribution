package typings.plottable.mod

import typings.plottable.formattersMod.Formatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Formatters {
  
  @JSImport("plottable", "Formatters.currency")
  @js.native
  def currency(): js.Function1[/* d */ js.Any, String] = js.native
  @JSImport("plottable", "Formatters.currency")
  @js.native
  def currency(precision: js.UndefOr[scala.Nothing], symbol: js.UndefOr[scala.Nothing], prefix: Boolean): js.Function1[/* d */ js.Any, String] = js.native
  @JSImport("plottable", "Formatters.currency")
  @js.native
  def currency(precision: js.UndefOr[scala.Nothing], symbol: String): js.Function1[/* d */ js.Any, String] = js.native
  @JSImport("plottable", "Formatters.currency")
  @js.native
  def currency(precision: js.UndefOr[scala.Nothing], symbol: String, prefix: Boolean): js.Function1[/* d */ js.Any, String] = js.native
  @JSImport("plottable", "Formatters.currency")
  @js.native
  def currency(precision: Double): js.Function1[/* d */ js.Any, String] = js.native
  @JSImport("plottable", "Formatters.currency")
  @js.native
  def currency(precision: Double, symbol: js.UndefOr[scala.Nothing], prefix: Boolean): js.Function1[/* d */ js.Any, String] = js.native
  @JSImport("plottable", "Formatters.currency")
  @js.native
  def currency(precision: Double, symbol: String): js.Function1[/* d */ js.Any, String] = js.native
  @JSImport("plottable", "Formatters.currency")
  @js.native
  def currency(precision: Double, symbol: String, prefix: Boolean): js.Function1[/* d */ js.Any, String] = js.native
  
  @JSImport("plottable", "Formatters.fixed")
  @js.native
  def fixed(): js.Function1[/* d */ js.Any, String] = js.native
  @JSImport("plottable", "Formatters.fixed")
  @js.native
  def fixed(precision: Double): js.Function1[/* d */ js.Any, String] = js.native
  
  @JSImport("plottable", "Formatters.general")
  @js.native
  def general(): js.Function1[/* d */ js.Any, String] = js.native
  @JSImport("plottable", "Formatters.general")
  @js.native
  def general(maxNumberOfDecimalPlaces: Double): js.Function1[/* d */ js.Any, String] = js.native
  
  @JSImport("plottable", "Formatters.identity")
  @js.native
  def identity(): js.Function1[/* d */ js.Any, String] = js.native
  
  @JSImport("plottable", "Formatters.multiTime")
  @js.native
  def multiTime(): js.Function1[/* d */ js.Any, String] = js.native
  
  @JSImport("plottable", "Formatters.percentage")
  @js.native
  def percentage(): js.Function1[/* d */ js.Any, String] = js.native
  @JSImport("plottable", "Formatters.percentage")
  @js.native
  def percentage(precision: Double): js.Function1[/* d */ js.Any, String] = js.native
  
  @JSImport("plottable", "Formatters.shortScale")
  @js.native
  def shortScale(): js.Function1[/* num */ Double, String] = js.native
  @JSImport("plottable", "Formatters.shortScale")
  @js.native
  def shortScale(precision: Double): js.Function1[/* num */ Double, String] = js.native
  
  @JSImport("plottable", "Formatters.siSuffix")
  @js.native
  def siSuffix(): js.Function1[/* d */ js.Any, String] = js.native
  @JSImport("plottable", "Formatters.siSuffix")
  @js.native
  def siSuffix(numberOfSignificantFigures: Double): js.Function1[/* d */ js.Any, String] = js.native
  
  @JSImport("plottable", "Formatters.time")
  @js.native
  def time(specifier: String): Formatter = js.native
  @JSImport("plottable", "Formatters.time")
  @js.native
  def time(specifier: String, useUTC: Boolean): Formatter = js.native
}
