package typings.posterus

import typings.posterus.anon.FnCall
import typings.posterus.anon.FnCallOnrejected
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("posterus", "Future")
  @js.native
  class Future[T, E /* <: Error */] () extends StObject {
    
    def `catch`[TResult](): js.Promise[T | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[T | TResult] = js.native
    @JSName("catch")
    var catch_Original: FnCallOnrejected[T] = js.native
    
    def deinit(): Unit = js.native
    
    def deref(): js.UndefOr[T] = js.native
    
    def `finally`(mapper: js.Function2[/* error */ js.UndefOr[E], /* result */ js.UndefOr[T], _]): Future[T, E] = js.native
    
    def finishPending(): Unit = js.native
    
    def map[U, V /* <: Error */](
      mapper: js.Function2[
          /* error */ js.UndefOr[E], 
          /* result */ js.UndefOr[T], 
          U | js.Promise[U] | (Future[U, V])
        ]
    ): Future[U, V] = js.native
    
    def mapError[U, V /* <: Error */](mapper: js.Function1[/* error */ E, U | js.Promise[U] | (Future[U, V])]): Future[U, V] = js.native
    
    def mapResult[U, V /* <: Error */](mapper: js.Function1[/* result */ T, U | js.Promise[U] | (Future[U, V])]): Future[U, V] = js.native
    
    def settle(): Unit = js.native
    def settle(error: E): Unit = js.native
    def settle(error: E, result: T): Unit = js.native
    def settle(error: js.UndefOr[scala.Nothing], result: T): Unit = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    @JSName("then")
    var then_Original: FnCall[T] = js.native
    
    def toPromise(): js.Promise[T] = js.native
    
    def weak(): Future[T, E] = js.native
  }
  /* static members */
  object Future {
    
    @JSImport("posterus", "Future")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("posterus", "Future.all")
    @js.native
    def all(values: js.Array[_]): Future[_, Error] = js.native
    
    @JSImport("posterus", "Future.from")
    @js.native
    def from[T, E /* <: Error */](): Future[T, E] = js.native
    @JSImport("posterus", "Future.from")
    @js.native
    def from[T, E /* <: Error */](result: T): Future[T, E] = js.native
    @JSImport("posterus", "Future.from")
    @js.native
    def from[T, E /* <: Error */](result: T, error: E): Future[T, E] = js.native
    @JSImport("posterus", "Future.from")
    @js.native
    def from[T, E /* <: Error */](result: js.UndefOr[scala.Nothing], error: E): Future[T, E] = js.native
    
    @JSImport("posterus", "Future.fromError")
    @js.native
    def fromError[E /* <: Error */](error: E): Future[js.UndefOr[scala.Nothing], E] = js.native
    
    @JSImport("posterus", "Future.fromPromise")
    @js.native
    def fromPromise[T](promise: js.Promise[T]): Future[T, Error] = js.native
    
    @JSImport("posterus", "Future.fromResult")
    @js.native
    def fromResult[T](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T extends undefined ? [] | [undefined] : [T] is not an array type */ args: js.Array[js.UndefOr[js.Any | T]]
    ): Future[T, Error] = js.native
    
    @JSImport("posterus", "Future.onUnhandledRejection")
    @js.native
    def onUnhandledRejection(future: Future[_, Error]): Unit = js.native
    
    @JSImport("posterus", "Future.race")
    @js.native
    def race(values: js.Array[_]): Future[_, Error] = js.native
    
    @JSImport("posterus", "Future.scheduler")
    @js.native
    def scheduler: Scheduler = js.native
    @scala.inline
    def scheduler_=(x: Scheduler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("posterus", "Scheduler")
  @js.native
  class Scheduler () extends StObject {
    
    def asap(callback: js.Function0[Unit]): Unit = js.native
    
    def deinit(): Unit = js.native
    
    def tick(): Unit = js.native
  }
  
  @JSImport("posterus", "isDeinitError")
  @js.native
  def isDeinitError(error: js.Any): Boolean = js.native
  
  @JSImport("posterus", "isFuture")
  @js.native
  def isFuture(value: js.Any): Boolean = js.native
}
