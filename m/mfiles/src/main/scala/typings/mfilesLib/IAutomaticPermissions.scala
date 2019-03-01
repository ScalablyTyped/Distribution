package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutomaticPermissions extends js.Object {
  var CanDeactivate: scala.Boolean
  val IsBasedOnObjectACL: scala.Boolean
  val IsDefault: scala.Boolean
  val NamedACL: INamedACL
  def Clone(): IAutomaticPermissions
  def SetBasedOnObjectACL(): scala.Unit
  def SetNamedACL(NamedACL: INamedACL): scala.Unit
}

object IAutomaticPermissions {
  @scala.inline
  def apply(
    CanDeactivate: scala.Boolean,
    Clone: js.Function0[IAutomaticPermissions],
    IsBasedOnObjectACL: scala.Boolean,
    IsDefault: scala.Boolean,
    NamedACL: INamedACL,
    SetBasedOnObjectACL: js.Function0[scala.Unit],
    SetNamedACL: js.Function1[INamedACL, scala.Unit]
  ): IAutomaticPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CanDeactivate")(CanDeactivate)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("IsBasedOnObjectACL")(IsBasedOnObjectACL)
    __obj.updateDynamic("IsDefault")(IsDefault)
    __obj.updateDynamic("NamedACL")(NamedACL)
    __obj.updateDynamic("SetBasedOnObjectACL")(SetBasedOnObjectACL)
    __obj.updateDynamic("SetNamedACL")(SetNamedACL)
    __obj.asInstanceOf[IAutomaticPermissions]
  }
}

