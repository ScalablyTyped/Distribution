package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.CaseSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootQuerySelector[T]
  extends StObject
     with // we could not find a proper TypeScript generic to support nested queries e.g. 'user.friends.name'
// this will mark all unrecognized properties as any (including nested queries)
/* key */ StringDictionary[js.Any] {
  
  /** https://docs.mongodb.com/manual/reference/operator/query/and/#op._S_and */
  @JSName("$and")
  var $and: js.UndefOr[js.Array[FilterQuery[T]]] = js.undefined
  
  /** https://docs.mongodb.com/manual/reference/operator/query/comment/#op._S_comment */
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.undefined
  
  /** https://docs.mongodb.com/manual/reference/operator/query/nor/#op._S_nor */
  @JSName("$nor")
  var $nor: js.UndefOr[js.Array[FilterQuery[T]]] = js.undefined
  
  /** https://docs.mongodb.com/manual/reference/operator/query/or/#op._S_or */
  @JSName("$or")
  var $or: js.UndefOr[js.Array[FilterQuery[T]]] = js.undefined
  
  /** https://docs.mongodb.com/manual/reference/operator/query/text */
  @JSName("$text")
  var $text: js.UndefOr[CaseSensitive] = js.undefined
  
  /** https://docs.mongodb.com/manual/reference/operator/query/where/#op._S_where */
  @JSName("$where")
  var $where: js.UndefOr[String | js.Function] = js.undefined
}
object RootQuerySelector {
  
  inline def apply[T](): RootQuerySelector[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootQuerySelector[T]]
  }
  
  extension [Self <: RootQuerySelector[?], T](x: Self & RootQuerySelector[T]) {
    
    inline def set$and(value: js.Array[FilterQuery[T]]): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
    
    inline def set$andUndefined: Self = StObject.set(x, "$and", js.undefined)
    
    inline def set$andVarargs(value: FilterQuery[T]*): Self = StObject.set(x, "$and", js.Array(value :_*))
    
    inline def set$comment(value: String): Self = StObject.set(x, "$comment", value.asInstanceOf[js.Any])
    
    inline def set$commentUndefined: Self = StObject.set(x, "$comment", js.undefined)
    
    inline def set$nor(value: js.Array[FilterQuery[T]]): Self = StObject.set(x, "$nor", value.asInstanceOf[js.Any])
    
    inline def set$norUndefined: Self = StObject.set(x, "$nor", js.undefined)
    
    inline def set$norVarargs(value: FilterQuery[T]*): Self = StObject.set(x, "$nor", js.Array(value :_*))
    
    inline def set$or(value: js.Array[FilterQuery[T]]): Self = StObject.set(x, "$or", value.asInstanceOf[js.Any])
    
    inline def set$orUndefined: Self = StObject.set(x, "$or", js.undefined)
    
    inline def set$orVarargs(value: FilterQuery[T]*): Self = StObject.set(x, "$or", js.Array(value :_*))
    
    inline def set$text(value: CaseSensitive): Self = StObject.set(x, "$text", value.asInstanceOf[js.Any])
    
    inline def set$textUndefined: Self = StObject.set(x, "$text", js.undefined)
    
    inline def set$where(value: String | js.Function): Self = StObject.set(x, "$where", value.asInstanceOf[js.Any])
    
    inline def set$whereUndefined: Self = StObject.set(x, "$where", js.undefined)
  }
}
