package typings.plottable

import typings.plottable.datasetMod.Dataset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formattersMod {
  
  @JSImport("plottable/build/src/core/formatters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def currency(): js.Function1[/* d */ js.Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("currency")().asInstanceOf[js.Function1[/* d */ js.Any, String]]
  @scala.inline
  def currency(precision: Double): js.Function1[/* d */ js.Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("currency")(precision.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* d */ js.Any, String]]
  @scala.inline
  def currency(precision: Double, symbol: String): js.Function1[/* d */ js.Any, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(precision.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* d */ js.Any, String]]
  @scala.inline
  def currency(precision: Double, symbol: String, prefix: Boolean): js.Function1[/* d */ js.Any, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(precision.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* d */ js.Any, String]]
  @scala.inline
  def currency(precision: Double, symbol: Unit, prefix: Boolean): js.Function1[/* d */ js.Any, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(precision.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* d */ js.Any, String]]
  @scala.inline
  def currency(precision: Unit, symbol: String): js.Function1[/* d */ js.Any, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(precision.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* d */ js.Any, String]]
  @scala.inline
  def currency(precision: Unit, symbol: String, prefix: Boolean): js.Function1[/* d */ js.Any, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(precision.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* d */ js.Any, String]]
  @scala.inline
  def currency(precision: Unit, symbol: Unit, prefix: Boolean): js.Function1[/* d */ js.Any, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(precision.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* d */ js.Any, String]]
  
  @scala.inline
  def fixed(): js.Function1[/* d */ js.Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fixed")().asInstanceOf[js.Function1[/* d */ js.Any, String]]
  @scala.inline
  def fixed(precision: Double): js.Function1[/* d */ js.Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fixed")(precision.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* d */ js.Any, String]]
  
  @scala.inline
  def general(): js.Function1[/* d */ js.Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("general")().asInstanceOf[js.Function1[/* d */ js.Any, String]]
  @scala.inline
  def general(maxNumberOfDecimalPlaces: Double): js.Function1[/* d */ js.Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("general")(maxNumberOfDecimalPlaces.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* d */ js.Any, String]]
  
  @scala.inline
  def identity(): js.Function1[/* d */ js.Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")().asInstanceOf[js.Function1[/* d */ js.Any, String]]
  
  @scala.inline
  def multiTime(): js.Function1[/* d */ js.Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiTime")().asInstanceOf[js.Function1[/* d */ js.Any, String]]
  
  @scala.inline
  def percentage(): js.Function1[/* d */ js.Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("percentage")().asInstanceOf[js.Function1[/* d */ js.Any, String]]
  @scala.inline
  def percentage(precision: Double): js.Function1[/* d */ js.Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("percentage")(precision.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* d */ js.Any, String]]
  
  @scala.inline
  def shortScale(): js.Function1[/* num */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shortScale")().asInstanceOf[js.Function1[/* num */ Double, String]]
  @scala.inline
  def shortScale(precision: Double): js.Function1[/* num */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shortScale")(precision.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* num */ Double, String]]
  
  @scala.inline
  def siSuffix(): js.Function1[/* d */ js.Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("siSuffix")().asInstanceOf[js.Function1[/* d */ js.Any, String]]
  @scala.inline
  def siSuffix(numberOfSignificantFigures: Double): js.Function1[/* d */ js.Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("siSuffix")(numberOfSignificantFigures.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* d */ js.Any, String]]
  
  @scala.inline
  def time(specifier: String): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(specifier.asInstanceOf[js.Any]).asInstanceOf[Formatter]
  @scala.inline
  def time(specifier: String, useUTC: Boolean): Formatter = (^.asInstanceOf[js.Dynamic].applyDynamic("time")(specifier.asInstanceOf[js.Any], useUTC.asInstanceOf[js.Any])).asInstanceOf[Formatter]
  
  type DatumFormatter = js.Function4[
    /* value */ js.Any, 
    /* datum */ js.Any, 
    /* index */ Double, 
    /* dataset */ Dataset, 
    String
  ]
  
  type Formatter = js.Function1[/* value */ js.Any, String]
}
