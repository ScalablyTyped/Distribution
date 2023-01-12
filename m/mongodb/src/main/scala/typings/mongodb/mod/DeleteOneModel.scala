package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOneModel[TSchema /* <: Document */] extends StObject {
  
  /** Specifies a collation. */
  var collation: js.UndefOr[CollationOptions] = js.undefined
  
  /** The filter to limit the deleted documents. */
  var filter: Filter[TSchema]
  
  /** The index to use. If specified, then the query system will only consider plans using the hinted index. */
  var hint: js.UndefOr[Hint] = js.undefined
}
object DeleteOneModel {
  
  inline def apply[TSchema /* <: Document */](filter: Filter[TSchema]): DeleteOneModel[TSchema] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOneModel[TSchema]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteOneModel[?], TSchema /* <: Document */] (val x: Self & DeleteOneModel[TSchema]) extends AnyVal {
    
    inline def setCollation(value: CollationOptions): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setFilter(value: Filter[TSchema]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setHint(value: Hint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
  }
}
