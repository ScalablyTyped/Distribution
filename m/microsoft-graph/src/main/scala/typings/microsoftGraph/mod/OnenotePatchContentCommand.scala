package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenotePatchContentCommand extends js.Object {
  // The action to perform on the target element. The possible values are: replace, append, delete, insert, or prepend.
  var action: js.UndefOr[OnenotePatchActionType] = js.undefined
  /**
    * A string of well-formed HTML to add to the page, and any image or file binary data. If the content contains binary
    * data, the request must be sent using the multipart/form-data content type with a 'Commands' part.
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * The location to add the supplied content, relative to the target element. The possible values are: after (default) or
    * before.
    */
  var position: js.UndefOr[OnenotePatchInsertPosition] = js.undefined
  /**
    * The element to update. Must be the #&amp;lt;data-id&amp;gt; or the generated &amp;lt;id&amp;gt; of the element, or the
    * body or title keyword.
    */
  var target: js.UndefOr[String] = js.undefined
}

object OnenotePatchContentCommand {
  @scala.inline
  def apply(
    action: OnenotePatchActionType = null,
    content: String = null,
    position: OnenotePatchInsertPosition = null,
    target: String = null
  ): OnenotePatchContentCommand = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnenotePatchContentCommand]
  }
}

