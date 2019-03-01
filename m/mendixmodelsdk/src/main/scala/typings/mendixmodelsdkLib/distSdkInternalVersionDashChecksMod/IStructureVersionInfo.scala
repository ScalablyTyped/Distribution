package typings
package mendixmodelsdkLib.distSdkInternalVersionDashChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStructureVersionInfo extends ILifeCycle {
  var experimental: js.UndefOr[IModifierValueHistory] = js.undefined
  var properties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IPropertyVersionInfo]] = js.undefined
  var public: js.UndefOr[IModifierValueHistory] = js.undefined
}

object IStructureVersionInfo {
  @scala.inline
  def apply(
    deleted: java.lang.String = null,
    deletionMessage: java.lang.String = null,
    deprecated: java.lang.String = null,
    deprecationMessage: java.lang.String = null,
    experimental: IModifierValueHistory = null,
    introduced: java.lang.String = null,
    properties: org.scalablytyped.runtime.StringDictionary[IPropertyVersionInfo] = null,
    public: IModifierValueHistory = null
  ): IStructureVersionInfo = {
    val __obj = js.Dynamic.literal()
    if (deleted != null) __obj.updateDynamic("deleted")(deleted)
    if (deletionMessage != null) __obj.updateDynamic("deletionMessage")(deletionMessage)
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated)
    if (deprecationMessage != null) __obj.updateDynamic("deprecationMessage")(deprecationMessage)
    if (experimental != null) __obj.updateDynamic("experimental")(experimental)
    if (introduced != null) __obj.updateDynamic("introduced")(introduced)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (public != null) __obj.updateDynamic("public")(public)
    __obj.asInstanceOf[IStructureVersionInfo]
  }
}

