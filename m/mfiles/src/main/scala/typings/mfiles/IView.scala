package typings.mfiles

import typings.mfiles.MFilesNs.MFSearchFlags
import typings.mfiles.MFilesNs.MFViewFlag
import typings.mfiles.MFilesNs.MFViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView extends js.Object {
  var AccessControlList: IAccessControlList
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
  def Clone(): IView
  def CloneFrom(View: IView): Unit
}

object IView {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Common = Common, GUID = GUID, HasParent = HasParent, ID = ID, Levels = Levels, LookInAllVersions = LookInAllVersions, Name = Name, Parent = Parent, ReturnLatestVisibleVersion = ReturnLatestVisibleVersion, SearchConditions = SearchConditions, SearchDef = SearchDef, SearchFlags = SearchFlags, ViewFlags = ViewFlags, ViewLocation = ViewLocation, ViewType = ViewType, Visible = Visible)
  
    __obj.asInstanceOf[IView]
  }
}

