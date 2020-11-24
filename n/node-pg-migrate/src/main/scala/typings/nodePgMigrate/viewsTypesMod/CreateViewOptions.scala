package typings.nodePgMigrate.viewsTypesMod

import typings.nodePgMigrate.nodePgMigrateStrings.CASCADED
import typings.nodePgMigrate.nodePgMigrateStrings.LOCAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateViewOptions extends js.Object {
  
  var checkOption: js.UndefOr[CASCADED | LOCAL] = js.native
  
  var columns: js.UndefOr[String | js.Array[String]] = js.native
  
  var options: js.UndefOr[ViewOptions] = js.native
  
  var recursive: js.UndefOr[Boolean] = js.native
  
  var replace: js.UndefOr[Boolean] = js.native
  
  var temporary: js.UndefOr[Boolean] = js.native
}
object CreateViewOptions {
  
  @scala.inline
  def apply(): CreateViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateViewOptions]
  }
  
  @scala.inline
  implicit class CreateViewOptionsOps[Self <: CreateViewOptions] (val x: Self) extends AnyVal {
    
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
    def setCheckOption(value: CASCADED | LOCAL): Self = this.set("checkOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckOption: Self = this.set("checkOption", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: String | js.Array[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setOptions(value: ViewOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    
    @scala.inline
    def setTemporary(value: Boolean): Self = this.set("temporary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemporary: Self = this.set("temporary", js.undefined)
  }
}
