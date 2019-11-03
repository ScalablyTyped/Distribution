package typings.mongodb

import typings.mongodb.mongodbMod.ClientSession
import typings.mongodb.mongodbMod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchSize extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var nameOnly: js.UndefOr[Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object Anon_BatchSize {
  @scala.inline
  def apply(
    batchSize: Int | Double = null,
    nameOnly: js.UndefOr[Boolean] = js.undefined,
    readPreference: ReadPreferenceOrMode = null,
    session: ClientSession = null
  ): Anon_BatchSize = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(nameOnly)) __obj.updateDynamic("nameOnly")(nameOnly)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference)
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_BatchSize]
  }
}

