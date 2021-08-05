package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupColumn extends StObject {
  
  // Indicates whether multiple values can be selected from the source.
  var allowMultipleValues: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether values in the column should be able to exceed the standard limit of 255 characters.
  var allowUnlimitedLength: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The name of the lookup source column.
  var columnName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier of the lookup source list.
  var listId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * If specified, this column is a secondary lookup, pulling an additional field from the list item looked up by the
    * primary lookup. Use the list item looked up by the primary as the source for the column named here.
    */
  var primaryLookupColumnId: js.UndefOr[NullableOption[String]] = js.undefined
}
object LookupColumn {
  
  inline def apply(): LookupColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupColumn]
  }
  
  extension [Self <: LookupColumn](x: Self) {
    
    inline def setAllowMultipleValues(value: NullableOption[Boolean]): Self = StObject.set(x, "allowMultipleValues", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleValuesNull: Self = StObject.set(x, "allowMultipleValues", null)
    
    inline def setAllowMultipleValuesUndefined: Self = StObject.set(x, "allowMultipleValues", js.undefined)
    
    inline def setAllowUnlimitedLength(value: NullableOption[Boolean]): Self = StObject.set(x, "allowUnlimitedLength", value.asInstanceOf[js.Any])
    
    inline def setAllowUnlimitedLengthNull: Self = StObject.set(x, "allowUnlimitedLength", null)
    
    inline def setAllowUnlimitedLengthUndefined: Self = StObject.set(x, "allowUnlimitedLength", js.undefined)
    
    inline def setColumnName(value: NullableOption[String]): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    inline def setColumnNameNull: Self = StObject.set(x, "columnName", null)
    
    inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
    
    inline def setListId(value: NullableOption[String]): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    inline def setListIdNull: Self = StObject.set(x, "listId", null)
    
    inline def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    inline def setPrimaryLookupColumnId(value: NullableOption[String]): Self = StObject.set(x, "primaryLookupColumnId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryLookupColumnIdNull: Self = StObject.set(x, "primaryLookupColumnId", null)
    
    inline def setPrimaryLookupColumnIdUndefined: Self = StObject.set(x, "primaryLookupColumnId", js.undefined)
  }
}
