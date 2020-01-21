package typings.monacoEditor

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwner extends js.Object {
  var owner: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[Uri] = js.undefined
  var take: js.UndefOr[Double] = js.undefined
}

object AnonOwner {
  @scala.inline
  def apply(owner: String = null, resource: Uri = null, take: Int | Double = null): AnonOwner = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (take != null) __obj.updateDynamic("take")(take.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOwner]
  }
}

