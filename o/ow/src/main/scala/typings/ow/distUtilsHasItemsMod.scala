package typings.ow

import typings.ow.owBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsHasItemsMod {
  
  @JSImport("ow/dist/utils/has-items", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Retrieve the missing values in a collection based on an array of items.
  @hidden
  @param source - Source collection to search through.
  @param items - Items to search for.
  @param maxValues - Maximum number of values after the search process is stopped. Default: 5.
  */
  inline def default[T](source: CollectionLike[T], items: js.Array[T]): `true` | js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[`true` | js.Array[T]]
  inline def default[T](source: CollectionLike[T], items: js.Array[T], maxValues: Double): `true` | js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], items.asInstanceOf[js.Any], maxValues.asInstanceOf[js.Any])).asInstanceOf[`true` | js.Array[T]]
  
  trait CollectionLike[T] extends StObject {
    
    def has(item: T): Boolean
  }
  object CollectionLike {
    
    inline def apply[T](has: T => Boolean): CollectionLike[T] = {
      val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[CollectionLike[T]]
    }
    
    extension [Self <: CollectionLike[?], T](x: Self & CollectionLike[T]) {
      
      inline def setHas(value: T => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
}
