package typings.openfin.shapesLayoutMod

import typings.openfin.openfinStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutRow extends js.Object {
  
  var content: LayoutContent = js.native
  
  var `type`: row = js.native
}
object LayoutRow {
  
  @scala.inline
  def apply(content: LayoutContent, `type`: row): LayoutRow = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutRow]
  }
  
  @scala.inline
  implicit class LayoutRowOps[Self <: LayoutRow] (val x: Self) extends AnyVal {
    
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
    def setContentVarargs(value: (LayoutRow | LayoutColumn | LayoutComponent)*): Self = this.set("content", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: LayoutContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: row): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
