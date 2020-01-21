package typings.mersenneTwister.mod

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
  def this(seed: js.Array[Double]) = this()
  def this(seed: Double) = this()
  /**
    * initializes mt with a number
    */
  /* CompleteClass */
  override def init_seed(seed: Double): Unit = js.native
  /**
    * generates a random number on [0,1)-real-interval
    */
  /* CompleteClass */
  override def random(): Double = js.native
  /**
    * generates a random number on (0,1)-real-interval
    */
  /* CompleteClass */
  override def random_excl(): Double = js.native
  /**
    * generates a random number on [0,1]-real-interval
    */
  /* CompleteClass */
  override def random_incl(): Double = js.native
  /**
    * generates a random number on [0,0xffffffff]-interval
    */
  /* CompleteClass */
  override def random_int(): Double = js.native
  /**
    * generates a random number on [0,0x7fffffff]-interval
    */
  /* CompleteClass */
  override def random_int31(): Double = js.native
  /**
    * generates a random number on [0,1) with 53-bit resolution
    */
  /* CompleteClass */
  override def random_long(): Double = js.native
}

