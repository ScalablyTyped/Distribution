package typings.ow

import typings.ow.owBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasItemsMod {
  
  @JSImport("ow/dist/source/utils/has-items", JSImport.Default)
  @js.native
  def default[T](source: CollectionLike[T], items: js.Array[T]): `true` | js.Array[T] = js.native
  @JSImport("ow/dist/source/utils/has-items", JSImport.Default)
  @js.native
  def default[T](source: CollectionLike[T], items: js.Array[T], maxValues: Double): `true` | js.Array[T] = js.native
  
  @js.native
  trait CollectionLike[T] extends StObject {
    
    def has(item: T): Boolean = js.native
  }
  object CollectionLike {
    
    @scala.inline
    def apply[T](has: T => Boolean): CollectionLike[T] = {
      val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[CollectionLike[T]]
    }
    
    @scala.inline
    implicit class CollectionLikeMutableBuilder[Self <: CollectionLike[_], T] (val x: Self with CollectionLike[T]) extends AnyVal {
      
      @scala.inline
      def setHas(value: T => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
}
