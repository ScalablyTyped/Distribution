package typings.mongorito

import typings.mongodb.mod.ReadPreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBatchSize extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
}

object AnonBatchSize {
  @scala.inline
  def apply(batchSize: Int | Double = null, readPreference: ReadPreference | String = null): AnonBatchSize = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBatchSize]
  }
}

