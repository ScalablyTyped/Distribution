package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://mongoosejs.com/docs/api.html#query_Query-setOptions
@js.native
trait QueryFindBaseOptions extends js.Object {
  /** Sets a default collation for every query and aggregation. */
  var collation: js.UndefOr[CollationOptions] = js.native
  var explain: js.UndefOr[js.Any] = js.native
  var lean: js.UndefOr[Boolean] = js.native
  var populate: js.UndefOr[String | ModelPopulateOptions] = js.native
  /** like select, it determines which fields to return */
  var projection: js.UndefOr[js.Any] = js.native
  /** use client session for transaction */
  var session: js.UndefOr[ClientSession] = js.native
}

object QueryFindBaseOptions {
  @scala.inline
  def apply(): QueryFindBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryFindBaseOptions]
  }
  @scala.inline
  implicit class QueryFindBaseOptionsOps[Self <: QueryFindBaseOptions] (val x: Self) extends AnyVal {
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
    def setCollation(value: CollationOptions): Self = this.set("collation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    @scala.inline
    def setExplain(value: js.Any): Self = this.set("explain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplain: Self = this.set("explain", js.undefined)
    @scala.inline
    def setLean(value: Boolean): Self = this.set("lean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLean: Self = this.set("lean", js.undefined)
    @scala.inline
    def setPopulate(value: String | ModelPopulateOptions): Self = this.set("populate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulate: Self = this.set("populate", js.undefined)
    @scala.inline
    def setProjection(value: js.Any): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
  
}

