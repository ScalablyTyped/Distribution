package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeStreamOptions extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var fullDocument: js.UndefOr[String] = js.undefined
  var maxAwaitTimeMS: js.UndefOr[scala.Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var resumeAfter: js.UndefOr[js.Object] = js.undefined
  var startAfter: js.UndefOr[js.Object] = js.undefined
  var startAtOperationTime: js.UndefOr[typings.bson.mod.Timestamp] = js.undefined
}

object ChangeStreamOptions {
  @scala.inline
  def apply(
    batchSize: Int | scala.Double = null,
    collation: CollationDocument = null,
    fullDocument: String = null,
    maxAwaitTimeMS: Int | scala.Double = null,
    readPreference: ReadPreferenceOrMode = null,
    resumeAfter: js.Object = null,
    startAfter: js.Object = null,
    startAtOperationTime: typings.bson.mod.Timestamp = null
  ): ChangeStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (fullDocument != null) __obj.updateDynamic("fullDocument")(fullDocument.asInstanceOf[js.Any])
    if (maxAwaitTimeMS != null) __obj.updateDynamic("maxAwaitTimeMS")(maxAwaitTimeMS.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (resumeAfter != null) __obj.updateDynamic("resumeAfter")(resumeAfter.asInstanceOf[js.Any])
    if (startAfter != null) __obj.updateDynamic("startAfter")(startAfter.asInstanceOf[js.Any])
    if (startAtOperationTime != null) __obj.updateDynamic("startAtOperationTime")(startAtOperationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeStreamOptions]
  }
}

