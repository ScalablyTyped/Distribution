package typings
package mersenneDashTwisterLib.mersenneDashTwisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MersenneTwister extends js.Object {
  /**
    * initializes mt with a number
    */
  def init_seed(seed: scala.Double): scala.Unit
  /**
    * generates a random number on [0,1)-real-interval
    */
  def random(): scala.Double
  /**
    * generates a random number on (0,1)-real-interval
    */
  def random_excl(): scala.Double
  /**
    * generates a random number on [0,1]-real-interval
    */
  def random_incl(): scala.Double
  /**
    * generates a random number on [0,0xffffffff]-interval
    */
  def random_int(): scala.Double
  /**
    * generates a random number on [0,0x7fffffff]-interval
    */
  def random_int31(): scala.Double
  /**
    * generates a random number on [0,1) with 53-bit resolution
    */
  def random_long(): scala.Double
}

object MersenneTwister {
  @scala.inline
  def apply(
    init_seed: scala.Double => scala.Unit,
    random: () => scala.Double,
    random_excl: () => scala.Double,
    random_incl: () => scala.Double,
    random_int: () => scala.Double,
    random_int31: () => scala.Double,
    random_long: () => scala.Double
  ): MersenneTwister = {
    val __obj = js.Dynamic.literal(init_seed = js.Any.fromFunction1(init_seed), random = js.Any.fromFunction0(random), random_excl = js.Any.fromFunction0(random_excl), random_incl = js.Any.fromFunction0(random_incl), random_int = js.Any.fromFunction0(random_int), random_int31 = js.Any.fromFunction0(random_int31), random_long = js.Any.fromFunction0(random_long))
  
    __obj.asInstanceOf[MersenneTwister]
  }
}

