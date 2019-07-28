package typings.phaser.phaserMod

import typings.phaser.PhaserNs.TypesNs.TweensNs.NumberTweenBuilderConfig
import typings.phaser.PhaserNs.TypesNs.TweensNs.TimelineBuilderConfig
import typings.phaser.PhaserNs.TypesNs.TweensNs.TweenBuilderConfig
import typings.phaser.PhaserNs.TypesNs.TweensNs.TweenConfigDefaults
import typings.phaser.PhaserNs.TypesNs.TweensNs.TweenDataConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Tweens")
@js.native
object TweensNs extends js.Object {
  /**
    * A Timeline combines multiple Tweens into one. Its overall behavior is otherwise similar to a single Tween.
    * 
    * The Timeline updates all of its Tweens simultaneously. Its methods allow you to easily build a sequence
    * of Tweens (each one starting after the previous one) or run multiple Tweens at once during given parts of the Timeline.
    */
  @js.native
  class Timeline protected ()
    extends typings.phaser.PhaserNs.TweensNs.Timeline {
    /**
      * 
      * @param manager The Tween Manager which owns this Timeline.
      */
    def this(manager: typings.phaser.PhaserNs.TweensNs.TweenManager) = this()
  }
  
  /**
    * A Tween is able to manipulate the properties of one or more objects to any given value, based
    * on a duration and type of ease. They are rarely instantiated directly and instead should be
    * created via the TweenManager.
    */
  @js.native
  class Tween protected ()
    extends typings.phaser.PhaserNs.TweensNs.Tween {
    def this(
      parent: typings.phaser.PhaserNs.TweensNs.Timeline,
      data: js.Array[TweenDataConfig],
      targets: js.Array[_]
    ) = this()
    /**
      * 
      * @param parent A reference to the parent of this Tween. Either the Tween Manager or a Tween Timeline instance.
      * @param data An array of TweenData objects, each containing a unique property to be tweened.
      * @param targets An array of targets to be tweened.
      */
    def this(
      parent: typings.phaser.PhaserNs.TweensNs.TweenManager,
      data: js.Array[TweenDataConfig],
      targets: js.Array[_]
    ) = this()
  }
  
  /**
    * The Tween Manager is a default Scene Plugin which controls and updates Tweens and Timelines.
    */
  @js.native
  class TweenManager protected ()
    extends typings.phaser.PhaserNs.TweensNs.TweenManager {
    /**
      * 
      * @param scene The Scene which owns this Tween Manager.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
  }
  
  /**
    * Tween state.
    */
  var ACTIVE: integer = js.native
  /**
    * TweenData state.
    */
  var COMPLETE: integer = js.native
  /**
    * Tween state.
    */
  var COMPLETE_DELAY: integer = js.native
  /**
    * TweenData state.
    */
  var CREATED: integer = js.native
  /**
    * TweenData state.
    */
  var DELAY: integer = js.native
  /**
    * TweenData state.
    */
  var HOLD_DELAY: integer = js.native
  /**
    * TweenData state.
    */
  var INIT: integer = js.native
  /**
    * Tween state.
    */
  var LOOP_DELAY: integer = js.native
  /**
    * TweenData state.
    */
  var OFFSET_DELAY: integer = js.native
  /**
    * Tween state.
    */
  var PAUSED: integer = js.native
  /**
    * Tween state.
    */
  var PENDING_ADD: integer = js.native
  /**
    * Tween state.
    */
  var PENDING_REMOVE: integer = js.native
  /**
    * TweenData state.
    */
  var PENDING_RENDER: integer = js.native
  /**
    * TweenData state.
    */
  var PLAYING_BACKWARD: integer = js.native
  /**
    * TweenData state.
    */
  var PLAYING_FORWARD: integer = js.native
  /**
    * Tween state.
    */
  var REMOVED: integer = js.native
  /**
    * TweenData state.
    */
  var REPEAT_DELAY: integer = js.native
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
    key: String,
    getEnd: js.Function,
    getStart: js.Function,
    ease: js.Function,
    delay: Double,
    duration: Double,
    yoyo: Boolean,
    hold: Double,
    repeat: Double,
    repeatDelay: Double,
    flipX: Boolean,
    flipY: Boolean
  ): TweenDataConfig = js.native
  @JSName("Builders")
  @js.native
  object BuildersNs extends js.Object {
    /**
      * Retrieves the value of the given key from an object.
      * @param source The object to retrieve the value from.
      * @param key The key to look for in the `source` object.
      * @param defaultValue The default value to return if the `key` doesn't exist or if no `source` object is provided.
      */
    def GetBoolean(source: js.Object, key: String, defaultValue: js.Any): js.Any = js.native
    /**
      * [description]
      * @param ease [description]
      * @param easeParams [description]
      */
    def GetEaseFunction(ease: String, easeParams: js.Array[_]): js.Function = js.native
    def GetEaseFunction(ease: js.Function, easeParams: js.Array[_]): js.Function = js.native
    /**
      * [description]
      * @param source [description]
      * @param key [description]
      * @param defaultValue [description]
      */
    def GetNewValue(source: js.Object, key: String, defaultValue: js.Any): js.Function = js.native
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
    def GetValueOp(key: String, propertyValue: js.Any): js.Function = js.native
    def NumberTweenBuilder(
      parent: typings.phaser.PhaserNs.TweensNs.Timeline,
      config: NumberTweenBuilderConfig,
      defaults: TweenConfigDefaults
    ): typings.phaser.PhaserNs.TweensNs.Tween = js.native
    /**
      * Creates a new Number Tween.
      * @param parent The owner of the new Tween.
      * @param config Configuration for the new Tween.
      * @param defaults Tween configuration defaults.
      */
    def NumberTweenBuilder(
      parent: typings.phaser.PhaserNs.TweensNs.TweenManager,
      config: NumberTweenBuilderConfig,
      defaults: TweenConfigDefaults
    ): typings.phaser.PhaserNs.TweensNs.Tween = js.native
    /**
      * Builds a Timeline of Tweens based on a configuration object.
      * @param manager The Tween Manager to which the Timeline will belong.
      * @param config The configuration object for the Timeline.
      */
    def TimelineBuilder(manager: typings.phaser.PhaserNs.TweensNs.TweenManager, config: TimelineBuilderConfig): typings.phaser.PhaserNs.TweensNs.Timeline = js.native
    def TweenBuilder(
      parent: typings.phaser.PhaserNs.TweensNs.Timeline,
      config: js.Object,
      defaults: TweenConfigDefaults
    ): typings.phaser.PhaserNs.TweensNs.Tween = js.native
    def TweenBuilder(
      parent: typings.phaser.PhaserNs.TweensNs.Timeline,
      config: TweenBuilderConfig,
      defaults: TweenConfigDefaults
    ): typings.phaser.PhaserNs.TweensNs.Tween = js.native
    def TweenBuilder(
      parent: typings.phaser.PhaserNs.TweensNs.TweenManager,
      config: js.Object,
      defaults: TweenConfigDefaults
    ): typings.phaser.PhaserNs.TweensNs.Tween = js.native
    /**
      * Creates a new Tween.
      * @param parent The owner of the new Tween.
      * @param config Configuration for the new Tween.
      * @param defaults Tween configuration defaults.
      */
    def TweenBuilder(
      parent: typings.phaser.PhaserNs.TweensNs.TweenManager,
      config: TweenBuilderConfig,
      defaults: TweenConfigDefaults
    ): typings.phaser.PhaserNs.TweensNs.Tween = js.native
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

