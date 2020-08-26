package typings.nodeZendesk.mod.Organizations

import typings.nodeZendesk.mod.AuditableModel
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends AuditableModel {
  var details: js.UndefOr[String | Null] = js.native
  var domain_names: js.UndefOr[js.Array[String]] = js.native
  var external_id: js.UndefOr[String | Null] = js.native
  var group_id: js.UndefOr[Double | Null] = js.native
  var name: String = js.native
  var notes: js.UndefOr[String | Null] = js.native
  var organization_fields: js.UndefOr[js.Object | Null] = js.native
  var shared_comments: js.UndefOr[Boolean] = js.native
  var shared_tickets: js.UndefOr[Boolean] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
  val url: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(created_at: String, id: ZendeskID, name: String): Model = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setDetailsNull: Self = this.set("details", null)
    @scala.inline
    def setDomain_namesVarargs(value: String*): Self = this.set("domain_names", js.Array(value :_*))
    @scala.inline
    def setDomain_names(value: js.Array[String]): Self = this.set("domain_names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain_names: Self = this.set("domain_names", js.undefined)
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternal_id: Self = this.set("external_id", js.undefined)
    @scala.inline
    def setExternal_idNull: Self = this.set("external_id", null)
    @scala.inline
    def setGroup_id(value: Double): Self = this.set("group_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup_id: Self = this.set("group_id", js.undefined)
    @scala.inline
    def setGroup_idNull: Self = this.set("group_id", null)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setNotesNull: Self = this.set("notes", null)
    @scala.inline
    def setOrganization_fields(value: js.Object): Self = this.set("organization_fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization_fields: Self = this.set("organization_fields", js.undefined)
    @scala.inline
    def setOrganization_fieldsNull: Self = this.set("organization_fields", null)
    @scala.inline
    def setShared_comments(value: Boolean): Self = this.set("shared_comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShared_comments: Self = this.set("shared_comments", js.undefined)
    @scala.inline
    def setShared_tickets(value: Boolean): Self = this.set("shared_tickets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShared_tickets: Self = this.set("shared_tickets", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

