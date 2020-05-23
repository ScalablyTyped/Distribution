package typings.mongodb.mod

import typings.mongodb.mongodbStrings.default_
import typings.mongodb.mongodbStrings.updateLookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeStreamOptions extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var fullDocument: js.UndefOr[default_ | updateLookup] = js.undefined
  var maxAwaitTimeMS: js.UndefOr[scala.Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var resumeAfter: js.UndefOr[ResumeToken] = js.undefined
  var startAfter: js.UndefOr[ResumeToken] = js.undefined
  var startAtOperationTime: js.UndefOr[typings.bson.mod.Timestamp] = js.undefined
}

object ChangeStreamOptions {
  @scala.inline
  def apply(
    batchSize: js.UndefOr[scala.Double] = js.undefined,
    collation: CollationDocument = null,
    fullDocument: default_ | updateLookup = null,
    maxAwaitTimeMS: js.UndefOr[scala.Double] = js.undefined,
    readPreference: ReadPreferenceOrMode = null,
    resumeAfter: ResumeToken = null,
    startAfter: ResumeToken = null,
    startAtOperationTime: typings.bson.mod.Timestamp = null
  ): ChangeStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (fullDocument != null) __obj.updateDynamic("fullDocument")(fullDocument.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAwaitTimeMS)) __obj.updateDynamic("maxAwaitTimeMS")(maxAwaitTimeMS.get.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (resumeAfter != null) __obj.updateDynamic("resumeAfter")(resumeAfter.asInstanceOf[js.Any])
    if (startAfter != null) __obj.updateDynamic("startAfter")(startAfter.asInstanceOf[js.Any])
    if (startAtOperationTime != null) __obj.updateDynamic("startAtOperationTime")(startAtOperationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeStreamOptions]
  }
}

