package typings.preact

import typings.preact.preactMod.ComponentChildren
import typings.preact.preactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children[RefType] extends js.Object {
  var children: js.UndefOr[ComponentChildren] = js.undefined
  var ref: js.UndefOr[Ref[RefType]] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply[RefType](children: ComponentChildren = null, ref: Ref[RefType] = null): Anon_Children[RefType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children[RefType]]
  }
}

