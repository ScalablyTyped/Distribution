package typings.pixiJs.global.PIXI

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This namespace contains an accessibility plugin for allowing interaction via the keyboard.
  *
  * Do not instantiate this plugin directly. It is available from the `renderer.plugins` property.
  * See {@link PIXI.CanvasRenderer#plugins} or {@link PIXI.Renderer#plugins}.
  * @namespace PIXI.accessibility
  */
@JSGlobal("PIXI.accessibility")
@js.native
object accessibility extends js.Object {
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
  @js.native
  class AccessibilityManager protected ()
    extends typings.pixiJs.PIXI.accessibility.AccessibilityManager {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    /**
      * Setting this to true will visually show the divs.
      *
      * @type {boolean}
      */
    /* CompleteClass */
    override var debug: Boolean = js.native
    /**
      * A flag
      * @type {boolean}
      * @readonly
      */
    /* CompleteClass */
    override val isActive: Boolean = js.native
    /**
      * A flag
      * @type {boolean}
      * @readonly
      */
    /* CompleteClass */
    override val isMobileAccessibility: Boolean = js.native
    /**
      * The renderer this accessibility manager works for.
      *
      * @member {PIXI.AbstractRenderer} PIXI.accessibility.AccessibilityManager#renderer
      */
    /* CompleteClass */
    override var renderer: typings.pixiJs.PIXI.AbstractRenderer = js.native
    /**
      * Adjust the hit area based on the bounds of a display object
      *
      * @param {PIXI.Rectangle} hitArea - Bounds of the child
      */
    /* CompleteClass */
    override def capHitArea(hitArea: typings.pixiJs.PIXI.Rectangle): Unit = js.native
    /**
      * Destroys the accessibility manager
      *
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /**
      * private function that will visually add the information to the
      * accessability div
      *
      * @param {HTMLDivElement} div
      */
    /* CompleteClass */
    override def updateDebugHTML(div: HTMLDivElement): Unit = js.native
  }
  
}

