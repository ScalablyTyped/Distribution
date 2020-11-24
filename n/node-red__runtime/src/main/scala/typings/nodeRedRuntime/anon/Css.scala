package typings.nodeRedRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Css extends js.Object {
  
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
  implicit class CssOps[Self <: Css] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setFavicon(value: String): Self = this.set("favicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavicon: Self = this.set("favicon", js.undefined)
    
    @scala.inline
    def setScriptsVarargs(value: String*): Self = this.set("scripts", js.Array(value :_*))
    
    @scala.inline
    def setScripts(value: js.Array[String]): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
