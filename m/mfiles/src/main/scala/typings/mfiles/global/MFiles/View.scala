package typings.mfiles.global.MFiles

import typings.mfiles.IAccessControlList
import typings.mfiles.IExpressionExs
import typings.mfiles.ISearchConditions
import typings.mfiles.ISearchDef
import typings.mfiles.IView
import typings.mfiles.IViewLocation
import typings.mfiles.MFiles.MFSearchFlags
import typings.mfiles.MFiles.MFViewFlag
import typings.mfiles.MFiles.MFViewType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.View")
@js.native
open class View ()
  extends StObject
     with IView {
  
  /* CompleteClass */
  var AccessControlList: IAccessControlList = js.native
  
  /* CompleteClass */
  override def Clone(): IView = js.native
  
  /* CompleteClass */
  override def CloneFrom(View: IView): Unit = js.native
  
  /* CompleteClass */
  var Common: Boolean = js.native
  
  /* CompleteClass */
  override val GUID: String = js.native
  
  /* CompleteClass */
  var HasParent: Boolean = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var Levels: IExpressionExs = js.native
  
  /* CompleteClass */
  var LookInAllVersions: Boolean = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var Parent: Double = js.native
  
  /* CompleteClass */
  var ReturnLatestVisibleVersion: Boolean = js.native
  
  /* CompleteClass */
  var SearchConditions: ISearchConditions = js.native
  
  /* CompleteClass */
  var SearchDef: ISearchDef = js.native
  
  /* CompleteClass */
  var SearchFlags: MFSearchFlags = js.native
  
  /* CompleteClass */
  var ViewFlags: MFViewFlag = js.native
  
  /* CompleteClass */
  var ViewLocation: IViewLocation = js.native
  
  /* CompleteClass */
  var ViewType: MFViewType = js.native
  
  /* CompleteClass */
  var Visible: Boolean = js.native
}
