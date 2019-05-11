package typings
package phaserLib.PhaserNs.TweensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Tweens.Builders")
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

