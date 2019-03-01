package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectType extends js.Object {
  var AccessControlList: IAccessControlList
  var AllowAdding: scala.Boolean
  var AllowedAsGroupingLevel: scala.Boolean
  var CanHaveFiles: scala.Boolean
  var DefaultAccessControlList: IAccessControlList
  var DefaultPropertyDef: scala.Double
  var External: scala.Boolean
  val GUID: java.lang.String
  var HasOwnerType: scala.Boolean
  var Hierarchical: scala.Boolean
  var ID: scala.Double
  var Icon: js.Array[scala.Double]
  var NamePlural: java.lang.String
  var NameSingular: java.lang.String
  var ObjectTypeTargetsForBrowsing: IObjectTypeTargetsForBrowsing
  var OwnerPropertyDef: scala.Double
  var OwnerType: scala.Double
  val ReadOnlyPropertiesDuringInsert: IIDs
  val ReadOnlyPropertiesDuringUpdate: IIDs
  var RealObjectType: scala.Boolean
  var ShowCreationCommandInTaskPane: scala.Boolean
  var Translatable: scala.Boolean
  def CanHaveItemIcons(): scala.Boolean
  def Clone(): IObjectType
  def GetIconAsPNG(Width: scala.Double, Height: scala.Double): js.Array[scala.Double]
  def IsAddingAllowedForUser(SessionInfo: ISessionInfo): scala.Boolean
}

object IObjectType {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AllowAdding: scala.Boolean,
    AllowedAsGroupingLevel: scala.Boolean,
    CanHaveFiles: scala.Boolean,
    CanHaveItemIcons: js.Function0[scala.Boolean],
    Clone: js.Function0[IObjectType],
    DefaultAccessControlList: IAccessControlList,
    DefaultPropertyDef: scala.Double,
    External: scala.Boolean,
    GUID: java.lang.String,
    GetIconAsPNG: js.Function2[scala.Double, scala.Double, js.Array[scala.Double]],
    HasOwnerType: scala.Boolean,
    Hierarchical: scala.Boolean,
    ID: scala.Double,
    Icon: js.Array[scala.Double],
    IsAddingAllowedForUser: js.Function1[ISessionInfo, scala.Boolean],
    NamePlural: java.lang.String,
    NameSingular: java.lang.String,
    ObjectTypeTargetsForBrowsing: IObjectTypeTargetsForBrowsing,
    OwnerPropertyDef: scala.Double,
    OwnerType: scala.Double,
    ReadOnlyPropertiesDuringInsert: IIDs,
    ReadOnlyPropertiesDuringUpdate: IIDs,
    RealObjectType: scala.Boolean,
    ShowCreationCommandInTaskPane: scala.Boolean,
    Translatable: scala.Boolean
  ): IObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessControlList")(AccessControlList)
    __obj.updateDynamic("AllowAdding")(AllowAdding)
    __obj.updateDynamic("AllowedAsGroupingLevel")(AllowedAsGroupingLevel)
    __obj.updateDynamic("CanHaveFiles")(CanHaveFiles)
    __obj.updateDynamic("CanHaveItemIcons")(CanHaveItemIcons)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("DefaultAccessControlList")(DefaultAccessControlList)
    __obj.updateDynamic("DefaultPropertyDef")(DefaultPropertyDef)
    __obj.updateDynamic("External")(External)
    __obj.updateDynamic("GUID")(GUID)
    __obj.updateDynamic("GetIconAsPNG")(GetIconAsPNG)
    __obj.updateDynamic("HasOwnerType")(HasOwnerType)
    __obj.updateDynamic("Hierarchical")(Hierarchical)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Icon")(Icon)
    __obj.updateDynamic("IsAddingAllowedForUser")(IsAddingAllowedForUser)
    __obj.updateDynamic("NamePlural")(NamePlural)
    __obj.updateDynamic("NameSingular")(NameSingular)
    __obj.updateDynamic("ObjectTypeTargetsForBrowsing")(ObjectTypeTargetsForBrowsing)
    __obj.updateDynamic("OwnerPropertyDef")(OwnerPropertyDef)
    __obj.updateDynamic("OwnerType")(OwnerType)
    __obj.updateDynamic("ReadOnlyPropertiesDuringInsert")(ReadOnlyPropertiesDuringInsert)
    __obj.updateDynamic("ReadOnlyPropertiesDuringUpdate")(ReadOnlyPropertiesDuringUpdate)
    __obj.updateDynamic("RealObjectType")(RealObjectType)
    __obj.updateDynamic("ShowCreationCommandInTaskPane")(ShowCreationCommandInTaskPane)
    __obj.updateDynamic("Translatable")(Translatable)
    __obj.asInstanceOf[IObjectType]
  }
}

