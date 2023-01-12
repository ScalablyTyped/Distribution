package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectType extends StObject {
  
  var AccessControlList: IAccessControlList
  
  var AllowAdding: Boolean
  
  var AllowedAsGroupingLevel: Boolean
  
  var CanHaveFiles: Boolean
  
  def CanHaveItemIcons(): Boolean
  
  def Clone(): IObjectType
  
  var DefaultAccessControlList: IAccessControlList
  
  var DefaultPropertyDef: Double
  
  var External: Boolean
  
  val GUID: String
  
  def GetIconAsPNG(Width: Double, Height: Double): js.Array[Double]
  
  var HasOwnerType: Boolean
  
  var Hierarchical: Boolean
  
  var ID: Double
  
  var Icon: js.Array[Double]
  
  def IsAddingAllowedForUser(SessionInfo: ISessionInfo): Boolean
  
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
}
object IObjectType {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IObjectType] (val x: Self) extends AnyVal {
    
    inline def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setAllowAdding(value: Boolean): Self = StObject.set(x, "AllowAdding", value.asInstanceOf[js.Any])
    
    inline def setAllowedAsGroupingLevel(value: Boolean): Self = StObject.set(x, "AllowedAsGroupingLevel", value.asInstanceOf[js.Any])
    
    inline def setCanHaveFiles(value: Boolean): Self = StObject.set(x, "CanHaveFiles", value.asInstanceOf[js.Any])
    
    inline def setCanHaveItemIcons(value: () => Boolean): Self = StObject.set(x, "CanHaveItemIcons", js.Any.fromFunction0(value))
    
    inline def setClone(value: () => IObjectType): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setDefaultAccessControlList(value: IAccessControlList): Self = StObject.set(x, "DefaultAccessControlList", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropertyDef(value: Double): Self = StObject.set(x, "DefaultPropertyDef", value.asInstanceOf[js.Any])
    
    inline def setExternal(value: Boolean): Self = StObject.set(x, "External", value.asInstanceOf[js.Any])
    
    inline def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
    
    inline def setGetIconAsPNG(value: (Double, Double) => js.Array[Double]): Self = StObject.set(x, "GetIconAsPNG", js.Any.fromFunction2(value))
    
    inline def setHasOwnerType(value: Boolean): Self = StObject.set(x, "HasOwnerType", value.asInstanceOf[js.Any])
    
    inline def setHierarchical(value: Boolean): Self = StObject.set(x, "Hierarchical", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: js.Array[Double]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconVarargs(value: Double*): Self = StObject.set(x, "Icon", js.Array(value*))
    
    inline def setIsAddingAllowedForUser(value: ISessionInfo => Boolean): Self = StObject.set(x, "IsAddingAllowedForUser", js.Any.fromFunction1(value))
    
    inline def setNamePlural(value: String): Self = StObject.set(x, "NamePlural", value.asInstanceOf[js.Any])
    
    inline def setNameSingular(value: String): Self = StObject.set(x, "NameSingular", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeTargetsForBrowsing(value: IObjectTypeTargetsForBrowsing): Self = StObject.set(x, "ObjectTypeTargetsForBrowsing", value.asInstanceOf[js.Any])
    
    inline def setOwnerPropertyDef(value: Double): Self = StObject.set(x, "OwnerPropertyDef", value.asInstanceOf[js.Any])
    
    inline def setOwnerType(value: Double): Self = StObject.set(x, "OwnerType", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyPropertiesDuringInsert(value: IIDs): Self = StObject.set(x, "ReadOnlyPropertiesDuringInsert", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyPropertiesDuringUpdate(value: IIDs): Self = StObject.set(x, "ReadOnlyPropertiesDuringUpdate", value.asInstanceOf[js.Any])
    
    inline def setRealObjectType(value: Boolean): Self = StObject.set(x, "RealObjectType", value.asInstanceOf[js.Any])
    
    inline def setShowCreationCommandInTaskPane(value: Boolean): Self = StObject.set(x, "ShowCreationCommandInTaskPane", value.asInstanceOf[js.Any])
    
    inline def setTranslatable(value: Boolean): Self = StObject.set(x, "Translatable", value.asInstanceOf[js.Any])
  }
}
