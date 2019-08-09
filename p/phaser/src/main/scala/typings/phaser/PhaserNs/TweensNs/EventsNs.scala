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
  /**
    * The Tween Active Event.
    * 
    * This event is dispatched by a Tween when it becomes active within the Tween Manager.
    * 
    * An 'active' Tween is one that is now progressing, although it may not yet be updating
    * any target properties, due to settings such as `delay`. If you need an event for when
    * the Tween starts actually updating its first property, see `TWEEN_START`.
    * 
    * Listen to it from a Tween instance using `Tween.on('active', listener)`, i.e.:
    * 
    * ```javascript
    * var tween = this.tweens.add({
    *     targets: image,
    *     x: 500,
    *     ease: 'Power1',
    *     duration: 3000
    * });
    * tween.on('active', listener);
    * ```
    */
  val TWEEN_ACTIVE: js.Any = js.native
  /**
    * The Tween Complete Event.
    * 
    * This event is dispatched by a Tween when it completes playback entirely, factoring in repeats and loops.
    * 
    * If the Tween has been set to loop or repeat infinitely, this event will not be dispatched
    * unless the `Tween.stop` method is called.
    * 
    * If a Tween has a `completeDelay` set, this event will fire after that delay expires.
    * 
    * Listen to it from a Tween instance using `Tween.on('complete', listener)`, i.e.:
    * 
    * ```javascript
    * var tween = this.tweens.add({
    *     targets: image,
    *     x: 500,
    *     ease: 'Power1',
    *     duration: 3000
    * });
    * tween.on('complete', listener);
    * ```
    */
  val TWEEN_COMPLETE: js.Any = js.native
  /**
    * The Tween Loop Event.
    * 
    * This event is dispatched by a Tween when it loops.
    * 
    * This event will only be dispatched if the Tween has a loop count set.
    * 
    * If a Tween has a `loopDelay` set, this event will fire after that delay expires.
    * 
    * The difference between `loop` and `repeat` is that `repeat` is a property setting,
    * where-as `loop` applies to the entire Tween.
    * 
    * Listen to it from a Tween instance using `Tween.on('loop', listener)`, i.e.:
    * 
    * ```javascript
    * var tween = this.tweens.add({
    *     targets: image,
    *     x: 500,
    *     ease: 'Power1',
    *     duration: 3000,
    *     loop: 6
    * });
    * tween.on('loop', listener);
    * ```
    */
  val TWEEN_LOOP: js.Any = js.native
  /**
    * The Tween Repeat Event.
    * 
    * This event is dispatched by a Tween when one of the properties it is tweening repeats.
    * 
    * This event will only be dispatched if the Tween has a property with a repeat count set.
    * 
    * If a Tween has a `repeatDelay` set, this event will fire after that delay expires.
    * 
    * The difference between `loop` and `repeat` is that `repeat` is a property setting,
    * where-as `loop` applies to the entire Tween.
    * 
    * Listen to it from a Tween instance using `Tween.on('repeat', listener)`, i.e.:
    * 
    * ```javascript
    * var tween = this.tweens.add({
    *     targets: image,
    *     x: 500,
    *     ease: 'Power1',
    *     duration: 3000,
    *     repeat: 4
    * });
    * tween.on('repeat', listener);
    * ```
    */
  val TWEEN_REPEAT: js.Any = js.native
  /**
    * The Tween Start Event.
    * 
    * This event is dispatched by a Tween when it starts tweening its first property.
    * 
    * A Tween will only emit this event once, as it can only start once.
    * 
    * If a Tween has a `delay` set, this event will fire after that delay expires.
    * 
    * Listen to it from a Tween instance using `Tween.on('start', listener)`, i.e.:
    * 
    * ```javascript
    * var tween = this.tweens.add({
    *     targets: image,
    *     x: 500,
    *     ease: 'Power1',
    *     duration: 3000
    * });
    * tween.on('start', listener);
    * ```
    */
  val TWEEN_START: js.Any = js.native
  /**
    * The Tween Update Event.
    * 
    * This event is dispatched by a Tween every time it updates _any_ of the properties it is tweening.
    * 
    * A Tween that is changing 3 properties of a target will emit this event 3 times per change, once per property.
    * 
    * **Note:** This is a very high frequency event and may be dispatched multiple times, every single frame.
    * 
    * Listen to it from a Tween instance using `Tween.on('update', listener)`, i.e.:
    * 
    * ```javascript
    * var tween = this.tweens.add({
    *     targets: image,
    *     x: 500,
    *     ease: 'Power1',
    *     duration: 3000,
    * });
    * tween.on('update', listener);
    * ```
    */
  val TWEEN_UPDATE: js.Any = js.native
  /**
    * The Tween Yoyo Event.
    * 
    * This event is dispatched by a Tween whenever a property it is tweening yoyos.
    * 
    * This event will only be dispatched if the Tween has a property with `yoyo` set.
    * 
    * If the Tween has a `hold` value, this event is dispatched when the hold expires.
    * 
    * This event is dispatched for every property, and for every target, that yoyos.
    * For example, if a Tween was updating 2 properties and had 10 targets, this event
    * would be dispatched 20 times (twice per target). So be careful how you use it!
    * 
    * Listen to it from a Tween instance using `Tween.on('yoyo', listener)`, i.e.:
    * 
    * ```javascript
    * var tween = this.tweens.add({
    *     targets: image,
    *     x: 500,
    *     ease: 'Power1',
    *     duration: 3000,
    *     yoyo: true
    * });
    * tween.on('yoyo', listener);
    * ```
    */
  val TWEEN_YOYO: js.Any = js.native
}

