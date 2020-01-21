package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOptions extends js.Object {
  var readConcern: js.UndefOr[ReadConcern] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var writeConcern: js.UndefOr[WriteConcern] = js.undefined
}

object TransactionOptions {
  @scala.inline
  def apply(
    readConcern: ReadConcern = null,
    readPreference: ReadPreferenceOrMode = null,
    writeConcern: WriteConcern = null
  ): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (readConcern != null) __obj.updateDynamic("readConcern")(readConcern.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (writeConcern != null) __obj.updateDynamic("writeConcern")(writeConcern.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionOptions]
  }
}

