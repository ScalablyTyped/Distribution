package typings.pixiFilterNoise

import typings.pixiCore.mod.Filter
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
  open class NoiseFilter () extends Filter {
    def this(noise: Double) = this()
    def this(noise: Double, seed: Double) = this()
    def this(noise: Unit, seed: Double) = this()
    
    /**
      * The amount of noise to apply, this value should be in the range (0, 1].
      * @default 0.5
      */
    def noise: Double = js.native
    def noise_=(value: Double): Unit = js.native
    
    /** A seed value to apply to the random noise generation. `Math.random()` is a good value to use. */
    def seed: Double = js.native
    def seed_=(value: Double): Unit = js.native
  }
}
