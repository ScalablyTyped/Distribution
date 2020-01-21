package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILink extends js.Object {
  var range: IRange
  var tooltip: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[Uri | String] = js.undefined
}

object ILink {
  @scala.inline
  def apply(range: IRange, tooltip: String = null, url: Uri | String = null): ILink = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILink]
  }
}

