package typings.pixiTicker

import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiTicker.GlobalMixins.IApplicationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/ticker", "Ticker")
  @js.native
  open class Ticker () extends StObject {
    
    /**
      * The frames per second at which this ticker is running.
      * The default is approximately 60 in most modern browsers.
      * **Note:** This does not factor in the value of
      * {@link PIXI.Ticker#speed}, which is specific
      * to scaling {@link PIXI.Ticker#deltaTime}.
      * @member {number}
      * @readonly
      */
    def FPS: Double = js.native
    
    /**
      * Internally adds the event handler so that it can be sorted by priority.
      * Priority allows certain handler (user, AnimatedSprite, Interaction) to be run
      * before the rendering.
      * @private
      * @param listener - Current listener being added.
      * @returns This instance of a ticker
      */
    /* private */ var _addListener: Any = js.native
    
    /**
      * Conditionally cancels a pending animation frame.
      * @private
      */
    /* private */ var _cancelIfNeeded: Any = js.native
    
    /** The first listener. All new listeners added are chained on this. */
    /* private */ var _head: Any = js.native
    
    /** The last time keyframe was executed. Maintains a relatively fixed interval with the previous value. */
    /* private */ var _lastFrame: Any = js.native
    
    /**
      * Internal value managed by minFPS property setter and getter.
      * This is the maximum allowed milliseconds between updates.
      */
    /* private */ var _maxElapsedMS: Any = js.native
    
    /**
      * Internal value managed by minFPS property setter and getter.
      * This is the minimum allowed milliseconds between updates.
      */
    /* private */ var _minElapsedMS: Any = js.native
    
    /** If enabled, deleting is disabled.*/
    /* private */ var _protected: Any = js.native
    
    /** Internal current frame request ID */
    /* private */ var _requestId: Any = js.native
    
    /**
      * Conditionally requests a new animation frame.
      * If a frame has not already been requested, and if the internal
      * emitter has listeners, a new frame is requested.
      * @private
      */
    /* private */ var _requestIfNeeded: Any = js.native
    
    /**
      * Conditionally requests a new animation frame.
      * If the ticker has been started it checks if a frame has not already
      * been requested, and if the internal emitter has listeners. If these
      * conditions are met, a new frame is requested. If the ticker has not
      * been started, but autoStart is `true`, then the ticker starts now,
      * and continues with the previous conditions to request a new frame.
      * @private
      */
    /* private */ var _startIfPossible: Any = js.native
    
    /**
      * Internal tick method bound to ticker instance.
      * This is because in early 2015, Function.bind
      * is still 60% slower in high performance scenarios.
      * Also separating frame requests from update method
      * so listeners may be called at any time and with
      * any animation API, just invoke ticker.update(time).
      * @param time - Time since last tick.
      */
    /* private */ var _tick: Any = js.native
    
    /**
      * Register a handler for tick events. Calls continuously unless
      * it is removed or the ticker is stopped.
      * @param fn - The listener function to be added for updates
      * @param context - The listener context
      * @param {number} [priority=PIXI.UPDATE_PRIORITY.NORMAL] - The priority for emitting
      * @returns This instance of a ticker
      */
    def add[T](fn: TickerCallback[T]): this.type = js.native
    def add[T](fn: TickerCallback[T], context: T): this.type = js.native
    def add[T](fn: TickerCallback[T], context: T, priority: UPDATE_PRIORITY): this.type = js.native
    def add[T](fn: TickerCallback[T], context: Unit, priority: UPDATE_PRIORITY): this.type = js.native
    
    /**
      * Add a handler for the tick event which is only execute once.
      * @param fn - The listener function to be added for one update
      * @param context - The listener context
      * @param {number} [priority=PIXI.UPDATE_PRIORITY.NORMAL] - The priority for emitting
      * @returns This instance of a ticker
      */
    def addOnce[T](fn: TickerCallback[T]): this.type = js.native
    def addOnce[T](fn: TickerCallback[T], context: T): this.type = js.native
    def addOnce[T](fn: TickerCallback[T], context: T, priority: UPDATE_PRIORITY): this.type = js.native
    def addOnce[T](fn: TickerCallback[T], context: Unit, priority: UPDATE_PRIORITY): this.type = js.native
    
    /**
      * Whether or not this ticker should invoke the method
      * {@link PIXI.Ticker#start} automatically
      * when a listener is added.
      */
    var autoStart: Boolean = js.native
    
    /**
      * The number of listeners on this ticker, calculated by walking through linked list
      * @readonly
      * @member {number}
      */
    def count: Double = js.native
    
    /**
      * Scaler time elapsed in milliseconds from last frame to this frame.
      * This value is capped by setting {@link PIXI.Ticker#minFPS}
      * and is scaled with {@link PIXI.Ticker#speed}.
      * **Note:** The cap may be exceeded by scaling.
      * If the platform supports DOMHighResTimeStamp,
      * this value will have a precision of 1 µs.
      * Defaults to target frame time
      * @default 16.66
      */
    var deltaMS: Double = js.native
    
    /**
      * Scalar time value from last frame to this frame.
      * This value is capped by setting {@link PIXI.Ticker#minFPS}
      * and is scaled with {@link PIXI.Ticker#speed}.
      * **Note:** The cap may be exceeded by scaling.
      */
    var deltaTime: Double = js.native
    
    /** Destroy the ticker and don't use after this. Calling this method removes all references to internal events. */
    def destroy(): Unit = js.native
    
    /**
      * Time elapsed in milliseconds from last frame to this frame.
      * Opposed to what the scalar {@link PIXI.Ticker#deltaTime}
      * is based, this value is neither capped nor scaled.
      * If the platform supports DOMHighResTimeStamp,
      * this value will have a precision of 1 µs.
      * Defaults to target frame time
      * @default 16.66
      */
    var elapsedMS: Double = js.native
    
    /**
      * The last time {@link PIXI.Ticker#update} was invoked.
      * This value is also reset internally outside of invoking
      * update, but only when a new animation frame is requested.
      * If the platform supports DOMHighResTimeStamp,
      * this value will have a precision of 1 µs.
      */
    var lastTime: Double = js.native
    
    /**
      * Manages the minimum amount of milliseconds required to
      * elapse between invoking {@link PIXI.Ticker#update}.
      * This will effect the measured value of {@link PIXI.Ticker#FPS}.
      * If it is set to `0`, then there is no limit; PixiJS will render as many frames as it can.
      * Otherwise it will be at least `minFPS`
      * @member {number}
      * @default 0
      */
    def maxFPS: Double = js.native
    def maxFPS_=(fps: Double): Unit = js.native
    
    /**
      * Manages the maximum amount of milliseconds allowed to
      * elapse between invoking {@link PIXI.Ticker#update}.
      * This value is used to cap {@link PIXI.Ticker#deltaTime},
      * but does not effect the measured value of {@link PIXI.Ticker#FPS}.
      * When setting this property it is clamped to a value between
      * `0` and `PIXI.settings.TARGET_FPMS * 1000`.
      * @member {number}
      * @default 10
      */
    def minFPS: Double = js.native
    def minFPS_=(fps: Double): Unit = js.native
    
    /**
      * Removes any handlers matching the function and context parameters.
      * If no handlers are left after removing, then it cancels the animation frame.
      * @param fn - The listener function to be removed
      * @param context - The listener context to be removed
      * @returns This instance of a ticker
      */
    def remove[T](fn: TickerCallback[T]): this.type = js.native
    def remove[T](fn: TickerCallback[T], context: T): this.type = js.native
    
    /**
      * Factor of current {@link PIXI.Ticker#deltaTime}.
      * @example
      * // Scales ticker.deltaTime to what would be
      * // the equivalent of approximately 120 FPS
      * ticker.speed = 2;
      */
    var speed: Double = js.native
    
    /** Starts the ticker. If the ticker has listeners a new animation frame is requested at this point. */
    def start(): Unit = js.native
    
    /**
      * Whether or not this ticker has been started.
      * `true` if {@link PIXI.Ticker#start} has been called.
      * `false` if {@link PIXI.Ticker#stop} has been called.
      * While `false`, this value may change to `true` in the
      * event of {@link PIXI.Ticker#autoStart} being `true`
      * and a listener is added.
      */
    var started: Boolean = js.native
    
    /** Stops the ticker. If the ticker has requested an animation frame it is canceled at this point. */
    def stop(): Unit = js.native
    
    /**
      * Triggers an update. An update entails setting the
      * current {@link PIXI.Ticker#elapsedMS},
      * the current {@link PIXI.Ticker#deltaTime},
      * invoking all listeners with current deltaTime,
      * and then finally setting {@link PIXI.Ticker#lastTime}
      * with the value of currentTime that was provided.
      * This method will be called automatically by animation
      * frame callbacks if the ticker instance has been started
      * and listeners are added.
      * @param {number} [currentTime=performance.now()] - the current time of execution
      */
    def update(): Unit = js.native
    def update(currentTime: Double): Unit = js.native
  }
  /* static members */
  object Ticker {
    
    @JSImport("@pixi/ticker", "Ticker")
    @js.native
    val ^ : js.Any = js.native
    
    /** The private shared ticker instance */
    @JSImport("@pixi/ticker", "Ticker._shared")
    @js.native
    def _shared: Any = js.native
    inline def _shared_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_shared")(x.asInstanceOf[js.Any])
    
    /** The private system ticker instance  */
    @JSImport("@pixi/ticker", "Ticker._system")
    @js.native
    def _system: Any = js.native
    inline def _system_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_system")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@pixi/ticker", "TickerPlugin")
  @js.native
  open class TickerPlugin () extends StObject
  /* static members */
  object TickerPlugin {
    
    @JSImport("@pixi/ticker", "TickerPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/ticker", "TickerPlugin._ticker")
    @js.native
    def _ticker: Ticker = js.native
    inline def _ticker_=(x: Ticker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ticker")(x.asInstanceOf[js.Any])
    
    /**
      * Clean up the ticker, scoped to application.
      * @static
      * @private
      */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** @ignore */
    @JSImport("@pixi/ticker", "TickerPlugin.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
    
    /**
      * Initialize the plugin with scope of application instance
      * @static
      * @private
      * @param {object} [options] - See application options
      */
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    inline def init(options: IApplicationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
    
    inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
    
    @JSImport("@pixi/ticker", "TickerPlugin.ticker")
    @js.native
    def ticker: Ticker = js.native
    inline def ticker_=(x: Ticker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ticker")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait UPDATE_PRIORITY extends StObject
  @JSImport("@pixi/ticker", "UPDATE_PRIORITY")
  @js.native
  object UPDATE_PRIORITY extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[UPDATE_PRIORITY & Double] = js.native
    
    @js.native
    sealed trait HIGH
      extends StObject
         with UPDATE_PRIORITY
    /* 25 */ val HIGH: typings.pixiTicker.mod.UPDATE_PRIORITY.HIGH & Double = js.native
    
    @js.native
    sealed trait INTERACTION
      extends StObject
         with UPDATE_PRIORITY
    /* 50 */ val INTERACTION: typings.pixiTicker.mod.UPDATE_PRIORITY.INTERACTION & Double = js.native
    
    @js.native
    sealed trait LOW
      extends StObject
         with UPDATE_PRIORITY
    /* -25 */ val LOW: typings.pixiTicker.mod.UPDATE_PRIORITY.LOW & Double = js.native
    
    @js.native
    sealed trait NORMAL
      extends StObject
         with UPDATE_PRIORITY
    /* 0 */ val NORMAL: typings.pixiTicker.mod.UPDATE_PRIORITY.NORMAL & Double = js.native
    
    @js.native
    sealed trait UTILITY
      extends StObject
         with UPDATE_PRIORITY
    /* -50 */ val UTILITY: typings.pixiTicker.mod.UPDATE_PRIORITY.UTILITY & Double = js.native
  }
  
  type TickerCallback[T] = js.ThisFunction1[/* this */ T, /* dt */ Double, Any]
}
