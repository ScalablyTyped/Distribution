package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Ticker class that runs an update loop that other objects listen to.
  *
  * This class is composed around listeners meant for execution on the next requested animation frame.
  * Animation frames are requested only when necessary, e.g. When the ticker is started and the emitter has listeners.
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.Ticker")
@js.native
class Ticker () extends js.Object {
  /**
    * The frames per second at which this ticker is running.
    * The default is approximately 60 in most modern browsers.
    * **Note:** This does not factor in the value of
    * {@link PIXI.Ticker#speed}, which is specific
    * to scaling {@link PIXI.Ticker#deltaTime}.
    *
    * @member {number}
    * @readonly
    */
  val FPS: Double = js.native
  /**
    * Whether or not this ticker should invoke the method
    * {@link PIXI.Ticker#start} automatically
    * when a listener is added.
    *
    * @member {boolean} PIXI.Ticker#autoStart
    * @default false
    */
  var autoStart: Boolean = js.native
  /**
    * Counts the number of listeners on this ticker.
    *
    * @returns {number} The number of listeners on this ticker
    */
  var count: js.Any = js.native
  /**
    * Scaler time elapsed in milliseconds from last frame to this frame.
    * This value is capped by setting {@link PIXI.Ticker#minFPS}
    * and is scaled with {@link PIXI.Ticker#speed}.
    * **Note:** The cap may be exceeded by scaling.
    * If the platform supports DOMHighResTimeStamp,
    * this value will have a precision of 1 µs.
    * Defaults to target frame time
    *
    * @member {number} PIXI.Ticker#deltaMS
    * @default 16.66
    */
  var deltaMS: Double = js.native
  /**
    * Scalar time value from last frame to this frame.
    * This value is capped by setting {@link PIXI.Ticker#minFPS}
    * and is scaled with {@link PIXI.Ticker#speed}.
    * **Note:** The cap may be exceeded by scaling.
    *
    * @member {number} PIXI.Ticker#deltaTime
    * @default 1
    */
  var deltaTime: Double = js.native
  /**
    * Time elapsed in milliseconds from last frame to this frame.
    * Opposed to what the scalar {@link PIXI.Ticker#deltaTime}
    * is based, this value is neither capped nor scaled.
    * If the platform supports DOMHighResTimeStamp,
    * this value will have a precision of 1 µs.
    * Defaults to target frame time
    *
    * @member {number} PIXI.Ticker#elapsedMS
    * @default 16.66
    */
  var elapsedMS: Double = js.native
  /**
    * The last time {@link PIXI.Ticker#update} was invoked.
    * This value is also reset internally outside of invoking
    * update, but only when a new animation frame is requested.
    * If the platform supports DOMHighResTimeStamp,
    * this value will have a precision of 1 µs.
    *
    * @member {number} PIXI.Ticker#lastTime
    * @default -1
    */
  var lastTime: Double = js.native
  /**
    * Manages the minimum amount of milliseconds required to
    * elapse between invoking {@link PIXI.Ticker#update}.
    * This will effect the measured value of {@link PIXI.Ticker#FPS}.
    * If it is set to `0`, then there is no limit; PixiJS will render as many frames as it can.
    * Otherwise it will be at least `minFPS`
    *
    * @member {number}
    * @default 0
    */
  var maxFPS: Double = js.native
  /**
    * Manages the maximum amount of milliseconds allowed to
    * elapse between invoking {@link PIXI.Ticker#update}.
    * This value is used to cap {@link PIXI.Ticker#deltaTime},
    * but does not effect the measured value of {@link PIXI.Ticker#FPS}.
    * When setting this property it is clamped to a value between
    * `0` and `PIXI.settings.TARGET_FPMS * 1000`.
    *
    * @member {number}
    * @default 10
    */
  var minFPS: Double = js.native
  /**
    * Factor of current {@link PIXI.Ticker#deltaTime}.
    * @example
    * // Scales ticker.deltaTime to what would be
    * // the equivalent of approximately 120 FPS
    * ticker.speed = 2;
    *
    * @member {number} PIXI.Ticker#speed
    * @default 1
    */
  var speed: Double = js.native
  /**
    * Whether or not this ticker has been started.
    * `true` if {@link PIXI.Ticker#start} has been called.
    * `false` if {@link PIXI.Ticker#stop} has been called.
    * While `false`, this value may change to `true` in the
    * event of {@link PIXI.Ticker#autoStart} being `true`
    * and a listener is added.
    *
    * @member {boolean} PIXI.Ticker#started
    * @default false
    */
  var started: Boolean = js.native
  /**
    * Register a handler for tick events. Calls continuously unless
    * it is removed or the ticker is stopped.
    *
    * @param {Function} fn - The listener function to be added for updates
    * @param {*} [context] - The listener context
    * @param {number} [priority=PIXI.UPDATE_PRIORITY.NORMAL] - The priority for emitting
    * @returns {PIXI.Ticker} This instance of a ticker
    */
  def add(fn: js.Function1[/* repeated */ js.Any, _]): Ticker = js.native
  def add(fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): Ticker = js.native
  def add(fn: js.Function1[/* repeated */ js.Any, _], context: js.Any, priority: Double): Ticker = js.native
  /**
    * Add a handler for the tick event which is only execute once.
    *
    * @param {Function} fn - The listener function to be added for one update
    * @param {*} [context] - The listener context
    * @param {number} [priority=PIXI.UPDATE_PRIORITY.NORMAL] - The priority for emitting
    * @returns {PIXI.Ticker} This instance of a ticker
    */
  def addOnce(fn: js.Function1[/* repeated */ js.Any, _]): Ticker = js.native
  def addOnce(fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): Ticker = js.native
  def addOnce(fn: js.Function1[/* repeated */ js.Any, _], context: js.Any, priority: Double): Ticker = js.native
  /**
    * Destroy the ticker and don't use after this. Calling
    * this method removes all references to internal events.
    */
  def destroy(): Unit = js.native
  /**
    * Removes any handlers matching the function and context parameters.
    * If no handlers are left after removing, then it cancels the animation frame.
    *
    * @param {Function} fn - The listener function to be removed
    * @param {*} [context] - The listener context to be removed
    * @returns {PIXI.Ticker} This instance of a ticker
    */
  def remove(fn: js.Function1[/* repeated */ js.Any, _]): Ticker = js.native
  def remove(fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): Ticker = js.native
  /**
    * Starts the ticker. If the ticker has listeners
    * a new animation frame is requested at this point.
    */
  def start(): Unit = js.native
  /**
    * Stops the ticker. If the ticker has requested
    * an animation frame it is canceled at this point.
    */
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
    *
    * @param {number} [currentTime=performance.now()] - the current time of execution
    */
  def update(): Unit = js.native
  def update(currentTime: Double): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.Ticker")
@js.native
object Ticker extends js.Object {
  /**
    * The shared ticker instance used by {@link PIXI.AnimatedSprite} and by
    * {@link PIXI.VideoResource} to update animation frames / video textures.
    *
    * It may also be used by {@link PIXI.Application} if created with the `sharedTicker` option property set to true.
    *
    * The property {@link PIXI.Ticker#autoStart} is set to `true` for this instance.
    * Please follow the examples for usage, including how to opt-out of auto-starting the shared ticker.
    *
    * @example
    * let ticker = PIXI.Ticker.shared;
    * // Set this to prevent starting this ticker when listeners are added.
    * // By default this is true only for the PIXI.Ticker.shared instance.
    * ticker.autoStart = false;
    * // FYI, call this to ensure the ticker is stopped. It should be stopped
    * // if you have not attempted to render anything yet.
    * ticker.stop();
    * // Call this when you are ready for a running shared ticker.
    * ticker.start();
    *
    * @example
    * // You may use the shared ticker to render...
    * let renderer = PIXI.autoDetectRenderer();
    * let stage = new PIXI.Container();
    * document.body.appendChild(renderer.view);
    * ticker.add(function (time) {
    *     renderer.render(stage);
    * });
    *
    * @example
    * // Or you can just update it manually.
    * ticker.autoStart = false;
    * ticker.stop();
    * function animate(time) {
    *     ticker.update(time);
    *     renderer.render(stage);
    *     requestAnimationFrame(animate);
    * }
    * animate(performance.now());
    *
    * @member {PIXI.Ticker}
    * @static
    */
  var shared: Ticker = js.native
  /**
    * The system ticker instance used by {@link PIXI.interaction.InteractionManager} and by
    * {@link PIXI.BasePrepare} for core timing functionality that shouldn't usually need to be paused,
    * unlike the `shared` ticker which drives visual animations and rendering which may want to be paused.
    *
    * The property {@link PIXI.Ticker#autoStart} is set to `true` for this instance.
    *
    * @member {PIXI.Ticker}
    * @static
    */
  var system: Ticker = js.native
}

