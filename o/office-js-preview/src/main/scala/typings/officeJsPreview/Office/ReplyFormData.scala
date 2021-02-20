package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ReplyFormData object that contains body or attachment data and a callback function. Used when displaying a reply form.
  */
@js.native
trait ReplyFormData extends StObject {
  
  /**
    * An array of {@link Office.ReplyFormAttachment | ReplyFormAttachment} that are either file or item attachments.
    */
  var attachments: js.UndefOr[js.Array[ReplyFormAttachment]] = js.native
  
  /**
    * When the reply display call completes, the function passed in the callback parameter is called with a single parameter,
    * `asyncResult`, which is an `Office.AsyncResult` object.
    */
  var callback: js.UndefOr[js.Function1[/* asyncResult */ AsyncResult[_], Unit]] = js.native
  
  /**
    * A string that contains text and HTML and that represents the body of the reply form. The string is limited to 32 KB.
    */
  var htmlBody: js.UndefOr[String] = js.native
  
  /**
    * An object literal that contains the following property.
    * `asyncContext`: Developers can provide any object they wish to access in the callback method.
    */
  var options: js.UndefOr[AsyncContextOptions] = js.native
}
object ReplyFormData {
  
  @scala.inline
  def apply(): ReplyFormData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplyFormData]
  }
  
  @scala.inline
  implicit class ReplyFormDataMutableBuilder[Self <: ReplyFormData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: js.Array[ReplyFormAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: ReplyFormAttachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setCallback(value: /* asyncResult */ AsyncResult[_] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setHtmlBody(value: String): Self = StObject.set(x, "htmlBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlBodyUndefined: Self = StObject.set(x, "htmlBody", js.undefined)
    
    @scala.inline
    def setOptions(value: AsyncContextOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
