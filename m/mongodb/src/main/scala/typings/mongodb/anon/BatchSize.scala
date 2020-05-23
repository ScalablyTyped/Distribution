package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchSize extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var nameOnly: js.UndefOr[Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object BatchSize {
  @scala.inline
  def apply(
    batchSize: js.UndefOr[Double] = js.undefined,
    nameOnly: js.UndefOr[Boolean] = js.undefined,
    readPreference: ReadPreferenceOrMode = null,
    session: ClientSession = null
  ): BatchSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nameOnly)) __obj.updateDynamic("nameOnly")(nameOnly.get.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchSize]
  }
}

