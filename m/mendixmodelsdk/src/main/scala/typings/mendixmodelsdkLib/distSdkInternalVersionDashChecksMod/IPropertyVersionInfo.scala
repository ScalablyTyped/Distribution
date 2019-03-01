package typings
package mendixmodelsdkLib.distSdkInternalVersionDashChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyVersionInfo extends ILifeCycle {
  var public: js.UndefOr[IModifierValueHistory] = js.undefined
  var required: js.UndefOr[IModifierValueHistory] = js.undefined
}

object IPropertyVersionInfo {
  @scala.inline
  def apply(
    deleted: java.lang.String = null,
    deletionMessage: java.lang.String = null,
    deprecated: java.lang.String = null,
    deprecationMessage: java.lang.String = null,
    introduced: java.lang.String = null,
    public: IModifierValueHistory = null,
    required: IModifierValueHistory = null
  ): IPropertyVersionInfo = {
    val __obj = js.Dynamic.literal()
    if (deleted != null) __obj.updateDynamic("deleted")(deleted)
    if (deletionMessage != null) __obj.updateDynamic("deletionMessage")(deletionMessage)
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated)
    if (deprecationMessage != null) __obj.updateDynamic("deprecationMessage")(deprecationMessage)
    if (introduced != null) __obj.updateDynamic("introduced")(introduced)
    if (public != null) __obj.updateDynamic("public")(public)
    if (required != null) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[IPropertyVersionInfo]
  }
}

