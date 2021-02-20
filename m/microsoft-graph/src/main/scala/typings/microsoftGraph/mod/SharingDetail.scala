package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharingDetail extends StObject {
  
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
  implicit class SharingDetailMutableBuilder[Self <: SharingDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSharedBy(value: NullableOption[InsightIdentity]): Self = StObject.set(x, "sharedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedByNull: Self = StObject.set(x, "sharedBy", null)
    
    @scala.inline
    def setSharedByUndefined: Self = StObject.set(x, "sharedBy", js.undefined)
    
    @scala.inline
    def setSharedDateTime(value: NullableOption[String]): Self = StObject.set(x, "sharedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedDateTimeNull: Self = StObject.set(x, "sharedDateTime", null)
    
    @scala.inline
    def setSharedDateTimeUndefined: Self = StObject.set(x, "sharedDateTime", js.undefined)
    
    @scala.inline
    def setSharingReference(value: NullableOption[ResourceReference]): Self = StObject.set(x, "sharingReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharingReferenceNull: Self = StObject.set(x, "sharingReference", null)
    
    @scala.inline
    def setSharingReferenceUndefined: Self = StObject.set(x, "sharingReference", js.undefined)
    
    @scala.inline
    def setSharingSubject(value: NullableOption[String]): Self = StObject.set(x, "sharingSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharingSubjectNull: Self = StObject.set(x, "sharingSubject", null)
    
    @scala.inline
    def setSharingSubjectUndefined: Self = StObject.set(x, "sharingSubject", js.undefined)
    
    @scala.inline
    def setSharingType(value: NullableOption[String]): Self = StObject.set(x, "sharingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharingTypeNull: Self = StObject.set(x, "sharingType", null)
    
    @scala.inline
    def setSharingTypeUndefined: Self = StObject.set(x, "sharingType", js.undefined)
  }
}
