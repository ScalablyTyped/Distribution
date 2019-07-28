package typings.noisejs.noisejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Noise extends js.Object {
  /**
    * 2D Perlin Noise
    * @param  {number} x
    * @param  {number} y
    * @return {number} noise value
    */
  def perlin2(x: Double, y: Double): Double
  /**
    * 3D Perlin Noise
    * @param  {number} x
    * @param  {number} y
    * @param  {number} z
    * @return {number} noise value
    */
  def perlin3(x: Double, y: Double, z: Double): Double
  /**
    * This isn't a very good seeding function, but it works ok. It supports 2^16
    * different seed values. Write something better if you need more seeds.
    * @param {number} seed [description]
    */
  def seed(seed: Double): Unit
  /**
    * 2D simplex noise
    * @param  {number} x
    * @param  {number} y
    * @return {number} noise value
    */
  def simplex2(x: Double, y: Double): Double
  /**
    * 3D simplex noise
    * @param  {number} x
    * @param  {number} y
    * @param  {number} z
    * @return {number} noise value
    */
  def simplex3(x: Double, y: Double, z: Double): Double
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
}

