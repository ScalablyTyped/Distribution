package typings.pMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Number of concurrently pending promises returned by `mapper`.
  		@default Infinity
  		*/
  val concurrency: js.UndefOr[Double] = js.undefined
  /**
  		When set to `false`, instead of stopping when a promise rejects, it will wait for all the promises to settle and then reject with an [aggregated error](https://github.com/sindresorhus/aggregate-error) containing all the errors from the rejected promises.
  		@default true
  		*/
  val stopOnError: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(concurrency: js.UndefOr[Double] = js.undefined, stopOnError: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnError)) __obj.updateDynamic("stopOnError")(stopOnError.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

