package typings.node

import typings.node.timersMod.TimerOptions
import typings.node.timersPromisesMod.Scheduler_
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColontimersPromisesMod {
  
  @JSImport("node:timers/promises", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:timers/promises", "scheduler")
  @js.native
  val scheduler: Scheduler_ = js.native
  
  /**
    * ```js
    * import {
    *   setImmediate,
    * } from 'timers/promises';
    *
    * const res = await setImmediate('result');
    *
    * console.log(res);  // Prints 'result'
    * ```
    * @since v15.0.0
    * @param value A value with which the promise is fulfilled.
    */
  inline def setImmediate[T](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")().asInstanceOf[js.Promise[T]]
  inline def setImmediate[T](value: T): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def setImmediate[T](value: T, options: TimerOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def setImmediate[T](value: Unit, options: TimerOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  /**
    * Returns an async iterator that generates values in an interval of `delay` ms.
    * If `ref` is `true`, you need to call `next()` of async iterator explicitly
    * or implicitly to keep the event loop alive.
    *
    * ```js
    * import {
    *   setInterval,
    * } from 'timers/promises';
    *
    * const interval = 100;
    * for await (const startTime of setInterval(interval, Date.now())) {
    *   const now = Date.now();
    *   console.log(now);
    *   if ((now - startTime) > 1000)
    *     break;
    * }
    * console.log(Date.now());
    * ```
    * @since v15.9.0
    */
  inline def setInterval[T](): AsyncIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")().asInstanceOf[AsyncIterable[T]]
  inline def setInterval[T](delay: Double): AsyncIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(delay.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[T]]
  inline def setInterval[T](delay: Double, value: T): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  inline def setInterval[T](delay: Double, value: T, options: TimerOptions): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  inline def setInterval[T](delay: Double, value: Unit, options: TimerOptions): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  inline def setInterval[T](delay: Unit, value: T): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  inline def setInterval[T](delay: Unit, value: T, options: TimerOptions): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  inline def setInterval[T](delay: Unit, value: Unit, options: TimerOptions): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  
  /**
    * ```js
    * import {
    *   setTimeout,
    * } from 'timers/promises';
    *
    * const res = await setTimeout(100, 'result');
    *
    * console.log(res);  // Prints 'result'
    * ```
    * @since v15.0.0
    * @param [delay=1] The number of milliseconds to wait before fulfilling the promise.
    * @param value A value with which the promise is fulfilled.
    */
  inline def setTimeout[T](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")().asInstanceOf[js.Promise[T]]
  inline def setTimeout[T](delay: Double): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(delay.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def setTimeout[T](delay: Double, value: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def setTimeout[T](delay: Double, value: T, options: TimerOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def setTimeout[T](delay: Double, value: Unit, options: TimerOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def setTimeout[T](delay: Unit, value: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def setTimeout[T](delay: Unit, value: T, options: TimerOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def setTimeout[T](delay: Unit, value: Unit, options: TimerOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
