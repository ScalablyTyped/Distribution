package typings.phaser.Phaser.Structs

import typings.phaser.Phaser.Math.Vector2
import typings.phaser.integer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Size component allows you to set `width` and `height` properties and define the relationship between them.
  * 
  * The component can automatically maintain the aspect ratios between the two values, and clamp them
  * to a defined min-max range. You can also control the dominant axis. When dimensions are given to the Size component
  * that would cause it to exceed its min-max range, the dimensions are adjusted based on the dominant axis.
  */
@js.native
trait Size extends js.Object {
  /**
    * The aspect mode this Size component will use when calculating its dimensions.
    * This property is read-only. To change it use the `setAspectMode` method.
    */
  val aspectMode: integer = js.native
  /**
    * The proportional relationship between the width and height.
    * 
    * This property is read-only and is updated automatically when either the `width` or `height` properties are changed,
    * depending on the aspect mode.
    */
  val aspectRatio: Double = js.native
  /**
    * The height of this Size component.
    * 
    * This value is clamped to the range specified by `minHeight` and `maxHeight`, if enabled.
    * 
    * A height can never be less than zero.
    * 
    * Changing this value will automatically update the `width` if the aspect ratio lock is enabled.
    * You can also use the `setHeight` and `getHeight` methods.
    */
  var height: Double = js.native
  /**
    * The maximum allowed height.
    * This value is read-only. To change it see the `setMax` method.
    */
  val maxHeight: Double = js.native
  /**
    * The maximum allowed width.
    * This value is read-only. To change it see the `setMax` method.
    */
  val maxWidth: Double = js.native
  /**
    * The minimum allowed height.
    * Cannot be less than zero.
    * This value is read-only. To change it see the `setMin` method.
    */
  val minHeight: Double = js.native
  /**
    * The minimum allowed width.
    * Cannot be less than zero.
    * This value is read-only. To change it see the `setMin` method.
    */
  val minWidth: Double = js.native
  /**
    * A Vector2 containing the horizontal and vertical snap values, which the width and height are snapped to during resizing.
    * 
    * By default this is disabled.
    * 
    * This property is read-only. To change it see the `setSnap` method.
    */
  val snapTo: Vector2 = js.native
  /**
    * The width of this Size component.
    * 
    * This value is clamped to the range specified by `minWidth` and `maxWidth`, if enabled.
    * 
    * A width can never be less than zero.
    * 
    * Changing this value will automatically update the `height` if the aspect ratio lock is enabled.
    * You can also use the `setWidth` and `getWidth` methods.
    */
  var width: Double = js.native
  /**
    * The current `width` and `height` are adjusted to fit inside the given dimensions, while keeping the aspect ratio.
    * 
    * If `fit` is true there may be some space inside the target area which is not covered if its aspect ratio differs.
    * If `fit` is false the size may extend further out than the target area if the aspect ratios differ.
    * 
    * If this Size component has a parent set, then the width and height passed to this method will be clamped so
    * it cannot exceed that of the parent.
    * @param width The new width of the Size component. Default 0.
    * @param height The new height of the Size component. If not given, it will use the width value.
    * @param fit Perform a `fit` (true) constraint, or an `envelop` (false) constraint. Default true.
    */
  def constrain(): this.type = js.native
  def constrain(width: js.UndefOr[scala.Nothing], height: js.UndefOr[scala.Nothing], fit: Boolean): this.type = js.native
  def constrain(width: js.UndefOr[scala.Nothing], height: Double): this.type = js.native
  def constrain(width: js.UndefOr[scala.Nothing], height: Double, fit: Boolean): this.type = js.native
  def constrain(width: Double): this.type = js.native
  def constrain(width: Double, height: js.UndefOr[scala.Nothing], fit: Boolean): this.type = js.native
  def constrain(width: Double, height: Double): this.type = js.native
  def constrain(width: Double, height: Double, fit: Boolean): this.type = js.native
  /**
    * Copies the aspect mode, aspect ratio, width and height from this Size component
    * to the given Size component. Note that the parent, if set, is not copied across.
    * @param destination The Size component to copy the values to.
    */
  def copy(destination: Size): Size = js.native
  /**
    * Destroys this Size component.
    * 
    * This clears the local properties and any parent object, if set.
    * 
    * A destroyed Size component cannot be re-used.
    */
  def destroy(): Unit = js.native
  /**
    * The current `width` and `height` are adjusted so that they fully envelope the given dimensions, while keeping the aspect ratio.
    * 
    * The size may extend further out than the target area if the aspect ratios differ.
    * 
    * If this Size component has a parent set, then the values are clamped so that it never exceeds the parent
    * on the longest axis.
    * @param width The new width of the Size component. Default 0.
    * @param height The new height of the Size component. If not given, it will use the width value.
    */
  def envelop(): this.type = js.native
  def envelop(width: js.UndefOr[scala.Nothing], height: Double): this.type = js.native
  def envelop(width: Double): this.type = js.native
  def envelop(width: Double, height: Double): this.type = js.native
  /**
    * The current `width` and `height` are adjusted to fit inside the given dimensions, while keeping the aspect ratio.
    * 
    * There may be some space inside the target area which is not covered if its aspect ratio differs.
    * 
    * If this Size component has a parent set, then the width and height passed to this method will be clamped so
    * it cannot exceed that of the parent.
    * @param width The new width of the Size component. Default 0.
    * @param height The new height of the Size component. If not given, it will use the width value.
    */
  def fitTo(): this.type = js.native
  def fitTo(width: js.UndefOr[scala.Nothing], height: Double): this.type = js.native
  def fitTo(width: Double): this.type = js.native
  def fitTo(width: Double, height: Double): this.type = js.native
  /**
    * Takes a new height and passes it through the min/max clamp and then checks it doesn't exceed the parent height.
    * @param value The value to clamp and check.
    * @param checkParent Check the given value against the parent, if set. Default true.
    */
  def getNewHeight(value: Double): Double = js.native
  def getNewHeight(value: Double, checkParent: Boolean): Double = js.native
  /**
    * Takes a new width and passes it through the min/max clamp and then checks it doesn't exceed the parent width.
    * @param value The value to clamp and check.
    * @param checkParent Check the given value against the parent, if set. Default true.
    */
  def getNewWidth(value: Double): Double = js.native
  def getNewWidth(value: Double, checkParent: Boolean): Double = js.native
  /**
    * Sets a new width and height for this Size component and updates the aspect ratio based on them.
    * 
    * It _doesn't_ change the `aspectMode` and still factors in size limits such as the min max and parent bounds.
    * @param width The new width of the Size component.
    * @param height The new height of the Size component. If not given, it will use the `width`. Default width.
    */
  def resize(width: Double): this.type = js.native
  def resize(width: Double, height: Double): this.type = js.native
  /**
    * Sets the aspect mode of this Size component.
    * 
    * The aspect mode controls what happens when you modify the `width` or `height` properties, or call `setSize`.
    * 
    * It can be a number from 0 to 4, or a Size constant:
    * 
    * 0. NONE = Do not make the size fit the aspect ratio. Change the ratio when the size changes.
    * 1. WIDTH_CONTROLS_HEIGHT = The height is automatically adjusted based on the width.
    * 2. HEIGHT_CONTROLS_WIDTH = The width is automatically adjusted based on the height.
    * 3. FIT = The width and height are automatically adjusted to fit inside the given target area, while keeping the aspect ratio. Depending on the aspect ratio there may be some space inside the area which is not covered.
    * 4. ENVELOP = The width and height are automatically adjusted to make the size cover the entire target area while keeping the aspect ratio. This may extend further out than the target size.
    * 
    * Calling this method automatically recalculates the `width` and the `height`, if required.
    * @param value The aspect mode value. Default 0.
    */
  def setAspectMode(): this.type = js.native
  def setAspectMode(value: integer): this.type = js.native
  /**
    * Sets a new aspect ratio, overriding what was there previously.
    * 
    * It then calls `setSize` immediately using the current dimensions.
    * @param ratio The new aspect ratio.
    */
  def setAspectRatio(ratio: Double): this.type = js.native
  /**
    * Sets the values of this Size component to the `element.style.width` and `height`
    * properties of the given DOM Element. The properties are set as `px` values.
    * @param element The DOM Element to set the CSS style on.
    */
  def setCSS(element: HTMLElement): Unit = js.native
  /**
    * Sets the height of this Size component.
    * 
    * Depending on the aspect mode, changing the height may also update the width and aspect ratio.
    * @param height The new height of the Size component.
    */
  def setHeight(height: Double): this.type = js.native
  /**
    * Set the maximum width and height values this Size component will allow.
    * 
    * Setting this will automatically adjust both the `width` and `height` properties to ensure they are within range.
    * 
    * Note that based on the aspect mode, and if this Size component has a parent set or not, the maximums set here
    * _can_ be exceed in some situations.
    * @param width The maximum allowed width of the Size component. Default Number.MAX_VALUE.
    * @param height The maximum allowed height of the Size component. If not given, it will use the `width`. Default width.
    */
  def setMax(): this.type = js.native
  def setMax(width: js.UndefOr[scala.Nothing], height: Double): this.type = js.native
  def setMax(width: Double): this.type = js.native
  def setMax(width: Double, height: Double): this.type = js.native
  /**
    * Set the minimum width and height values this Size component will allow.
    * 
    * The minimum values can never be below zero, or greater than the maximum values.
    * 
    * Setting this will automatically adjust both the `width` and `height` properties to ensure they are within range.
    * 
    * Note that based on the aspect mode, and if this Size component has a parent set or not, the minimums set here
    * _can_ be exceed in some situations.
    * @param width The minimum allowed width of the Size component. Default 0.
    * @param height The minimum allowed height of the Size component. If not given, it will use the `width`. Default width.
    */
  def setMin(): this.type = js.native
  def setMin(width: js.UndefOr[scala.Nothing], height: Double): this.type = js.native
  def setMin(width: Double): this.type = js.native
  def setMin(width: Double, height: Double): this.type = js.native
  /**
    * Sets, or clears, the parent of this Size component.
    * 
    * To clear the parent call this method with no arguments.
    * 
    * The parent influences the maximum extents to which this Size component can expand,
    * based on the aspect mode:
    * 
    * NONE - The parent clamps both the width and height.
    * WIDTH_CONTROLS_HEIGHT - The parent clamps just the width.
    * HEIGHT_CONTROLS_WIDTH - The parent clamps just the height.
    * FIT - The parent clamps whichever axis is required to ensure the size fits within it.
    * ENVELOP - The parent is used to ensure the size fully envelops the parent.
    * 
    * Calling this method automatically calls `setSize`.
    * @param parent Sets the parent of this Size component. Don't provide a value to clear an existing parent.
    */
  def setParent(): this.type = js.native
  def setParent(parent: js.Any): this.type = js.native
  /**
    * Sets the width and height of this Size component based on the aspect mode.
    * 
    * If the aspect mode is 'none' then calling this method will change the aspect ratio, otherwise the current
    * aspect ratio is honored across all other modes.
    * 
    * If snapTo values have been set then the given width and height are snapped first, prior to any further
    * adjustment via min/max values, or a parent.
    * 
    * If minimum and/or maximum dimensions have been specified, the values given to this method will be clamped into
    * that range prior to adjustment, but may still exceed them depending on the aspect mode.
    * 
    * If this Size component has a parent set, and the aspect mode is `fit` or `envelop`, then the given sizes will
    * be clamped to the range specified by the parent.
    * @param width The new width of the Size component. Default 0.
    * @param height The new height of the Size component. If not given, it will use the `width`. Default width.
    */
  def setSize(): this.type = js.native
  def setSize(width: js.UndefOr[scala.Nothing], height: Double): this.type = js.native
  def setSize(width: Double): this.type = js.native
  def setSize(width: Double, height: Double): this.type = js.native
  /**
    * By setting a Snap To value when this Size component is modified its dimensions will automatically
    * by snapped to the nearest grid slice, using floor. For example, if you have snap value of 16,
    * and the width changes to 68, then it will snap down to 64 (the closest multiple of 16 when floored)
    * 
    * Note that snapping takes place before adjustments by the parent, or the min / max settings. If these
    * values are not multiples of the given snap values, then this can result in un-snapped dimensions.
    * 
    * Call this method with no arguments to reset the snap values.
    * 
    * Calling this method automatically recalculates the `width` and the `height`, if required.
    * @param snapWidth The amount to snap the width to. If you don't want to snap the width, pass a value of zero. Default 0.
    * @param snapHeight The amount to snap the height to. If not provided it will use the `snapWidth` value. If you don't want to snap the height, pass a value of zero. Default snapWidth.
    */
  def setSnap(): this.type = js.native
  def setSnap(snapWidth: js.UndefOr[scala.Nothing], snapHeight: Double): this.type = js.native
  def setSnap(snapWidth: Double): this.type = js.native
  def setSnap(snapWidth: Double, snapHeight: Double): this.type = js.native
  /**
    * Sets the width of this Size component.
    * 
    * Depending on the aspect mode, changing the width may also update the height and aspect ratio.
    * @param width The new width of the Size component.
    */
  def setWidth(width: Double): this.type = js.native
}

