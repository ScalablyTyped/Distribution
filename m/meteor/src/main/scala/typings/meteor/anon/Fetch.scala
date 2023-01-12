package typings.meteor.anon

import typings.bson.mod.Document
import typings.meteor.mongoMod.Mongo.DispatchTransform
import typings.meteor.mongoMod.Mongo.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fetch[Fn /* <: Transform[T] */, T /* <: Document */, U] extends StObject {
  
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
      /* modifier */ Any, 
      Boolean
    ]
  ] = js.undefined
}
object Fetch {
  
  inline def apply[Fn /* <: Transform[T] */, T /* <: Document */, U](): Fetch[Fn, T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fetch[Fn, T, U]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fetch[?, ?, ?], Fn /* <: Transform[T] */, T /* <: Document */, U] (val x: Self & (Fetch[Fn, T, U])) extends AnyVal {
    
    inline def setFetch(value: js.Array[String]): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
    
    inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    
    inline def setFetchVarargs(value: String*): Self = StObject.set(x, "fetch", js.Array(value*))
    
    inline def setInsert(value: (/* userId */ String, /* doc */ DispatchTransform[Fn, T, U]) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setRemove(value: (/* userId */ String, /* doc */ DispatchTransform[Fn, T, U]) => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setTransform(value: Fn): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setUpdate(
      value: (/* userId */ String, /* doc */ DispatchTransform[Fn, T, U], /* fieldNames */ js.Array[String], /* modifier */ Any) => Boolean
    ): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
