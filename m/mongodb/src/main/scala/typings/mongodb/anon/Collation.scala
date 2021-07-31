package typings.mongodb.anon

import typings.mongodb.mod.FilterQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collation[TSchema] extends StObject {
  
  var collation: js.UndefOr[js.Object] = js.undefined
  
  var filter: FilterQuery[TSchema]
  
  var hint: js.UndefOr[String | js.Object] = js.undefined
  
  var replacement: TSchema
  
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object Collation {
  
  @scala.inline
  def apply[TSchema](filter: FilterQuery[TSchema], replacement: TSchema): Collation[TSchema] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collation[TSchema]]
  }
  
  @scala.inline
  implicit class CollationMutableBuilder[Self <: Collation[?], TSchema] (val x: Self & Collation[TSchema]) extends AnyVal {
    
    @scala.inline
    def setCollation(value: js.Object): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    @scala.inline
    def setFilter(value: FilterQuery[TSchema]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHint(value: String | js.Object): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setReplacement(value: TSchema): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
