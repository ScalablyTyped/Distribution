package typings.monacoEditor.anon

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Owner extends js.Object {
  var owner: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[Uri] = js.undefined
  var take: js.UndefOr[Double] = js.undefined
}

object Owner {
  @scala.inline
  def apply(owner: String = null, resource: Uri = null, take: js.UndefOr[Double] = js.undefined): Owner = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (!js.isUndefined(take)) __obj.updateDynamic("take")(take.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Owner]
  }
}

