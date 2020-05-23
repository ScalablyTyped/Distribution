package typings.navigation.mod

import typings.std.HTMLAnchorElement
import typings.std.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryManager extends js.Object {
  /**
    * Gets or sets a value indicating whether to disable browser history
    */
  var disabled: Boolean = js.native
  /**
    * Adds browser history
    * @param url The current url
    * @param replace A value indicating whether to replace the current
    * @param stateContext The current StateContext
    * browser history entry
    */
  def addHistory(url: String, replace: Boolean, stateContext: StateContext): Unit = js.native
  /**
    * Gets the current location
    */
  def getCurrentUrl(): String = js.native
  /**
    * Gets an Href from the url
    */
  def getHref(url: String): String = js.native
  /**
    * Gets a Url from the anchor or location
    */
  def getUrl(hrefElement: HTMLAnchorElement): String = js.native
  def getUrl(hrefElement: Location): String = js.native
  /**
    * Registers browser history event listeners
    * @param navigateHistory The history navigation event handler
    */
  def init(navigateHistory: js.Function1[/* url */ js.UndefOr[String], Unit]): Unit = js.native
  /**
    * Removes browser history event listeners
    */
  def stop(): Unit = js.native
}

