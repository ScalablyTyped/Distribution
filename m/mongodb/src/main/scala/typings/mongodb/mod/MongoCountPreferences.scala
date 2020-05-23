package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoCountPreferences extends js.Object {
  /**
    * An index name hint for the query.
    */
  var hint: js.UndefOr[String] = js.undefined
  /**
    * The limit of documents to count.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
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
  /**
    * The number of documents to skip for the count.
    */
  var skip: js.UndefOr[scala.Double] = js.undefined
}

object MongoCountPreferences {
  @scala.inline
  def apply(
    hint: String = null,
    limit: js.UndefOr[scala.Double] = js.undefined,
    maxTimeMS: js.UndefOr[scala.Double] = js.undefined,
    readPreference: ReadPreferenceOrMode = null,
    session: ClientSession = null,
    skip: js.UndefOr[scala.Double] = js.undefined
  ): MongoCountPreferences = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTimeMS)) __obj.updateDynamic("maxTimeMS")(maxTimeMS.get.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoCountPreferences]
  }
}

