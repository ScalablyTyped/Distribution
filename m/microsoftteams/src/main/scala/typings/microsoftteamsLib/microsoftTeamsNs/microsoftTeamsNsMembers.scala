package typings
package microsoftteamsLib.microsoftTeamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams")
@js.native
object microsoftTeamsNsMembers extends js.Object {
  /**
    * Retrieves the current context the frame is running in.
    * @param callback The callback to invoke when the {@link Context} object is retrieved.
    */
  def getContext(callback: js.Function1[/* context */ Context, scala.Unit]): scala.Unit = js.native
  /**
    * Allows an app to retrieve the most recently used tabs for this user.
    * @param callback The callback to invoke when the {@link TabInformation} object is retrieved.
    * @param tabInstanceParameters OPTIONAL Ignored, kept for future use
    */
  def getMruTabInstances(callback: js.Function1[/* tabInfo */ TabInformation, scala.Unit]): scala.Unit = js.native
  def getMruTabInstances(
    callback: js.Function1[/* tabInfo */ TabInformation, scala.Unit],
    tabInstanceParameters: TabInstanceParameters
  ): scala.Unit = js.native
  /**
    * Allows an app to retrieve for this user tabs that are owned by this app.
    * If no TabInstanceParameters are passed, the app defaults to favorite teams and favorite channels.
    * @param callback The callback to invoke when the {@link TabInstanceParameters} object is retrieved.
    * @param tabInstanceParameters OPTIONAL Flags that specify whether to scope call to favorite teams or channels.
    */
  def getTabInstances(callback: js.Function1[/* tabInfo */ TabInformation, scala.Unit]): scala.Unit = js.native
  def getTabInstances(
    callback: js.Function1[/* tabInfo */ TabInformation, scala.Unit],
    tabInstanceParameters: TabInstanceParameters
  ): scala.Unit = js.native
  /**
    * Initializes the library. This must be called before any other SDK calls
    * but after the frame is loaded successfully.
    */
  def initialize(): scala.Unit = js.native
  /**
    * Navigates the frame to a new cross-domain URL. The domain of this URL must match at least one of the
    * valid domains specified in the validDomains block of the manifest; otherwise, an exception will be
    * thrown. This function needs to be used only when navigating the frame to a URL in a different domain
    * than the current one in a way that keeps the app informed of the change and allows the SDK to
    * continue working.
    * @param url The URL to navigate the frame to.
    */
  def navigateCrossDomain(url: java.lang.String): scala.Unit = js.native
  /**
    * Navigates the Microsoft Teams app to the specified tab instance.
    * @param tabInstance The tab instance to navigate to.
    */
  def navigateToTab(tabInstance: TabInstance): scala.Unit = js.native
  /**
    * Registers a handler for changes from or to full-screen view for a tab.
    * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
    * @param handler The handler to invoke when the user toggles full-screen view for a tab.
    */
  def registerFullScreenHandler(handler: js.Function1[/* isFullScreen */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
    * Registers a handler for theme changes.
    * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
    * @param handler The handler to invoke when the user changes their theme.
    */
  def registerOnThemeChangeHandler(handler: js.Function1[/* theme */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Shares a deep link that a user can use to navigate back to a specific state in this page.
    * @param deepLinkParameters ID and label for the link and fallback URL.
    */
  def shareDeepLink(deepLinkParameters: DeepLinkParameters): scala.Unit = js.native
}

