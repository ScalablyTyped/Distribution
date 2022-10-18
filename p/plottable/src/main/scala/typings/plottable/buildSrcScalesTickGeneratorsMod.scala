package typings.plottable

import typings.plottable.buildSrcScalesQuantitativeScaleMod.QuantitativeScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcScalesTickGeneratorsMod {
  
  @JSImport("plottable/build/src/scales/tickGenerators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def integerTickGenerator(): ITickGenerator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("integerTickGenerator")().asInstanceOf[ITickGenerator[Double]]
  
  inline def intervalTickGenerator(interval: Double): ITickGenerator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("intervalTickGenerator")(interval.asInstanceOf[js.Any]).asInstanceOf[ITickGenerator[Double]]
  
  type ITickGenerator[D] = js.Function1[/* scale */ QuantitativeScale[D], js.Array[D]]
}
