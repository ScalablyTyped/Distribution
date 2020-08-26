package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.anon.Rev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkGetOptions extends Options {
  var attachments: js.UndefOr[Boolean] = js.native
  var binary: js.UndefOr[Boolean] = js.native
  var docs: js.Array[Rev] = js.native
  var revs: js.UndefOr[Boolean] = js.native
}

object BulkGetOptions {
  @scala.inline
  def apply(docs: js.Array[Rev]): BulkGetOptions = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkGetOptions]
  }
  @scala.inline
  implicit class BulkGetOptionsOps[Self <: BulkGetOptions] (val x: Self) extends AnyVal {
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
    def setDocsVarargs(value: Rev*): Self = this.set("docs", js.Array(value :_*))
    @scala.inline
    def setDocs(value: js.Array[Rev]): Self = this.set("docs", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachments(value: Boolean): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    @scala.inline
    def setRevs(value: Boolean): Self = this.set("revs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevs: Self = this.set("revs", js.undefined)
  }
  
}

