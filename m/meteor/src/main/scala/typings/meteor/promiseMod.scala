package typings.meteor

import typings.std.Iterable
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/promise", JSImport.Namespace)
@js.native
object promiseMod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Promise<T> * / any */ @js.native
  class Promise[T] () extends js.Object {
    
    def await(): T = js.native
  }
  /* static members */
  @js.native
  object Promise extends js.Object {
    
    def async[Fn /* <: js.ThisFunction1[/* this */ This, /* args */ Args, _] */, This, Args /* <: js.Array[_] */](fn: Fn): js.ThisFunction1[/* this */ This, /* args */ Args, Promise[ReturnType[Fn]]] = js.native
    def async[Fn /* <: js.ThisFunction1[/* this */ This, /* args */ Args, _] */, This, Args /* <: js.Array[_] */](fn: Fn, allowReuseOfCurrentFiber: Boolean): js.ThisFunction1[/* this */ This, /* args */ Args, Promise[ReturnType[Fn]]] = js.native
    
    def asyncApply[Fn /* <: js.ThisFunction1[/* this */ This, /* args */ Args, _] */, This, Args /* <: js.Array[_] */](fn: Fn, context: This, args: Args): Promise[ReturnType[Fn]] = js.native
    def asyncApply[Fn /* <: js.ThisFunction1[/* this */ This, /* args */ Args, _] */, This, Args /* <: js.Array[_] */](fn: Fn, context: This, args: Args, allowReuseOfCurrentFiber: Boolean): Promise[ReturnType[Fn]] = js.native
    
    def await[T](value: js.Thenable[T]): T = js.native
    
    def awaitAll[T](values: Iterable[T | js.Thenable[T]]): js.Array[T] = js.native
  }
}
