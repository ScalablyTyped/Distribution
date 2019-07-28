package typings.officeDashJsDashPreview.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A file or item attachment. Used when displaying a reply form.
  */
trait ReplyFormAttachment extends js.Object {
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
  def apply(
    name: String,
    `type`: String,
    inLine: js.UndefOr[Boolean] = js.undefined,
    itemId: String = null,
    url: String = null
  ): ReplyFormAttachment = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(inLine)) __obj.updateDynamic("inLine")(inLine)
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ReplyFormAttachment]
  }
}

