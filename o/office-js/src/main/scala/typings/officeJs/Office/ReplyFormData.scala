package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ReplyFormData object that contains body or attachment data and a callback function. Used when displaying a reply form.
  */
trait ReplyFormData extends js.Object {
  /**
    * An array of {@link Office.ReplyFormAttachment | ReplyFormAttachment} that are either file or item attachments.
    */
  var attachments: js.UndefOr[js.Array[ReplyFormAttachment]] = js.undefined
  /**
    * When the reply display call completes, the function passed in the callback parameter is called with a single parameter, 
    * `asyncResult`, which is an `Office.AsyncResult` object.
    */
  var callback: js.UndefOr[js.Function1[/* asyncResult */ AsyncResult[_], Unit]] = js.undefined
  /**
    * A string that contains text and HTML and that represents the body of the reply form. The string is limited to 32 KB.
    */
  var htmlBody: js.UndefOr[String] = js.undefined
  /**
    * An object literal that contains the following property.
    * `asyncContext`: Developers can provide any object they wish to access in the callback method.
    */
  var options: js.UndefOr[AsyncContextOptions] = js.undefined
}

object ReplyFormData {
  @scala.inline
  def apply(
    attachments: js.Array[ReplyFormAttachment] = null,
    callback: /* asyncResult */ AsyncResult[_] => Unit = null,
    htmlBody: String = null,
    options: AsyncContextOptions = null
  ): ReplyFormData = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (htmlBody != null) __obj.updateDynamic("htmlBody")(htmlBody.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyFormData]
  }
}

