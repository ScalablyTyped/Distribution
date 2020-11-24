package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShellFrame extends js.Object {
  
  val ActiveListing: IShellListing = js.native
  
  val BottomPane: IShellPaneContainer = js.native
  
  val Commands: ICommands = js.native
  
  def CreateAdditionalListingForPath(path: String): IShellListing = js.native
  
  def CreateAdditionalListingForView(viewID: Double): IShellListing = js.native
  def CreateAdditionalListingForView(viewID: MFBuiltInView): IShellListing = js.native
  
  val CurrentFolder: IFolderDefs = js.native
  
  val CurrentObjectVersion: IObjectVersion = js.native
  
  var CurrentPath: String = js.native
  
  val Events: IShellFrameEvents = js.native
  
  def GetListing(listingIndex: Double): IShellListing = js.native
  
  def IsFolderLocation(): Boolean = js.native
  
  def IsObjectLocation(): Boolean = js.native
  
  val Listing: IShellListing = js.native
  
  def NavigateToParent(): Unit = js.native
  
  val OuterWindow: IWindow = js.native
  
  val ParentFolder: IFolderDefs = js.native
  
  val RightPane: IShellPaneContainer = js.native
  
  val SearchPane: ISearchPane = js.native
  
  def SetTheme(theme: ITheme): Unit = js.native
  
  val ShellUI: IShellUI = js.native
  
  def ShowDashboard(dashboardID: String, data: js.Any): Unit = js.native
  
  def ShowDefaultContent(): Unit = js.native
  
  def ShowMessage(message: String): Double = js.native
  def ShowMessage(message: IMessage): Double = js.native
  
  def ShowPopupDashboard(dashboardID: String, waitUntilClosed: Boolean, data: js.Any): Unit = js.native
  
  def ShowPopupSSRSReport(reportWindowTitle: String, reportURL: String): Unit = js.native
  
  def ShowSSRSReport(reportURL: String): Unit = js.native
  
  val TaskPane: ITaskPane = js.native
  
  val UseCompactLayout: Boolean = js.native
}
