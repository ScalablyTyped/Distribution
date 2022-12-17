package typings.obliterator

import org.scalablytyped.runtime.StringDictionary
import typings.obliterator.typesMod.Sequence
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foreachWithNullKeysMod {
  
  @JSImport("obliterator/foreach-with-null-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](iterable: js.Iterable[T], callback: js.Function2[/* item */ T, /* key */ Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](iterable: js.Iterator[T], callback: js.Function2[/* item */ T, /* key */ Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](iterable: Sequence[T], callback: js.Function2[/* item */ T, /* key */ Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[V](iterable: Set[V], callback: js.Function2[/* value */ V, /* key */ Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
    
    extension [Self <: ForEachTrait[?, ?], K, V](x: Self & (ForEachTrait[K, V])) {
      
      inline def setForEach(value: js.Function3[/* value */ V, /* key */ K, ForEachTrait[K, V], Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    }
  }
  
  type PlainObject[T] = StringDictionary[T]
}
