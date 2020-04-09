package typings.mongoose

import typings.bson.mod.Timestamp
import typings.mongodb.mod.CollationDocument
import typings.mongodb.mod.ReadPreferenceOrMode
import typings.mongodb.mod.ResumeToken
import typings.mongoose.mod.ClientSession
import typings.mongoose.mongooseStrings.default
import typings.mongoose.mongooseStrings.updateLookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mongodb.mongodb.ChangeStreamOptions & {  session ? :mongoose.mongoose.ClientSession} */
trait ChangeStreamOptionssessio extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var fullDocument: js.UndefOr[default | updateLookup] = js.undefined
  var maxAwaitTimeMS: js.UndefOr[Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var resumeAfter: js.UndefOr[ResumeToken] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  var startAfter: js.UndefOr[ResumeToken] = js.undefined
  var startAtOperationTime: js.UndefOr[Timestamp] = js.undefined
}

object ChangeStreamOptionssessio {
  @scala.inline
  def apply(
    batchSize: Int | Double = null,
    collation: CollationDocument = null,
    fullDocument: default | updateLookup = null,
    maxAwaitTimeMS: Int | Double = null,
    readPreference: ReadPreferenceOrMode = null,
    resumeAfter: ResumeToken = null,
    session: ClientSession = null,
    startAfter: ResumeToken = null,
    startAtOperationTime: Timestamp = null
  ): ChangeStreamOptionssessio = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (fullDocument != null) __obj.updateDynamic("fullDocument")(fullDocument.asInstanceOf[js.Any])
    if (maxAwaitTimeMS != null) __obj.updateDynamic("maxAwaitTimeMS")(maxAwaitTimeMS.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (resumeAfter != null) __obj.updateDynamic("resumeAfter")(resumeAfter.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (startAfter != null) __obj.updateDynamic("startAfter")(startAfter.asInstanceOf[js.Any])
    if (startAtOperationTime != null) __obj.updateDynamic("startAtOperationTime")(startAtOperationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeStreamOptionssessio]
  }
}

