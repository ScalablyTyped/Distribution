package typings.neoAsync

import org.scalablytyped.runtime.StringDictionary
import typings.neoAsync.anon.Error
import typings.neoAsync.anon.RetryOptionsaritynumberun
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("neo-async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def all[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def allLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("allLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def allLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("allLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def allSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("allSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def allSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("allSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def any[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def any[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def anyLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("anyLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def anyLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("anyLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def anySeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("anySeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def anySeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("anySeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def apply[E](fn: js.Function, args: Any*): AsyncFunction[Any, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("apply")(scala.List(fn.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[AsyncFunction[Any, E]]
  
  inline def applyEach(fns: js.Array[js.Function], argsAndCallback: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyEach")(scala.List(fns.asInstanceOf[js.Any]).`++`(argsAndCallback.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def applyEachSeries(fns: js.Array[js.Function], argsAndCallback: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyEachSeries")(scala.List(fns.asInstanceOf[js.Any]).`++`(argsAndCallback.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def asyncify(fn: js.Function): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  
  inline def auto[R /* <: Dictionary[Any] */, E](tasks: AsyncAutoTasks[R, E]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("auto")(tasks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def auto[R /* <: Dictionary[Any] */, E](tasks: AsyncAutoTasks[R, E], callback: AsyncResultCallback[R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auto")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def auto[R /* <: Dictionary[Any] */, E](tasks: AsyncAutoTasks[R, E], concurrency: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auto")(tasks.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def auto[R /* <: Dictionary[Any] */, E](tasks: AsyncAutoTasks[R, E], concurrency: Double, callback: AsyncResultCallback[R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auto")(tasks.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def auto[R /* <: Dictionary[Any] */, E](tasks: AsyncAutoTasks[R, E], concurrency: Unit, callback: AsyncResultCallback[R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auto")(tasks.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def autoInject[E](tasks: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("autoInject")(tasks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def autoInject[E](tasks: Any, callback: AsyncResultCallback[Any, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autoInject")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cargo[T, E](worker: AsyncWorker[js.Array[T], E]): QueueObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cargo")(worker.asInstanceOf[js.Any]).asInstanceOf[QueueObject[T]]
  inline def cargo[T, E](worker: AsyncWorker[js.Array[T], E], payload: Double): QueueObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cargo")(worker.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[QueueObject[T]]
  
  inline def cargoQueue[T, E](// eslint-disable-next-line no-unnecessary-generics
  worker: AsyncWorker[js.Array[T], E]): QueueObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cargoQueue")(worker.asInstanceOf[js.Any]).asInstanceOf[QueueObject[T]]
  inline def cargoQueue[T, E](
    // eslint-disable-next-line no-unnecessary-generics
  worker: AsyncWorker[js.Array[T], E],
    concurrency: Double
  ): QueueObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cargoQueue")(worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[QueueObject[T]]
  inline def cargoQueue[T, E](
    // eslint-disable-next-line no-unnecessary-generics
  worker: AsyncWorker[js.Array[T], E],
    concurrency: Double,
    payload: Double
  ): QueueObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cargoQueue")(worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[QueueObject[T]]
  inline def cargoQueue[T, E](
    // eslint-disable-next-line no-unnecessary-generics
  worker: AsyncWorker[js.Array[T], E],
    concurrency: Unit,
    payload: Double
  ): QueueObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cargoQueue")(worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[QueueObject[T]]
  
  inline def compose(fns: js.Function*): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(fns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function]
  
  inline def concat[T, R, E](arr: IterableCollection[T], iterator: AsyncResultIterator[T, js.Array[R], E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def concat[T, R, E](
    arr: IterableCollection[T],
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def concatLimit[T, R, E](arr: IterableCollection[T], limit: Double, iterator: AsyncResultIterator[T, js.Array[R], E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("concatLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def concatLimit[T, R, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("concatLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def concatSeries[T, R, E](arr: IterableCollection[T], iterator: AsyncResultIterator[T, js.Array[R], E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("concatSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def concatSeries[T, R, E](
    arr: IterableCollection[T],
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("concatSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def constant(values: Any*): AsyncFunction[Any, js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[AsyncFunction[Any, js.Error]]
  
  inline def detect[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def detect[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def detectLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def detectLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def detectSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def detectSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dir(fn: js.Function, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dir")(scala.List(fn.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def doDuring[E](
    fn: AsyncVoidFunction[E],
    test: js.Function1[/* testCallback */ AsyncBooleanResultCallback[E], Unit],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doDuring")(fn.asInstanceOf[js.Any], test.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def doUntil[T, E](
    fn: AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, Boolean],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doUntil")(fn.asInstanceOf[js.Any], test.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doUntil[T, R, E](fn: AsyncFunctionEx[T, E], test: js.Function1[/* repeated */ T, Boolean]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("doUntil")(fn.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  inline def doWhilst[T, E](
    fn: AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, Boolean],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doWhilst")(fn.asInstanceOf[js.Any], test.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doWhilst[T, R, E](fn: AsyncFunctionEx[T, E], test: js.Function1[/* repeated */ T, Boolean]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("doWhilst")(fn.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  inline def during[E](
    test: js.Function1[/* testCallback */ AsyncBooleanResultCallback[E], Unit],
    fn: AsyncVoidFunction[E],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("during")(test.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def each[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def each[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def eachLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncIterator[T, E]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eachLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def eachOf[T, E](
    obj: IterableCollection[T],
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncForEachOfIterator[T, E]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachOf")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachOf")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def eachOfLimit[T, E](
    obj: IterableCollection[T],
    limit: Double,
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncForEachOfIterator[T, E]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachOfLimit")(obj.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eachOfLimit[T, E](
    obj: IterableCollection[T],
    limit: Double,
    iterator: AsyncForEachOfIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachOfLimit")(obj.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def eachOfSeries[T, E](
    obj: IterableCollection[T],
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncForEachOfIterator[T, E]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachOfSeries")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eachOfSeries[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachOfSeries")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def eachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureAsync(fn: js.Function1[/* repeated */ Any, Unit]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def every[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def every[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def everyLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("everyLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def everyLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("everyLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def everySeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("everySeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def everySeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("everySeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def filter[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  inline def filter[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def filterLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncBooleanIterator[T, E]
  ): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  inline def filterLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filterLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def filterSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  inline def filterSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filterSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def find[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def find[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def foldl[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldl")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def foldl[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldl")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def foldl[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldl")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def foldl[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldl")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def foldr[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldr")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def foldr[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldr")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def foldr[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldr")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def foldr[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldr")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEach[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def forEach[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncIterator[T, E]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def forEachLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachOf[T, E](
    obj: IterableCollection[T],
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncForEachOfIterator[T, E]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachOf")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def forEachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachOf")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachOfLimit[T, E](
    obj: IterableCollection[T],
    limit: Double,
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncForEachOfIterator[T, E]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachOfLimit")(obj.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def forEachOfLimit[T, E](
    obj: IterableCollection[T],
    limit: Double,
    iterator: AsyncForEachOfIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachOfLimit")(obj.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachOfSeries[T, E](
    obj: IterableCollection[T],
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncForEachOfIterator[T, E]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachOfSeries")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def forEachOfSeries[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachOfSeries")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def forEachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forever[E](next: js.Function1[/* next */ ErrorCallback[E], Unit], errBack: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forever")(next.asInstanceOf[js.Any], errBack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def inject[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inject[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inject[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inject[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def log(fn: js.Function, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(scala.List(fn.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def map[T, R, E](
    arr: js.Array[T],
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncResultIterator[T, R, E]
  ): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  inline def map[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E], callback: AsyncResultArrayCallback[R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def map[T, R, E](
    arr: Dictionary[T],
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncResultIterator[T, R, E]
  ): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  inline def map[T, R, E](
    arr: Dictionary[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def map[T, R, E](
    arr: IterableIterator[T],
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncResultIterator[T, R, E]
  ): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  inline def map[T, R, E](
    arr: IterableIterator[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mapLimit[T, R, E](
    arr: IterableCollection[T],
    limit: Double,
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncResultIterator[T, R, E]
  ): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  inline def mapLimit[T, R, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mapSeries[T, R, E](
    arr: js.Array[T],
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncResultIterator[T, R, E]
  ): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  inline def mapSeries[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E], callback: AsyncResultArrayCallback[R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mapSeries[T, R, E](
    arr: Dictionary[T],
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncResultIterator[T, R, E]
  ): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  inline def mapSeries[T, R, E](
    arr: Dictionary[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mapSeries[T, R, E](
    arr: IterableIterator[T],
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncResultIterator[T, R, E]
  ): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  inline def mapSeries[T, R, E](
    arr: IterableIterator[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mapValues[T, R, E](
    obj: Dictionary[T],
    // eslint-disable-next-line no-unnecessary-generics
  iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit]
  ): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(obj.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def mapValues[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit],
    callback: AsyncResultObjectCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(obj.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mapValuesLimit[T, R, E](
    obj: Dictionary[T],
    limit: Double,
    // eslint-disable-next-line no-unnecessary-generics
  iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit]
  ): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValuesLimit")(obj.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def mapValuesLimit[T, R, E](
    obj: Dictionary[T],
    limit: Double,
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit],
    callback: AsyncResultObjectCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValuesLimit")(obj.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mapValuesSeries[T, R, E](
    obj: Dictionary[T],
    // eslint-disable-next-line no-unnecessary-generics
  iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit]
  ): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValuesSeries")(obj.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def mapValuesSeries[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit],
    callback: AsyncResultObjectCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValuesSeries")(obj.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def memoize(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def memoize(fn: js.Function, hasher: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(fn.asInstanceOf[js.Any], hasher.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def nextTick(callback: js.Function, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")(scala.List(callback.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def parallel[T, E](tasks: js.Array[AsyncFunction[T, E]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(tasks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def parallel[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultArrayCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parallel[T, E](tasks: Dictionary[AsyncFunction[T, E]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(tasks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def parallel[T, E](tasks: Dictionary[AsyncFunction[T, E]], callback: AsyncResultObjectCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parallelLimit[T, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelLimit")(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parallelLimit[T, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double, callback: AsyncResultArrayCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelLimit")(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parallelLimit[T, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelLimit")(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parallelLimit[T, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double, callback: AsyncResultObjectCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelLimit")(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parallelLimit_TRE_Promise[T, R, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelLimit")(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def parallelLimit_TRE_Promise[T, R, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelLimit")(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  inline def parallel_TRE_Promise[T, R, E](tasks: js.Array[AsyncFunction[T, E]]): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
  inline def parallel_TRE_Promise[T, R, E](tasks: Dictionary[AsyncFunction[T, E]]): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
  
  inline def priorityQueue[T, E](worker: AsyncWorker[T, E]): AsyncPriorityQueue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("priorityQueue")(worker.asInstanceOf[js.Any]).asInstanceOf[AsyncPriorityQueue[T]]
  inline def priorityQueue[T, E](worker: AsyncWorker[T, E], concurrency: Double): AsyncPriorityQueue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("priorityQueue")(worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[AsyncPriorityQueue[T]]
  
  inline def queue[T, E](worker: AsyncWorker[T, E]): QueueObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("queue")(worker.asInstanceOf[js.Any]).asInstanceOf[QueueObject[T]]
  inline def queue[T, E](worker: AsyncWorker[T, E], concurrency: Double): QueueObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("queue")(worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[QueueObject[T]]
  
  inline def queue_TRE[T, R, E](worker: AsyncResultIterator[T, R, E]): QueueObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("queue")(worker.asInstanceOf[js.Any]).asInstanceOf[QueueObject[T]]
  inline def queue_TRE[T, R, E](worker: AsyncResultIterator[T, R, E], concurrency: Double): QueueObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("queue")(worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[QueueObject[T]]
  
  inline def race[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reduce[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reduce[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reduce[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reduce[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reduceRight[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reduceRight[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reduceRight[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reduceRight[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reflect[T, E](fn: AsyncFunction[T, E]): js.Function1[/* callback */ js.Function2[/* err */ Null, /* result */ Error[E, T], Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reflect")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* callback */ js.Function2[/* err */ Null, /* result */ Error[E, T], Unit], Unit]]
  
  inline def reflectAll[T, E](tasks: js.Array[AsyncFunction[T, E]]): js.Array[
    js.Function1[/* callback */ js.Function2[/* err */ Null, /* result */ Error[E, T], Unit], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectAll")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    js.Function1[/* callback */ js.Function2[/* err */ Null, /* result */ Error[E, T], Unit], Unit]
  ]]
  
  inline def reject[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  inline def reject[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rejectLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncBooleanIterator[T, E]
  ): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejectLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  inline def rejectLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rejectLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rejectSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejectSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  inline def rejectSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rejectSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def retry[T, E](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")().asInstanceOf[Unit]
  inline def retry[T, E](opts: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def retry[T, E](
    opts: Double,
    // eslint-disable-next-line no-unnecessary-generics
  task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retry[T, E](
    opts: Double,
    // eslint-disable-next-line no-unnecessary-generics
  task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ Any, Unit],
    callback: AsyncResultCallback[Any, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retry[T, E](
    opts: Double,
    // eslint-disable-next-line no-unnecessary-generics
  task: Unit,
    callback: AsyncResultCallback[Any, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retry[T, E](
    opts: Unit,
    // eslint-disable-next-line no-unnecessary-generics
  task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retry[T, E](
    opts: Unit,
    // eslint-disable-next-line no-unnecessary-generics
  task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ Any, Unit],
    callback: AsyncResultCallback[Any, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retry[T, E](
    opts: Unit,
    // eslint-disable-next-line no-unnecessary-generics
  task: Unit,
    callback: AsyncResultCallback[Any, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retry[T, E](opts: RetryOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def retry[T, E](
    opts: RetryOptions,
    // eslint-disable-next-line no-unnecessary-generics
  task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retry[T, E](
    opts: RetryOptions,
    // eslint-disable-next-line no-unnecessary-generics
  task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ Any, Unit],
    callback: AsyncResultCallback[Any, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retry[T, E](
    opts: RetryOptions,
    // eslint-disable-next-line no-unnecessary-generics
  task: Unit,
    callback: AsyncResultCallback[Any, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def retry_TE_Promise[T, E](): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")().asInstanceOf[js.Promise[Unit]]
  inline def retry_TE_Promise[T, E](opts: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def retry_TE_Promise[T, E](
    opts: Double,
    // eslint-disable-next-line no-unnecessary-generics
  task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ Any, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def retry_TE_Promise[T, E](
    opts: Unit,
    // eslint-disable-next-line no-unnecessary-generics
  task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ Any, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def retry_TE_Promise[T, E](opts: RetryOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def retry_TE_Promise[T, E](
    opts: RetryOptions,
    // eslint-disable-next-line no-unnecessary-generics
  task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ Any, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def retryable[T, E](opts: Double, task: AsyncFunction[T, E]): AsyncFunction[T, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryable")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[AsyncFunction[T, E]]
  inline def retryable[T, E](opts: RetryOptionsaritynumberun, task: AsyncFunction[T, E]): AsyncFunction[T, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryable")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[AsyncFunction[T, E]]
  inline def retryable[T, E](task: AsyncFunction[T, E]): AsyncFunction[T, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryable")(task.asInstanceOf[js.Any]).asInstanceOf[AsyncFunction[T, E]]
  
  inline def select[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  inline def select[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def selectLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncBooleanIterator[T, E]
  ): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  inline def selectLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def selectSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  inline def selectSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def seq(fns: js.Function*): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("seq")(fns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function]
  
  inline def series[T, E](tasks: js.Array[AsyncFunction[T, E]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("series")(tasks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def series[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultArrayCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("series")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def series[T, E](tasks: Dictionary[AsyncFunction[T, E]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("series")(tasks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def series[T, E](tasks: Dictionary[AsyncFunction[T, E]], callback: AsyncResultObjectCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("series")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def series_TRE_Promise[T, R, E](tasks: js.Array[AsyncFunction[T, E]]): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("series")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
  inline def series_TRE_Promise[T, R, E](tasks: Dictionary[AsyncFunction[T, E]]): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("series")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
  
  @JSImport("neo-async", "setImmediate")
  @js.native
  val setImmediate: js.Function2[/* callback */ js.Function, /* repeated */ Any, Unit] = js.native
  
  inline def some[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def some[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def someLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("someLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def someLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("someLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def someSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("someSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def someSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("someSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sortBy[T, V, E](
    arr: js.Array[T],
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncResultIterator[T, V, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sortBy[T, V, E](
    arr: js.Array[T],
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncResultIterator[T, V, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sortBy[T, V, E](
    arr: IterableIterator[T],
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncResultIterator[T, V, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sortBy[T, V, E](
    arr: IterableIterator[T],
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncResultIterator[T, V, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def timeout[T, E](fn: AsyncFunction[T, E], milliseconds: Double): AsyncFunction[T, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(fn.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[AsyncFunction[T, E]]
  inline def timeout[T, E](fn: AsyncFunction[T, E], milliseconds: Double, info: Any): AsyncFunction[T, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(fn.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[AsyncFunction[T, E]]
  inline def timeout[T, R, E](fn: AsyncResultIterator[T, R, E], milliseconds: Double): AsyncResultIterator[T, R, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(fn.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[AsyncResultIterator[T, R, E]]
  inline def timeout[T, R, E](fn: AsyncResultIterator[T, R, E], milliseconds: Double, info: Any): AsyncResultIterator[T, R, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(fn.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[AsyncResultIterator[T, R, E]]
  
  inline def times[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("times")(n.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def times[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E], callback: AsyncResultArrayCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("times")(n.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def timesLimit[T, E](
    n: Double,
    limit: Double,
    // eslint-disable-next-line no-unnecessary-generics
  iterator: AsyncResultIterator[Double, T, E]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timesLimit")(n.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def timesLimit[T, E](
    n: Double,
    limit: Double,
    iterator: AsyncResultIterator[Double, T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timesLimit")(n.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def timesSeries[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timesSeries")(n.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def timesSeries[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E], callback: AsyncResultArrayCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timesSeries")(n.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transform[T, R, E](
    arr: js.Array[T],
    acc: js.Array[R],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], acc.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transform[T, R, E](
    arr: js.Array[T],
    acc: js.Array[R],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], acc.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transform[T, R, E](
    arr: js.Array[T],
    // eslint-disable-next-line no-unnecessary-generics
  iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transform[T, R, E](
    arr: js.Array[T],
    // eslint-disable-next-line no-unnecessary-generics
  iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transform[T, R, E](
    arr: StringDictionary[T],
    acc: StringDictionary[R],
    iteratee: js.Function4[
      /* acc */ StringDictionary[R], 
      /* item */ T, 
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], acc.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transform[T, R, E](
    arr: StringDictionary[T],
    acc: StringDictionary[R],
    iteratee: js.Function4[
      /* acc */ StringDictionary[R], 
      /* item */ T, 
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ],
    callback: AsyncResultObjectCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], acc.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transform[T, R, E](
    arr: StringDictionary[T],
    // eslint-disable-next-line no-unnecessary-generics
  iteratee: js.Function4[
      /* acc */ StringDictionary[R], 
      /* item */ T, 
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transform[T, R, E](
    arr: StringDictionary[T],
    // eslint-disable-next-line no-unnecessary-generics
  iteratee: js.Function4[
      /* acc */ StringDictionary[R], 
      /* item */ T, 
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ],
    callback: AsyncResultObjectCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unmemoize(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("unmemoize")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def until[E](test: js.Function0[Boolean], fn: AsyncVoidFunction[E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("until")(test.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def until[R, E](test: js.Function0[Boolean], fn: AsyncVoidFunction[E]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("until")(test.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  inline def waterfall[T, E](tasks: js.Array[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("waterfall")(tasks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def waterfall[T, E](tasks: js.Array[js.Function], callback: AsyncResultCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("waterfall")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def whilst[E](
    test: js.Function1[/* cb */ js.Function2[/* err */ Any, /* truth */ Boolean, Boolean], Boolean],
    fn: AsyncVoidFunction[E],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("whilst")(test.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def whilst[R, E](
    test: js.Function1[/* cb */ js.Function2[/* err */ Any, /* truth */ Boolean, Boolean], Boolean],
    // eslint-disable-next-line no-unnecessary-generics
  fn: AsyncVoidFunction[E]
  ): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("whilst")(test.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  inline def wrapSync(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapSync")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  type AsyncAutoTask[R1, R /* <: Dictionary[Any] */, E] = (AsyncAutoTaskFunctionWithoutDependencies[R1, E]) | (js.Array[(/* keyof R */ String) | (AsyncAutoTaskFunction[R1, R, E])])
  
  type AsyncAutoTaskFunction[R1, R /* <: Dictionary[Any] */, E] = js.Function2[/* results */ R, /* cb */ (AsyncResultCallback[R1, E]) | ErrorCallback[E], Unit]
  
  type AsyncAutoTaskFunctionWithoutDependencies[R1, E] = js.Function1[/* cb */ (AsyncResultCallback[R1, E]) | ErrorCallback[E], Unit]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof R ]: neo-async.neo-async.AsyncAutoTask<R[K], R, E>}
    }}}
    */
  @js.native
  trait AsyncAutoTasks[R /* <: Dictionary[Any] */, E] extends StObject
  
  type AsyncBooleanIterator[T, E] = js.Function2[/* item */ T, /* callback */ AsyncBooleanResultCallback[E], Unit]
  
  type AsyncBooleanResultCallback[E] = js.Function2[/* err */ js.UndefOr[E | Null], /* truthValue */ js.UndefOr[Boolean], Unit]
  
  type AsyncCargoQueue[T] = QueueObject[T]
  
  type AsyncForEachOfIterator[T, E] = js.Function3[/* item */ T, /* key */ Double | String, /* callback */ ErrorCallback[E], Unit]
  
  type AsyncFunction[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E | Null], /* result */ js.UndefOr[T], Unit], 
    Unit
  ]
  
  type AsyncFunctionEx[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E | Null], /* repeated */ T, Unit], 
    Unit
  ]
  
  type AsyncIterator[T, E] = js.Function2[/* item */ T, /* callback */ ErrorCallback[E], Unit]
  
  type AsyncMemoIterator[T, R, E] = js.Function3[/* memo */ js.UndefOr[R], /* item */ T, /* callback */ AsyncResultCallback[R, E], Unit]
  
  /* Inlined parent std.Pick<neo-async.neo-async.QueueObject<T>, std.Exclude<keyof neo-async.neo-async.QueueObject<T>, 'push' | 'unshift'>> */
  @js.native
  trait AsyncPriorityQueue[T] extends StObject {
    
    var buffer: Double = js.native
    
    var concurrency: Double = js.native
    
    def drain(): js.Promise[Unit] = js.native
    @JSName("drain")
    var drain_Original: js.Function0[js.Promise[Unit]] = js.native
    
    def empty(): js.Promise[Unit] = js.native
    @JSName("empty")
    var empty_Original: js.Function0[js.Promise[Unit]] = js.native
    
    def error(): js.Promise[scala.Nothing] = js.native
    @JSName("error")
    var error_Original: js.Function0[js.Promise[scala.Nothing]] = js.native
    
    def idle(): Boolean = js.native
    @JSName("idle")
    var idle_Original: js.Function0[Boolean] = js.native
    
    def kill(): Unit = js.native
    @JSName("kill")
    var kill_Original: js.Function0[Unit] = js.native
    
    def length(): Double = js.native
    @JSName("length")
    var length_Original: js.Function0[Double] = js.native
    
    def pause(): Unit = js.native
    @JSName("pause")
    var pause_Original: js.Function0[Unit] = js.native
    
    var paused: Boolean = js.native
    
    var payload: Double = js.native
    
    // eslint-disable-next-line no-unnecessary-generics
    def push[R](task: T): js.Promise[R] = js.native
    def push[R](task: T, priority: Double): js.Promise[R] = js.native
    def push[R](task: js.Array[T]): js.Promise[R] = js.native
    def push[R](task: js.Array[T], priority: Double): js.Promise[R] = js.native
    // eslint-disable-next-line no-unnecessary-generics
    def push[R, E](task: T, priority: Double, callback: AsyncResultCallback[R, E]): Unit = js.native
    def push[R, E](task: js.Array[T], priority: Double, callback: AsyncResultCallback[R, E]): Unit = js.native
    
    def pushAsync[R](task: T): js.Promise[R] = js.native
    def pushAsync[R](task: js.Array[T]): js.Promise[R] = js.native
    @JSName("pushAsync")
    var pushAsync_Original: js.Function1[/* task */ T | js.Array[T], js.Promise[Any]] = js.native
    
    def remove(filter: js.Function1[/* node */ DataContainer[T], Boolean]): Unit = js.native
    @JSName("remove")
    var remove_Original: js.Function1[/* filter */ js.Function1[/* node */ DataContainer[T], Boolean], Unit] = js.native
    
    def resume(): Unit = js.native
    @JSName("resume")
    var resume_Original: js.Function0[Unit] = js.native
    
    def running(): Double = js.native
    @JSName("running")
    var running_Original: js.Function0[Double] = js.native
    
    def saturated(): js.Promise[Unit] = js.native
    @JSName("saturated")
    var saturated_Original: js.Function0[js.Promise[Unit]] = js.native
    
    var started: Boolean = js.native
    
    def unsaturated(): js.Promise[Unit] = js.native
    @JSName("unsaturated")
    var unsaturated_Original: js.Function0[js.Promise[Unit]] = js.native
    
    def unshiftAsync[R](task: T): js.Promise[R] = js.native
    def unshiftAsync[R](task: js.Array[T]): js.Promise[R] = js.native
    @JSName("unshiftAsync")
    var unshiftAsync_Original: js.Function1[/* task */ T | js.Array[T], js.Promise[Any]] = js.native
    
    def workersList[TWorker /* <: DataContainer[T] */, CallbackContainer](): js.Array[TWorker] = js.native
    @JSName("workersList")
    var workersList_Original: js.Function0[js.Array[DataContainer[T]]] = js.native
  }
  
  type AsyncQueue[T] = QueueObject[T]
  
  type AsyncResultArrayCallback[T, E] = js.Function2[
    /* err */ js.UndefOr[E | Null], 
    /* results */ js.UndefOr[js.Array[js.UndefOr[T]]], 
    Unit
  ]
  
  type AsyncResultCallback[T, E] = js.Function2[/* err */ js.UndefOr[E | Null], /* result */ js.UndefOr[T], Unit]
  
  type AsyncResultIterator[T, R, E] = js.Function2[/* item */ T, /* callback */ AsyncResultCallback[R, E], Unit]
  
  type AsyncResultObjectCallback[T, E] = js.Function2[/* err */ js.UndefOr[E], /* results */ Dictionary[js.UndefOr[T]], Unit]
  
  type AsyncVoidFunction[E] = js.Function1[/* callback */ ErrorCallback[E], Unit]
  
  type AsyncWorker[T, E] = js.Function2[/* task */ T, /* callback */ ErrorCallback[E], Unit]
  
  trait CallbackContainer extends StObject {
    
    // tslint:disable-next-line:ban-types
    var callback: js.Function
  }
  object CallbackContainer {
    
    inline def apply(callback: js.Function): CallbackContainer = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackContainer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallbackContainer] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataContainer[T] extends StObject {
    
    var data: T
    
    var priority: Double
  }
  object DataContainer {
    
    inline def apply[T](data: T, priority: Double): DataContainer[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataContainer[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataContainer[?], T] (val x: Self & DataContainer[T]) extends AnyVal {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  type Dictionary[T] = StringDictionary[T]
  
  type ErrorCallback[E] = js.Function1[/* err */ js.UndefOr[E | Null], Unit]
  
  type IterableCollection[T] = js.Array[T] | IterableIterator[T] | Dictionary[T]
  
  trait PriorityContainer extends StObject {
    
    var priority: Double
  }
  object PriorityContainer {
    
    inline def apply(priority: Double): PriorityContainer = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[PriorityContainer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PriorityContainer] (val x: Self) extends AnyVal {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueueObject[T] extends StObject {
    
    /**
      * A minimum threshold buffer in order to say that the `queue` is `unsaturated`.
      */
    var buffer: Double = js.native
    
    /**
      * An integer for determining how many worker functions should be run in parallel.
      * This property can be changed after a queue is created to alter the concurrency on-the-fly.
      */
    var concurrency: Double = js.native
    
    /**
      * A function that sets a callback that is called when the last item from
      * the `queue` has returned from the `worker`.
      *
      * If the callback is omitted, `q.drain()` returns a promise for the next occurrence.
      */
    def drain(): js.Promise[Unit] = js.native
    def drain(handler: js.Function0[Unit]): Unit = js.native
    
    /**
      * A function that sets a callback that is called when the last item from the `queue`
      * is given to a `worker`.
      *
      * If the callback is omitted, `q.empty()` returns a promise for the next occurrence.
      */
    def empty(): js.Promise[Unit] = js.native
    def empty(handler: js.Function0[Unit]): Unit = js.native
    
    /**
      * A function that sets a callback that is called when a task errors.
      *
      * If the callback is omitted, `q.error()` returns a promise that rejects on the next error.
      */
    def error(): js.Promise[scala.Nothing] = js.native
    def error(handler: js.Function2[/* error */ js.Error, /* task */ T, Unit]): Unit = js.native
    
    /**
      * Returns false if there are items waiting or being processed, or true if not.
      */
    def idle(): Boolean = js.native
    
    /**
      * A function that removes the drain callback and empties remaining tasks
      * from the queue forcing it to go idle. No more tasks should be pushed to
      * the queue after calling this function.
      */
    def kill(): Unit = js.native
    
    /**
      * Returns the number of items waiting to be processed.
      */
    def length(): Double = js.native
    
    /**
      * A function that pauses the processing of tasks until `q.resume()` is called.
      */
    def pause(): Unit = js.native
    
    /**
      * A boolean for determining whether the queue is in a paused state.
      */
    var paused: Boolean = js.native
    
    /**
      * An integer that specifies how many items are passed to the worker function at a time.
      * Only applies if this is a cargo object
      */
    var payload: Double = js.native
    
    /**
      * Add a new task to the queue. Calls `callback` once the worker has finished
      * processing the task.
      *
      * Instead of a single task, a tasks array can be submitted.
      * The respective callback is used for every task in the list.
      */
    // eslint-disable-next-line no-unnecessary-generics
    def push[R](task: T): js.Promise[R] = js.native
    def push[R](task: js.Array[T]): js.Promise[R] = js.native
    // eslint-disable-next-line no-unnecessary-generics
    def push[R, E](task: T, callback: AsyncResultCallback[R, E]): Unit = js.native
    def push[R, E](task: js.Array[T], callback: AsyncResultCallback[R, E]): Unit = js.native
    
    /**
      * The same as `q.push`, except this returns a promise that rejects if an error occurs.
      * The `callback` arg is ignored
      */
    // eslint-disable-next-line no-unnecessary-generics
    def pushAsync[R](task: T): js.Promise[R] = js.native
    def pushAsync[R](task: js.Array[T]): js.Promise[R] = js.native
    
    /**
      * Remove items from the queue that match a test function.
      * The test function will be passed an object with a `data` property,
      * and a `priority` property, if this is a `priorityQueue` object.
      */
    def remove(filter: js.Function1[/* node */ DataContainer[T], Boolean]): Unit = js.native
    
    /**
      * A function that resumes the processing of queued tasks when the queue
      * is paused.
      */
    def resume(): Unit = js.native
    
    /**
      * Returns the number of items currently being processed.
      */
    def running(): Double = js.native
    
    /**
      * A function that sets a callback that is called when the number of
      * running workers hits the `concurrency` limit, and further tasks will be
      * queued.
      *
      * If the callback is omitted, `q.saturated()` returns a promise
      * for the next occurrence.
      */
    def saturated(): js.Promise[Unit] = js.native
    def saturated(handler: js.Function0[Unit]): Unit = js.native
    
    /**
      * Indicates whether or not any items have been pushed and processed by the queue.
      */
    var started: Boolean = js.native
    
    /**
      * A function that sets a callback that is called when the number
      * of running workers is less than the `concurrency` & `buffer` limits,
      * and further tasks will not be queued
      *
      * If the callback is omitted, `q.unsaturated()` returns a promise
      * for the next occurrence.
      */
    def unsaturated(): js.Promise[Unit] = js.native
    def unsaturated(handler: js.Function0[Unit]): Unit = js.native
    
    /**
      * Add a new task to the front of the queue
      */
    // eslint-disable-next-line no-unnecessary-generics
    def unshift[R](task: T): js.Promise[R] = js.native
    def unshift[R](task: js.Array[T]): js.Promise[R] = js.native
    // eslint-disable-next-line no-unnecessary-generics
    def unshift[R, E](task: T, callback: AsyncResultCallback[R, E]): Unit = js.native
    def unshift[R, E](task: js.Array[T], callback: AsyncResultCallback[R, E]): Unit = js.native
    
    /**
      * The same as `q.unshift`, except this returns a promise that rejects if an error occurs.
      * The `callback` arg is ignored
      */
    // eslint-disable-next-line no-unnecessary-generics
    def unshiftAsync[R](task: T): js.Promise[R] = js.native
    def unshiftAsync[R](task: js.Array[T]): js.Promise[R] = js.native
    
    /**
      * Returns an array of items currently being processed.
      */
    // eslint-disable-next-line no-unnecessary-generics
    def workersList[TWorker /* <: DataContainer[T] */, CallbackContainer](): js.Array[TWorker] = js.native
  }
  
  trait RetryOptions extends StObject {
    
    var errorFilter: js.UndefOr[js.Function1[/* error */ js.Error, Boolean]] = js.undefined
    
    var interval: js.UndefOr[Double | (js.Function1[/* retryCount */ Double, Double])] = js.undefined
    
    var times: js.UndefOr[Double] = js.undefined
  }
  object RetryOptions {
    
    inline def apply(): RetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryOptions] (val x: Self) extends AnyVal {
      
      inline def setErrorFilter(value: /* error */ js.Error => Boolean): Self = StObject.set(x, "errorFilter", js.Any.fromFunction1(value))
      
      inline def setErrorFilterUndefined: Self = StObject.set(x, "errorFilter", js.undefined)
      
      inline def setInterval(value: Double | (js.Function1[/* retryCount */ Double, Double])): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalFunction1(value: /* retryCount */ Double => Double): Self = StObject.set(x, "interval", js.Any.fromFunction1(value))
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    }
  }
}
