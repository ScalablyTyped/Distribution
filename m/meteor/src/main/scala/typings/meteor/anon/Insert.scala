package typings.meteor.anon

import typings.meteor.Mongo.DispatchTransform
import typings.meteor.Mongo.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Insert[Fn /* <: Transform[T] */, T, U] extends StObject {
  
  var fetch: js.UndefOr[js.Array[String]] = js.undefined
  
  var insert: js.UndefOr[
    js.Function2[/* userId */ String, /* doc */ DispatchTransform[Fn, T, U], Boolean]
  ] = js.undefined
  
  var remove: js.UndefOr[
    js.Function2[/* userId */ String, /* doc */ DispatchTransform[Fn, T, U], Boolean]
  ] = js.undefined
  
  var transform: js.UndefOr[Fn] = js.undefined
  
  var update: js.UndefOr[
    js.Function4[
      /* userId */ String, 
      /* doc */ DispatchTransform[Fn, T, U], 
      /* fieldNames */ js.Array[String], 
      /* modifier */ js.Any, 
      Boolean
    ]
  ] = js.undefined
}
object Insert {
  
  @scala.inline
  def apply[Fn /* <: Transform[T] */, T, U](): Insert[Fn, T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Insert[Fn, T, U]]
  }
  
  @scala.inline
  implicit class InsertMutableBuilder[Self <: Insert[?, ?, ?], Fn /* <: Transform[T] */, T, U] (val x: Self & (Insert[Fn, T, U])) extends AnyVal {
    
    @scala.inline
    def setFetch(value: js.Array[String]): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    
    @scala.inline
    def setFetchVarargs(value: String*): Self = StObject.set(x, "fetch", js.Array(value :_*))
    
    @scala.inline
    def setInsert(value: (/* userId */ String, /* doc */ DispatchTransform[Fn, T, U]) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    @scala.inline
    def setRemove(value: (/* userId */ String, /* doc */ DispatchTransform[Fn, T, U]) => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setTransform(value: Fn): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setUpdate(
      value: (/* userId */ String, /* doc */ DispatchTransform[Fn, T, U], /* fieldNames */ js.Array[String], /* modifier */ js.Any) => Boolean
    ): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
