package typings.next.anon

import typings.next.nextStrings.app
import typings.next.nextStrings.pages
import typings.next.nextStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageExtensions extends StObject {
  
  var isDev: Boolean
  
  var pageExtensions: js.Array[String]
  
  var pagePaths: js.Array[String]
  
  var pagesDir: js.UndefOr[String] = js.undefined
  
  var pagesType: pages | root | app
}
object PageExtensions {
  
  inline def apply(
    isDev: Boolean,
    pageExtensions: js.Array[String],
    pagePaths: js.Array[String],
    pagesType: pages | root | app
  ): PageExtensions = {
    val __obj = js.Dynamic.literal(isDev = isDev.asInstanceOf[js.Any], pageExtensions = pageExtensions.asInstanceOf[js.Any], pagePaths = pagePaths.asInstanceOf[js.Any], pagesType = pagesType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageExtensions]
  }
  
  extension [Self <: PageExtensions](x: Self) {
    
    inline def setIsDev(value: Boolean): Self = StObject.set(x, "isDev", value.asInstanceOf[js.Any])
    
    inline def setPageExtensions(value: js.Array[String]): Self = StObject.set(x, "pageExtensions", value.asInstanceOf[js.Any])
    
    inline def setPageExtensionsVarargs(value: String*): Self = StObject.set(x, "pageExtensions", js.Array(value*))
    
    inline def setPagePaths(value: js.Array[String]): Self = StObject.set(x, "pagePaths", value.asInstanceOf[js.Any])
    
    inline def setPagePathsVarargs(value: String*): Self = StObject.set(x, "pagePaths", js.Array(value*))
    
    inline def setPagesDir(value: String): Self = StObject.set(x, "pagesDir", value.asInstanceOf[js.Any])
    
    inline def setPagesDirUndefined: Self = StObject.set(x, "pagesDir", js.undefined)
    
    inline def setPagesType(value: pages | root | app): Self = StObject.set(x, "pagesType", value.asInstanceOf[js.Any])
  }
}
