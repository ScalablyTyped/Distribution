package typings.obliterator

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    K extends keyof any ? std.Record<K, V> | obliterator.obliterator/types.Mapping<K, V> : obliterator.obliterator/types.Mapping<K, V>
    }}}
    */
  type AnyMapping[K, V] = (Record[K, V]) | (Mapping[K, V])
  
  type IntoEntriesIterator[K, V] = IntoInterator[js.Tuple2[K, V]]
  
  type IntoInterator[T] = js.Iterable[T] | js.Iterator[T] | Sequence[T]
  
  trait Mapping[K, V] extends StObject {
    
    def forEach(callback: js.Function2[/* value */ V, /* key */ K, Unit]): Unit
    
    def get(key: K): js.UndefOr[V]
    
    def has(key: K): Boolean
  }
  object Mapping {
    
    inline def apply[K, V](
      forEach: js.Function2[/* value */ V, /* key */ K, Unit] => Unit,
      get: K => js.UndefOr[V],
      has: K => Boolean
    ): Mapping[K, V] = {
      val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[Mapping[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mapping[?, ?], K, V] (val x: Self & (Mapping[K, V])) extends AnyVal {
      
      inline def setForEach(value: js.Function2[/* value */ V, /* key */ K, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setGet(value: K => js.UndefOr[V]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: K => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Sequence[T]
    extends StObject
       with /* index */ NumberDictionary[T] {
    
    var length: Double = js.native
    
    def slice(from: Double): Sequence[T] = js.native
    def slice(from: Double, to: Double): Sequence[T] = js.native
  }
}
