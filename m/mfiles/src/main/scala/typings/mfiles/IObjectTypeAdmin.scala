package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectTypeAdmin extends js.Object {
  
  def Clone(): IObjectTypeAdmin = js.native
  
  var ColumnMappings: IObjectTypeColumnMappings = js.native
  
  var ConnectionString: String = js.native
  
  var DefaultForAutomaticPermissions: IAutomaticPermissions = js.native
  
  var DeleteStatement: String = js.native
  
  var InsertIntoStatement: String = js.native
  
  var NamedValueNamespaces: INamedValueNamespaces = js.native
  
  var ObjectType: IObjectType = js.native
  
  var SelectExtIDStatement: String = js.native
  
  var SelectStatement: String = js.native
  
  var SelectStatementOneRecord: String = js.native
  
  var SemanticAliases: ISemanticAliases = js.native
  
  var Translatable: Boolean = js.native
  
  var UpdateStatement: String = js.native
}
object IObjectTypeAdmin {
  
  @scala.inline
  def apply(
    Clone: () => IObjectTypeAdmin,
    ColumnMappings: IObjectTypeColumnMappings,
    ConnectionString: String,
    DefaultForAutomaticPermissions: IAutomaticPermissions,
    DeleteStatement: String,
    InsertIntoStatement: String,
    NamedValueNamespaces: INamedValueNamespaces,
    ObjectType: IObjectType,
    SelectExtIDStatement: String,
    SelectStatement: String,
    SelectStatementOneRecord: String,
    SemanticAliases: ISemanticAliases,
    Translatable: Boolean,
    UpdateStatement: String
  ): IObjectTypeAdmin = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ColumnMappings = ColumnMappings.asInstanceOf[js.Any], ConnectionString = ConnectionString.asInstanceOf[js.Any], DefaultForAutomaticPermissions = DefaultForAutomaticPermissions.asInstanceOf[js.Any], DeleteStatement = DeleteStatement.asInstanceOf[js.Any], InsertIntoStatement = InsertIntoStatement.asInstanceOf[js.Any], NamedValueNamespaces = NamedValueNamespaces.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], SelectExtIDStatement = SelectExtIDStatement.asInstanceOf[js.Any], SelectStatement = SelectStatement.asInstanceOf[js.Any], SelectStatementOneRecord = SelectStatementOneRecord.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], Translatable = Translatable.asInstanceOf[js.Any], UpdateStatement = UpdateStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectTypeAdmin]
  }
  
  @scala.inline
  implicit class IObjectTypeAdminOps[Self <: IObjectTypeAdmin] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IObjectTypeAdmin): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColumnMappings(value: IObjectTypeColumnMappings): Self = this.set("ColumnMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionString(value: String): Self = this.set("ConnectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultForAutomaticPermissions(value: IAutomaticPermissions): Self = this.set("DefaultForAutomaticPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteStatement(value: String): Self = this.set("DeleteStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertIntoStatement(value: String): Self = this.set("InsertIntoStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedValueNamespaces(value: INamedValueNamespaces): Self = this.set("NamedValueNamespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: IObjectType): Self = this.set("ObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectExtIDStatement(value: String): Self = this.set("SelectExtIDStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectStatement(value: String): Self = this.set("SelectStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectStatementOneRecord(value: String): Self = this.set("SelectStatementOneRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticAliases(value: ISemanticAliases): Self = this.set("SemanticAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslatable(value: Boolean): Self = this.set("Translatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStatement(value: String): Self = this.set("UpdateStatement", value.asInstanceOf[js.Any])
  }
}
