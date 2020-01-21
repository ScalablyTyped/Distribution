package typings.officeUiFabricReact.docPageTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinkToken extends js.Object {
  /** If this token is a link, name of the doc page it points to */
  var linkedPage: js.UndefOr[String] = js.undefined
  /** If this token is a link, group/category of the doc page it points to */
  var linkedPageGroup: js.UndefOr[String] = js.undefined
  var text: String
}

object ILinkToken {
  @scala.inline
  def apply(text: String, linkedPage: String = null, linkedPageGroup: String = null): ILinkToken = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (linkedPage != null) __obj.updateDynamic("linkedPage")(linkedPage.asInstanceOf[js.Any])
    if (linkedPageGroup != null) __obj.updateDynamic("linkedPageGroup")(linkedPageGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkToken]
  }
}

