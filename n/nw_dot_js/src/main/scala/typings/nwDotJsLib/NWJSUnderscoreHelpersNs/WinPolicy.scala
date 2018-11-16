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

