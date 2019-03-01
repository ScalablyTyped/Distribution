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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessControlList")(AccessControlList)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("CloneFrom")(CloneFrom)
    __obj.updateDynamic("Common")(Common)
    __obj.updateDynamic("GUID")(GUID)
    __obj.updateDynamic("HasParent")(HasParent)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Levels")(Levels)
    __obj.updateDynamic("LookInAllVersions")(LookInAllVersions)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("ReturnLatestVisibleVersion")(ReturnLatestVisibleVersion)
    __obj.updateDynamic("SearchConditions")(SearchConditions)
    __obj.updateDynamic("SearchDef")(SearchDef)
    __obj.updateDynamic("SearchFlags")(SearchFlags)
    __obj.updateDynamic("ViewFlags")(ViewFlags)
    __obj.updateDynamic("ViewLocation")(ViewLocation)
    __obj.updateDynamic("ViewType")(ViewType)
    __obj.updateDynamic("Visible")(Visible)
    __obj.asInstanceOf[IView]
  }
}

