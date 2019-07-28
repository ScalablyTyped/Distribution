package typings.phaser.PhaserNs.TweensNs

import typings.phaser.PhaserNs.TypesNs.TweensNs.NumberTweenBuilderConfig
import typings.phaser.PhaserNs.TypesNs.TweensNs.TimelineBuilderConfig
import typings.phaser.PhaserNs.TypesNs.TweensNs.TweenBuilderConfig
import typings.phaser.PhaserNs.TypesNs.TweensNs.TweenConfigDefaults
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
  def NumberTweenBuilder(parent: Timeline, config: NumberTweenBuilderConfig, defaults: TweenConfigDefaults): Tween = js.native
  /**
    * Creates a new Number Tween.
    * @param parent The owner of the new Tween.
    * @param config Configuration for the new Tween.
    * @param defaults Tween configuration defaults.
    */
  def NumberTweenBuilder(parent: TweenManager, config: NumberTweenBuilderConfig, defaults: TweenConfigDefaults): Tween = js.native
  /**
    * Builds a Timeline of Tweens based on a configuration object.
    * @param manager The Tween Manager to which the Timeline will belong.
    * @param config The configuration object for the Timeline.
    */
  def TimelineBuilder(manager: TweenManager, config: TimelineBuilderConfig): Timeline = js.native
  def TweenBuilder(parent: Timeline, config: js.Object, defaults: TweenConfigDefaults): Tween = js.native
  def TweenBuilder(parent: Timeline, config: TweenBuilderConfig, defaults: TweenConfigDefaults): Tween = js.native
  def TweenBuilder(parent: TweenManager, config: js.Object, defaults: TweenConfigDefaults): Tween = js.native
  /**
    * Creates a new Tween.
    * @param parent The owner of the new Tween.
    * @param config Configuration for the new Tween.
    * @param defaults Tween configuration defaults.
    */
  def TweenBuilder(parent: TweenManager, config: TweenBuilderConfig, defaults: TweenConfigDefaults): Tween = js.native
}

