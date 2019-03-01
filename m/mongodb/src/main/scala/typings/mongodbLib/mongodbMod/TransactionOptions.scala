package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOptions extends js.Object {
  var readConcern: js.UndefOr[ReadConcern] = js.undefined
  var readPreference: js.UndefOr[js.Any] = js.undefined
  var writeConcern: js.UndefOr[WriteConcern] = js.undefined
}

object TransactionOptions {
  @scala.inline
  def apply(readConcern: ReadConcern = null, readPreference: js.Any = null, writeConcern: WriteConcern = null): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (readConcern != null) __obj.updateDynamic("readConcern")(readConcern)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference)
    if (writeConcern != null) __obj.updateDynamic("writeConcern")(writeConcern)
    __obj.asInstanceOf[TransactionOptions]
  }
}

