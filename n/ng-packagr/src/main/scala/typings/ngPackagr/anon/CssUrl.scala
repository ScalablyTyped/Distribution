package typings.ngPackagr.anon

import typings.ngPackagr.ngPackagrStrings.`inline`
import typings.ngPackagr.ngPackagrStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssUrl extends StObject {
  
  /**
    * Embed assets in css file using data URIs - see https://css-tricks.com/data-uris
    */
  var cssUrl: js.UndefOr[none | `inline`] = js.undefined
  
  /**
    * Entry file to the public API (default: `src/public_api.ts`).
    */
  var entryFile: js.UndefOr[String] = js.undefined
  
  /**
    * Filename of the auto-generated flat module file (if empty, defaults to the package name as given in `package.json`).
    */
  var flatModuleFile: js.UndefOr[String] = js.undefined
  
  /**
    * Any additional paths that should be used to resolve style imports
    */
  var styleIncludePaths: js.UndefOr[js.Array[String]] = js.undefined
}
object CssUrl {
  
  inline def apply(): CssUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CssUrl]
  }
  
  extension [Self <: CssUrl](x: Self) {
    
    inline def setCssUrl(value: none | `inline`): Self = StObject.set(x, "cssUrl", value.asInstanceOf[js.Any])
    
    inline def setCssUrlUndefined: Self = StObject.set(x, "cssUrl", js.undefined)
    
    inline def setEntryFile(value: String): Self = StObject.set(x, "entryFile", value.asInstanceOf[js.Any])
    
    inline def setEntryFileUndefined: Self = StObject.set(x, "entryFile", js.undefined)
    
    inline def setFlatModuleFile(value: String): Self = StObject.set(x, "flatModuleFile", value.asInstanceOf[js.Any])
    
    inline def setFlatModuleFileUndefined: Self = StObject.set(x, "flatModuleFile", js.undefined)
    
    inline def setStyleIncludePaths(value: js.Array[String]): Self = StObject.set(x, "styleIncludePaths", value.asInstanceOf[js.Any])
    
    inline def setStyleIncludePathsUndefined: Self = StObject.set(x, "styleIncludePaths", js.undefined)
    
    inline def setStyleIncludePathsVarargs(value: String*): Self = StObject.set(x, "styleIncludePaths", js.Array(value*))
  }
}
