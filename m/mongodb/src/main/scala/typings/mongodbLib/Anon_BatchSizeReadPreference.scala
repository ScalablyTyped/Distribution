package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchSizeReadPreference extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var readPreference: js.UndefOr[mongodbLib.mongodbMod.ReadPreference | java.lang.String] = js.undefined
  var session: js.UndefOr[mongodbLib.mongodbMod.ClientSession] = js.undefined
}

object Anon_BatchSizeReadPreference {
  @scala.inline
  def apply(
    batchSize: scala.Int | scala.Double = null,
    readPreference: mongodbLib.mongodbMod.ReadPreference | java.lang.String = null,
    session: mongodbLib.mongodbMod.ClientSession = null
  ): Anon_BatchSizeReadPreference = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_BatchSizeReadPreference]
  }
}

