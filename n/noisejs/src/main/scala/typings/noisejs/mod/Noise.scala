package typings.noisejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Noise extends js.Object {
  
  /**
    * 2D Perlin Noise
    * @param  {number} x
    * @param  {number} y
    * @return {number} noise value
    */
  def perlin2(x: Double, y: Double): Double = js.native
  
  /**
    * 3D Perlin Noise
    * @param  {number} x
    * @param  {number} y
    * @param  {number} z
    * @return {number} noise value
    */
  def perlin3(x: Double, y: Double, z: Double): Double = js.native
  
  /**
    * This isn't a very good seeding function, but it works ok. It supports 2^16
    * different seed values. Write something better if you need more seeds.
    * @param {number} seed [description]
    */
  def seed(seed: Double): Unit = js.native
  
  /**
    * 2D simplex noise
    * @param  {number} x
    * @param  {number} y
    * @return {number} noise value
    */
  def simplex2(x: Double, y: Double): Double = js.native
  
  /**
    * 3D simplex noise
    * @param  {number} x
    * @param  {number} y
    * @param  {number} z
    * @return {number} noise value
    */
  def simplex3(x: Double, y: Double, z: Double): Double = js.native
}
object Noise {
  
  @scala.inline
  def apply(
    perlin2: (Double, Double) => Double,
    perlin3: (Double, Double, Double) => Double,
    seed: Double => Unit,
    simplex2: (Double, Double) => Double,
    simplex3: (Double, Double, Double) => Double
  ): Noise = {
    val __obj = js.Dynamic.literal(perlin2 = js.Any.fromFunction2(perlin2), perlin3 = js.Any.fromFunction3(perlin3), seed = js.Any.fromFunction1(seed), simplex2 = js.Any.fromFunction2(simplex2), simplex3 = js.Any.fromFunction3(simplex3))
    __obj.asInstanceOf[Noise]
  }
  
  @scala.inline
  implicit class NoiseOps[Self <: Noise] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPerlin2(value: (Double, Double) => Double): Self = this.set("perlin2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPerlin3(value: (Double, Double, Double) => Double): Self = this.set("perlin3", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSeed(value: Double => Unit): Self = this.set("seed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSimplex2(value: (Double, Double) => Double): Self = this.set("simplex2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSimplex3(value: (Double, Double, Double) => Double): Self = this.set("simplex3", js.Any.fromFunction3(value))
  }
}
