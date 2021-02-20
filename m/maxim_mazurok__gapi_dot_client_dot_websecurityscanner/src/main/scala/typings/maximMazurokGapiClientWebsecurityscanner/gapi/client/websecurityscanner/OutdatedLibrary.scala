package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutdatedLibrary extends StObject {
  
  /** URLs to learn more information about the vulnerabilities in the library. */
  var learnMoreUrls: js.UndefOr[js.Array[String]] = js.native
  
  /** The name of the outdated library. */
  var libraryName: js.UndefOr[String] = js.native
  
  /** The version number. */
  var version: js.UndefOr[String] = js.native
}
object OutdatedLibrary {
  
  @scala.inline
  def apply(): OutdatedLibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutdatedLibrary]
  }
  
  @scala.inline
  implicit class OutdatedLibraryMutableBuilder[Self <: OutdatedLibrary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLearnMoreUrls(value: js.Array[String]): Self = StObject.set(x, "learnMoreUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearnMoreUrlsUndefined: Self = StObject.set(x, "learnMoreUrls", js.undefined)
    
    @scala.inline
    def setLearnMoreUrlsVarargs(value: String*): Self = StObject.set(x, "learnMoreUrls", js.Array(value :_*))
    
    @scala.inline
    def setLibraryName(value: String): Self = StObject.set(x, "libraryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryNameUndefined: Self = StObject.set(x, "libraryName", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
