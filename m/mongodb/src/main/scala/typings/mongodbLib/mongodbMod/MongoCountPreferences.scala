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
  var skip: js.UndefOr[scala.Boolean] = js.undefined
}

