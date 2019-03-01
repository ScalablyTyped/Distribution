package typings
package preactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children[RefType] extends js.Object {
  var children: js.UndefOr[preactLib.preactMod.preactNs.ComponentChildren] = js.undefined
  var ref: js.UndefOr[preactLib.preactMod.preactNs.Ref[RefType]] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply[RefType](
    children: preactLib.preactMod.preactNs.ComponentChildren = null,
    ref: preactLib.preactMod.preactNs.Ref[RefType] = null
  ): Anon_Children[RefType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_Children[RefType]]
  }
}

