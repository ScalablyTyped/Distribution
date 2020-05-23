package typings.preact.mod

import typings.preact.anon.Html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreactDOMAttributes extends js.Object {
  var children: js.UndefOr[ComponentChildren] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
}

object PreactDOMAttributes {
  @scala.inline
  def apply(
    children: js.UndefOr[Null | ComponentChildren] = js.undefined,
    dangerouslySetInnerHTML: Html = null
  ): PreactDOMAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreactDOMAttributes]
  }
}

