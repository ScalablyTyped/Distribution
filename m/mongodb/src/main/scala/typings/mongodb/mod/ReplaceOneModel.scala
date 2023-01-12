package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceOneModel[TSchema /* <: Document */] extends StObject {
  
  /** Specifies a collation. */
  var collation: js.UndefOr[CollationOptions] = js.undefined
  
  /** The filter to limit the replaced document. */
  var filter: Filter[TSchema]
  
  /** The index to use. If specified, then the query system will only consider plans using the hinted index. */
  var hint: js.UndefOr[Hint] = js.undefined
  
  /** The document with which to replace the matched document. */
  var replacement: WithoutId[TSchema]
  
  /** When true, creates a new document if no document matches the query. */
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object ReplaceOneModel {
  
  inline def apply[TSchema /* <: Document */](filter: Filter[TSchema], replacement: WithoutId[TSchema]): ReplaceOneModel[TSchema] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceOneModel[TSchema]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplaceOneModel[?], TSchema /* <: Document */] (val x: Self & ReplaceOneModel[TSchema]) extends AnyVal {
    
    inline def setCollation(value: CollationOptions): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setFilter(value: Filter[TSchema]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setHint(value: Hint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setReplacement(value: WithoutId[TSchema]): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
