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

