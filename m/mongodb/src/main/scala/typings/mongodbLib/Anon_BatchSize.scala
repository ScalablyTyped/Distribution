package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchSize extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var nameOnly: js.UndefOr[scala.Boolean] = js.undefined
  var readPreference: js.UndefOr[mongodbLib.mongodbMod.ReadPreference | java.lang.String] = js.undefined
  var session: js.UndefOr[mongodbLib.mongodbMod.ClientSession] = js.undefined
}

object Anon_BatchSize {
  @scala.inline
  def apply(
    batchSize: scala.Int | scala.Double = null,
    nameOnly: js.UndefOr[scala.Boolean] = js.undefined,
    readPreference: mongodbLib.mongodbMod.ReadPreference | java.lang.String = null,
    session: mongodbLib.mongodbMod.ClientSession = null
  ): Anon_BatchSize = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(nameOnly)) __obj.updateDynamic("nameOnly")(nameOnly)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_BatchSize]
  }
}

