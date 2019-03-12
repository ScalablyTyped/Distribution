package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * nw.Window.get().on('new-win-policy') callback policy argument object
  */
trait WinPolicy extends js.Object {
  /**
    * Force the link to be opened in the same frame
    */
  def forceCurrent(): scala.Unit
  /**
    * Force the link to be a downloadable, or open by external program
    */
  def forceDownload(): scala.Unit
  /**
    * Force the link to be opened in a new popup window
    */
  def forceNewPopup(): scala.Unit
  /**
    * Force the link to be opened in a new window
    */
  def forceNewWindow(): scala.Unit
  /**
    * Ignore the request, navigation won’t happen.
    */
  def ignore(): scala.Unit
  /**
    * Control the options for the new popup window.
    *
    *@param m {Object} The object is in the same format as the Window subfields in manifest format.
    */
  def setNewWindowManifest(m: WindowOption): scala.Unit
}

object WinPolicy {
  @scala.inline
  def apply(
    forceCurrent: () => scala.Unit,
    forceDownload: () => scala.Unit,
    forceNewPopup: () => scala.Unit,
    forceNewWindow: () => scala.Unit,
    ignore: () => scala.Unit,
    setNewWindowManifest: WindowOption => scala.Unit
  ): WinPolicy = {
    val __obj = js.Dynamic.literal(forceCurrent = js.Any.fromFunction0(forceCurrent), forceDownload = js.Any.fromFunction0(forceDownload), forceNewPopup = js.Any.fromFunction0(forceNewPopup), forceNewWindow = js.Any.fromFunction0(forceNewWindow), ignore = js.Any.fromFunction0(ignore), setNewWindowManifest = js.Any.fromFunction1(setNewWindowManifest))
  
    __obj.asInstanceOf[WinPolicy]
  }
}

