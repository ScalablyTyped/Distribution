package typings.node

import typings.node.NodeJS.RefCounted
import typings.node.eventsMod.Abortable
import typings.node.timersMod.global.NodeJS.Immediate
import typings.node.timersMod.global.NodeJS.Timeout
import typings.node.timersMod.global.NodeJS.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timersMod {
  
  @JSImport("timers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("timers", "clearImmediate")
  @js.native
  def clearImmediate: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.clearImmediate */ Any = js.native
  inline def clearImmediate_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.clearImmediate */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearImmediate")(x.asInstanceOf[js.Any])
  
  @JSImport("timers", "clearInterval")
  @js.native
  def clearInterval: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.clearInterval */ Any = js.native
  inline def clearInterval_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.clearInterval */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearInterval")(x.asInstanceOf[js.Any])
  
  @JSImport("timers", "clearTimeout")
  @js.native
  def clearTimeout: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.clearTimeout */ Any = js.native
  inline def clearTimeout_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.clearTimeout */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearTimeout")(x.asInstanceOf[js.Any])
  
  object global {
    
    object NodeJS {
      
      /**
        * This object is created internally and is returned from `setImmediate()`. It
        * can be passed to `clearImmediate()` in order to cancel the scheduled
        * actions.
        *
        * By default, when an immediate is scheduled, the Node.js event loop will continue
        * running as long as the immediate is active. The `Immediate` object returned by `setImmediate()` exports both `immediate.ref()` and `immediate.unref()`functions that can be used to
        * control this default behavior.
        */
      @JSGlobal("NodeJS.Immediate")
      @js.native
      open class Immediate ()
        extends StObject
           with RefCounted {
        
        var _onImmediate: js.Function = js.native
        
        /**
          * If true, the `Immediate` object will keep the Node.js event loop active.
          * @since v11.0.0
          */
        def hasRef(): Boolean = js.native
        
        /* CompleteClass */
        override def ref(): this.type = js.native
        
        /* CompleteClass */
        override def unref(): this.type = js.native
      }
      
      /**
        * This object is created internally and is returned from `setTimeout()` and `setInterval()`. It can be passed to either `clearTimeout()` or `clearInterval()` in order to cancel the
        * scheduled actions.
        *
        * By default, when a timer is scheduled using either `setTimeout()` or `setInterval()`, the Node.js event loop will continue running as long as the
        * timer is active. Each of the `Timeout` objects returned by these functions
        * export both `timeout.ref()` and `timeout.unref()` functions that can be used to
        * control this default behavior.
        */
      @JSGlobal("NodeJS.Timeout")
      @js.native
      open class Timeout ()
        extends StObject
           with Timer {
        
        /* CompleteClass */
        override def ref(): this.type = js.native
        
        /* CompleteClass */
        override def unref(): this.type = js.native
      }
      
      // compatibility with older typings
      @js.native
      trait Timer
        extends StObject
           with RefCounted {
        
        def hasRef(): Boolean = js.native
        
        def refresh(): this.type = js.native
        
        @JSName(js.Symbol.toPrimitive)
        var toPrimitive: js.Function0[Double] = js.native
      }
    }
    
    /**
      * Cancels an `Immediate` object created by `setImmediate()`.
      * @since v0.9.1
      * @param immediate An `Immediate` object as returned by {@link setImmediate}.
      */
    inline def clearImmediate(): Unit = js.Dynamic.global.applyDynamic("clearImmediate")().asInstanceOf[Unit]
    inline def clearImmediate(immediateId: Immediate): Unit = js.Dynamic.global.applyDynamic("clearImmediate")(immediateId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Cancels a `Timeout` object created by `setInterval()`.
      * @since v0.0.1
      * @param timeout A `Timeout` object as returned by {@link setInterval} or the `primitive` of the `Timeout` object as a string or a number.
      */
    inline def clearInterval(): Unit = js.Dynamic.global.applyDynamic("clearInterval")().asInstanceOf[Unit]
    inline def clearInterval(intervalId: String): Unit = js.Dynamic.global.applyDynamic("clearInterval")(intervalId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def clearInterval(intervalId: Double): Unit = js.Dynamic.global.applyDynamic("clearInterval")(intervalId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def clearInterval(intervalId: Timeout): Unit = js.Dynamic.global.applyDynamic("clearInterval")(intervalId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Cancels a `Timeout` object created by `setTimeout()`.
      * @since v0.0.1
      * @param timeout A `Timeout` object as returned by {@link setTimeout} or the `primitive` of the `Timeout` object as a string or a number.
      */
    inline def clearTimeout(): Unit = js.Dynamic.global.applyDynamic("clearTimeout")().asInstanceOf[Unit]
    inline def clearTimeout(timeoutId: String): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(timeoutId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def clearTimeout(timeoutId: Double): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(timeoutId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def clearTimeout(timeoutId: Timeout): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(timeoutId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def queueMicrotask(callback: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("queueMicrotask")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    // util.promisify no rest args compability
    // tslint:disable-next-line void-return
    inline def setImmediate(callback: js.Function1[/* args */ Unit, Unit]): Immediate = js.Dynamic.global.applyDynamic("setImmediate")(callback.asInstanceOf[js.Any]).asInstanceOf[Immediate]
    /**
      * Schedules the "immediate" execution of the `callback` after I/O events'
      * callbacks.
      *
      * When multiple calls to `setImmediate()` are made, the `callback` functions are
      * queued for execution in the order in which they are created. The entire callback
      * queue is processed every event loop iteration. If an immediate timer is queued
      * from inside an executing callback, that timer will not be triggered until the
      * next event loop iteration.
      *
      * If `callback` is not a function, a `TypeError` will be thrown.
      *
      * This method has a custom variant for promises that is available using `timersPromises.setImmediate()`.
      * @since v0.9.1
      * @param callback The function to call at the end of this turn of the Node.js `Event Loop`
      * @param args Optional arguments to pass when the `callback` is called.
      * @return for use with {@link clearImmediate}
      */
    inline def setImmediate[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Immediate = (js.Dynamic.global.applyDynamic("setImmediate")(callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Immediate]
    
    // util.promisify no rest args compability
    // tslint:disable-next-line void-return
    inline def setInterval(callback: js.Function1[/* args */ Unit, Unit]): Timer = js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any]).asInstanceOf[Timer]
    inline def setInterval(callback: js.Function1[/* args */ Unit, Unit], ms: Double): Timer = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Timer]
    /**
      * Schedules repeated execution of `callback` every `delay` milliseconds.
      *
      * When `delay` is larger than `2147483647` or less than `1`, the `delay` will be
      * set to `1`. Non-integer delays are truncated to an integer.
      *
      * If `callback` is not a function, a `TypeError` will be thrown.
      *
      * This method has a custom variant for promises that is available using `timersPromises.setInterval()`.
      * @since v0.0.1
      * @param callback The function to call when the timer elapses.
      * @param [delay=1] The number of milliseconds to wait before calling the `callback`.
      * @param args Optional arguments to pass when the `callback` is called.
      * @return for use with {@link clearInterval}
      */
    inline def setInterval[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Double,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timer = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timer]
    inline def setInterval[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timer = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timer]
    
    // util.promisify no rest args compability
    // tslint:disable-next-line void-return
    inline def setTimeout(callback: js.Function1[/* args */ Unit, Unit]): Timeout = js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any]).asInstanceOf[Timeout]
    inline def setTimeout(callback: js.Function1[/* args */ Unit, Unit], ms: Double): Timeout = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Timeout]
    /**
      * Schedules execution of a one-time `callback` after `delay` milliseconds.
      *
      * The `callback` will likely not be invoked in precisely `delay` milliseconds.
      * Node.js makes no guarantees about the exact timing of when callbacks will fire,
      * nor of their ordering. The callback will be called as close as possible to the
      * time specified.
      *
      * When `delay` is larger than `2147483647` or less than `1`, the `delay`will be set to `1`. Non-integer delays are truncated to an integer.
      *
      * If `callback` is not a function, a `TypeError` will be thrown.
      *
      * This method has a custom variant for promises that is available using `timersPromises.setTimeout()`.
      * @since v0.0.1
      * @param callback The function to call when the timer elapses.
      * @param [delay=1] The number of milliseconds to wait before calling the `callback`.
      * @param args Optional arguments to pass when the `callback` is called.
      * @return for use with {@link clearTimeout}
      */
    inline def setTimeout[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Double,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timeout]
    inline def setTimeout[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timeout]
  }
  
  @JSImport("timers", "setImmediate")
  @js.native
  def setImmediate: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.setImmediate */ Any = js.native
  inline def setImmediate_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.setImmediate */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setImmediate")(x.asInstanceOf[js.Any])
  
  @JSImport("timers", "setInterval")
  @js.native
  def setInterval: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.setInterval */ Any = js.native
  inline def setInterval_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.setInterval */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setInterval")(x.asInstanceOf[js.Any])
  
  @JSImport("timers", "setTimeout")
  @js.native
  def setTimeout: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.setTimeout */ Any = js.native
  inline def setTimeout_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.setTimeout */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(x.asInstanceOf[js.Any])
  
  trait TimerOptions
    extends StObject
       with Abortable {
    
    /**
      * Set to `false` to indicate that the scheduled `Timeout`
      * should not require the Node.js event loop to remain active.
      * @default true
      */
    var ref: js.UndefOr[Boolean] = js.undefined
  }
  object TimerOptions {
    
    inline def apply(): TimerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimerOptions] (val x: Self) extends AnyVal {
      
      inline def setRef(value: Boolean): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
