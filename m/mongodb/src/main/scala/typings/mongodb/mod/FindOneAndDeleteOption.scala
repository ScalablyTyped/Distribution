package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOneAndDeleteOption[T] extends StObject {
  
  var collation: js.UndefOr[CollationDocument] = js.undefined
  
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  var projection: js.UndefOr[SchemaMember[T, ProjectionOperators | scala.Double | Boolean | js.Any]] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
  
  var sort: js.UndefOr[SortOptionObject[T]] = js.undefined
}
object FindOneAndDeleteOption {
  
  @scala.inline
  def apply[T](): FindOneAndDeleteOption[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndDeleteOption[T]]
  }
  
  @scala.inline
  implicit class FindOneAndDeleteOptionMutableBuilder[Self <: FindOneAndDeleteOption[?], T] (val x: Self & FindOneAndDeleteOption[T]) extends AnyVal {
    
    @scala.inline
    def setCollation(value: CollationDocument): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    @scala.inline
    def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    @scala.inline
    def setProjection(value: SchemaMember[T, ProjectionOperators | scala.Double | Boolean | js.Any]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setSort(value: SortOptionObject[T]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
