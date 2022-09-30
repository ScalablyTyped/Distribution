package typings.nrwlDevkit

import typings.std.AsyncGenerator
import typings.std.AsyncIterableIterator
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rxjsForAwaitMod {
  
  @JSImport("@nrwl/devkit/src/utils/rxjs-for-await", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nrwl/devkit/src/utils/rxjs-for-await", "Deferred")
  @js.native
  open class Deferred[T] () extends StObject {
    
    var promise: js.Promise[T] = js.native
    
    def reject(): Unit = js.native
    def reject(reason: Any): Unit = js.native
    
    def resolve(value: T): Unit = js.native
    def resolve(value: PromiseLike[T]): Unit = js.native
  }
  
  inline def bufferedValuesFrom[T](
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
  ): AsyncGenerator[js.Array[T], Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferedValuesFrom")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[js.Array[T], Any, Any]]
  
  inline def eachValueFrom[T](
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
  ): AsyncIterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachValueFrom")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterableIterator[T]]
  
  inline def latestValueFrom[T](
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
  ): AsyncGenerator[T, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("latestValueFrom")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[T, Any, Any]]
  
  inline def nextValueFrom[T](
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
  ): AsyncGenerator[T, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextValueFrom")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
}
