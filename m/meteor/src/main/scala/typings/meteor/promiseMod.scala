package typings.meteor

import typings.std.Iterable
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Promise<T> * / any */ @JSImport("meteor/promise", "Promise")
  @js.native
  class Promise[T] () extends StObject {
    
    def await(): T = js.native
  }
  /* static members */
  object Promise {
    
    @JSImport("meteor/promise", "Promise.async")
    @js.native
    def async[Fn /* <: js.ThisFunction1[/* this */ This, /* args */ Args, _] */, This, Args /* <: js.Array[_] */](fn: Fn): js.ThisFunction1[/* this */ This, /* args */ Args, Promise[ReturnType[Fn]]] = js.native
    @JSImport("meteor/promise", "Promise.async")
    @js.native
    def async[Fn /* <: js.ThisFunction1[/* this */ This, /* args */ Args, _] */, This, Args /* <: js.Array[_] */](fn: Fn, allowReuseOfCurrentFiber: Boolean): js.ThisFunction1[/* this */ This, /* args */ Args, Promise[ReturnType[Fn]]] = js.native
    
    @JSImport("meteor/promise", "Promise.asyncApply")
    @js.native
    def asyncApply[Fn /* <: js.ThisFunction1[/* this */ This, /* args */ Args, _] */, This, Args /* <: js.Array[_] */](fn: Fn, context: This, args: Args): Promise[ReturnType[Fn]] = js.native
    @JSImport("meteor/promise", "Promise.asyncApply")
    @js.native
    def asyncApply[Fn /* <: js.ThisFunction1[/* this */ This, /* args */ Args, _] */, This, Args /* <: js.Array[_] */](fn: Fn, context: This, args: Args, allowReuseOfCurrentFiber: Boolean): Promise[ReturnType[Fn]] = js.native
    
    @JSImport("meteor/promise", "Promise.await")
    @js.native
    def await[T](value: js.Thenable[T]): T = js.native
    
    @JSImport("meteor/promise", "Promise.awaitAll")
    @js.native
    def awaitAll[T](values: Iterable[T | js.Thenable[T]]): js.Array[T] = js.native
  }
}
