package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ReplyFormData object that contains body or attachment data and a callback function. Used when displaying a reply form.
  */
trait ReplyFormData extends js.Object {
  /**
    * An array of {@link Office.ReplyFormAttachment} that are either file or item attachments.
    */
  var attachments: js.UndefOr[js.Array[ReplyFormAttachment]] = js.undefined
  /**
    * When the reply display call completes, the function passed in the callback parameter is called with a single parameter, 
    * asyncResult, which is an Office.AsyncResult object.
    */
  var callback: js.UndefOr[js.Function1[/* asyncResult */ AsyncResult[_], scala.Unit]] = js.undefined
  /**
    * A string that contains text and HTML and that represents the body of the reply form. The string is limited to 32 KB.
    */
  var htmlBody: js.UndefOr[java.lang.String] = js.undefined
}

