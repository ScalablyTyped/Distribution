package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharingDetail extends js.Object {
  
  // The user who shared the document.
  var sharedBy: js.UndefOr[NullableOption[InsightIdentity]] = js.native
  
  /**
    * The date and time the file was last shared. The timestamp represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: 2014-01-01T00:00:00Z.
    * Read-only.
    */
  var sharedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  var sharingReference: js.UndefOr[NullableOption[ResourceReference]] = js.native
  
  // The subject with which the document was shared.
  var sharingSubject: js.UndefOr[NullableOption[String]] = js.native
  
  // Determines the way the document was shared, can be by a 'Link', 'Attachment', 'Group', 'Site'.
  var sharingType: js.UndefOr[NullableOption[String]] = js.native
}
object SharingDetail {
  
  @scala.inline
  def apply(): SharingDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharingDetail]
  }
  
  @scala.inline
  implicit class SharingDetailOps[Self <: SharingDetail] (val x: Self) extends AnyVal {
    
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
    def setSharedBy(value: NullableOption[InsightIdentity]): Self = this.set("sharedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedBy: Self = this.set("sharedBy", js.undefined)
    
    @scala.inline
    def setSharedByNull: Self = this.set("sharedBy", null)
    
    @scala.inline
    def setSharedDateTime(value: NullableOption[String]): Self = this.set("sharedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedDateTime: Self = this.set("sharedDateTime", js.undefined)
    
    @scala.inline
    def setSharedDateTimeNull: Self = this.set("sharedDateTime", null)
    
    @scala.inline
    def setSharingReference(value: NullableOption[ResourceReference]): Self = this.set("sharingReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingReference: Self = this.set("sharingReference", js.undefined)
    
    @scala.inline
    def setSharingReferenceNull: Self = this.set("sharingReference", null)
    
    @scala.inline
    def setSharingSubject(value: NullableOption[String]): Self = this.set("sharingSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingSubject: Self = this.set("sharingSubject", js.undefined)
    
    @scala.inline
    def setSharingSubjectNull: Self = this.set("sharingSubject", null)
    
    @scala.inline
    def setSharingType(value: NullableOption[String]): Self = this.set("sharingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingType: Self = this.set("sharingType", js.undefined)
    
    @scala.inline
    def setSharingTypeNull: Self = this.set("sharingType", null)
  }
}
