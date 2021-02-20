package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MainPageSuffix extends StObject {
  
  /**
    * If the requested object path is missing, the service will ensure the path has a trailing '/', append this suffix, and attempt to retrieve the resulting object. This allows the
    * creation of index.html objects to represent directory pages.
    */
  var mainPageSuffix: js.UndefOr[String] = js.native
  
  /**
    * If the requested object path is missing, and any mainPageSuffix object is missing, if applicable, the service will return the named object from this bucket as the content for a
    * 404 Not Found result.
    */
  var notFoundPage: js.UndefOr[String] = js.native
}
object MainPageSuffix {
  
  @scala.inline
  def apply(): MainPageSuffix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MainPageSuffix]
  }
  
  @scala.inline
  implicit class MainPageSuffixMutableBuilder[Self <: MainPageSuffix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMainPageSuffix(value: String): Self = StObject.set(x, "mainPageSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainPageSuffixUndefined: Self = StObject.set(x, "mainPageSuffix", js.undefined)
    
    @scala.inline
    def setNotFoundPage(value: String): Self = StObject.set(x, "notFoundPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundPageUndefined: Self = StObject.set(x, "notFoundPage", js.undefined)
  }
}
