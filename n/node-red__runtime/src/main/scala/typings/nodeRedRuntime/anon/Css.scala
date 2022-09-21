package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Css extends StObject {
  
  /**
    * Absolute path to custom css file
    */
  var css: js.UndefOr[String] = js.undefined
  
  /**
    * Absolute path to theme icon
    */
  var favicon: js.UndefOr[String] = js.undefined
  
  /**
    * Absolute paths to custom script files
    */
  var scripts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Page title
    */
  var title: js.UndefOr[String] = js.undefined
}
object Css {
  
  inline def apply(): Css = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Css]
  }
  
  extension [Self <: Css](x: Self) {
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
    
    inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
    
    inline def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
