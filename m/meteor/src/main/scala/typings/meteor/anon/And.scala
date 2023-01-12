package typings.meteor.anon

import typings.meteor.mongoMod.Mongo.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait And[T] extends StObject {
  
  @JSName("$and")
  var $and: js.UndefOr[js.Array[Query[T]]] = js.undefined
  
  @JSName("$nor")
  var $nor: js.UndefOr[js.Array[Query[T]]] = js.undefined
  
  @JSName("$or")
  var $or: js.UndefOr[js.Array[Query[T]]] = js.undefined
}
object And {
  
  inline def apply[T](): And[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[And[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: And[?], T] (val x: Self & And[T]) extends AnyVal {
    
    inline def set$and(value: js.Array[Query[T]]): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
    
    inline def set$andUndefined: Self = StObject.set(x, "$and", js.undefined)
    
    inline def set$andVarargs(value: Query[T]*): Self = StObject.set(x, "$and", js.Array(value*))
    
    inline def set$nor(value: js.Array[Query[T]]): Self = StObject.set(x, "$nor", value.asInstanceOf[js.Any])
    
    inline def set$norUndefined: Self = StObject.set(x, "$nor", js.undefined)
    
    inline def set$norVarargs(value: Query[T]*): Self = StObject.set(x, "$nor", js.Array(value*))
    
    inline def set$or(value: js.Array[Query[T]]): Self = StObject.set(x, "$or", value.asInstanceOf[js.Any])
    
    inline def set$orUndefined: Self = StObject.set(x, "$or", js.undefined)
    
    inline def set$orVarargs(value: Query[T]*): Self = StObject.set(x, "$or", js.Array(value*))
  }
}
