package typings
package noisejsLib.noisejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noisejs", JSImport.Namespace)
@js.native
/**
  * Passing in seed will seed this Noise instance
  * @param  {number} seed
  * @return {Noise}       Noise instance
  */
class namespaced () extends Noise {
  def this(seed: scala.Double) = this()
  /**
    * 2D Perlin Noise
    * @param  {number} x
    * @param  {number} y
    * @return {number} noise value
    */
  /* CompleteClass */
  override def perlin2(x: scala.Double, y: scala.Double): scala.Double = js.native
  /**
    * 3D Perlin Noise
    * @param  {number} x
    * @param  {number} y
    * @param  {number} z
    * @return {number} noise value
    */
  /* CompleteClass */
  override def perlin3(x: scala.Double, y: scala.Double, z: scala.Double): scala.Double = js.native
  /**
    * This isn't a very good seeding function, but it works ok. It supports 2^16
    * different seed values. Write something better if you need more seeds.
    * @param {number} seed [description]
    */
  /* CompleteClass */
  override def seed(seed: scala.Double): scala.Unit = js.native
  /**
    * 2D simplex noise
    * @param  {number} x
    * @param  {number} y
    * @return {number} noise value
    */
  /* CompleteClass */
  override def simplex2(x: scala.Double, y: scala.Double): scala.Double = js.native
  /**
    * 3D simplex noise
    * @param  {number} x
    * @param  {number} y
    * @param  {number} z
    * @return {number} noise value
    */
  /* CompleteClass */
  override def simplex3(x: scala.Double, y: scala.Double, z: scala.Double): scala.Double = js.native
}

