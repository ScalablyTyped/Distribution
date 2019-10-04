package typings.preact

import typings.preact.srcMod.ComponentChildren
import typings.preact.srcMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenRef[RefType] extends js.Object {
  var children: js.UndefOr[ComponentChildren] = js.undefined
  var ref: js.UndefOr[Ref[RefType]] = js.undefined
}

object Anon_ChildrenRef {
  @scala.inline
  def apply[RefType](children: ComponentChildren = null, ref: Ref[RefType] = null): Anon_ChildrenRef[RefType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenRef[RefType]]
  }
}

