package typings.obliterator

import org.scalablytyped.runtime.StringDictionary
import typings.obliterator.typesMod.Sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foreachMod {
  
  @JSImport("obliterator/foreach", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](iterable: js.Iterable[T], callback: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](iterable: js.Iterator[T], callback: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](iterable: Sequence[T], callback: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](`object`: PlainObject[T], callback: js.Function2[/* value */ T, /* key */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[K, V](iterable: ForEachTrait[K, V], callback: js.Function2[/* value */ V, /* key */ K, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ForEachTrait[K, V] extends StObject {
    
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* self */ this.type, Unit]): Unit
  }
  object ForEachTrait {
    
    inline def apply[K, V](forEach: js.Function3[/* value */ V, /* key */ K, ForEachTrait[K, V], Unit] => Unit): ForEachTrait[K, V] = {
      val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
      __obj.asInstanceOf[ForEachTrait[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ForEachTrait[?, ?], K, V] (val x: Self & (ForEachTrait[K, V])) extends AnyVal {
      
      inline def setForEach(value: js.Function3[/* value */ V, /* key */ K, ForEachTrait[K, V], Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    }
  }
  
  type PlainObject[T] = StringDictionary[T]
}
