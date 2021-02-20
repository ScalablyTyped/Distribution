package typings.plottable

import typings.plottable.quantitativeScaleMod.QuantitativeScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tickGeneratorsMod {
  
  @JSImport("plottable/build/src/scales/tickGenerators", "integerTickGenerator")
  @js.native
  def integerTickGenerator(): ITickGenerator[Double] = js.native
  
  @JSImport("plottable/build/src/scales/tickGenerators", "intervalTickGenerator")
  @js.native
  def intervalTickGenerator(interval: Double): ITickGenerator[Double] = js.native
  
  type ITickGenerator[D] = js.Function1[/* scale */ QuantitativeScale[D], js.Array[D]]
}
