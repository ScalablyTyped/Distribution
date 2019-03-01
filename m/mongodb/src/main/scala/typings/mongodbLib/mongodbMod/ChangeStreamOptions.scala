package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeStreamOptions extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var fullDocument: js.UndefOr[java.lang.String] = js.undefined
  var maxAwaitTimeMS: js.UndefOr[scala.Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreference] = js.undefined
  var resumeAfter: js.UndefOr[js.Object] = js.undefined
}

object ChangeStreamOptions {
  @scala.inline
  def apply(
    batchSize: scala.Int | scala.Double = null,
    collation: CollationDocument = null,
    fullDocument: java.lang.String = null,
    maxAwaitTimeMS: scala.Int | scala.Double = null,
    readPreference: ReadPreference = null,
    resumeAfter: js.Object = null
  ): ChangeStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation)
    if (fullDocument != null) __obj.updateDynamic("fullDocument")(fullDocument)
    if (maxAwaitTimeMS != null) __obj.updateDynamic("maxAwaitTimeMS")(maxAwaitTimeMS.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference)
    if (resumeAfter != null) __obj.updateDynamic("resumeAfter")(resumeAfter)
    __obj.asInstanceOf[ChangeStreamOptions]
  }
}

