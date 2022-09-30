package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.CaseSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootFilterOperators[TSchema]
  extends StObject
     with Document {
  
  @JSName("$and")
  var $and: js.UndefOr[js.Array[Filter[TSchema]]] = js.undefined
  
  @JSName("$comment")
  var $comment: js.UndefOr[String | Document] = js.undefined
  
  @JSName("$nor")
  var $nor: js.UndefOr[js.Array[Filter[TSchema]]] = js.undefined
  
  @JSName("$or")
  var $or: js.UndefOr[js.Array[Filter[TSchema]]] = js.undefined
  
  @JSName("$text")
  var $text: js.UndefOr[CaseSensitive] = js.undefined
  
  @JSName("$where")
  var $where: js.UndefOr[String | (js.ThisFunction0[/* this */ TSchema, Boolean])] = js.undefined
}
object RootFilterOperators {
  
  inline def apply[TSchema](): RootFilterOperators[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootFilterOperators[TSchema]]
  }
  
  extension [Self <: RootFilterOperators[?], TSchema](x: Self & RootFilterOperators[TSchema]) {
    
    inline def set$and(value: js.Array[Filter[TSchema]]): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
    
    inline def set$andUndefined: Self = StObject.set(x, "$and", js.undefined)
    
    inline def set$andVarargs(value: Filter[TSchema]*): Self = StObject.set(x, "$and", js.Array(value*))
    
    inline def set$comment(value: String | Document): Self = StObject.set(x, "$comment", value.asInstanceOf[js.Any])
    
    inline def set$commentUndefined: Self = StObject.set(x, "$comment", js.undefined)
    
    inline def set$nor(value: js.Array[Filter[TSchema]]): Self = StObject.set(x, "$nor", value.asInstanceOf[js.Any])
    
    inline def set$norUndefined: Self = StObject.set(x, "$nor", js.undefined)
    
    inline def set$norVarargs(value: Filter[TSchema]*): Self = StObject.set(x, "$nor", js.Array(value*))
    
    inline def set$or(value: js.Array[Filter[TSchema]]): Self = StObject.set(x, "$or", value.asInstanceOf[js.Any])
    
    inline def set$orUndefined: Self = StObject.set(x, "$or", js.undefined)
    
    inline def set$orVarargs(value: Filter[TSchema]*): Self = StObject.set(x, "$or", js.Array(value*))
    
    inline def set$text(value: CaseSensitive): Self = StObject.set(x, "$text", value.asInstanceOf[js.Any])
    
    inline def set$textUndefined: Self = StObject.set(x, "$text", js.undefined)
    
    inline def set$where(value: String | (js.ThisFunction0[/* this */ TSchema, Boolean])): Self = StObject.set(x, "$where", value.asInstanceOf[js.Any])
    
    inline def set$whereUndefined: Self = StObject.set(x, "$where", js.undefined)
  }
}
