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
    CanHaveItemIcons: () => scala.Boolean,
    Clone: () => IObjectType,
    DefaultAccessControlList: IAccessControlList,
    DefaultPropertyDef: scala.Double,
    External: scala.Boolean,
    GUID: java.lang.String,
    GetIconAsPNG: (scala.Double, scala.Double) => js.Array[scala.Double],
    HasOwnerType: scala.Boolean,
    Hierarchical: scala.Boolean,
    ID: scala.Double,
    Icon: js.Array[scala.Double],
    IsAddingAllowedForUser: ISessionInfo => scala.Boolean,
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
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, AllowAdding = AllowAdding, AllowedAsGroupingLevel = AllowedAsGroupingLevel, CanHaveFiles = CanHaveFiles, CanHaveItemIcons = js.Any.fromFunction0(CanHaveItemIcons), Clone = js.Any.fromFunction0(Clone), DefaultAccessControlList = DefaultAccessControlList, DefaultPropertyDef = DefaultPropertyDef, External = External, GUID = GUID, GetIconAsPNG = js.Any.fromFunction2(GetIconAsPNG), HasOwnerType = HasOwnerType, Hierarchical = Hierarchical, ID = ID, Icon = Icon, IsAddingAllowedForUser = js.Any.fromFunction1(IsAddingAllowedForUser), NamePlural = NamePlural, NameSingular = NameSingular, ObjectTypeTargetsForBrowsing = ObjectTypeTargetsForBrowsing, OwnerPropertyDef = OwnerPropertyDef, OwnerType = OwnerType, ReadOnlyPropertiesDuringInsert = ReadOnlyPropertiesDuringInsert, ReadOnlyPropertiesDuringUpdate = ReadOnlyPropertiesDuringUpdate, RealObjectType = RealObjectType, ShowCreationCommandInTaskPane = ShowCreationCommandInTaskPane, Translatable = Translatable)
  
    __obj.asInstanceOf[IObjectType]
  }
}

