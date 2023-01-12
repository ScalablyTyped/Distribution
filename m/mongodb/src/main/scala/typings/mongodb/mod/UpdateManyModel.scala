package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateManyModel[TSchema /* <: Document */] extends StObject {
  
  /** A set of filters specifying to which array elements an update should apply. */
  var arrayFilters: js.UndefOr[js.Array[Document]] = js.undefined
  
  /** Specifies a collation. */
  var collation: js.UndefOr[CollationOptions] = js.undefined
  
  /** The filter to limit the updated documents. */
  var filter: Filter[TSchema]
  
  /** The index to use. If specified, then the query system will only consider plans using the hinted index. */
  var hint: js.UndefOr[Hint] = js.undefined
  
  /** A document or pipeline containing update operators. */
  var update: UpdateFilter[TSchema] | js.Array[UpdateFilter[TSchema]]
  
  /** When true, creates a new document if no document matches the query. */
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object UpdateManyModel {
  
  inline def apply[TSchema /* <: Document */](filter: Filter[TSchema], update: UpdateFilter[TSchema] | js.Array[UpdateFilter[TSchema]]): UpdateManyModel[TSchema] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateManyModel[TSchema]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateManyModel[?], TSchema /* <: Document */] (val x: Self & UpdateManyModel[TSchema]) extends AnyVal {
    
    inline def setArrayFilters(value: js.Array[Document]): Self = StObject.set(x, "arrayFilters", value.asInstanceOf[js.Any])
    
    inline def setArrayFiltersUndefined: Self = StObject.set(x, "arrayFilters", js.undefined)
    
    inline def setArrayFiltersVarargs(value: Document*): Self = StObject.set(x, "arrayFilters", js.Array(value*))
    
    inline def setCollation(value: CollationOptions): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setFilter(value: Filter[TSchema]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setHint(value: Hint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setUpdate(value: UpdateFilter[TSchema] | js.Array[UpdateFilter[TSchema]]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateVarargs(value: UpdateFilter[TSchema]*): Self = StObject.set(x, "update", js.Array(value*))
    
    inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
