package typings
package navigationLib.navigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryManager extends js.Object {
  /**
       * Gets or sets a value indicating whether to disable browser history
       */
  var disabled: scala.Boolean = js.native
  /**
       * Adds browser history
       * @param url The current url
       * @param replace A value indicating whether to replace the current
       * browser history entry
       */
  def addHistory(url: java.lang.String, replace: scala.Boolean): scala.Unit = js.native
  /**
       * Gets the current location
       */
  def getCurrentUrl(): java.lang.String = js.native
  /**
       * Gets an Href from the url
       */
  def getHref(url: java.lang.String): java.lang.String = js.native
  /**
       * Gets a Url from the anchor or location
       */
  def getUrl(hrefElement: stdLib.HTMLAnchorElement): java.lang.String = js.native
  /**
       * Gets a Url from the anchor or location
       */
  def getUrl(hrefElement: stdLib.Location): java.lang.String = js.native
  /**
       * Registers browser history event listeners
       * @param navigateHistory The history navigation event handler
       */
  def init(navigateHistory: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Removes browser history event listeners
       */
  def stop(): scala.Unit = js.native
}

