package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoDistinctPreferences extends js.Object {
  /**
    * Number of miliseconds to wait before aborting the query.
    */
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  /**
    * The preferred read preference
    */
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  /**
    * Optional session to use for this operation
    */
  var session: js.UndefOr[ClientSession] = js.undefined
}

object MongoDistinctPreferences {
  @scala.inline
  def apply(
    maxTimeMS: js.UndefOr[scala.Double] = js.undefined,
    readPreference: ReadPreferenceOrMode = null,
    session: ClientSession = null
  ): MongoDistinctPreferences = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxTimeMS)) __obj.updateDynamic("maxTimeMS")(maxTimeMS.get.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoDistinctPreferences]
  }
}

