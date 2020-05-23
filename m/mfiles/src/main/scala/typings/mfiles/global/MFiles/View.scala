package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAccessControlList
import typings.mfiles.IExpressionExs
import typings.mfiles.ISearchConditions
import typings.mfiles.ISearchDef
import typings.mfiles.IView
import typings.mfiles.IViewLocation
import typings.mfiles.MFiles.MFSearchFlags
import typings.mfiles.MFiles.MFViewFlag
import typings.mfiles.MFiles.MFViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.View")
@js.native
class View () extends IView {
  /* CompleteClass */
  override var AccessControlList: IAccessControlList = js.native
  /* CompleteClass */
  override var Common: Boolean = js.native
  /* CompleteClass */
  override val GUID: String = js.native
  /* CompleteClass */
  override var HasParent: Boolean = js.native
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override var Levels: IExpressionExs = js.native
  /* CompleteClass */
  override var LookInAllVersions: Boolean = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var Parent: Double = js.native
  /* CompleteClass */
  override var ReturnLatestVisibleVersion: Boolean = js.native
  /* CompleteClass */
  override var SearchConditions: ISearchConditions = js.native
  /* CompleteClass */
  override var SearchDef: ISearchDef = js.native
  /* CompleteClass */
  override var SearchFlags: MFSearchFlags = js.native
  /* CompleteClass */
  override var ViewFlags: MFViewFlag = js.native
  /* CompleteClass */
  override var ViewLocation: IViewLocation = js.native
  /* CompleteClass */
  override var ViewType: MFViewType = js.native
  /* CompleteClass */
  override var Visible: Boolean = js.native
  /* CompleteClass */
  override def Clone(): IView = js.native
  /* CompleteClass */
  override def CloneFrom(View: IView): Unit = js.native
}

@JSGlobal("MFiles.View")
@js.native
object View extends Instantiable0[IView]

