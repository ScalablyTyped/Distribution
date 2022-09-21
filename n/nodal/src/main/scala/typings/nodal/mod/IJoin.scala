package typings.nodal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IJoin extends StObject {
  
  var cachedModel: js.UndefOr[Model] = js.undefined
  
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  
  var columnsObject: js.UndefOr[js.Object] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var joinAlias: js.UndefOr[String] = js.undefined
  
  var joinColumn: js.UndefOr[String] = js.undefined
  
  var joinTable: String
  
  var key: js.UndefOr[String] = js.undefined
  
  var multiFilter: js.UndefOr[Any] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var orderBy: js.UndefOr[Any] = js.undefined
  
  var prevAlias: js.UndefOr[String] = js.undefined
  
  var prevColumn: js.UndefOr[String] = js.undefined
  
  var prevTable: String
}
object IJoin {
  
  inline def apply(joinTable: String, prevTable: String): IJoin = {
    val __obj = js.Dynamic.literal(joinTable = joinTable.asInstanceOf[js.Any], prevTable = prevTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJoin]
  }
  
  extension [Self <: IJoin](x: Self) {
    
    inline def setCachedModel(value: Model): Self = StObject.set(x, "cachedModel", value.asInstanceOf[js.Any])
    
    inline def setCachedModelUndefined: Self = StObject.set(x, "cachedModel", js.undefined)
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsObject(value: js.Object): Self = StObject.set(x, "columnsObject", value.asInstanceOf[js.Any])
    
    inline def setColumnsObjectUndefined: Self = StObject.set(x, "columnsObject", js.undefined)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setJoinAlias(value: String): Self = StObject.set(x, "joinAlias", value.asInstanceOf[js.Any])
    
    inline def setJoinAliasUndefined: Self = StObject.set(x, "joinAlias", js.undefined)
    
    inline def setJoinColumn(value: String): Self = StObject.set(x, "joinColumn", value.asInstanceOf[js.Any])
    
    inline def setJoinColumnUndefined: Self = StObject.set(x, "joinColumn", js.undefined)
    
    inline def setJoinTable(value: String): Self = StObject.set(x, "joinTable", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMultiFilter(value: Any): Self = StObject.set(x, "multiFilter", value.asInstanceOf[js.Any])
    
    inline def setMultiFilterUndefined: Self = StObject.set(x, "multiFilter", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrderBy(value: Any): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPrevAlias(value: String): Self = StObject.set(x, "prevAlias", value.asInstanceOf[js.Any])
    
    inline def setPrevAliasUndefined: Self = StObject.set(x, "prevAlias", js.undefined)
    
    inline def setPrevColumn(value: String): Self = StObject.set(x, "prevColumn", value.asInstanceOf[js.Any])
    
    inline def setPrevColumnUndefined: Self = StObject.set(x, "prevColumn", js.undefined)
    
    inline def setPrevTable(value: String): Self = StObject.set(x, "prevTable", value.asInstanceOf[js.Any])
  }
}
