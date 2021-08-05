package typings.nodeSql2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDefinition[Name /* <: String */, Type]
  extends StObject
     with Named[Name] {
  
  var dataType: String
  
  var defaultValue: js.UndefOr[Type] = js.undefined
  
  var jsType: js.UndefOr[Type] = js.undefined
  
  var notNull: js.UndefOr[Boolean] = js.undefined
  
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  
  var references: js.UndefOr[typings.nodeSql2.anon.Column] = js.undefined
  
  var unique: js.UndefOr[Boolean] = js.undefined
}
object ColumnDefinition {
  
  inline def apply[Name /* <: String */, Type](dataType: String): ColumnDefinition[Name, Type] = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition[Name, Type]]
  }
  
  extension [Self <: ColumnDefinition[?, ?], Name /* <: String */, Type](x: Self & (ColumnDefinition[Name, Type])) {
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Type): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setJsType(value: Type): Self = StObject.set(x, "jsType", value.asInstanceOf[js.Any])
    
    inline def setJsTypeUndefined: Self = StObject.set(x, "jsType", js.undefined)
    
    inline def setNotNull(value: Boolean): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
    
    inline def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
    
    inline def setPrimaryKey(value: Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    inline def setReferences(value: typings.nodeSql2.anon.Column): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
