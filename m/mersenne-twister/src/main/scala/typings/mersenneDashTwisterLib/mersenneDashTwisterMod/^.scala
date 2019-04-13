package typings
package mersenneDashTwisterLib.mersenneDashTwisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mersenne-twister", JSImport.Namespace)
@js.native
/**
  * constructs mt with a number
  * @params seed
  */
class ^ () extends MersenneTwister {
  def this(seed: js.Array[scala.Double]) = this()
  def this(seed: scala.Double) = this()
  /**
    * initializes mt with a number
    */
  /* CompleteClass */
  override def init_seed(seed: scala.Double): scala.Unit = js.native
  /**
    * generates a random number on [0,1)-real-interval
    */
  /* CompleteClass */
  override def random(): scala.Double = js.native
  /**
    * generates a random number on (0,1)-real-interval
    */
  /* CompleteClass */
  override def random_excl(): scala.Double = js.native
  /**
    * generates a random number on [0,1]-real-interval
    */
  /* CompleteClass */
  override def random_incl(): scala.Double = js.native
  /**
    * generates a random number on [0,0xffffffff]-interval
    */
  /* CompleteClass */
  override def random_int(): scala.Double = js.native
  /**
    * generates a random number on [0,0x7fffffff]-interval
    */
  /* CompleteClass */
  override def random_int31(): scala.Double = js.native
  /**
    * generates a random number on [0,1) with 53-bit resolution
    */
  /* CompleteClass */
  override def random_long(): scala.Double = js.native
}

