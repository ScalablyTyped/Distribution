package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinksList extends js.Object {
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var links: js.Array[ILink]
}

object ILinksList {
  @scala.inline
  def apply(links: js.Array[ILink], dispose: () => Unit = null): ILinksList = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[ILinksList]
  }
}

