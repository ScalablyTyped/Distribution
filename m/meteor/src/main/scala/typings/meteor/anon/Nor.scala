package typings.meteor.anon

import typings.meteor.Mongo.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nor[T] extends StObject {
  
  @JSName("$and")
  var $and: js.UndefOr[js.Array[Query[T]]] = js.undefined
  
  @JSName("$nor")
  var $nor: js.UndefOr[js.Array[Query[T]]] = js.undefined
  
  @JSName("$or")
  var $or: js.UndefOr[js.Array[Query[T]]] = js.undefined
}
object Nor {
  
  inline def apply[T](): Nor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nor[T]]
  }
  
  extension [Self <: Nor[?], T](x: Self & Nor[T]) {
    
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
