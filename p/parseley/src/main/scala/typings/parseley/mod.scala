package typings.parseley

import typings.parseley.libAstMod.CompoundSelector
import typings.parseley.libAstMod.ListSelector
import typings.parseley.libAstMod.Selector
import typings.parseley.libAstMod.SimpleSelector
import typings.parseley.libAstMod.Specificity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parseley", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareSelectors(a: CompoundSelector, b: CompoundSelector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSelectors")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareSelectors(a: CompoundSelector, b: SimpleSelector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSelectors")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareSelectors(a: SimpleSelector, b: CompoundSelector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSelectors")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareSelectors(a: SimpleSelector, b: SimpleSelector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSelectors")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def compareSpecificity(a: Specificity, b: Specificity): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSpecificity")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def normalize(selector: Selector): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(selector.asInstanceOf[js.Any]).asInstanceOf[Selector]
  
  inline def parse(str: String): ListSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[ListSelector]
  
  inline def parse1(str: String): CompoundSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("parse1")(str.asInstanceOf[js.Any]).asInstanceOf[CompoundSelector]
  
  inline def serialize(selector: Selector): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(selector.asInstanceOf[js.Any]).asInstanceOf[String]
}
