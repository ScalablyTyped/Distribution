package typings.pixiFilterNoise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/filter-noise", "NoiseFilter")
  @js.native
  /**
    * @param {number} [noise=0.5] - The noise intensity, should be a normalized value in the range [0, 1].
    * @param {number} [seed] - A random seed for the noise generation. Default is `Math.random()`.
    */
  open class NoiseFilter ()
    extends typings.pixiFilterNoise.libNoiseFilterMod.NoiseFilter {
    def this(noise: Double) = this()
    def this(noise: Double, seed: Double) = this()
    def this(noise: Unit, seed: Double) = this()
  }
}
