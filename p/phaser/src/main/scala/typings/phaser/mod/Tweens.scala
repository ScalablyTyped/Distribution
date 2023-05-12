package typings.phaser.mod

import typings.phaser.Phaser.Types.Tweens.GetActiveCallback
import typings.phaser.Phaser.Types.Tweens.GetEndCallback
import typings.phaser.Phaser.Types.Tweens.GetStartCallback
import typings.phaser.Phaser.Types.Tweens.NumberTweenBuilderConfig
import typings.phaser.Phaser.Types.Tweens.StaggerConfig
import typings.phaser.Phaser.Types.Tweens.TweenBuilderConfig
import typings.phaser.Phaser.Types.Tweens.TweenChainBuilderConfig
import typings.phaser.Phaser.Types.Tweens.TweenConfigDefaults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tweens {
  
  /**
    * As the name implies, this is the base Tween class that both the Tween and TweenChain
    * inherit from. It contains shared properties and methods common to both types of Tween.
    * 
    * Typically you would never instantiate this class directly, although you could certainly
    * use it to create your own variation of Tweens from.
    */
  @JSImport("phaser", "Tweens.BaseTween")
  @js.native
  open class BaseTween protected ()
    extends StObject
       with typings.phaser.Phaser.Tweens.BaseTween {
    def this(parent: typings.phaser.Phaser.Tweens.TweenChain) = this()
    /**
      * 
      * @param parent A reference to the Tween Manager, or Tween Chain, that owns this Tween.
      */
    def this(parent: typings.phaser.Phaser.Tweens.TweenManager) = this()
  }
  
  /**
    * BaseTweenData is the class that the TweenData and TweenFrameData classes
    * extend from. You should not typically instantiate this class directly, but instead
    * use it to form your own tween data classes from, should you require it.
    * 
    * Prior to Phaser 3.60 the TweenData was just an object, but was refactored to a class,
    * to make it responsible for its own state and updating.
    */
  @JSImport("phaser", "Tweens.BaseTweenData")
  @js.native
  open class BaseTweenData protected ()
    extends StObject
       with typings.phaser.Phaser.Tweens.BaseTweenData {
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: Unit,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean
    ) = this()
    /**
      * 
      * @param tween The tween this TweenData instance belongs to.
      * @param targetIndex The target index within the Tween targets array.
      * @param key The property of the target to tween.
      * @param getEnd What the property will be at the END of the Tween.
      * @param getStart What the property will be at the START of the Tween.
      * @param getActive If not null, is invoked _immediately_ as soon as the TweenData is running, and is set on the target property.
      * @param ease The ease function this tween uses.
      * @param delay Function that returns the time in milliseconds before tween will start.
      * @param duration The duration of the tween in milliseconds.
      * @param yoyo Determines whether the tween should return back to its start value after hold has expired.
      * @param hold Function that returns the time in milliseconds the tween will pause before repeating or returning to its starting value if yoyo is set to true.
      * @param repeat Function that returns the number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
      * @param repeatDelay Function that returns the time in milliseconds before the repeat will start.
      * @param flipX Should toggleFlipX be called when yoyo or repeat happens?
      * @param flipY Should toggleFlipY be called when yoyo or repeat happens?
      * @param interpolation The interpolation function to be used for arrays of data. Defaults to 'null'.
      * @param interpolationData The array of interpolation data to be set. Defaults to 'null'.
      */
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: GetActiveCallback,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean
    ) = this()
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: Unit,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: js.Function
    ) = this()
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: GetActiveCallback,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: js.Function
    ) = this()
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: Unit,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: js.Function,
      interpolationData: js.Array[Double]
    ) = this()
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: Unit,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: Unit,
      interpolationData: js.Array[Double]
    ) = this()
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: GetActiveCallback,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: js.Function,
      interpolationData: js.Array[Double]
    ) = this()
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: GetActiveCallback,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: Unit,
      interpolationData: js.Array[Double]
    ) = this()
  }
  
  object Builders {
    
    @JSImport("phaser", "Tweens.Builders")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Retrieves the value of the given key from an object.
      * @param source The object to retrieve the value from.
      * @param key The key to look for in the `source` object.
      * @param defaultValue The default value to return if the `key` doesn't exist or if no `source` object is provided.
      */
    inline def GetBoolean(source: js.Object, key: String, defaultValue: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("GetBoolean")(source.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
      * This internal function is used to return the correct interpolation function for a Tween.
      * 
      * It can take a variety of input, including a string, or a custom function.
      * @param interpolation The interpolation function to find. This can be either a string, or a custom function, or null.
      */
    inline def GetInterpolationFunction(): js.Function | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("GetInterpolationFunction")().asInstanceOf[js.Function | Null]
    inline def GetInterpolationFunction(interpolation: String): js.Function | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("GetInterpolationFunction")(interpolation.asInstanceOf[js.Any]).asInstanceOf[js.Function | Null]
    inline def GetInterpolationFunction(interpolation: js.Function): js.Function | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("GetInterpolationFunction")(interpolation.asInstanceOf[js.Any]).asInstanceOf[js.Function | Null]
    
    /**
      * Internal function used by the Tween Builder to create a function that will return
      * the given value from the source.
      * @param source The source object to get the value from.
      * @param key The property to get from the source.
      * @param defaultValue A default value to return should the source not have the property set.
      */
    inline def GetNewValue(source: Any, key: String, defaultValue: Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("GetNewValue")(source.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
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
    inline def GetTargets(config: js.Object): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTargets")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
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
      * as its arguments and must return a value.
      * 
      * If both the starting and the ending values need to be controlled, an object with `getStart` and `getEnd`
      * callbacks, which will receive the same arguments, can be provided instead. If an object with a `value`
      * property is provided, the property will be used as the effective value under the same rules described here.
      * @param key The name of the property to modify.
      * @param propertyValue The ending value of the property, as described above.
      */
    inline def GetValueOp(key: String, propertyValue: Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("GetValueOp")(key.asInstanceOf[js.Any], propertyValue.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
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
    
    inline def TweenChainBuilder(parent: typings.phaser.Phaser.Tweens.TweenManager, config: js.Object): typings.phaser.Phaser.Tweens.TweenChain = (^.asInstanceOf[js.Dynamic].applyDynamic("TweenChainBuilder")(parent.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tweens.TweenChain]
    /**
      * Creates a new Tween Chain instance.
      * @param parent The owner of the new Tween.
      * @param config Configuration for the new Tween.
      */
    inline def TweenChainBuilder(parent: typings.phaser.Phaser.Tweens.TweenManager, config: TweenChainBuilderConfig): typings.phaser.Phaser.Tweens.TweenChain = (^.asInstanceOf[js.Dynamic].applyDynamic("TweenChainBuilder")(parent.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tweens.TweenChain]
  }
  
  object Events {
    
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
      * var tween = this.tweens.create({
      *     targets: image,
      *     x: 500,
      *     ease: 'Power1',
      *     duration: 3000
      * });
      * tween.on('active', listener);
      * this.tweens.existing(tween);
      * ```
      * 
      * Note that this event is usually dispatched already by the time you call `this.tweens.add()`, and is
      * meant for use with `tweens.create()` and/or `tweens.existing()`.
      */
    @JSImport("phaser", "Tweens.Events.TWEEN_ACTIVE")
    @js.native
    val TWEEN_ACTIVE: String = js.native
    
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
    @JSImport("phaser", "Tweens.Events.TWEEN_COMPLETE")
    @js.native
    val TWEEN_COMPLETE: String = js.native
    
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
    @JSImport("phaser", "Tweens.Events.TWEEN_LOOP")
    @js.native
    val TWEEN_LOOP: String = js.native
    
    /**
      * The Tween Pause Event.
      * 
      * This event is dispatched by a Tween when it is paused.
      * 
      * Listen to it from a Tween instance using `Tween.on('pause', listener)`, i.e.:
      * 
      * ```javascript
      * var tween = this.tweens.add({
      *     targets: image,
      *     ease: 'Power1',
      *     duration: 3000,
      *     x: 600
      * });
      * tween.on('pause', listener);
      * // At some point later ...
      * tween.pause();
      * ```
      */
    @JSImport("phaser", "Tweens.Events.TWEEN_PAUSE")
    @js.native
    val TWEEN_PAUSE: String = js.native
    
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
    @JSImport("phaser", "Tweens.Events.TWEEN_REPEAT")
    @js.native
    val TWEEN_REPEAT: String = js.native
    
    /**
      * The Tween Resume Event.
      * 
      * This event is dispatched by a Tween when it is resumed from a paused state.
      * 
      * Listen to it from a Tween instance using `Tween.on('resume', listener)`, i.e.:
      * 
      * ```javascript
      * var tween = this.tweens.add({
      *     targets: image,
      *     ease: 'Power1',
      *     duration: 3000,
      *     x: 600
      * });
      * tween.on('resume', listener);
      * // At some point later ...
      * tween.resume();
      * ```
      */
    @JSImport("phaser", "Tweens.Events.TWEEN_RESUME")
    @js.native
    val TWEEN_RESUME: String = js.native
    
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
    @JSImport("phaser", "Tweens.Events.TWEEN_START")
    @js.native
    val TWEEN_START: String = js.native
    
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
    @JSImport("phaser", "Tweens.Events.TWEEN_STOP")
    @js.native
    val TWEEN_STOP: String = js.native
    
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
    @JSImport("phaser", "Tweens.Events.TWEEN_UPDATE")
    @js.native
    val TWEEN_UPDATE: String = js.native
    
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
    @JSImport("phaser", "Tweens.Events.TWEEN_YOYO")
    @js.native
    val TWEEN_YOYO: String = js.native
  }
  
  /**
    * Phaser Tween States.
    */
  @JSImport("phaser", "Tweens.States")
  @js.native
  object States extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.phaser.Phaser.Tweens.States & Double] = js.native
    
    /* 9 */ val ACTIVE: typings.phaser.Phaser.Tweens.States.ACTIVE & Double = js.native
    
    /* 7 */ val COMPLETE: typings.phaser.Phaser.Tweens.States.COMPLETE & Double = js.native
    
    /* 11 */ val COMPLETE_DELAY: typings.phaser.Phaser.Tweens.States.COMPLETE_DELAY & Double = js.native
    
    /* 0 */ val CREATED: typings.phaser.Phaser.Tweens.States.CREATED & Double = js.native
    
    /* 1 */ val DELAY: typings.phaser.Phaser.Tweens.States.DELAY & Double = js.native
    
    /* 16 */ val DESTROYED: typings.phaser.Phaser.Tweens.States.DESTROYED & Double = js.native
    
    /* 15 */ val FINISHED: typings.phaser.Phaser.Tweens.States.FINISHED & Double = js.native
    
    /* 5 */ val HOLD_DELAY: typings.phaser.Phaser.Tweens.States.HOLD_DELAY & Double = js.native
    
    /* 10 */ val LOOP_DELAY: typings.phaser.Phaser.Tweens.States.LOOP_DELAY & Double = js.native
    
    /* 17 */ val MAX: typings.phaser.Phaser.Tweens.States.MAX & Double = js.native
    
    /* 8 */ val PENDING: typings.phaser.Phaser.Tweens.States.PENDING & Double = js.native
    
    /* 13 */ val PENDING_REMOVE: typings.phaser.Phaser.Tweens.States.PENDING_REMOVE & Double = js.native
    
    /* 2 */ val PENDING_RENDER: typings.phaser.Phaser.Tweens.States.PENDING_RENDER & Double = js.native
    
    /* 4 */ val PLAYING_BACKWARD: typings.phaser.Phaser.Tweens.States.PLAYING_BACKWARD & Double = js.native
    
    /* 3 */ val PLAYING_FORWARD: typings.phaser.Phaser.Tweens.States.PLAYING_FORWARD & Double = js.native
    
    /* 14 */ val REMOVED: typings.phaser.Phaser.Tweens.States.REMOVED & Double = js.native
    
    /* 6 */ val REPEAT_DELAY: typings.phaser.Phaser.Tweens.States.REPEAT_DELAY & Double = js.native
    
    /* 12 */ val START_DELAY: typings.phaser.Phaser.Tweens.States.START_DELAY & Double = js.native
  }
  
  /**
    * A Tween is able to manipulate the properties of one or more objects to any given value, based
    * on a duration and type of ease. They are rarely instantiated directly and instead should be
    * created via the TweenManager.
    * 
    * Please note that a Tween will not manipulate any property that begins with an underscore.
    */
  @JSImport("phaser", "Tweens.Tween")
  @js.native
  open class Tween protected ()
    extends StObject
       with typings.phaser.Phaser.Tweens.Tween {
    /**
      * 
      * @param parent A reference to the Tween Manager that owns this Tween.
      * @param targets An array of targets to be tweened.
      */
    def this(parent: typings.phaser.Phaser.Tweens.TweenManager, targets: js.Array[js.Object]) = this()
  }
  
  /**
    * A TweenChain is a special type of Tween that allows you to create a sequence of Tweens, chained to one-another,
    * and add them to the Tween Manager.
    * 
    * The tweens are played in order, from start to finish. You can optionally set the chain
    * to repeat as many times as you like. Once the chain has finished playing, or repeating if set,
    * all tweens in the chain will be destroyed automatically. To override this, set the 'persists'
    * argument to 'true'.
    * 
    * Playback will start immediately unless the _first_ Tween has been configured to be paused.
    * 
    * Please note that Tweens will not manipulate any target property that begins with an underscore.
    */
  @JSImport("phaser", "Tweens.TweenChain")
  @js.native
  open class TweenChain protected ()
    extends StObject
       with typings.phaser.Phaser.Tweens.TweenChain {
    def this(parent: typings.phaser.Phaser.Tweens.TweenChain) = this()
    /**
      * 
      * @param parent A reference to the Tween Manager, or TweenChain, that owns this TweenChain.
      */
    def this(parent: typings.phaser.Phaser.Tweens.TweenManager) = this()
  }
  
  /**
    * The TweenData is a class that contains a single target and property that is being tweened.
    * 
    * Tweens create TweenData instances when they are created, with one TweenData instance per
    * target, per property. A Tween can own multiple TweenData instances, but a TweenData only
    * ever belongs to a single Tween.
    * 
    * You should not typically create these yourself, but rather use the TweenBuilder,
    * or the `Tween.add` method.
    * 
    * Prior to Phaser 3.60 the TweenData was just an object, but was refactored to a class,
    * to make it responsible for its own state and updating.
    */
  @JSImport("phaser", "Tweens.TweenData")
  @js.native
  open class TweenData protected ()
    extends StObject
       with typings.phaser.Phaser.Tweens.TweenData {
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: Unit,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean
    ) = this()
    /**
      * 
      * @param tween The tween this TweenData instance belongs to.
      * @param targetIndex The target index within the Tween targets array.
      * @param key The property of the target to tween.
      * @param getEnd What the property will be at the END of the Tween.
      * @param getStart What the property will be at the START of the Tween.
      * @param getActive If not null, is invoked _immediately_ as soon as the TweenData is running, and is set on the target property.
      * @param ease The ease function this tween uses.
      * @param delay Function that returns the time in milliseconds before tween will start.
      * @param duration The duration of the tween in milliseconds.
      * @param yoyo Determines whether the tween should return back to its start value after hold has expired.
      * @param hold Function that returns the time in milliseconds the tween will pause before repeating or returning to its starting value if yoyo is set to true.
      * @param repeat Function that returns the number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
      * @param repeatDelay Function that returns the time in milliseconds before the repeat will start.
      * @param flipX Should toggleFlipX be called when yoyo or repeat happens?
      * @param flipY Should toggleFlipY be called when yoyo or repeat happens?
      * @param interpolation The interpolation function to be used for arrays of data. Defaults to 'null'.
      * @param interpolationData The array of interpolation data to be set. Defaults to 'null'.
      */
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: GetActiveCallback,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean
    ) = this()
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: Unit,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: js.Function
    ) = this()
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: GetActiveCallback,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: js.Function
    ) = this()
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: Unit,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: js.Function,
      interpolationData: js.Array[Double]
    ) = this()
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: Unit,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: Unit,
      interpolationData: js.Array[Double]
    ) = this()
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: GetActiveCallback,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: js.Function,
      interpolationData: js.Array[Double]
    ) = this()
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: GetActiveCallback,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: Unit,
      interpolationData: js.Array[Double]
    ) = this()
  }
  
  /**
    * The TweenFrameData is a class that contains a single target that will change the texture frame
    * at the conclusion of the Tween.
    * 
    * TweenFrameData instances are typically created by the TweenBuilder automatically, when it
    * detects the prescence of a 'texture' property as the key being tweened.
    * 
    * A Tween can own multiple TweenFrameData instances, but a TweenFrameData only
    * ever belongs to a single Tween.
    * 
    * You should not typically create these yourself, but rather use the TweenBuilder,
    * or the `Tween.addFrame` method.
    */
  @JSImport("phaser", "Tweens.TweenFrameData")
  @js.native
  open class TweenFrameData protected ()
    extends StObject
       with typings.phaser.Phaser.Tweens.TweenFrameData {
    /**
      * 
      * @param tween The tween this TweenData instance belongs to.
      * @param targetIndex The target index within the Tween targets array.
      * @param texture The texture key to set at the end of this tween.
      * @param frame The texture frame to set at the end of this tween.
      * @param delay Function that returns the time in milliseconds before tween will start.
      * @param duration The duration of the tween in milliseconds.
      * @param hold Function that returns the time in milliseconds the tween will pause before repeating or returning to its starting value if yoyo is set to true.
      * @param repeat Function that returns the number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
      * @param repeatDelay Function that returns the time in milliseconds before the repeat will start.
      * @param flipX Should toggleFlipX be called when yoyo or repeat happens?
      * @param flipY Should toggleFlipY be called when yoyo or repeat happens?
      */
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      texture: String,
      frame: String,
      delay: js.Function,
      duration: Double,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean
    ) = this()
    def this(
      tween: typings.phaser.Phaser.Tweens.Tween,
      targetIndex: Double,
      texture: String,
      frame: Double,
      delay: js.Function,
      duration: Double,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean
    ) = this()
  }
  
  /**
    * The Tween Manager is a default Scene Plugin which controls and updates Tweens.
    * 
    * A tween is a way to alter one or more properties of a target object over a defined period of time.
    * 
    * Tweens are created by calling the `add` method and passing in the configuration object.
    * 
    * ```js
    * const logo = this.add.image(100, 100, 'logo');
    * 
    * this.tweens.add({
    *   targets: logo,
    *   x: 600,
    *   ease: 'Power1',
    *   duration: 2000
    * });
    * ```
    * 
    * See the `TweenBuilderConfig` for all of the options you have available.
    * 
    * Playback will start immediately unless the tween has been configured to be paused.
    * 
    * Please note that a Tween will not manipulate any target property that begins with an underscore.
    * 
    * Tweens are designed to be 'fire-and-forget'. They automatically destroy themselves once playback
    * is complete, to free-up memory and resources. If you wish to keep a tween after playback, i.e. to
    * play it again at a later time, then you should set the `persist` property to `true` in the config.
    * However, doing so means it's entirely up to _you_ to destroy the tween when you're finished with it,
    * otherwise it will linger in memory forever.
    * 
    * If you wish to chain Tweens together for sequential playback, see the `TweenManager.chain` method.
    */
  @JSImport("phaser", "Tweens.TweenManager")
  @js.native
  open class TweenManager protected ()
    extends StObject
       with typings.phaser.Phaser.Tweens.TweenManager {
    /**
      * 
      * @param scene The Scene which owns this Tween Manager.
      */
    def this(scene: typings.phaser.Phaser.Scene) = this()
  }
}
