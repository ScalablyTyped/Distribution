package typings.nodePgMigrate.tablesTypesMod

import typings.nodePgMigrate.anon.Options
import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOptions extends IfNotExistsOption {
  
  var comment: js.UndefOr[String | Null] = js.native
  
  var constraints: js.UndefOr[ConstraintOptions] = js.native
  
  var inherits: js.UndefOr[Name] = js.native
  
  var like: js.UndefOr[Name | Options] = js.native
  
  var temporary: js.UndefOr[Boolean] = js.native
}
object TableOptions {
  
  @scala.inline
  def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  
  @scala.inline
  implicit class TableOptionsOps[Self <: TableOptions] (val x: Self) extends AnyVal {
    
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCommentNull: Self = this.set("comment", null)
    
    @scala.inline
    def setConstraints(value: ConstraintOptions): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    
    @scala.inline
    def setInherits(value: Name): Self = this.set("inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherits: Self = this.set("inherits", js.undefined)
    
    @scala.inline
    def setLike(value: Name | Options): Self = this.set("like", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLike: Self = this.set("like", js.undefined)
    
    @scala.inline
    def setTemporary(value: Boolean): Self = this.set("temporary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemporary: Self = this.set("temporary", js.undefined)
  }
}
