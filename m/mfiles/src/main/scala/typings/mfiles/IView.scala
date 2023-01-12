package typings.mfiles

import typings.mfiles.MFiles.MFSearchFlags
import typings.mfiles.MFiles.MFViewFlag
import typings.mfiles.MFiles.MFViewType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IView extends StObject {
  
  var AccessControlList: IAccessControlList
  
  def Clone(): IView
  
  def CloneFrom(View: IView): Unit
  
  var Common: Boolean
  
  val GUID: String
  
  var HasParent: Boolean
  
  var ID: Double
  
  var Levels: IExpressionExs
  
  var LookInAllVersions: Boolean
  
  var Name: String
  
  var Parent: Double
  
  var ReturnLatestVisibleVersion: Boolean
  
  var SearchConditions: ISearchConditions
  
  var SearchDef: ISearchDef
  
  var SearchFlags: MFSearchFlags
  
  var ViewFlags: MFViewFlag
  
  var ViewLocation: IViewLocation
  
  var ViewType: MFViewType
  
  var Visible: Boolean
}
object IView {
  
  inline def apply(
    AccessControlList: IAccessControlList,
    Clone: () => IView,
    CloneFrom: IView => Unit,
    Common: Boolean,
    GUID: String,
    HasParent: Boolean,
    ID: Double,
    Levels: IExpressionExs,
    LookInAllVersions: Boolean,
    Name: String,
    Parent: Double,
    ReturnLatestVisibleVersion: Boolean,
    SearchConditions: ISearchConditions,
    SearchDef: ISearchDef,
    SearchFlags: MFSearchFlags,
    ViewFlags: MFViewFlag,
    ViewLocation: IViewLocation,
    ViewType: MFViewType,
    Visible: Boolean
  ): IView = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Common = Common.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], HasParent = HasParent.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], LookInAllVersions = LookInAllVersions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReturnLatestVisibleVersion = ReturnLatestVisibleVersion.asInstanceOf[js.Any], SearchConditions = SearchConditions.asInstanceOf[js.Any], SearchDef = SearchDef.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any], ViewFlags = ViewFlags.asInstanceOf[js.Any], ViewLocation = ViewLocation.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IView] (val x: Self) extends AnyVal {
    
    inline def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => IView): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCloneFrom(value: IView => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    inline def setCommon(value: Boolean): Self = StObject.set(x, "Common", value.asInstanceOf[js.Any])
    
    inline def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
    
    inline def setHasParent(value: Boolean): Self = StObject.set(x, "HasParent", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setLevels(value: IExpressionExs): Self = StObject.set(x, "Levels", value.asInstanceOf[js.Any])
    
    inline def setLookInAllVersions(value: Boolean): Self = StObject.set(x, "LookInAllVersions", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Double): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReturnLatestVisibleVersion(value: Boolean): Self = StObject.set(x, "ReturnLatestVisibleVersion", value.asInstanceOf[js.Any])
    
    inline def setSearchConditions(value: ISearchConditions): Self = StObject.set(x, "SearchConditions", value.asInstanceOf[js.Any])
    
    inline def setSearchDef(value: ISearchDef): Self = StObject.set(x, "SearchDef", value.asInstanceOf[js.Any])
    
    inline def setSearchFlags(value: MFSearchFlags): Self = StObject.set(x, "SearchFlags", value.asInstanceOf[js.Any])
    
    inline def setViewFlags(value: MFViewFlag): Self = StObject.set(x, "ViewFlags", value.asInstanceOf[js.Any])
    
    inline def setViewLocation(value: IViewLocation): Self = StObject.set(x, "ViewLocation", value.asInstanceOf[js.Any])
    
    inline def setViewType(value: MFViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
