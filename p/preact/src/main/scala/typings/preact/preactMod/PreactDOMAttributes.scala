package typings.preact.preactMod

import typings.preact.Anon_Html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreactDOMAttributes extends js.Object {
  var children: js.UndefOr[ComponentChildren] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Anon_Html] = js.undefined
}

object PreactDOMAttributes {
  @scala.inline
  def apply(children: ComponentChildren = null, dangerouslySetInnerHTML: Anon_Html = null): PreactDOMAttributes = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreactDOMAttributes]
  }
}

