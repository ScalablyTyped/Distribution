package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectTypeAdmin extends StObject {
  
  def Clone(): IObjectTypeAdmin
  
  var ColumnMappings: IObjectTypeColumnMappings
  
  var ConnectionString: String
  
  var DefaultForAutomaticPermissions: IAutomaticPermissions
  
  var DeleteStatement: String
  
  var InsertIntoStatement: String
  
  var NamedValueNamespaces: INamedValueNamespaces
  
  var ObjectType: IObjectType
  
  var SelectExtIDStatement: String
  
  var SelectStatement: String
  
  var SelectStatementOneRecord: String
  
  var SemanticAliases: ISemanticAliases
  
  var Translatable: Boolean
  
  var UpdateStatement: String
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
  implicit class IObjectTypeAdminMutableBuilder[Self <: IObjectTypeAdmin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IObjectTypeAdmin): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColumnMappings(value: IObjectTypeColumnMappings): Self = StObject.set(x, "ColumnMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionString(value: String): Self = StObject.set(x, "ConnectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultForAutomaticPermissions(value: IAutomaticPermissions): Self = StObject.set(x, "DefaultForAutomaticPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteStatement(value: String): Self = StObject.set(x, "DeleteStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertIntoStatement(value: String): Self = StObject.set(x, "InsertIntoStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedValueNamespaces(value: INamedValueNamespaces): Self = StObject.set(x, "NamedValueNamespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: IObjectType): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectExtIDStatement(value: String): Self = StObject.set(x, "SelectExtIDStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectStatement(value: String): Self = StObject.set(x, "SelectStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectStatementOneRecord(value: String): Self = StObject.set(x, "SelectStatementOneRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticAliases(value: ISemanticAliases): Self = StObject.set(x, "SemanticAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslatable(value: Boolean): Self = StObject.set(x, "Translatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStatement(value: String): Self = StObject.set(x, "UpdateStatement", value.asInstanceOf[js.Any])
  }
}
