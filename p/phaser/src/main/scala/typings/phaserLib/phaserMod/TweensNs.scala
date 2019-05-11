package typings
package phaserLib.phaserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Tweens")
@js.native
object TweensNs extends js.Object {
  /**
    * A Timeline combines multiple Tweens into one. Its overall behavior is otherwise similar to a single Tween.
    * 
    * The Timeline updates all of its Tweens simultaneously. Its methods allow you to easily build a sequence of Tweens (each one starting after the previous one) or run multiple Tweens at once during given parts of the Timeline.
    */
  @js.native
  class Timeline protected ()
    extends phaserLib.PhaserNs.TweensNs.Timeline {
    /**
      * 
      * @param manager The Tween Manager which owns this Timeline.
      */
    def this(manager: phaserLib.PhaserNs.TweensNs.TweenManager) = this()
  }
  
  /**
    * A Tween is able to manipulate the properties of one or more objects to any given value, based
    * on a duration and type of ease. They are rarely instantiated directly and instead should be
    * created via the TweenManager.
    */
  @js.native
  class Tween protected ()
    extends phaserLib.PhaserNs.TweensNs.Tween {
    def this(parent: phaserLib.PhaserNs.TweensNs.Timeline, data: js.Array[phaserLib.PhaserNs.TypesNs.TweensNs.TweenDataConfig], targets: js.Array[_]) = this()
    /**
      * 
      * @param parent A reference to the parent of this Tween. Either the Tween Manager or a Tween Timeline instance.
      * @param data An array of TweenData objects, each containing a unique property to be tweened.
      * @param targets An array of targets to be tweened.
      */
    def this(parent: phaserLib.PhaserNs.TweensNs.TweenManager, data: js.Array[phaserLib.PhaserNs.TypesNs.TweensNs.TweenDataConfig], targets: js.Array[_]) = this()
  }
  
  /**
    * The Tween Manager is a default Scene Plugin which controls and updates Tweens and Timelines.
    */
  @js.native
  class TweenManager protected ()
    extends phaserLib.PhaserNs.TweensNs.TweenManager {
    /**
      * 
      * @param scene The Scene which owns this Tween Manager.
      */
    def this(scene: phaserLib.PhaserNs.Scene) = this()
  }
  
  /**
    * Tween state.
    */
  var ACTIVE: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var COMPLETE: phaserLib.integer = js.native
  /**
    * Tween state.
    */
  var COMPLETE_DELAY: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var CREATED: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var DELAY: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var HOLD_DELAY: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var INIT: phaserLib.integer = js.native
  /**
    * Tween state.
    */
  var LOOP_DELAY: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var OFFSET_DELAY: phaserLib.integer = js.native
  /**
    * Tween state.
    */
  var PAUSED: phaserLib.integer = js.native
  /**
    * Tween state.
    */
  var PENDING_ADD: phaserLib.integer = js.native
  /**
    * Tween state.
    */
  var PENDING_REMOVE: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var PENDING_RENDER: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var PLAYING_BACKWARD: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var PLAYING_FORWARD: phaserLib.integer = js.native
  /**
    * Tween state.
    */
  var REMOVED: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var REPEAT_DELAY: phaserLib.integer = js.native
  /**
    * Returns a TweenDataConfig object that describes the tween data for a unique property of a unique target. A single Tween consists of multiple TweenDatas, depending on how many properties are being changed by the Tween.
    * 
    * This is an internal function used by the TweenBuilder and should not be accessed directly, instead, Tweens should be created using the GameObjectFactory or GameObjectCreator.
    * @param target The target to tween.
    * @param key The property of the target to tween.
    * @param getEnd What the property will be at the END of the Tween.
    * @param getStart What the property will be at the START of the Tween.
    * @param ease The ease function this tween uses.
    * @param delay Time in ms/frames before tween will start.
    * @param duration Duration of the tween in ms/frames.
    * @param yoyo Determines whether the tween should return back to its start value after hold has expired.
    * @param hold Time in ms/frames the tween will pause before repeating or returning to its starting value if yoyo is set to true.
    * @param repeat Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
    * @param repeatDelay Time in ms/frames before the repeat will start.
    * @param flipX Should toggleFlipX be called when yoyo or repeat happens?
    * @param flipY Should toggleFlipY be called when yoyo or repeat happens?
    */
  def TweenData(
    target: js.Object,
    key: java.lang.String,
    getEnd: js.Function,
    getStart: js.Function,
    ease: js.Function,
    delay: scala.Double,
    duration: scala.Double,
    yoyo: scala.Boolean,
    hold: scala.Double,
    repeat: scala.Double,
    repeatDelay: scala.Double,
    flipX: scala.Boolean,
    flipY: scala.Boolean
  ): phaserLib.PhaserNs.TypesNs.TweensNs.TweenDataConfig = js.native
  @JSName("Builders")
  @js.native
  object BuildersNs extends js.Object {
    /**
      * Retrieves the value of the given key from an object.
      * @param source The object to retrieve the value from.
      * @param key The key to look for in the `source` object.
      * @param defaultValue The default value to return if the `key` doesn't exist or if no `source` object is provided.
      */
    def GetBoolean(source: js.Object, key: java.lang.String, defaultValue: js.Any): js.Any = js.native
    /**
      * [description]
      * @param ease [description]
      * @param easeParams [description]
      */
    def GetEaseFunction(ease: java.lang.String, easeParams: js.Array[_]): js.Function = js.native
    def GetEaseFunction(ease: js.Function, easeParams: js.Array[_]): js.Function = js.native
    /**
      * [description]
      * @param source [description]
      * @param key [description]
      * @param defaultValue [description]
      */
    def GetNewValue(source: js.Object, key: java.lang.String, defaultValue: js.Any): js.Function = js.native
    /**
      * [description]
      * @param config The configuration object of the tween to get the target(s) from.
      */
    def GetProps(config: js.Object): js.Array[_] = js.native
    /**
      * Extracts an array of targets from a Tween configuration object.
      * 
      * The targets will be looked for in a `targets` property. If it's a function, its return value will be used as the result.
      * @param config The configuration object to use.
      */
    def GetTargets(config: js.Object): js.Array[_] = js.native
    /**
      * Returns an array of all tweens in the given config
      * @param config [description]
      */
    def GetTweens(config: js.Object): js.Array[_] = js.native
    /**
      * Returns `getStart` and `getEnd` functions for a Tween's Data based on a target property and end value.
      * 
      * If the end value is a number, it will be treated as an absolute value and the property will be tweened to it. A string can be provided to specify a relative end value which consists of an operation (`+=` to add to the current value, `-=` to subtract from the current value, `*=` to multiply the current value, or `/=` to divide the current value) followed by its operand. A function can be provided to allow greater control over the end value; it will receive the target object being tweened, the name of the property being tweened, and the current value of the property as its arguments. If both the starting and the ending values need to be controlled, an object with `getStart` and `getEnd` callbacks, which will receive the same arguments, can be provided instead. If an object with a `value` property is provided, the property will be used as the effective value under the same rules described here.
      * @param key The name of the property to modify.
      * @param propertyValue The ending value of the property, as described above.
      */
    def GetValueOp(key: java.lang.String, propertyValue: js.Any): js.Function = js.native
    def NumberTweenBuilder(
      parent: phaserLib.PhaserNs.TweensNs.Timeline,
      config: js.Object,
      defaults: phaserLib.PhaserNs.TypesNs.TweensNs.TweenConfigDefaults
    ): phaserLib.PhaserNs.TweensNs.Tween = js.native
    /**
      * [description]
      * @param parent [description]
      * @param config [description]
      * @param defaults [description]
      */
    def NumberTweenBuilder(
      parent: phaserLib.PhaserNs.TweensNs.TweenManager,
      config: js.Object,
      defaults: phaserLib.PhaserNs.TypesNs.TweensNs.TweenConfigDefaults
    ): phaserLib.PhaserNs.TweensNs.Tween = js.native
    /**
      * Builds a Timeline of Tweens based on a configuration object.
      * 
      * The configuration object (`config`) can have the following properties:
      * 
      * `tweens` - an array of tween configuration objects to create and add into the new Timeline, as described by `TweenBuilder`. If this doesn't exist or is empty, the Timeline will start off paused and none of the other configuration settings will be read. If it's a function, it will be called and its return value will be used as the array.
      * `targets` - an array (or function which returns one) of default targets to which to apply the Timeline. Each individual Tween configuration can override this value.
      * `totalDuration` - if specified, each Tween in the Timeline will get an equal portion of this duration, usually in milliseconds, by default. Each individual Tween configuration can override the Tween's duration.
      * `duration` - if `totalDuration` is not specified, the default duration, usually in milliseconds, of each Tween which will be created. Each individual Tween configuration can override the Tween's duration.
      * `delay`, `easeParams`, `ease`, `hold`, `repeat`, `repeatDelay`, `yoyo`, `flipX`, `flipY` - the default settings for each Tween which will be created, as specified by `TweenBuilder`. Each individual Tween configuration can override any of these values.
      * `completeDelay` - if specified, the time to wait, usually in milliseconds, before the Timeline completes.
      * `loop` - how many times the Timeline should loop, or -1 to loop indefinitely.
      * `loopDelay` - the time, usually in milliseconds, between each loop
      * `paused` - if `true`, the Timeline will start paused
      * `useFrames` - if `true`, all duration in the Timeline will be in frames instead of milliseconds
      * `callbackScope` - the default scope (`this` value) to use for each callback registered by the Timeline Builder. If not specified, the Timeline itself will be used.
      * `onStart` - if specified, the `onStart` callback for the Timeline, called every time it starts playing
      * `onStartScope` - the scope (`this` value) to use for the `onStart` callback. If not specified, the `callbackScope` will be used.
      * `onStartParams` - additional arguments to pass to the `onStart` callback. The Timeline will always be the first argument.
      * `onUpdate` - if specified, the `onUpdate` callback for the Timeline, called every frame it's active, regardless of its Tweens
      * `onUpdateScope` - the scope (`this` value) to use for the `onUpdate` callback. If not specified, the `callbackScope` will be used.
      * `onUpdateParams` - additional arguments to pass to the `onUpdate` callback. The Timeline will always be the first argument.
      * `onLoop` - if specified, the `onLoop` callback for the Timeline, called every time it loops
      * `onLoopScope` - the scope (`this` value) to use for the `onLoop` callback. If not specified, the `callbackScope` will be used.
      * `onLoopParams` - additional arguments to pass to the `onLoop` callback. The Timeline will always be the first argument.
      * `onYoyo` - if specified, the `onYoyo` callback for the Timeline, called every time it yoyos
      * `onYoyoScope` - the scope (`this` value) to use for the `onYoyo` callback. If not specified, the `callbackScope` will be used.
      * `onYoyoParams` - additional arguments to pass to the `onYoyo` callback. The first argument will always be `null`, while the Timeline will always be the second argument.
      * `onComplete` - if specified, the `onComplete` callback for the Timeline, called after it completes
      * `onCompleteScope` - the scope (`this` value) to use for the `onComplete` callback. If not specified, the `callbackScope` will be used.
      * `onCompleteParams` - additional arguments to pass to the `onComplete` callback. The Timeline will always be the first argument.
      * @param manager The Tween Manager to which the Timeline will belong.
      * @param config The configuration object for the Timeline, as described above.
      */
    def TimelineBuilder(manager: phaserLib.PhaserNs.TweensNs.TweenManager, config: js.Object): phaserLib.PhaserNs.TweensNs.Timeline = js.native
    def TweenBuilder(
      parent: phaserLib.PhaserNs.TweensNs.Timeline,
      config: js.Object,
      defaults: phaserLib.PhaserNs.TypesNs.TweensNs.TweenConfigDefaults
    ): phaserLib.PhaserNs.TweensNs.Tween = js.native
    /**
      * [description]
      * @param parent [description]
      * @param config [description]
      * @param defaults Tween configuration defaults.
      * `
      */
    def TweenBuilder(
      parent: phaserLib.PhaserNs.TweensNs.TweenManager,
      config: js.Object,
      defaults: phaserLib.PhaserNs.TypesNs.TweensNs.TweenConfigDefaults
    ): phaserLib.PhaserNs.TweensNs.Tween = js.native
  }
  
  @JSName("Events")
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
  
}

