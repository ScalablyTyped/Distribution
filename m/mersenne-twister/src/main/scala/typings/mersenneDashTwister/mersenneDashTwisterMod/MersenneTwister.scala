package typings.mersenneDashTwister.mersenneDashTwisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MersenneTwister extends js.Object {
  /**
    * initializes mt with a number
    */
  def init_seed(seed: Double): Unit
  /**
    * generates a random number on [0,1)-real-interval
    */
  def random(): Double
  /**
    * generates a random number on (0,1)-real-interval
    */
  def random_excl(): Double
  /**
    * generates a random number on [0,1]-real-interval
    */
  def random_incl(): Double
  /**
    * generates a random number on [0,0xffffffff]-interval
    */
  def random_int(): Double
  /**
    * generates a random number on [0,0x7fffffff]-interval
    */
  def random_int31(): Double
  /**
    * generates a random number on [0,1) with 53-bit resolution
    */
  def random_long(): Double
}

object MersenneTwister {
  @scala.inline
  def apply(
    init_seed: Double => Unit,
    random: () => Double,
    random_excl: () => Double,
    random_incl: () => Double,
    random_int: () => Double,
    random_int31: () => Double,
    random_long: () => Double
  ): MersenneTwister = {
    val __obj = js.Dynamic.literal(init_seed = js.Any.fromFunction1(init_seed), random = js.Any.fromFunction0(random), random_excl = js.Any.fromFunction0(random_excl), random_incl = js.Any.fromFunction0(random_incl), random_int = js.Any.fromFunction0(random_int), random_int31 = js.Any.fromFunction0(random_int31), random_long = js.Any.fromFunction0(random_long))
  
    __obj.asInstanceOf[MersenneTwister]
  }
}

