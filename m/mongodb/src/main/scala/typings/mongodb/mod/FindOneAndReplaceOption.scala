package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOneAndReplaceOption[T]
  extends StObject
     with CommonOptions {
  
  var collation: js.UndefOr[CollationDocument] = js.undefined
  
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  var projection: js.UndefOr[SchemaMember[T, ProjectionOperators | scala.Double | Boolean | js.Any]] = js.undefined
  
  var returnOriginal: js.UndefOr[Boolean] = js.undefined
  
  var sort: js.UndefOr[SortOptionObject[T]] = js.undefined
  
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object FindOneAndReplaceOption {
  
  inline def apply[T](): FindOneAndReplaceOption[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndReplaceOption[T]]
  }
  
  extension [Self <: FindOneAndReplaceOption[?], T](x: Self & FindOneAndReplaceOption[T]) {
    
    inline def setCollation(value: CollationDocument): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    inline def setProjection(value: SchemaMember[T, ProjectionOperators | scala.Double | Boolean | js.Any]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setReturnOriginal(value: Boolean): Self = StObject.set(x, "returnOriginal", value.asInstanceOf[js.Any])
    
    inline def setReturnOriginalUndefined: Self = StObject.set(x, "returnOriginal", js.undefined)
    
    inline def setSort(value: SortOptionObject[T]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
