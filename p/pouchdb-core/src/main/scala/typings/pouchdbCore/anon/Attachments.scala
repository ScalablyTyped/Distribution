package typings.pouchdbCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachments extends js.Object {
  var _attachments: js.UndefOr[typings.pouchdbCore.PouchDB.Core.Attachments] = js.native
  /** You can update an existing doc using _rev */
  var _rev: js.UndefOr[RevisionId] = js.native
  var filters: js.UndefOr[StringDictionary[String]] = js.native
  var views: js.UndefOr[StringDictionary[Map]] = js.native
}

object Attachments {
  @scala.inline
  def apply(): Attachments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachments]
  }
  @scala.inline
  implicit class AttachmentsOps[Self <: Attachments] (val x: Self) extends AnyVal {
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
    def set_attachments(value: typings.pouchdbCore.PouchDB.Core.Attachments): Self = this.set("_attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_attachments: Self = this.set("_attachments", js.undefined)
    @scala.inline
    def set_rev(value: RevisionId): Self = this.set("_rev", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_rev: Self = this.set("_rev", js.undefined)
    @scala.inline
    def setFilters(value: StringDictionary[String]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setViews(value: StringDictionary[Map]): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
  
}

