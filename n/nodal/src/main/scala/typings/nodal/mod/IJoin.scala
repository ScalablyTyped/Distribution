package typings.nodal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJoin extends StObject {
  
  var cachedModel: js.UndefOr[Model] = js.native
  
  var columns: js.UndefOr[js.Array[String]] = js.native
  
  var columnsObject: js.UndefOr[js.Object] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var joinAlias: js.UndefOr[String] = js.native
  
  var joinColumn: js.UndefOr[String] = js.native
  
  var joinTable: String = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var multiFilter: js.UndefOr[js.Any] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var orderBy: js.UndefOr[js.Any] = js.native
  
  var prevAlias: js.UndefOr[String] = js.native
  
  var prevColumn: js.UndefOr[String] = js.native
  
  var prevTable: String = js.native
}
object IJoin {
  
  @scala.inline
  def apply(joinTable: String, prevTable: String): IJoin = {
    val __obj = js.Dynamic.literal(joinTable = joinTable.asInstanceOf[js.Any], prevTable = prevTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJoin]
  }
  
  @scala.inline
  implicit class IJoinMutableBuilder[Self <: IJoin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachedModel(value: Model): Self = StObject.set(x, "cachedModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachedModelUndefined: Self = StObject.set(x, "cachedModel", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsObject(value: js.Object): Self = StObject.set(x, "columnsObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsObjectUndefined: Self = StObject.set(x, "columnsObject", js.undefined)
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setJoinAlias(value: String): Self = StObject.set(x, "joinAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinAliasUndefined: Self = StObject.set(x, "joinAlias", js.undefined)
    
    @scala.inline
    def setJoinColumn(value: String): Self = StObject.set(x, "joinColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinColumnUndefined: Self = StObject.set(x, "joinColumn", js.undefined)
    
    @scala.inline
    def setJoinTable(value: String): Self = StObject.set(x, "joinTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMultiFilter(value: js.Any): Self = StObject.set(x, "multiFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiFilterUndefined: Self = StObject.set(x, "multiFilter", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrderBy(value: js.Any): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPrevAlias(value: String): Self = StObject.set(x, "prevAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevAliasUndefined: Self = StObject.set(x, "prevAlias", js.undefined)
    
    @scala.inline
    def setPrevColumn(value: String): Self = StObject.set(x, "prevColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevColumnUndefined: Self = StObject.set(x, "prevColumn", js.undefined)
    
    @scala.inline
    def setPrevTable(value: String): Self = StObject.set(x, "prevTable", value.asInstanceOf[js.Any])
  }
}
