package typings.plottable

import typings.plottable.quantitativeScaleMod.QuantitativeScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/scales/tickGenerators", JSImport.Namespace)
@js.native
object tickGeneratorsMod extends js.Object {
  
  def integerTickGenerator(): ITickGenerator[Double] = js.native
  
  def intervalTickGenerator(interval: Double): ITickGenerator[Double] = js.native
  
  type ITickGenerator[D] = js.Function1[/* scale */ QuantitativeScale[D], js.Array[D]]
}
