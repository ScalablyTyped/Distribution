package typings.pixiJs.PIXI.accessibility

import typings.pixiJs.PIXI.AbstractRenderer
import typings.pixiJs.PIXI.Rectangle
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Accessibility manager recreates the ability to tab and have content read by screen readers.
  * This is very important as it can possibly help people with disabilities access PixiJS content.
  *
  * A DisplayObject can be made accessible just like it can be made interactive. This manager will map the
  * events as if the mouse was being used, minimizing the effort required to implement.
  *
  * An instance of this class is automatically created by default, and can be found at `renderer.plugins.accessibility`
  *
  * @class
  * @memberof PIXI.accessibility
  */
trait AccessibilityManager extends js.Object {
  /**
    * Setting this to true will visually show the divs.
    *
    * @type {boolean}
    */
  var debug: Boolean
  /**
    * A flag
    * @type {boolean}
    * @readonly
    */
  val isActive: Boolean
  /**
    * A flag
    * @type {boolean}
    * @readonly
    */
  val isMobileAccessibility: Boolean
  /**
    * The renderer this accessibility manager works for.
    *
    * @member {PIXI.AbstractRenderer} PIXI.accessibility.AccessibilityManager#renderer
    */
  var renderer: AbstractRenderer
  /**
    * Adjust the hit area based on the bounds of a display object
    *
    * @param {PIXI.Rectangle} hitArea - Bounds of the child
    */
  def capHitArea(hitArea: Rectangle): Unit
  /**
    * Destroys the accessibility manager
    *
    */
  def destroy(): Unit
  /**
    * private function that will visually add the information to the
    * accessability div
    *
    * @param {HTMLDivElement} div
    */
  def updateDebugHTML(div: HTMLDivElement): Unit
}

object AccessibilityManager {
  @scala.inline
  def apply(
    capHitArea: Rectangle => Unit,
    debug: Boolean,
    destroy: () => Unit,
    isActive: Boolean,
    isMobileAccessibility: Boolean,
    renderer: AbstractRenderer,
    updateDebugHTML: HTMLDivElement => Unit
  ): AccessibilityManager = {
    val __obj = js.Dynamic.literal(capHitArea = js.Any.fromFunction1(capHitArea), debug = debug.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), isActive = isActive.asInstanceOf[js.Any], isMobileAccessibility = isMobileAccessibility.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], updateDebugHTML = js.Any.fromFunction1(updateDebugHTML))
    __obj.asInstanceOf[AccessibilityManager]
  }
}

