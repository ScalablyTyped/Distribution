package typings
package pDashMapLib.pDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  	 * Number of concurrently pending promises returned by `mapper`.
  	 *
  	 * @default Infinity
  	 */
  var concurrency: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(concurrency: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

