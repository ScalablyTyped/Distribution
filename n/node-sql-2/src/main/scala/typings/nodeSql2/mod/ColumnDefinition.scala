package typings.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnDefinition[Name /* <: String */, Type] extends Named[Name] {
  
  var dataType: String = js.native
  
  var defaultValue: js.UndefOr[Type] = js.native
  
  var jsType: js.UndefOr[Type] = js.native
  
  var notNull: js.UndefOr[Boolean] = js.native
  
  var primaryKey: js.UndefOr[Boolean] = js.native
  
  var references: js.UndefOr[typings.nodeSql2.anon.Column] = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
}
object ColumnDefinition {
  
  @scala.inline
  def apply[Name /* <: String */, Type](dataType: String): ColumnDefinition[Name, Type] = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition[Name, Type]]
  }
  
  @scala.inline
  implicit class ColumnDefinitionOps[Self <: ColumnDefinition[_, _], Name /* <: String */, Type] (val x: Self with (ColumnDefinition[Name, Type])) extends AnyVal {
    
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
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: Type): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setJsType(value: Type): Self = this.set("jsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsType: Self = this.set("jsType", js.undefined)
    
    @scala.inline
    def setNotNull(value: Boolean): Self = this.set("notNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotNull: Self = this.set("notNull", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: Boolean): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    
    @scala.inline
    def setReferences(value: typings.nodeSql2.anon.Column): Self = this.set("references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
}
