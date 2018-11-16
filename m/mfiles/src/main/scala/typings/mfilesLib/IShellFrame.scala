package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellFrame extends js.Object {
  val ActiveListing: IShellListing = js.native
  val BottomPane: IShellPaneContainer = js.native
  val Commands: ICommands = js.native
  val CurrentFolder: IFolderDefs = js.native
  val CurrentObjectVersion: IObjectVersion = js.native
  var CurrentPath: java.lang.String = js.native
  val Events: IShellFrameEvents = js.native
  val Listing: IShellListing = js.native
  val OuterWindow: IWindow = js.native
  val ParentFolder: IFolderDefs = js.native
  val RightPane: IShellPaneContainer = js.native
  val SearchPane: ISearchPane = js.native
  val ShellUI: IShellUI = js.native
  val TaskPane: ITaskPane = js.native
  val UseCompactLayout: scala.Boolean = js.native
  def CreateAdditionalListingForPath(path: java.lang.String): IShellListing = js.native
  def CreateAdditionalListingForView(viewID: mfilesLib.MFilesNs.MFBuiltInView): IShellListing = js.native
  def CreateAdditionalListingForView(viewID: scala.Double): IShellListing = js.native
  def GetListing(listingIndex: scala.Double): IShellListing = js.native
  def IsFolderLocation(): scala.Boolean = js.native
  def IsObjectLocation(): scala.Boolean = js.native
  def NavigateToParent(): scala.Unit = js.native
  def SetTheme(theme: ITheme): scala.Unit = js.native
  def ShowDashboard(dashboardID: java.lang.String, data: js.Any): scala.Unit = js.native
  def ShowDefaultContent(): scala.Unit = js.native
  def ShowMessage(message: java.lang.String): scala.Double = js.native
  def ShowMessage(message: IMessage): scala.Double = js.native
  def ShowPopupDashboard(dashboardID: java.lang.String, waitUntilClosed: scala.Boolean, data: js.Any): scala.Unit = js.native
  def ShowPopupSSRSReport(reportWindowTitle: java.lang.String, reportURL: java.lang.String): scala.Unit = js.native
  def ShowSSRSReport(reportURL: java.lang.String): scala.Unit = js.native
}

