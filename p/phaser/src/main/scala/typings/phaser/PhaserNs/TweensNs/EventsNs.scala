package typings.phaser.PhaserNs.TweensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Tweens.Events")
@js.native
object EventsNs extends js.Object {
  /**
    * The Timeline Complete Event.
    * 
    * This event is dispatched by a Tween Timeline when it completes playback.
    * 
    * Listen to it from a Timeline instance using `Timeline.on('complete', listener)`, i.e.:
    * 
    * ```javascript
    * var timeline = this.tweens.timeline({
    *     targets: image,
    *     ease: 'Power1',
    *     duration: 3000,
    *     tweens: [ { x: 600 }, { y: 500 }, { x: 100 }, { y: 100 } ]
    * });
    * timeline.on('complete', listener);
    * timeline.play();
    * ```
    */
  val TIMELINE_COMPLETE: js.Any = js.native
  /**
    * The Timeline Loop Event.
    * 
    * This event is dispatched by a Tween Timeline every time it loops.
    * 
    * Listen to it from a Timeline instance using `Timeline.on('loop', listener)`, i.e.:
    * 
    * ```javascript
    * var timeline = this.tweens.timeline({
    *     targets: image,
    *     ease: 'Power1',
    *     duration: 3000,
    *     loop: 4,
    *     tweens: [ { x: 600 }, { y: 500 }, { x: 100 }, { y: 100 } ]
    * });
    * timeline.on('loop', listener);
    * timeline.play();
    * ```
    */
  val TIMELINE_LOOP: js.Any = js.native
  /**
    * The Timeline Pause Event.
    * 
    * This event is dispatched by a Tween Timeline when it is paused.
    * 
    * Listen to it from a Timeline instance using `Timeline.on('pause', listener)`, i.e.:
    * 
    * ```javascript
    * var timeline = this.tweens.timeline({
    *     targets: image,
    *     ease: 'Power1',
    *     duration: 3000,
    *     tweens: [ { x: 600 }, { y: 500 }, { x: 100 }, { y: 100 } ]
    * });
    * timeline.on('pause', listener);
    * // At some point later ...
    * timeline.pause();
    * ```
    */
  val TIMELINE_PAUSE: js.Any = js.native
  /**
    * The Timeline Resume Event.
    * 
    * This event is dispatched by a Tween Timeline when it is resumed from a paused state.
    * 
    * Listen to it from a Timeline instance using `Timeline.on('resume', listener)`, i.e.:
    * 
    * ```javascript
    * var timeline = this.tweens.timeline({
    *     targets: image,
    *     ease: 'Power1',
    *     duration: 3000,
    *     tweens: [ { x: 600 }, { y: 500 }, { x: 100 }, { y: 100 } ]
    * });
    * timeline.on('resume', listener);
    * // At some point later ...
    * timeline.resume();
    * ```
    */
  val TIMELINE_RESUME: js.Any = js.native
  /**
    * The Timeline Start Event.
    * 
    * This event is dispatched by a Tween Timeline when it starts.
    * 
    * Listen to it from a Timeline instance using `Timeline.on('start', listener)`, i.e.:
    * 
    * ```javascript
    * var timeline = this.tweens.timeline({
    *     targets: image,
    *     ease: 'Power1',
    *     duration: 3000,
    *     tweens: [ { x: 600 }, { y: 500 }, { x: 100 }, { y: 100 } ]
    * });
    * timeline.on('start', listener);
    * timeline.play();
    * ```
    */
  val TIMELINE_START: js.Any = js.native
  /**
    * The Timeline Update Event.
    * 
    * This event is dispatched by a Tween Timeline every time it updates, which can happen a lot of times per second,
    * so be careful about listening to this event unless you absolutely require it.
    * 
    * Listen to it from a Timeline instance using `Timeline.on('update', listener)`, i.e.:
    * 
    * ```javascript
    * var timeline = this.tweens.timeline({
    *     targets: image,
    *     ease: 'Power1',
    *     duration: 3000,
    *     tweens: [ { x: 600 }, { y: 500 }, { x: 100 }, { y: 100 } ]
    * });
    * timeline.on('update', listener);
    * timeline.play();
    * ```
    */
  val TIMELINE_UPDATE: js.Any = js.native
}

