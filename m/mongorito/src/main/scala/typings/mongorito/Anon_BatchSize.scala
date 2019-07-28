package typings.mongorito

import typings.mongodb.mongodbMod.ReadPreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchSize extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
}

object Anon_BatchSize {
  @scala.inline
  def apply(batchSize: Int | Double = null, readPreference: ReadPreference | String = null): Anon_BatchSize = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BatchSize]
  }
}

