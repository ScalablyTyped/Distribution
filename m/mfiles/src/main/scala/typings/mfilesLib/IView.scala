package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView extends js.Object {
  var AccessControlList: IAccessControlList
  var Common: scala.Boolean
  val GUID: java.lang.String
  var HasParent: scala.Boolean
  var ID: scala.Double
  var Levels: IExpressionExs
  var LookInAllVersions: scala.Boolean
  var Name: java.lang.String
  var Parent: scala.Double
  var ReturnLatestVisibleVersion: scala.Boolean
  var SearchConditions: ISearchConditions
  var SearchDef: ISearchDef
  var SearchFlags: mfilesLib.MFilesNs.MFSearchFlags
  var ViewFlags: mfilesLib.MFilesNs.MFViewFlag
  var ViewLocation: IViewLocation
  var ViewType: mfilesLib.MFilesNs.MFViewType
  var Visible: scala.Boolean
  def Clone(): IView
  def CloneFrom(View: IView): scala.Unit
}

object IView {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: js.Function0[IView],
    CloneFrom: js.Function1[IView, scala.Unit],
    Common: scala.Boolean,
    GUID: java.lang.String,
    HasParent: scala.Boolean,
    ID: scala.Double,
    Levels: IExpressionExs,
    LookInAllVersions: scala.Boolean,
    Name: java.lang.String,
    Parent: scala.Double,
    ReturnLatestVisibleVersion: scala.Boolean,
    SearchConditions: ISearchConditions,
    SearchDef: ISearchDef,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    ViewFlags: mfilesLib.MFilesNs.MFViewFlag,
    ViewLocation: IViewLocation,
    ViewType: mfilesLib.MFilesNs.MFViewType,
    Visible: scala.Boolean
  ): IView = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, Clone = Clone, CloneFrom = CloneFrom, Common = Common, GUID = GUID, HasParent = HasParent, ID = ID, Levels = Levels, LookInAllVersions = LookInAllVersions, Name = Name, Parent = Parent, ReturnLatestVisibleVersion = ReturnLatestVisibleVersion, SearchConditions = SearchConditions, SearchDef = SearchDef, SearchFlags = SearchFlags, ViewFlags = ViewFlags, ViewLocation = ViewLocation, ViewType = ViewType, Visible = Visible)
  
    __obj.asInstanceOf[IView]
  }
}

