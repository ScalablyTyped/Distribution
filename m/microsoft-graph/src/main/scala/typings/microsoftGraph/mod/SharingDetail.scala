package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharingDetail extends StObject {
  
  // The user who shared the document.
  var sharedBy: js.UndefOr[NullableOption[InsightIdentity]] = js.undefined
  
  /**
    * The date and time the file was last shared. The timestamp represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: 2014-01-01T00:00:00Z.
    * Read-only.
    */
  var sharedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var sharingReference: js.UndefOr[NullableOption[ResourceReference]] = js.undefined
  
  // The subject with which the document was shared.
  var sharingSubject: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Determines the way the document was shared, can be by a 'Link', 'Attachment', 'Group', 'Site'.
  var sharingType: js.UndefOr[NullableOption[String]] = js.undefined
}
object SharingDetail {
  
  inline def apply(): SharingDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharingDetail]
  }
  
  extension [Self <: SharingDetail](x: Self) {
    
    inline def setSharedBy(value: NullableOption[InsightIdentity]): Self = StObject.set(x, "sharedBy", value.asInstanceOf[js.Any])
    
    inline def setSharedByNull: Self = StObject.set(x, "sharedBy", null)
    
    inline def setSharedByUndefined: Self = StObject.set(x, "sharedBy", js.undefined)
    
    inline def setSharedDateTime(value: NullableOption[String]): Self = StObject.set(x, "sharedDateTime", value.asInstanceOf[js.Any])
    
    inline def setSharedDateTimeNull: Self = StObject.set(x, "sharedDateTime", null)
    
    inline def setSharedDateTimeUndefined: Self = StObject.set(x, "sharedDateTime", js.undefined)
    
    inline def setSharingReference(value: NullableOption[ResourceReference]): Self = StObject.set(x, "sharingReference", value.asInstanceOf[js.Any])
    
    inline def setSharingReferenceNull: Self = StObject.set(x, "sharingReference", null)
    
    inline def setSharingReferenceUndefined: Self = StObject.set(x, "sharingReference", js.undefined)
    
    inline def setSharingSubject(value: NullableOption[String]): Self = StObject.set(x, "sharingSubject", value.asInstanceOf[js.Any])
    
    inline def setSharingSubjectNull: Self = StObject.set(x, "sharingSubject", null)
    
    inline def setSharingSubjectUndefined: Self = StObject.set(x, "sharingSubject", js.undefined)
    
    inline def setSharingType(value: NullableOption[String]): Self = StObject.set(x, "sharingType", value.asInstanceOf[js.Any])
    
    inline def setSharingTypeNull: Self = StObject.set(x, "sharingType", null)
    
    inline def setSharingTypeUndefined: Self = StObject.set(x, "sharingType", js.undefined)
  }
}
