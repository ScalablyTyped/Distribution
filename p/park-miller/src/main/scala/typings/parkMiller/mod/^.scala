package typings.parkMiller.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("park-miller", JSImport.Namespace)
@js.native
class ^ protected () extends ParkMiller {
  /**
  	[Park-Miller](https://en.wikipedia.org/wiki/Lehmer_random_number_generator) pseudorandom number generator (PRNG).
  	@param seed - [Initialization seed.](https://en.wikipedia.org/wiki/Random_seed)
  	@example
  	```
  	import ParkMiller = require('park-miller');
  	const random = new ParkMiller(10);
  	random.integer();
  	//=> 2027521326
  	```
  	*/
  def this(seed: Double) = this()
  /* CompleteClass */
  override def boolean(): Boolean = js.native
  /* CompleteClass */
  override def float(): Double = js.native
  /* CompleteClass */
  override def floatInRange(min: Double, max: Double): Double = js.native
  /* CompleteClass */
  override def integer(): Double = js.native
  /* CompleteClass */
  override def integerInRange(min: Double, max: Double): Double = js.native
}

