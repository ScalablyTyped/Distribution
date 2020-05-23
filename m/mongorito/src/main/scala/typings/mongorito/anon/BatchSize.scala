package typings.mongorito.anon

import typings.mongodb.mod.ReadPreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchSize extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
}

object BatchSize {
  @scala.inline
  def apply(batchSize: js.UndefOr[Double] = js.undefined, readPreference: ReadPreference | String = null): BatchSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchSize]
  }
}

