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
    init_seed: js.Function1[scala.Double, scala.Unit],
    random: js.Function0[scala.Double],
    random_excl: js.Function0[scala.Double],
    random_incl: js.Function0[scala.Double],
    random_int: js.Function0[scala.Double],
    random_int31: js.Function0[scala.Double],
    random_long: js.Function0[scala.Double]
  ): MersenneTwister = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init_seed")(init_seed)
    __obj.updateDynamic("random")(random)
    __obj.updateDynamic("random_excl")(random_excl)
    __obj.updateDynamic("random_incl")(random_incl)
    __obj.updateDynamic("random_int")(random_int)
    __obj.updateDynamic("random_int31")(random_int31)
    __obj.updateDynamic("random_long")(random_long)
    __obj.asInstanceOf[MersenneTwister]
  }
}

