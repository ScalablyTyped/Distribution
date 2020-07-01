package typings.pixiJs.global.PIXI

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
class Ticker ()
  extends typings.pixiJs.PIXI.Ticker

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
  var shared: typings.pixiJs.PIXI.Ticker = js.native
  /**
    * The system ticker instance used by {@link PIXI.InteractionManager} and by
    * {@link PIXI.BasePrepare} for core timing functionality that shouldn't usually need to be paused,
    * unlike the `shared` ticker which drives visual animations and rendering which may want to be paused.
    *
    * The property {@link PIXI.Ticker#autoStart} is set to `true` for this instance.
    *
    * @member {PIXI.Ticker}
    * @static
    */
  var system: typings.pixiJs.PIXI.Ticker = js.native
}

