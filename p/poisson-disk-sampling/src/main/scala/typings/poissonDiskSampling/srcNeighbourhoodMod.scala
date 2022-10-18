package typings.poissonDiskSampling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNeighbourhoodMod {
  
  @JSImport("poisson-disk-sampling/src/neighbourhood", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNeighbourhood(dimensionNumber: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNeighbourhood")(dimensionNumber.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getNeighbourhoodMemoized(dimensionNumber: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNeighbourhoodMemoized")(dimensionNumber.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
