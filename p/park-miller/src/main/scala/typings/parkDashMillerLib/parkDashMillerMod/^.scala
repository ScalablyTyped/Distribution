package typings
package parkDashMillerLib.parkDashMillerMod

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
  def this(seed: scala.Double) = this()
  /* CompleteClass */
  override def boolean(): scala.Boolean = js.native
  /* CompleteClass */
  override def float(): scala.Double = js.native
  /* CompleteClass */
  override def floatInRange(min: scala.Double, max: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def integer(): scala.Double = js.native
  /* CompleteClass */
  override def integerInRange(min: scala.Double, max: scala.Double): scala.Double = js.native
}

