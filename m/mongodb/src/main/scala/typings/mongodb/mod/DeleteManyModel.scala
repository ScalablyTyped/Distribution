package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteManyModel[TSchema /* <: Document */] extends StObject {
  
  /** Specifies a collation. */
  var collation: js.UndefOr[CollationOptions] = js.undefined
  
  /** The filter to limit the deleted documents. */
  var filter: Filter[TSchema]
  
  /** The index to use. If specified, then the query system will only consider plans using the hinted index. */
  var hint: js.UndefOr[Hint] = js.undefined
}
object DeleteManyModel {
  
  inline def apply[TSchema /* <: Document */](filter: Filter[TSchema]): DeleteManyModel[TSchema] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteManyModel[TSchema]]
  }
  
  extension [Self <: DeleteManyModel[?], TSchema /* <: Document */](x: Self & DeleteManyModel[TSchema]) {
    
    inline def setCollation(value: CollationOptions): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setFilter(value: Filter[TSchema]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setHint(value: Hint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
  }
}
