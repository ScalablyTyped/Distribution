package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreAppCacheBusterMod extends Shortcut {
  
  @JSImport("sap/ui/core/AppCacheBuster", JSImport.Default)
  @js.native
  val default: AppCacheBuster = js.native
  
  /**
    * The AppCacheBuster is used to hook into URL relevant functions in jQuery and SAPUI5 and rewrite the URLs
    * with a timestamp segment. The timestamp information is fetched from the server and used later on for
    * the URL rewriting.
    */
  trait AppCacheBuster extends StObject {
    
    /**
      * Converts the given URL if it matches a URL in the cachebuster index. If not then the same URL will be
      * returned. To prevent URLs from being modified by the application cachebuster you can implement the function
      * `sap.ui.core.AppCacheBuster.handleURL`.
      *
      * @returns modified URL when matching the index or unmodified when not
      */
    def convertURL(/**
      * any URL
      */
    sUrl: String): String
    
    /**
      * Callback function which can be overwritten to programmatically decide whether to rewrite the given URL
      * or not.
      *
      * @returns `true` to rewrite or `false` to ignore
      */
    def handleURL(/**
      * any URL
      */
    sUrl: String): Boolean
    
    /**
      * Normalizes the given URL and make it absolute.
      *
      * @returns normalized URL
      */
    def normalizeURL(/**
      * any URL
      */
    sUrl: String): String
    
    /**
      * Registers an application. Loads the cachebuster index file from this locations. All registered files
      * will be considered by the cachebuster and the URLs will be prefixed with the timestamp of the index file.
      */
    def register(/**
      * base URL of an application providing a cachebuster index file
      */
    sBaseUrl: String): Unit
  }
  object AppCacheBuster {
    
    inline def apply(
      convertURL: String => String,
      handleURL: String => Boolean,
      normalizeURL: String => String,
      register: String => Unit
    ): AppCacheBuster = {
      val __obj = js.Dynamic.literal(convertURL = js.Any.fromFunction1(convertURL), handleURL = js.Any.fromFunction1(handleURL), normalizeURL = js.Any.fromFunction1(normalizeURL), register = js.Any.fromFunction1(register))
      __obj.asInstanceOf[AppCacheBuster]
    }
    
    extension [Self <: AppCacheBuster](x: Self) {
      
      inline def setConvertURL(value: String => String): Self = StObject.set(x, "convertURL", js.Any.fromFunction1(value))
      
      inline def setHandleURL(value: String => Boolean): Self = StObject.set(x, "handleURL", js.Any.fromFunction1(value))
      
      inline def setNormalizeURL(value: String => String): Self = StObject.set(x, "normalizeURL", js.Any.fromFunction1(value))
      
      inline def setRegister(value: String => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    }
  }
  
  type _To = AppCacheBuster
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreAppCacheBusterMod.foo` */
  override def _to: AppCacheBuster = default
}
