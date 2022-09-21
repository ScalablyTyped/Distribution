package typings.poissonDiskSampling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sphereRandomMod {
  
  @JSImport("poisson-disk-sampling/src/sphere-random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sampleSphere(d: Double, rng: js.Function1[/* repeated */ Double, Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("sampleSphere")(d.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
