package typings.mongodb.mongodbMod

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
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  /**
    * The preferred read preference
    */
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
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
    limit: Int | scala.Double = null,
    maxTimeMS: Int | scala.Double = null,
    readPreference: ReadPreferenceOrMode = null,
    session: ClientSession = null,
    skip: Int | scala.Double = null
  ): MongoCountPreferences = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoCountPreferences]
  }
}

