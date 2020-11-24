package typings.nodeRedRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Catalogues extends js.Object {
  
  /**
    * Alternative palette manager catalogues
    */
  var catalogues: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Enable/disable the Palette Manager
    */
  var editable: js.UndefOr[Boolean] = js.native
  
  /**
    * Override node colours - rules test against category/type by RegExp.
    */
  var theme: js.UndefOr[js.Array[Category]] = js.native
}
object Catalogues {
  
  @scala.inline
  def apply(): Catalogues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Catalogues]
  }
  
  @scala.inline
  implicit class CataloguesOps[Self <: Catalogues] (val x: Self) extends AnyVal {
    
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
    def setCataloguesVarargs(value: String*): Self = this.set("catalogues", js.Array(value :_*))
    
    @scala.inline
    def setCatalogues(value: js.Array[String]): Self = this.set("catalogues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogues: Self = this.set("catalogues", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setThemeVarargs(value: Category*): Self = this.set("theme", js.Array(value :_*))
    
    @scala.inline
    def setTheme(value: js.Array[Category]): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
