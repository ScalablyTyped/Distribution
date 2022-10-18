package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibWithPromiseCacheMod {
  
  @JSImport("next/dist/lib/with-promise-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withPromiseCache[K, V](cache: Cache[K, js.Promise[V]], fn: js.Function1[/* value */ K, js.Promise[V]]): js.Function1[/* value */ K, js.Promise[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withPromiseCache")(cache.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ K, js.Promise[V]]]
  inline def withPromiseCache[T /* <: js.Array[Any] */, K, V](
    cache: Cache[K, js.Promise[V]],
    fn: js.Function1[/* values */ T, js.Promise[V]],
    getKey: js.Function1[/* values */ T, K]
  ): js.Function1[/* values */ T, js.Promise[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withPromiseCache")(cache.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* values */ T, js.Promise[V]]]
  
  @js.native
  trait Cache[K, V] extends StObject {
    
    def del(key: K): Unit = js.native
    
    def get(key: K): js.UndefOr[V] = js.native
    
    def set(key: K, value: V): Boolean = js.native
    def set(key: K, value: V, maxAge: Double): Boolean = js.native
  }
}
