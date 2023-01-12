package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutdatedLibrary extends StObject {
  
  /** URLs to learn more information about the vulnerabilities in the library. */
  var learnMoreUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The name of the outdated library. */
  var libraryName: js.UndefOr[String] = js.undefined
  
  /** The version number. */
  var version: js.UndefOr[String] = js.undefined
}
object OutdatedLibrary {
  
  inline def apply(): OutdatedLibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutdatedLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutdatedLibrary] (val x: Self) extends AnyVal {
    
    inline def setLearnMoreUrls(value: js.Array[String]): Self = StObject.set(x, "learnMoreUrls", value.asInstanceOf[js.Any])
    
    inline def setLearnMoreUrlsUndefined: Self = StObject.set(x, "learnMoreUrls", js.undefined)
    
    inline def setLearnMoreUrlsVarargs(value: String*): Self = StObject.set(x, "learnMoreUrls", js.Array(value*))
    
    inline def setLibraryName(value: String): Self = StObject.set(x, "libraryName", value.asInstanceOf[js.Any])
    
    inline def setLibraryNameUndefined: Self = StObject.set(x, "libraryName", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
