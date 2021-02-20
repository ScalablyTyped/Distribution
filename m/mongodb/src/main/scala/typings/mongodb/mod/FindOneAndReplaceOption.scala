package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindOneAndReplaceOption[T] extends CommonOptions {
  
  var collation: js.UndefOr[CollationDocument] = js.native
  
  var maxTimeMS: js.UndefOr[scala.Double] = js.native
  
  var projection: js.UndefOr[SchemaMember[T, ProjectionOperators | scala.Double | Boolean | _]] = js.native
  
  var returnOriginal: js.UndefOr[Boolean] = js.native
  
  var sort: js.UndefOr[SortOptionObject[T]] = js.native
  
  var upsert: js.UndefOr[Boolean] = js.native
}
object FindOneAndReplaceOption {
  
  @scala.inline
  def apply[T](): FindOneAndReplaceOption[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndReplaceOption[T]]
  }
  
  @scala.inline
  implicit class FindOneAndReplaceOptionMutableBuilder[Self <: FindOneAndReplaceOption[_], T] (val x: Self with FindOneAndReplaceOption[T]) extends AnyVal {
    
    @scala.inline
    def setCollation(value: CollationDocument): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    @scala.inline
    def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    @scala.inline
    def setProjection(value: SchemaMember[T, ProjectionOperators | scala.Double | Boolean | _]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setReturnOriginal(value: Boolean): Self = StObject.set(x, "returnOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnOriginalUndefined: Self = StObject.set(x, "returnOriginal", js.undefined)
    
    @scala.inline
    def setSort(value: SortOptionObject[T]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
