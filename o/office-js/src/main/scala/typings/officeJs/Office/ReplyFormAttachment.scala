package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A file or item attachment. Used when displaying a reply form.
  */
trait ReplyFormAttachment extends StObject {
  
  /**
    * Only used if type is set to file. If true, indicates that the attachment will be shown inline in the message body, and should not be 
    * displayed in the attachment list.
    */
  var inLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only used if type is set to item. The EWS item id of the attachment. This is a string up to 100 characters.
    */
  var itemId: js.UndefOr[String] = js.undefined
  
  /**
    * A string that contains the name of the attachment, up to 255 characters in length.
    */
  var name: String
  
  /**
    * Indicates the type of attachment. Must be file for a file attachment or item for an item attachment.
    */
  var `type`: String
  
  /**
    * Only used if type is set to file. The URI of the location for the file.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ReplyFormAttachment {
  
  @scala.inline
  def apply(name: String, `type`: String): ReplyFormAttachment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyFormAttachment]
  }
  
  @scala.inline
  implicit class ReplyFormAttachmentMutableBuilder[Self <: ReplyFormAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInLine(value: Boolean): Self = StObject.set(x, "inLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInLineUndefined: Self = StObject.set(x, "inLine", js.undefined)
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
