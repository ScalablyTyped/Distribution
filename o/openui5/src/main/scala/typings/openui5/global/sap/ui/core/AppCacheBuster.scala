package typings.openui5.global.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppCacheBuster {
  
  @JSGlobal("sap.ui.core.AppCacheBuster")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts the given URL if it matches a URL in the cachebuster index.If not then the same URL will be
    * returned. To prevent URLs from beingmodified by the application cachebuster you can implement the
    * function<code>sap.ui.core.AppCacheBuster.handleURL</code>.
    * @param sUrl any URL
    * @returns modified URL when matching the index or unmodified when not
    */
  inline def convertURL(sUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertURL")(sUrl.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Callback function which can be overwritten to programmatically decidewhether to rewrite the given
    * URL or not.
    * @param sUrl any URL
    * @returns <code>true</code> to rewrite or <code>false</code> to ignore
    */
  inline def handleURL(sUrl: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("handleURL")(sUrl.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Normalizes the given URL and make it absolute.
    * @param sUrl any URL
    * @returns normalized URL
    */
  inline def normalizeURL(sUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeURL")(sUrl.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Registers an application. Loads the cachebuster index file from thislocations. All registered files
    * will be considered by the cachebusterand the URLs will be prefixed with the timestamp of the index
    * file.
    * @param base URL of an application providing a cachebuster index file
    */
  inline def register(base: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(base.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
