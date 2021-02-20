package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Css extends StObject {
  
  /**
    * Absolute path to custom css file
    */
  var css: js.UndefOr[String] = js.native
  
  /**
    * Absolute path to theme icon
    */
  var favicon: js.UndefOr[String] = js.native
  
  /**
    * Absolute paths to custom script files
    */
  var scripts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Page title
    */
  var title: js.UndefOr[String] = js.native
}
object Css {
  
  @scala.inline
  def apply(): Css = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Css]
  }
  
  @scala.inline
  implicit class CssMutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
    
    @scala.inline
    def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    @scala.inline
    def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
