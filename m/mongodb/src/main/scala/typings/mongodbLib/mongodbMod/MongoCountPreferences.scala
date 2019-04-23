package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoCountPreferences extends js.Object {
  /**
    * An index name hint for the query.
    */
  var hint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The limit of documents to count.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  /**
    * The preferred read preference
    */
  var readPreference: js.UndefOr[ReadPreference | java.lang.String] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  /**
    * The number of documents to skip for the count.
    */
  var skip: js.UndefOr[scala.Double] = js.undefined
}

object MongoCountPreferences {
  @scala.inline
  def apply(
    hint: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    maxTimeMS: scala.Int | scala.Double = null,
    readPreference: ReadPreference | java.lang.String = null,
    session: ClientSession = null,
    skip: scala.Int | scala.Double = null
  ): MongoCountPreferences = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoCountPreferences]
  }
}

