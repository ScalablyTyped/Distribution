package typings.pixiJs.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  * @memberof PIXI
  */
@JSImport("pixi.js", "AccessibilityManager")
@js.native
class AccessibilityManager protected ()
  extends StObject
     with typings.pixiJs.PIXI.AccessibilityManager {
  def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
  
  /**
    * Adjust the hit area based on the bounds of a display object
    *
    * @param {PIXI.Rectangle} hitArea - Bounds of the child
    */
  /* CompleteClass */
  override def capHitArea(hitArea: typings.pixiJs.PIXI.Rectangle): Unit = js.native
  
  /**
    * Setting this to true will visually show the divs.
    *
    * @type {boolean}
    */
  /* CompleteClass */
  var debug: Boolean = js.native
  
  /**
    * Destroys the accessibility manager
    *
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * A flag
    * @member {boolean}
    * @readonly
    */
  /* CompleteClass */
  override val isActive: Boolean = js.native
  
  /**
    * A flag
    * @member {boolean}
    * @readonly
    */
  /* CompleteClass */
  override val isMobileAccessibility: Boolean = js.native
  
  /**
    * The renderer this accessibility manager works for.
    *
    * @member {PIXI.AbstractRenderer} PIXI.AccessibilityManager#renderer
    */
  /* CompleteClass */
  var renderer: typings.pixiJs.PIXI.AbstractRenderer = js.native
  
  /**
    * private function that will visually add the information to the
    * accessability div
    *
    * @param {HTMLElement} div
    */
  /* CompleteClass */
  override def updateDebugHTML(div: HTMLElement): Unit = js.native
}
