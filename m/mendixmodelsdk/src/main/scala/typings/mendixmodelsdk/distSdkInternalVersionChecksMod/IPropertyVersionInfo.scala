package typings.mendixmodelsdk.distSdkInternalVersionChecksMod

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
    deleted: String = null,
    deletionMessage: String = null,
    deprecated: String = null,
    deprecationMessage: String = null,
    introduced: String = null,
    public: IModifierValueHistory = null,
    required: IModifierValueHistory = null
  ): IPropertyVersionInfo = {
    val __obj = js.Dynamic.literal()
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (deletionMessage != null) __obj.updateDynamic("deletionMessage")(deletionMessage.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (deprecationMessage != null) __obj.updateDynamic("deprecationMessage")(deprecationMessage.asInstanceOf[js.Any])
    if (introduced != null) __obj.updateDynamic("introduced")(introduced.asInstanceOf[js.Any])
    if (public != null) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyVersionInfo]
  }
}

