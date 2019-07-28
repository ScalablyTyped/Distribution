package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectType extends js.Object {
  var AccessControlList: IAccessControlList
  var AllowAdding: Boolean
  var AllowedAsGroupingLevel: Boolean
  var CanHaveFiles: Boolean
  var DefaultAccessControlList: IAccessControlList
  var DefaultPropertyDef: Double
  var External: Boolean
  val GUID: String
  var HasOwnerType: Boolean
  var Hierarchical: Boolean
  var ID: Double
  var Icon: js.Array[Double]
  var NamePlural: String
  var NameSingular: String
  var ObjectTypeTargetsForBrowsing: IObjectTypeTargetsForBrowsing
  var OwnerPropertyDef: Double
  var OwnerType: Double
  val ReadOnlyPropertiesDuringInsert: IIDs
  val ReadOnlyPropertiesDuringUpdate: IIDs
  var RealObjectType: Boolean
  var ShowCreationCommandInTaskPane: Boolean
  var Translatable: Boolean
  def CanHaveItemIcons(): Boolean
  def Clone(): IObjectType
  def GetIconAsPNG(Width: Double, Height: Double): js.Array[Double]
  def IsAddingAllowedForUser(SessionInfo: ISessionInfo): Boolean
}

object IObjectType {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AllowAdding: Boolean,
    AllowedAsGroupingLevel: Boolean,
    CanHaveFiles: Boolean,
    CanHaveItemIcons: () => Boolean,
    Clone: () => IObjectType,
    DefaultAccessControlList: IAccessControlList,
    DefaultPropertyDef: Double,
    External: Boolean,
    GUID: String,
    GetIconAsPNG: (Double, Double) => js.Array[Double],
    HasOwnerType: Boolean,
    Hierarchical: Boolean,
    ID: Double,
    Icon: js.Array[Double],
    IsAddingAllowedForUser: ISessionInfo => Boolean,
    NamePlural: String,
    NameSingular: String,
    ObjectTypeTargetsForBrowsing: IObjectTypeTargetsForBrowsing,
    OwnerPropertyDef: Double,
    OwnerType: Double,
    ReadOnlyPropertiesDuringInsert: IIDs,
    ReadOnlyPropertiesDuringUpdate: IIDs,
    RealObjectType: Boolean,
    ShowCreationCommandInTaskPane: Boolean,
    Translatable: Boolean
  ): IObjectType = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, AllowAdding = AllowAdding, AllowedAsGroupingLevel = AllowedAsGroupingLevel, CanHaveFiles = CanHaveFiles, CanHaveItemIcons = js.Any.fromFunction0(CanHaveItemIcons), Clone = js.Any.fromFunction0(Clone), DefaultAccessControlList = DefaultAccessControlList, DefaultPropertyDef = DefaultPropertyDef, External = External, GUID = GUID, GetIconAsPNG = js.Any.fromFunction2(GetIconAsPNG), HasOwnerType = HasOwnerType, Hierarchical = Hierarchical, ID = ID, Icon = Icon, IsAddingAllowedForUser = js.Any.fromFunction1(IsAddingAllowedForUser), NamePlural = NamePlural, NameSingular = NameSingular, ObjectTypeTargetsForBrowsing = ObjectTypeTargetsForBrowsing, OwnerPropertyDef = OwnerPropertyDef, OwnerType = OwnerType, ReadOnlyPropertiesDuringInsert = ReadOnlyPropertiesDuringInsert, ReadOnlyPropertiesDuringUpdate = ReadOnlyPropertiesDuringUpdate, RealObjectType = RealObjectType, ShowCreationCommandInTaskPane = ShowCreationCommandInTaskPane, Translatable = Translatable)
  
    __obj.asInstanceOf[IObjectType]
  }
}

