package typings.preact.anon

import typings.preact.mod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ref[RefType] extends js.Object {
  var children: js.UndefOr[ComponentChildren] = js.undefined
  var ref: js.UndefOr[typings.preact.mod.Ref[RefType]] = js.undefined
}

object Ref {
  @scala.inline
  def apply[RefType](
    children: js.UndefOr[Null | ComponentChildren] = js.undefined,
    ref: typings.preact.mod.Ref[RefType] = null
  ): Ref[RefType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref[RefType]]
  }
}

