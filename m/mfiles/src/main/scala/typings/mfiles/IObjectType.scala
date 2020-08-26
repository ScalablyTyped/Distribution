package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectType extends js.Object {
  var AccessControlList: IAccessControlList = js.native
  var AllowAdding: Boolean = js.native
  var AllowedAsGroupingLevel: Boolean = js.native
  var CanHaveFiles: Boolean = js.native
  var DefaultAccessControlList: IAccessControlList = js.native
  var DefaultPropertyDef: Double = js.native
  var External: Boolean = js.native
  val GUID: String = js.native
  var HasOwnerType: Boolean = js.native
  var Hierarchical: Boolean = js.native
  var ID: Double = js.native
  var Icon: js.Array[Double] = js.native
  var NamePlural: String = js.native
  var NameSingular: String = js.native
  var ObjectTypeTargetsForBrowsing: IObjectTypeTargetsForBrowsing = js.native
  var OwnerPropertyDef: Double = js.native
  var OwnerType: Double = js.native
  val ReadOnlyPropertiesDuringInsert: IIDs = js.native
  val ReadOnlyPropertiesDuringUpdate: IIDs = js.native
  var RealObjectType: Boolean = js.native
  var ShowCreationCommandInTaskPane: Boolean = js.native
  var Translatable: Boolean = js.native
  def CanHaveItemIcons(): Boolean = js.native
  def Clone(): IObjectType = js.native
  def GetIconAsPNG(Width: Double, Height: Double): js.Array[Double] = js.native
  def IsAddingAllowedForUser(SessionInfo: ISessionInfo): Boolean = js.native
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
  @scala.inline
  implicit class IObjectTypeOps[Self <: IObjectType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessControlList(value: IAccessControlList): Self = this.set("AccessControlList", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowAdding(value: Boolean): Self = this.set("AllowAdding", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedAsGroupingLevel(value: Boolean): Self = this.set("AllowedAsGroupingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanHaveFiles(value: Boolean): Self = this.set("CanHaveFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanHaveItemIcons(value: () => Boolean): Self = this.set("CanHaveItemIcons", js.Any.fromFunction0(value))
    @scala.inline
    def setClone(value: () => IObjectType): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setDefaultAccessControlList(value: IAccessControlList): Self = this.set("DefaultAccessControlList", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultPropertyDef(value: Double): Self = this.set("DefaultPropertyDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternal(value: Boolean): Self = this.set("External", value.asInstanceOf[js.Any])
    @scala.inline
    def setGUID(value: String): Self = this.set("GUID", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetIconAsPNG(value: (Double, Double) => js.Array[Double]): Self = this.set("GetIconAsPNG", js.Any.fromFunction2(value))
    @scala.inline
    def setHasOwnerType(value: Boolean): Self = this.set("HasOwnerType", value.asInstanceOf[js.Any])
    @scala.inline
    def setHierarchical(value: Boolean): Self = this.set("Hierarchical", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconVarargs(value: Double*): Self = this.set("Icon", js.Array(value :_*))
    @scala.inline
    def setIcon(value: js.Array[Double]): Self = this.set("Icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAddingAllowedForUser(value: ISessionInfo => Boolean): Self = this.set("IsAddingAllowedForUser", js.Any.fromFunction1(value))
    @scala.inline
    def setNamePlural(value: String): Self = this.set("NamePlural", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameSingular(value: String): Self = this.set("NameSingular", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectTypeTargetsForBrowsing(value: IObjectTypeTargetsForBrowsing): Self = this.set("ObjectTypeTargetsForBrowsing", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerPropertyDef(value: Double): Self = this.set("OwnerPropertyDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerType(value: Double): Self = this.set("OwnerType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnlyPropertiesDuringInsert(value: IIDs): Self = this.set("ReadOnlyPropertiesDuringInsert", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnlyPropertiesDuringUpdate(value: IIDs): Self = this.set("ReadOnlyPropertiesDuringUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRealObjectType(value: Boolean): Self = this.set("RealObjectType", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowCreationCommandInTaskPane(value: Boolean): Self = this.set("ShowCreationCommandInTaskPane", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslatable(value: Boolean): Self = this.set("Translatable", value.asInstanceOf[js.Any])
  }
  
}

