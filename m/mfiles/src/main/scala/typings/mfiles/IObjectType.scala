package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectType extends StObject {
  
  var AccessControlList: IAccessControlList = js.native
  
  var AllowAdding: Boolean = js.native
  
  var AllowedAsGroupingLevel: Boolean = js.native
  
  var CanHaveFiles: Boolean = js.native
  
  def CanHaveItemIcons(): Boolean = js.native
  
  def Clone(): IObjectType = js.native
  
  var DefaultAccessControlList: IAccessControlList = js.native
  
  var DefaultPropertyDef: Double = js.native
  
  var External: Boolean = js.native
  
  val GUID: String = js.native
  
  def GetIconAsPNG(Width: Double, Height: Double): js.Array[Double] = js.native
  
  var HasOwnerType: Boolean = js.native
  
  var Hierarchical: Boolean = js.native
  
  var ID: Double = js.native
  
  var Icon: js.Array[Double] = js.native
  
  def IsAddingAllowedForUser(SessionInfo: ISessionInfo): Boolean = js.native
  
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
  implicit class IObjectTypeMutableBuilder[Self <: IObjectType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAdding(value: Boolean): Self = StObject.set(x, "AllowAdding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedAsGroupingLevel(value: Boolean): Self = StObject.set(x, "AllowedAsGroupingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanHaveFiles(value: Boolean): Self = StObject.set(x, "CanHaveFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanHaveItemIcons(value: () => Boolean): Self = StObject.set(x, "CanHaveItemIcons", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClone(value: () => IObjectType): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultAccessControlList(value: IAccessControlList): Self = StObject.set(x, "DefaultAccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropertyDef(value: Double): Self = StObject.set(x, "DefaultPropertyDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal(value: Boolean): Self = StObject.set(x, "External", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetIconAsPNG(value: (Double, Double) => js.Array[Double]): Self = StObject.set(x, "GetIconAsPNG", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasOwnerType(value: Boolean): Self = StObject.set(x, "HasOwnerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchical(value: Boolean): Self = StObject.set(x, "Hierarchical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: js.Array[Double]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconVarargs(value: Double*): Self = StObject.set(x, "Icon", js.Array(value :_*))
    
    @scala.inline
    def setIsAddingAllowedForUser(value: ISessionInfo => Boolean): Self = StObject.set(x, "IsAddingAllowedForUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNamePlural(value: String): Self = StObject.set(x, "NamePlural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameSingular(value: String): Self = StObject.set(x, "NameSingular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeTargetsForBrowsing(value: IObjectTypeTargetsForBrowsing): Self = StObject.set(x, "ObjectTypeTargetsForBrowsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerPropertyDef(value: Double): Self = StObject.set(x, "OwnerPropertyDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerType(value: Double): Self = StObject.set(x, "OwnerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyPropertiesDuringInsert(value: IIDs): Self = StObject.set(x, "ReadOnlyPropertiesDuringInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyPropertiesDuringUpdate(value: IIDs): Self = StObject.set(x, "ReadOnlyPropertiesDuringUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealObjectType(value: Boolean): Self = StObject.set(x, "RealObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCreationCommandInTaskPane(value: Boolean): Self = StObject.set(x, "ShowCreationCommandInTaskPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslatable(value: Boolean): Self = StObject.set(x, "Translatable", value.asInstanceOf[js.Any])
  }
}
