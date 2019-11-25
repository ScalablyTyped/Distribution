package typings.mendixmodelsdk.distSdkInternalVersionChecksMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStructureVersionInfo extends ILifeCycle {
  var experimental: js.UndefOr[IModifierValueHistory] = js.undefined
  var properties: js.UndefOr[StringDictionary[IPropertyVersionInfo]] = js.undefined
  var public: js.UndefOr[IModifierValueHistory] = js.undefined
}

object IStructureVersionInfo {
  @scala.inline
  def apply(
    deleted: String = null,
    deletionMessage: String = null,
    deprecated: String = null,
    deprecationMessage: String = null,
    experimental: IModifierValueHistory = null,
    introduced: String = null,
    properties: StringDictionary[IPropertyVersionInfo] = null,
    public: IModifierValueHistory = null
  ): IStructureVersionInfo = {
    val __obj = js.Dynamic.literal()
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (deletionMessage != null) __obj.updateDynamic("deletionMessage")(deletionMessage.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (deprecationMessage != null) __obj.updateDynamic("deprecationMessage")(deprecationMessage.asInstanceOf[js.Any])
    if (experimental != null) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (introduced != null) __obj.updateDynamic("introduced")(introduced.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (public != null) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStructureVersionInfo]
  }
}

