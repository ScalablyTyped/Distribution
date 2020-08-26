package typings.mongodb.mod

import typings.mongodb.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionAggregationOptions extends js.Object {
  /**
    * Lets the server know if it can use disk to store
    * temporary results for the aggregation (requires mongodb 2.6 >).
    */
  var allowDiskUse: js.UndefOr[Boolean] = js.native
  /**
    * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.native
  var collation: js.UndefOr[CollationDocument] = js.native
  var comment: js.UndefOr[String] = js.native
  /**
    * Return the query as cursor, on 2.6 > it returns as a real cursor
    * on pre 2.6 it returns as an emulated cursor.
    */
  var cursor: js.UndefOr[`3`] = js.native
  /**
    * Explain returns the aggregation execution plan (requires mongodb 2.6 >).
    */
  var explain: js.UndefOr[Boolean] = js.native
  var hint: js.UndefOr[String | js.Object] = js.native
  /**
    * specifies a cumulative time limit in milliseconds for processing operations
    * on the cursor. MongoDB interrupts the operation at the earliest following interrupt point.
    */
  var maxTimeMS: js.UndefOr[scala.Double] = js.native
  var promoteBuffers: js.UndefOr[Boolean] = js.native
  var promoteLongs: js.UndefOr[Boolean] = js.native
  var promoteValues: js.UndefOr[Boolean] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  var session: js.UndefOr[ClientSession] = js.native
}

object CollectionAggregationOptions {
  @scala.inline
  def apply(): CollectionAggregationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionAggregationOptions]
  }
  @scala.inline
  implicit class CollectionAggregationOptionsOps[Self <: CollectionAggregationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowDiskUse(value: Boolean): Self = this.set("allowDiskUse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDiskUse: Self = this.set("allowDiskUse", js.undefined)
    @scala.inline
    def setBypassDocumentValidation(value: Boolean): Self = this.set("bypassDocumentValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBypassDocumentValidation: Self = this.set("bypassDocumentValidation", js.undefined)
    @scala.inline
    def setCollation(value: CollationDocument): Self = this.set("collation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setCursor(value: `3`): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setExplain(value: Boolean): Self = this.set("explain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplain: Self = this.set("explain", js.undefined)
    @scala.inline
    def setHint(value: String | js.Object): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setMaxTimeMS(value: scala.Double): Self = this.set("maxTimeMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTimeMS: Self = this.set("maxTimeMS", js.undefined)
    @scala.inline
    def setPromoteBuffers(value: Boolean): Self = this.set("promoteBuffers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromoteBuffers: Self = this.set("promoteBuffers", js.undefined)
    @scala.inline
    def setPromoteLongs(value: Boolean): Self = this.set("promoteLongs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromoteLongs: Self = this.set("promoteLongs", js.undefined)
    @scala.inline
    def setPromoteValues(value: Boolean): Self = this.set("promoteValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromoteValues: Self = this.set("promoteValues", js.undefined)
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
  
}

