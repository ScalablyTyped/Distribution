package typings.phaser.global.Phaser

import typings.phaser.Phaser.Types.Tweens.NumberTweenBuilderConfig
import typings.phaser.Phaser.Types.Tweens.StaggerConfig
import typings.phaser.Phaser.Types.Tweens.TimelineBuilderConfig
import typings.phaser.Phaser.Types.Tweens.TweenBuilderConfig
import typings.phaser.Phaser.Types.Tweens.TweenConfigDefaults
import typings.phaser.Phaser.Types.Tweens.TweenDataConfig
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tweens {
  
  @JSGlobal("Phaser.Tweens")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Tween state.
    */
  @JSGlobal("Phaser.Tweens.ACTIVE")
  @js.native
  def ACTIVE: integer = js.native
  inline def ACTIVE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
  
  object Builders {
    
    @JSGlobal("Phaser.Tweens.Builders")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Retrieves the value of the given key from an object.
      * @param source The object to retrieve the value from.
      * @param key The key to look for in the `source` object.
      * @param defaultValue The default value to return if the `key` doesn't exist or if no `source` object is provided.
      */
    inline def GetBoolean(source: js.Object, key: String, defaultValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetBoolean")(source.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * This internal function is used to return the correct ease function for a Tween.
      * 
      * It can take a variety of input, including an EaseMap based string, or a custom function.
      * @param ease The ease to find. This can be either a string from the EaseMap, or a custom function.
      * @param easeParams An optional array of ease parameters to go with the ease.
      */
    inline def GetEaseFunction(ease: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEaseFunction")(ease.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def GetEaseFunction(ease: String, easeParams: js.Array[Double]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("GetEaseFunction")(ease.asInstanceOf[js.Any], easeParams.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def GetEaseFunction(ease: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEaseFunction")(ease.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def GetEaseFunction(ease: js.Function, easeParams: js.Array[Double]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("GetEaseFunction")(ease.asInstanceOf[js.Any], easeParams.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Internal function used by the Tween Builder to create a function that will return
      * the given value from the source.
      * @param source The source object to get the value from.
      * @param key The property to get from the source.
      * @param defaultValue A default value to return should the source not have the property set.
      */
    inline def GetNewValue(source: js.Any, key: String, defaultValue: js.Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("GetNewValue")(source.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Internal function used by the Tween Builder to return an array of properties
      * that the Tween will be operating on. It takes a tween configuration object
      * and then checks that none of the `props` entries start with an underscore, or that
      * none of the direct properties are on the Reserved list.
      * @param config The configuration object of the Tween to get the properties from.
      */
    inline def GetProps(config: TweenBuilderConfig): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetProps")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Extracts an array of targets from a Tween configuration object.
      * 
      * The targets will be looked for in a `targets` property. If it's a function, its return value will be used as the result.
      * @param config The configuration object to use.
      */
    inline def GetTargets(config: js.Object): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTargets")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    
    /**
      * Internal function used by the Timeline Builder.
      * 
      * It returns an array of all tweens in the given timeline config.
      * @param config The configuration object for the Timeline.
      */
    inline def GetTweens(config: TimelineBuilderConfig): js.Array[typings.phaser.Phaser.Tweens.Tween] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTweens")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.phaser.Phaser.Tweens.Tween]]
    
    /**
      * Returns `getActive`, `getStart` and `getEnd` functions for a TweenData based on a target property and end value.
      * 
      * `getActive` if not null, is invoked _immediately_ as soon as the TweenData is running, and is set on the target property.
      * `getEnd` is invoked once any start delays have expired and returns what the value should tween to.
      * `getStart` is invoked when the tween reaches the end and needs to either repeat or yoyo, it returns the value to go back to.
      * 
      * If the end value is a number, it will be treated as an absolute value and the property will be tweened to it.
      * A string can be provided to specify a relative end value which consists of an operation
      * (`+=` to add to the current value, `-=` to subtract from the current value, `*=` to multiply the current
      * value, or `/=` to divide the current value) followed by its operand.
      * 
      * A function can be provided to allow greater control over the end value; it will receive the target
      * object being tweened, the name of the property being tweened, and the current value of the property
      * as its arguments.
      * 
      * If both the starting and the ending values need to be controlled, an object with `getStart` and `getEnd`
      * callbacks, which will receive the same arguments, can be provided instead. If an object with a `value`
      * property is provided, the property will be used as the effective value under the same rules described here.
      * @param key The name of the property to modify.
      * @param propertyValue The ending value of the property, as described above.
      */
    inline def GetValueOp(key: String, propertyValue: js.Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("GetValueOp")(key.asInstanceOf[js.Any], propertyValue.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    inline def NumberTweenBuilder(
      parent: typings.phaser.Phaser.Tweens.Timeline,
      config: NumberTweenBuilderConfig,
      defaults: TweenConfigDefaults
    ): typings.phaser.Phaser.Tweens.Tween = (^.asInstanceOf[js.Dynamic].applyDynamic("NumberTweenBuilder")(parent.asInstanceOf[js.Any], config.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tweens.Tween]
    /**
      * Creates a new Number Tween.
      * @param parent The owner of the new Tween.
      * @param config Configuration for the new Tween.
      * @param defaults Tween configuration defaults.
      */
    inline def NumberTweenBuilder(
      parent: typings.phaser.Phaser.Tweens.TweenManager,
      config: NumberTweenBuilderConfig,
      defaults: TweenConfigDefaults
    ): typings.phaser.Phaser.Tweens.Tween = (^.asInstanceOf[js.Dynamic].applyDynamic("NumberTweenBuilder")(parent.asInstanceOf[js.Any], config.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tweens.Tween]
    
    inline def StaggerBuilder(value: js.Array[Double]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("StaggerBuilder")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def StaggerBuilder(value: js.Array[Double], config: StaggerConfig): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("StaggerBuilder")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    /**
      * Creates a Stagger function to be used by a Tween property.
      * 
      * The stagger function will allow you to stagger changes to the value of the property across all targets of the tween.
      * 
      * This is only worth using if the tween has multiple targets.
      * 
      * The following will stagger the delay by 100ms across all targets of the tween, causing them to scale down to 0.2
      * over the duration specified:
      * 
      * ```javascript
      * this.tweens.add({
      *     targets: [ ... ],
      *     scale: 0.2,
      *     ease: 'linear',
      *     duration: 1000,
      *     delay: this.tweens.stagger(100)
      * });
      * ```
      * 
      * The following will stagger the delay by 500ms across all targets of the tween using a 10 x 6 grid, staggering
      * from the center out, using a cubic ease.
      * 
      * ```javascript
      * this.tweens.add({
      *     targets: [ ... ],
      *     scale: 0.2,
      *     ease: 'linear',
      *     duration: 1000,
      *     delay: this.tweens.stagger(500, { grid: [ 10, 6 ], from: 'center', ease: 'cubic.out' })
      * });
      * ```
      * @param value The amount to stagger by, or an array containing two elements representing the min and max values to stagger between.
      * @param config A Stagger Configuration object.
      */
    inline def StaggerBuilder(value: Double): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("StaggerBuilder")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def StaggerBuilder(value: Double, config: StaggerConfig): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("StaggerBuilder")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Builds a Timeline of Tweens based on a configuration object.
      * @param manager The Tween Manager to which the Timeline will belong.
      * @param config The configuration object for the Timeline.
      */
    inline def TimelineBuilder(manager: typings.phaser.Phaser.Tweens.TweenManager, config: TimelineBuilderConfig): typings.phaser.Phaser.Tweens.Timeline = (^.asInstanceOf[js.Dynamic].applyDynamic("TimelineBuilder")(manager.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tweens.Timeline]
    
    inline def TweenBuilder(parent: typings.phaser.Phaser.Tweens.Timeline, config: js.Object, defaults: TweenConfigDefaults): typings.phaser.Phaser.Tweens.Tween = (^.asInstanceOf[js.Dynamic].applyDynamic("TweenBuilder")(parent.asInstanceOf[js.Any], config.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tweens.Tween]
    inline def TweenBuilder(
      parent: typings.phaser.Phaser.Tweens.Timeline,
      config: TweenBuilderConfig,
      defaults: TweenConfigDefaults
    ): typings.phaser.Phaser.Tweens.Tween = (^.asInstanceOf[js.Dynamic].applyDynamic("TweenBuilder")(parent.asInstanceOf[js.Any], config.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tweens.Tween]
    inline def TweenBuilder(
      parent: typings.phaser.Phaser.Tweens.TweenManager,
      config: js.Object,
      defaults: TweenConfigDefaults
    ): typings.phaser.Phaser.Tweens.Tween = (^.asInstanceOf[js.Dynamic].applyDynamic("TweenBuilder")(parent.asInstanceOf[js.Any], config.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tweens.Tween]
    /**
      * Creates a new Tween.
      * @param parent The owner of the new Tween.
      * @param config Configuration for the new Tween.
      * @param defaults Tween configuration defaults.
      */
    inline def TweenBuilder(
      parent: typings.phaser.Phaser.Tweens.TweenManager,
      config: TweenBuilderConfig,
      defaults: TweenConfigDefaults
    ): typings.phaser.Phaser.Tweens.Tween = (^.asInstanceOf[js.Dynamic].applyDynamic("TweenBuilder")(parent.asInstanceOf[js.Any], config.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tweens.Tween]
  }
  
  /**
    * TweenData state.
    */
  @JSGlobal("Phaser.Tweens.COMPLETE")
  @js.native
  def COMPLETE: integer = js.native
  inline def COMPLETE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPLETE")(x.asInstanceOf[js.Any])
  
  /**
    * Tween state.
    */
  @JSGlobal("Phaser.Tweens.COMPLETE_DELAY")
  @js.native
  def COMPLETE_DELAY: integer = js.native
  inline def COMPLETE_DELAY_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPLETE_DELAY")(x.asInstanceOf[js.Any])
  
  /**
    * TweenData state.
    */
  @JSGlobal("Phaser.Tweens.CREATED")
  @js.native
  def CREATED: integer = js.native
  inline def CREATED_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATED")(x.asInstanceOf[js.Any])
  
  /**
    * TweenData state.
    */
  @JSGlobal("Phaser.Tweens.DELAY")
  @js.native
  def DELAY: integer = js.native
  inline def DELAY_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELAY")(x.asInstanceOf[js.Any])
  
  object Events {
    
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
    @JSGlobal("Phaser.Tweens.Events.TIMELINE_COMPLETE")
    @js.native
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
    @JSGlobal("Phaser.Tweens.Events.TIMELINE_LOOP")
    @js.native
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
    @JSGlobal("Phaser.Tweens.Events.TIMELINE_PAUSE")
    @js.native
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
    @JSGlobal("Phaser.Tweens.Events.TIMELINE_RESUME")
    @js.native
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
    @JSGlobal("Phaser.Tweens.Events.TIMELINE_START")
    @js.native
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
    @JSGlobal("Phaser.Tweens.Events.TIMELINE_UPDATE")
    @js.native
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
    @JSGlobal("Phaser.Tweens.Events.TWEEN_ACTIVE")
    @js.native
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
    @JSGlobal("Phaser.Tweens.Events.TWEEN_COMPLETE")
    @js.native
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
    @JSGlobal("Phaser.Tweens.Events.TWEEN_LOOP")
    @js.native
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
    @JSGlobal("Phaser.Tweens.Events.TWEEN_REPEAT")
    @js.native
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
    @JSGlobal("Phaser.Tweens.Events.TWEEN_START")
    @js.native
    val TWEEN_START: js.Any = js.native
    
    /**
      * The Tween Stop Event.
      * 
      * This event is dispatched by a Tween when it is stopped.
      * 
      * Listen to it from a Tween instance using `Tween.on('stop', listener)`, i.e.:
      * 
      * ```javascript
      * var tween = this.tweens.add({
      *     targets: image,
      *     x: 500,
      *     ease: 'Power1',
      *     duration: 3000
      * });
      * tween.on('stop', listener);
      * ```
      */
    @JSGlobal("Phaser.Tweens.Events.TWEEN_STOP")
    @js.native
    val TWEEN_STOP: js.Any = js.native
    
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
    @JSGlobal("Phaser.Tweens.Events.TWEEN_UPDATE")
    @js.native
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
    @JSGlobal("Phaser.Tweens.Events.TWEEN_YOYO")
    @js.native
    val TWEEN_YOYO: js.Any = js.native
  }
  
  /**
    * TweenData state.
    */
  @JSGlobal("Phaser.Tweens.HOLD_DELAY")
  @js.native
  def HOLD_DELAY: integer = js.native
  inline def HOLD_DELAY_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOLD_DELAY")(x.asInstanceOf[js.Any])
  
  /**
    * TweenData state.
    */
  @JSGlobal("Phaser.Tweens.INIT")
  @js.native
  def INIT: integer = js.native
  inline def INIT_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INIT")(x.asInstanceOf[js.Any])
  
  /**
    * Tween state.
    */
  @JSGlobal("Phaser.Tweens.LOOP_DELAY")
  @js.native
  def LOOP_DELAY: integer = js.native
  inline def LOOP_DELAY_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOOP_DELAY")(x.asInstanceOf[js.Any])
  
  /**
    * TweenData state.
    */
  @JSGlobal("Phaser.Tweens.OFFSET_DELAY")
  @js.native
  def OFFSET_DELAY: integer = js.native
  inline def OFFSET_DELAY_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFSET_DELAY")(x.asInstanceOf[js.Any])
  
  /**
    * Tween state.
    */
  @JSGlobal("Phaser.Tweens.PAUSED")
  @js.native
  def PAUSED: integer = js.native
  inline def PAUSED_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAUSED")(x.asInstanceOf[js.Any])
  
  /**
    * Tween state.
    */
  @JSGlobal("Phaser.Tweens.PENDING_ADD")
  @js.native
  def PENDING_ADD: integer = js.native
  inline def PENDING_ADD_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING_ADD")(x.asInstanceOf[js.Any])
  
  /**
    * Tween state.
    */
  @JSGlobal("Phaser.Tweens.PENDING_REMOVE")
  @js.native
  def PENDING_REMOVE: integer = js.native
  inline def PENDING_REMOVE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING_REMOVE")(x.asInstanceOf[js.Any])
  
  /**
    * TweenData state.
    */
  @JSGlobal("Phaser.Tweens.PENDING_RENDER")
  @js.native
  def PENDING_RENDER: integer = js.native
  inline def PENDING_RENDER_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING_RENDER")(x.asInstanceOf[js.Any])
  
  /**
    * TweenData state.
    */
  @JSGlobal("Phaser.Tweens.PLAYING_BACKWARD")
  @js.native
  def PLAYING_BACKWARD: integer = js.native
  inline def PLAYING_BACKWARD_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAYING_BACKWARD")(x.asInstanceOf[js.Any])
  
  /**
    * TweenData state.
    */
  @JSGlobal("Phaser.Tweens.PLAYING_FORWARD")
  @js.native
  def PLAYING_FORWARD: integer = js.native
  inline def PLAYING_FORWARD_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAYING_FORWARD")(x.asInstanceOf[js.Any])
  
  /**
    * Tween state.
    */
  @JSGlobal("Phaser.Tweens.REMOVED")
  @js.native
  def REMOVED: integer = js.native
  inline def REMOVED_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVED")(x.asInstanceOf[js.Any])
  
  /**
    * TweenData state.
    */
  @JSGlobal("Phaser.Tweens.REPEAT_DELAY")
  @js.native
  def REPEAT_DELAY: integer = js.native
  inline def REPEAT_DELAY_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REPEAT_DELAY")(x.asInstanceOf[js.Any])
  
  /**
    * A Timeline combines multiple Tweens into one. Its overall behavior is otherwise similar to a single Tween.
    * 
    * The Timeline updates all of its Tweens simultaneously. Its methods allow you to easily build a sequence
    * of Tweens (each one starting after the previous one) or run multiple Tweens at once during given parts of the Timeline.
    */
  @JSGlobal("Phaser.Tweens.Timeline")
  @js.native
  class Timeline protected ()
    extends StObject
       with typings.phaser.Phaser.Tweens.Timeline {
    /**
      * 
      * @param manager The Tween Manager which owns this Timeline.
      */
    def this(manager: typings.phaser.Phaser.Tweens.TweenManager) = this()
  }
  
  /**
    * A Tween is able to manipulate the properties of one or more objects to any given value, based
    * on a duration and type of ease. They are rarely instantiated directly and instead should be
    * created via the TweenManager.
    */
  @JSGlobal("Phaser.Tweens.Tween")
  @js.native
  class Tween protected ()
    extends StObject
       with typings.phaser.Phaser.Tweens.Tween {
    def this(
      parent: typings.phaser.Phaser.Tweens.Timeline,
      data: js.Array[TweenDataConfig],
      targets: js.Array[js.Any]
    ) = this()
    /**
      * 
      * @param parent A reference to the parent of this Tween. Either the Tween Manager or a Tween Timeline instance.
      * @param data An array of TweenData objects, each containing a unique property to be tweened.
      * @param targets An array of targets to be tweened.
      */
    def this(
      parent: typings.phaser.Phaser.Tweens.TweenManager,
      data: js.Array[TweenDataConfig],
      targets: js.Array[js.Any]
    ) = this()
  }
  
  /**
    * Returns a TweenDataConfig object that describes the tween data for a unique property of a unique target.
    * A single Tween consists of multiple TweenDatas, depending on how many properties are being changed by the Tween.
    * 
    * This is an internal function used by the TweenBuilder and should not be accessed directly, instead,
    * Tweens should be created using the GameObjectFactory or GameObjectCreator.
    * @param target The target to tween.
    * @param index The target index within the Tween targets array.
    * @param key The property of the target to tween.
    * @param getEnd What the property will be at the END of the Tween.
    * @param getStart What the property will be at the START of the Tween.
    * @param getActive If not null, is invoked _immediately_ as soon as the TweenData is running, and is set on the target property.
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
  inline def TweenData(
    target: js.Any,
    index: integer,
    key: String,
    getEnd: js.Function,
    getStart: js.Function,
    getActive: js.Function,
    ease: js.Function,
    delay: Double,
    duration: Double,
    yoyo: Boolean,
    hold: Double,
    repeat: Double,
    repeatDelay: Double,
    flipX: Boolean,
    flipY: Boolean
  ): TweenDataConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("TweenData")(target.asInstanceOf[js.Any], index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], getEnd.asInstanceOf[js.Any], getStart.asInstanceOf[js.Any], getActive.asInstanceOf[js.Any], ease.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], yoyo.asInstanceOf[js.Any], hold.asInstanceOf[js.Any], repeat.asInstanceOf[js.Any], repeatDelay.asInstanceOf[js.Any], flipX.asInstanceOf[js.Any], flipY.asInstanceOf[js.Any])).asInstanceOf[TweenDataConfig]
  
  /**
    * The Tween Manager is a default Scene Plugin which controls and updates Tweens and Timelines.
    */
  @JSGlobal("Phaser.Tweens.TweenManager")
  @js.native
  class TweenManager protected ()
    extends StObject
       with typings.phaser.Phaser.Tweens.TweenManager {
    /**
      * 
      * @param scene The Scene which owns this Tween Manager.
      */
    def this(scene: typings.phaser.Phaser.Scene) = this()
  }
}
