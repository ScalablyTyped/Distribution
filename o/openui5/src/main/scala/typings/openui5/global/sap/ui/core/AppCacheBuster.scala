package typings.openui5.global.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.AppCacheBuster")
@js.native
object AppCacheBuster extends js.Object {
  /**
    * Converts the given URL if it matches a URL in the cachebuster index.If not then the same URL will be
    * returned. To prevent URLs from beingmodified by the application cachebuster you can implement the
    * function<code>sap.ui.core.AppCacheBuster.handleURL</code>.
    * @param sUrl any URL
    * @returns modified URL when matching the index or unmodified when not
    */
  def convertURL(sUrl: String): String = js.native
  /**
    * Callback function which can be overwritten to programmatically decidewhether to rewrite the given
    * URL or not.
    * @param sUrl any URL
    * @returns <code>true</code> to rewrite or <code>false</code> to ignore
    */
  def handleURL(sUrl: String): Boolean = js.native
  /**
    * Normalizes the given URL and make it absolute.
    * @param sUrl any URL
    * @returns normalized URL
    */
  def normalizeURL(sUrl: String): String = js.native
  /**
    * Registers an application. Loads the cachebuster index file from thislocations. All registered files
    * will be considered by the cachebusterand the URLs will be prefixed with the timestamp of the index
    * file.
    * @param base URL of an application providing a cachebuster index file
    */
  def register(base: String): Unit = js.native
}

