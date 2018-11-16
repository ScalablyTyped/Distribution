package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReplyFormAttachment extends js.Object {
  /**
           * Only used if type is set to file. If true, indicates that the attachment will be shown inline in the message body, and should not be 
           * displayed in the attachment list.
           */
  var inLine: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Only used if type is set to item. The EWS item id of the attachment. This is a string up to 100 characters.
           */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A string that contains the name of the attachment, up to 255 characters in length.
           */
  var name: java.lang.String
  /**
           * Indicates the type of attachment. Must be file for a file attachment or item for an item attachment.
           */
  var `type`: java.lang.String
  /**
           * Only used if type is set to file. The URI of the location for the file.
           */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

