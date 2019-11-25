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
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], AllowAdding = AllowAdding.asInstanceOf[js.Any], AllowedAsGroupingLevel = AllowedAsGroupingLevel.asInstanceOf[js.Any], CanHaveFiles = CanHaveFiles.asInstanceOf[js.Any], CanHaveItemIcons = js.Any.fromFunction0(CanHaveItemIcons), Clone = js.Any.fromFunction0(Clone), DefaultAccessControlList = DefaultAccessControlList.asInstanceOf[js.Any], DefaultPropertyDef = DefaultPropertyDef.asInstanceOf[js.Any], External = External.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], GetIconAsPNG = js.Any.fromFunction2(GetIconAsPNG), HasOwnerType = HasOwnerType.asInstanceOf[js.Any], Hierarchical = Hierarchical.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], IsAddingAllowedForUser = js.Any.fromFunction1(IsAddingAllowedForUser), NamePlural = NamePlural.asInstanceOf[js.Any], NameSingular = NameSingular.asInstanceOf[js.Any], ObjectTypeTargetsForBrowsing = ObjectTypeTargetsForBrowsing.asInstanceOf[js.Any], OwnerPropertyDef = OwnerPropertyDef.asInstanceOf[js.Any], OwnerType = OwnerType.asInstanceOf[js.Any], ReadOnlyPropertiesDuringInsert = ReadOnlyPropertiesDuringInsert.asInstanceOf[js.Any], ReadOnlyPropertiesDuringUpdate = ReadOnlyPropertiesDuringUpdate.asInstanceOf[js.Any], RealObjectType = RealObjectType.asInstanceOf[js.Any], ShowCreationCommandInTaskPane = ShowCreationCommandInTaskPane.asInstanceOf[js.Any], Translatable = Translatable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IObjectType]
  }
}

