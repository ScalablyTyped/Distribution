package typings
package preactLib.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreactDOMAttributes extends js.Object {
  var children: js.UndefOr[ComponentChildren] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[preactLib.Anon_Html] = js.undefined
}

object PreactDOMAttributes {
  @scala.inline
  def apply(children: ComponentChildren = null, dangerouslySetInnerHTML: preactLib.Anon_Html = null): PreactDOMAttributes = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    __obj.asInstanceOf[PreactDOMAttributes]
  }
}

