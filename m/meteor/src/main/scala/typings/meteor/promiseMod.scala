package typings.meteor

import typings.std.Iterable
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("meteor/promise", "Promise")
    @js.native
    val ^ : js.Any = js.native
    
    inline def async[Fn /* <: js.ThisFunction1[/* this */ This, /* args */ Args, js.Any] */, This, Args /* <: js.Array[js.Any] */](fn: Fn): js.ThisFunction1[/* this */ This, /* args */ Args, Promise[ReturnType[Fn]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(fn.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction1[/* this */ This, /* args */ Args, Promise[ReturnType[Fn]]]]
    inline def async[Fn /* <: js.ThisFunction1[/* this */ This, /* args */ Args, js.Any] */, This, Args /* <: js.Array[js.Any] */](fn: Fn, allowReuseOfCurrentFiber: Boolean): js.ThisFunction1[/* this */ This, /* args */ Args, Promise[ReturnType[Fn]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(fn.asInstanceOf[js.Any], allowReuseOfCurrentFiber.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[/* this */ This, /* args */ Args, Promise[ReturnType[Fn]]]]
    
    inline def asyncApply[Fn /* <: js.ThisFunction1[/* this */ This, /* args */ Args, js.Any] */, This, Args /* <: js.Array[js.Any] */](fn: Fn, context: This, args: Args): Promise[ReturnType[Fn]] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncApply")(fn.asInstanceOf[js.Any], context.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[ReturnType[Fn]]]
    inline def asyncApply[Fn /* <: js.ThisFunction1[/* this */ This, /* args */ Args, js.Any] */, This, Args /* <: js.Array[js.Any] */](fn: Fn, context: This, args: Args, allowReuseOfCurrentFiber: Boolean): Promise[ReturnType[Fn]] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncApply")(fn.asInstanceOf[js.Any], context.asInstanceOf[js.Any], args.asInstanceOf[js.Any], allowReuseOfCurrentFiber.asInstanceOf[js.Any])).asInstanceOf[Promise[ReturnType[Fn]]]
    
    inline def await[T](value: js.Thenable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("await")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def awaitAll[T](values: Iterable[T | js.Thenable[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("awaitAll")(values.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  }
}
