package typings.nodeSql2.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ColumnDefinitionMutableBuilder[Self <: ColumnDefinition[_, _], Name /* <: String */, Type] (val x: Self with (ColumnDefinition[Name, Type])) extends AnyVal {
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: Type): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setJsType(value: Type): Self = StObject.set(x, "jsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsTypeUndefined: Self = StObject.set(x, "jsType", js.undefined)
    
    @scala.inline
    def setNotNull(value: Boolean): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    @scala.inline
    def setReferences(value: typings.nodeSql2.anon.Column): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
