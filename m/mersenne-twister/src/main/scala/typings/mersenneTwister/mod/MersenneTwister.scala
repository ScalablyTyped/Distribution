package typings.mersenneTwister.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MersenneTwister extends js.Object {
  /**
    * initializes mt with a number
    */
  def init_seed(seed: Double): Unit = js.native
  /**
    * generates a random number on [0,1)-real-interval
    */
  def random(): Double = js.native
  /**
    * generates a random number on (0,1)-real-interval
    */
  def random_excl(): Double = js.native
  /**
    * generates a random number on [0,1]-real-interval
    */
  def random_incl(): Double = js.native
  /**
    * generates a random number on [0,0xffffffff]-interval
    */
  def random_int(): Double = js.native
  /**
    * generates a random number on [0,0x7fffffff]-interval
    */
  def random_int31(): Double = js.native
  /**
    * generates a random number on [0,1) with 53-bit resolution
    */
  def random_long(): Double = js.native
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
  @scala.inline
  implicit class MersenneTwisterOps[Self <: MersenneTwister] (val x: Self) extends AnyVal {
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
    def setInit_seed(value: Double => Unit): Self = this.set("init_seed", js.Any.fromFunction1(value))
    @scala.inline
    def setRandom(value: () => Double): Self = this.set("random", js.Any.fromFunction0(value))
    @scala.inline
    def setRandom_excl(value: () => Double): Self = this.set("random_excl", js.Any.fromFunction0(value))
    @scala.inline
    def setRandom_incl(value: () => Double): Self = this.set("random_incl", js.Any.fromFunction0(value))
    @scala.inline
    def setRandom_int(value: () => Double): Self = this.set("random_int", js.Any.fromFunction0(value))
    @scala.inline
    def setRandom_int31(value: () => Double): Self = this.set("random_int31", js.Any.fromFunction0(value))
    @scala.inline
    def setRandom_long(value: () => Double): Self = this.set("random_long", js.Any.fromFunction0(value))
  }
  
}

