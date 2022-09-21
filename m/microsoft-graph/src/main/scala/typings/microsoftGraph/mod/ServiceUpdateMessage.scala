package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceUpdateMessage
  extends StObject
     with ServiceAnnouncementBase {
  
  // The expected deadline of the action for the message.
  var actionRequiredByDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A collection of serviceAnnouncementAttachments.
  var attachments: js.UndefOr[NullableOption[js.Array[ServiceAnnouncementAttachment]]] = js.undefined
  
  // The zip file that contains all attachments for a message.
  var attachmentsArchive: js.UndefOr[NullableOption[Any]] = js.undefined
  
  // The content type and content of the service message body.
  var body: js.UndefOr[ItemBody] = js.undefined
  
  // The service message category. Possible values are: preventOrFixIssue, planForChange, stayInformed, unknownFutureValue.
  var category: js.UndefOr[ServiceUpdateCategory] = js.undefined
  
  // Indicates whether the message has any attachment.
  var hasAttachments: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether the message describes a major update for the service.
  var isMajorChange: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The affected services by the service message.
  var services: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The severity of the service message. Possible values are: normal, high, critical, unknownFutureValue.
  var severity: js.UndefOr[ServiceUpdateSeverity] = js.undefined
  
  /**
    * A collection of tags for the service message. Tags are provided by the service team/support team who post the message
    * to tell whether this message contains privacy data, or whether this message is for a service new feature update, and so
    * on.
    */
  var tags: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Represents user viewpoints data of the service message. This data includes message status such as whether the user has
    * archived, read, or marked the message as favorite. This property is null when accessed with application permissions.
    */
  var viewPoint: js.UndefOr[NullableOption[ServiceUpdateMessageViewpoint]] = js.undefined
}
object ServiceUpdateMessage {
  
  inline def apply(): ServiceUpdateMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceUpdateMessage]
  }
  
  extension [Self <: ServiceUpdateMessage](x: Self) {
    
    inline def setActionRequiredByDateTime(value: NullableOption[String]): Self = StObject.set(x, "actionRequiredByDateTime", value.asInstanceOf[js.Any])
    
    inline def setActionRequiredByDateTimeNull: Self = StObject.set(x, "actionRequiredByDateTime", null)
    
    inline def setActionRequiredByDateTimeUndefined: Self = StObject.set(x, "actionRequiredByDateTime", js.undefined)
    
    inline def setAttachments(value: NullableOption[js.Array[ServiceAnnouncementAttachment]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsArchive(value: NullableOption[Any]): Self = StObject.set(x, "attachmentsArchive", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsArchiveNull: Self = StObject.set(x, "attachmentsArchive", null)
    
    inline def setAttachmentsArchiveUndefined: Self = StObject.set(x, "attachmentsArchive", js.undefined)
    
    inline def setAttachmentsNull: Self = StObject.set(x, "attachments", null)
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: ServiceAnnouncementAttachment*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setBody(value: ItemBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCategory(value: ServiceUpdateCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setHasAttachments(value: Boolean): Self = StObject.set(x, "hasAttachments", value.asInstanceOf[js.Any])
    
    inline def setHasAttachmentsUndefined: Self = StObject.set(x, "hasAttachments", js.undefined)
    
    inline def setIsMajorChange(value: NullableOption[Boolean]): Self = StObject.set(x, "isMajorChange", value.asInstanceOf[js.Any])
    
    inline def setIsMajorChangeNull: Self = StObject.set(x, "isMajorChange", null)
    
    inline def setIsMajorChangeUndefined: Self = StObject.set(x, "isMajorChange", js.undefined)
    
    inline def setServices(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesNull: Self = StObject.set(x, "services", null)
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setSeverity(value: ServiceUpdateSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setTags(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setViewPoint(value: NullableOption[ServiceUpdateMessageViewpoint]): Self = StObject.set(x, "viewPoint", value.asInstanceOf[js.Any])
    
    inline def setViewPointNull: Self = StObject.set(x, "viewPoint", null)
    
    inline def setViewPointUndefined: Self = StObject.set(x, "viewPoint", js.undefined)
  }
}
