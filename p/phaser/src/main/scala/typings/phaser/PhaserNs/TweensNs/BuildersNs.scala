package typings.phaser.PhaserNs.TweensNs

import typings.phaser.PhaserNs.TypesNs.TweensNs.NumberTweenBuilderConfig
import typings.phaser.PhaserNs.TypesNs.TweensNs.StaggerConfig
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
    * This internal function is used to return the correct ease function for a Tween.
    * 
    * It can take a variety of input, including an EaseMap based string, or a custom function.
    * @param ease The ease to find. This can be either a string from the EaseMap, or a custom function.
    * @param easeParams An optional array of ease parameters to go with the ease.
    */
  def GetEaseFunction(ease: String): js.Function = js.native
  def GetEaseFunction(ease: String, easeParams: js.Array[Double]): js.Function = js.native
  def GetEaseFunction(ease: js.Function): js.Function = js.native
  def GetEaseFunction(ease: js.Function, easeParams: js.Array[Double]): js.Function = js.native
  /**
    * Internal function used by the Tween Builder to create a function that will return
    * the given value from the source.
    * @param source The source object to get the value from.
    * @param key The property to get from the source.
    * @param defaultValue A default value to return should the source not have the property set.
    */
  def GetNewValue(source: js.Any, key: String, defaultValue: js.Any): js.Function = js.native
  /**
    * Internal function used by the Tween Builder to return an array of properties
    * that the Tween will be operating on. It takes a tween configuration object
    * and then checks that none of the `props` entries start with an underscore, or that
    * none of the direct properties are on the Reserved list.
    * @param config The configuration object of the Tween to get the properties from.
    */
  def GetProps(config: TweenBuilderConfig): js.Array[String] = js.native
  /**
    * Extracts an array of targets from a Tween configuration object.
    * 
    * The targets will be looked for in a `targets` property. If it's a function, its return value will be used as the result.
    * @param config The configuration object to use.
    */
  def GetTargets(config: js.Object): js.Array[_] = js.native
  /**
    * Internal function used by the Timeline Builder.
    * 
    * It returns an array of all tweens in the given timeline config.
    * @param config The configuration object for the Timeline.
    */
  def GetTweens(config: TimelineBuilderConfig): js.Array[Tween] = js.native
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
  def GetValueOp(key: String, propertyValue: js.Any): js.Function = js.native
  def NumberTweenBuilder(parent: Timeline, config: NumberTweenBuilderConfig, defaults: TweenConfigDefaults): Tween = js.native
  /**
    * Creates a new Number Tween.
    * @param parent The owner of the new Tween.
    * @param config Configuration for the new Tween.
    * @param defaults Tween configuration defaults.
    */
  def NumberTweenBuilder(parent: TweenManager, config: NumberTweenBuilderConfig, defaults: TweenConfigDefaults): Tween = js.native
  def StaggerBuilder(value: js.Array[Double]): js.Function = js.native
  def StaggerBuilder(value: js.Array[Double], config: StaggerConfig): js.Function = js.native
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
  def StaggerBuilder(value: Double): js.Function = js.native
  def StaggerBuilder(value: Double, config: StaggerConfig): js.Function = js.native
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

