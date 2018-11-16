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

