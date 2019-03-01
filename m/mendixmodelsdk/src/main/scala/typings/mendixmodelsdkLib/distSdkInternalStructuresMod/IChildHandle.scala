package typings
package mendixmodelsdkLib.distSdkInternalStructuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChildHandle extends js.Object {
  var containingProperty: AbstractStructureProperty
  def delete(): scala.Unit
  def detach(): scala.Unit
}

object IChildHandle {
  @scala.inline
  def apply(
    containingProperty: AbstractStructureProperty,
    delete: js.Function0[scala.Unit],
    detach: js.Function0[scala.Unit]
  ): IChildHandle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("containingProperty")(containingProperty.asInstanceOf[js.Any])
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("detach")(detach)
    __obj.asInstanceOf[IChildHandle]
  }
}

