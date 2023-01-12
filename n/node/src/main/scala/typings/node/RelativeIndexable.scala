package typings.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion borrowed
//#region ArrayLike.at()
trait RelativeIndexable[T] extends StObject {
  
  /**
    * Takes an integer value and returns the item at that index,
    * allowing for positive and negative integers.
    * Negative integers count back from the last item in the array.
    */
  def at(index: Double): js.UndefOr[T]
}
object RelativeIndexable {
  
  inline def apply[T](at: Double => js.UndefOr[T]): RelativeIndexable[T] = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at))
    __obj.asInstanceOf[RelativeIndexable[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelativeIndexable[?], T] (val x: Self & RelativeIndexable[T]) extends AnyVal {
    
    inline def setAt(value: Double => js.UndefOr[T]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
  }
}
