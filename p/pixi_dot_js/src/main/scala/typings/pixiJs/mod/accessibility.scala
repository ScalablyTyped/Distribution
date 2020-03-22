package typings.pixiJs.mod

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
@JSImport("pixi.js", "accessibility")
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
  }
  
}

