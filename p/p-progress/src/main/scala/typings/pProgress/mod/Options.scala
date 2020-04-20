package typings.pProgress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Number of concurrently pending promises. Minimum: `1`.
  		To run the promises in series, set it to `1`.
  		When this option is set, the first argument must be an array of promise-returning functions.
  		@default Infinity
  		*/
  val concurrency: Double
}

object Options {
  @scala.inline
  def apply(concurrency: Double): Options = {
    val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

