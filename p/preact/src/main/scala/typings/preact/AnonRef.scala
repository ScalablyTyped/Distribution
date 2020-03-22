package typings.preact

import typings.preact.mod.ComponentChildren
import typings.preact.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRef[RefType] extends js.Object {
  var children: js.UndefOr[ComponentChildren] = js.undefined
  var ref: js.UndefOr[Ref[RefType]] = js.undefined
}

object AnonRef {
  @scala.inline
  def apply[RefType](children: ComponentChildren = null, ref: Ref[RefType] = null): AnonRef[RefType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRef[RefType]]
  }
}

