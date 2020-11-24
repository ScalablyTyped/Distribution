package typings.nodePgMigrate.tablesTypesMod

import typings.nodePgMigrate.generalTypesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForeignKeyOptions extends ReferencesOptions {
  
  var columns: Name | js.Array[Name] = js.native
}
object ForeignKeyOptions {
  
  @scala.inline
  def apply(columns: Name | js.Array[Name], references: Name): ForeignKeyOptions = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForeignKeyOptions]
  }
  
  @scala.inline
  implicit class ForeignKeyOptionsOps[Self <: ForeignKeyOptions] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: Name*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: Name | js.Array[Name]): Self = this.set("columns", value.asInstanceOf[js.Any])
  }
}
