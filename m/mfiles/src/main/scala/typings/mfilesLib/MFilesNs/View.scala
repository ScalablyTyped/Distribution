package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.View")
@js.native
class View ()
  extends mfilesLib.IView {
  /* CompleteClass */
  override var AccessControlList: mfilesLib.IAccessControlList = js.native
  /* CompleteClass */
  override var Common: scala.Boolean = js.native
  /* CompleteClass */
  override val GUID: java.lang.String = js.native
  /* CompleteClass */
  override var HasParent: scala.Boolean = js.native
  /* CompleteClass */
  override var ID: scala.Double = js.native
  /* CompleteClass */
  override var Levels: mfilesLib.IExpressionExs = js.native
  /* CompleteClass */
  override var LookInAllVersions: scala.Boolean = js.native
  /* CompleteClass */
  override var Name: java.lang.String = js.native
  /* CompleteClass */
  override var Parent: scala.Double = js.native
  /* CompleteClass */
  override var ReturnLatestVisibleVersion: scala.Boolean = js.native
  /* CompleteClass */
  override var SearchConditions: mfilesLib.ISearchConditions = js.native
  /* CompleteClass */
  override var SearchDef: mfilesLib.ISearchDef = js.native
  /* CompleteClass */
  override var SearchFlags: MFSearchFlags = js.native
  /* CompleteClass */
  override var ViewFlags: MFViewFlag = js.native
  /* CompleteClass */
  override var ViewLocation: mfilesLib.IViewLocation = js.native
  /* CompleteClass */
  override var ViewType: MFViewType = js.native
  /* CompleteClass */
  override var Visible: scala.Boolean = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IView = js.native
  /* CompleteClass */
  override def CloneFrom(View: mfilesLib.IView): scala.Unit = js.native
}

@JSGlobal("MFiles.View")
@js.native
object View
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IView]

