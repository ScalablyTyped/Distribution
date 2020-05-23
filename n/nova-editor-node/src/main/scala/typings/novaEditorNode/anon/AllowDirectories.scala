package typings.novaEditorNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowDirectories extends js.Object {
  var allowDirectories: js.UndefOr[Boolean] = js.undefined
  var allowFiles: js.UndefOr[Boolean] = js.undefined
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  var filetype: js.UndefOr[js.Array[String]] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var relative: js.UndefOr[Boolean] = js.undefined
}

object AllowDirectories {
  @scala.inline
  def apply(
    allowDirectories: js.UndefOr[Boolean] = js.undefined,
    allowFiles: js.UndefOr[Boolean] = js.undefined,
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    filetype: js.Array[String] = null,
    prompt: String = null,
    relative: js.UndefOr[Boolean] = js.undefined
  ): AllowDirectories = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDirectories)) __obj.updateDynamic("allowDirectories")(allowDirectories.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiles)) __obj.updateDynamic("allowFiles")(allowFiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple.get.asInstanceOf[js.Any])
    if (filetype != null) __obj.updateDynamic("filetype")(filetype.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowDirectories]
  }
}

