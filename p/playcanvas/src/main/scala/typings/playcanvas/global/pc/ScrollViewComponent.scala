package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ScrollViewComponent enables a group of entities to behave like a masked scrolling area, with
  * optional horizontal and vertical scroll bars.
  *
  * @property {boolean} horizontal Whether to enable horizontal scrolling.
  * @property {boolean} vertical Whether to enable vertical scrolling.
  * @property {number} scrollMode Specifies how the scroll view should behave when the user scrolls
  * past the end of the content. Modes are defined as follows:
  *
  * - {@link SCROLL_MODE_CLAMP}: Content does not scroll any further than its bounds.
  * - {@link SCROLL_MODE_BOUNCE}: Content scrolls past its bounds and then gently bounces back.
  * - {@link SCROLL_MODE_INFINITE}: Content can scroll forever.
  *
  * @property {number} bounceAmount Controls how far the content should move before bouncing back.
  * @property {number} friction Controls how freely the content should move if thrown, i.e. By
  * flicking on a phone or by flinging the scroll wheel on a mouse. A value of 1 means that content
  * will stop immediately; 0 means that content will continue moving forever (or until the bounds of
  * the content are reached, depending on the scrollMode).
  * @property {boolean} useMouseWheel Whether to use mouse wheel for scrolling (horizontally and
  * vertically).
  * @property {Vec2} mouseWheelSensitivity Mouse wheel horizontal and vertical sensitivity. Only
  * used if useMouseWheel is set. Setting a direction to 0 will disable mouse wheel scrolling in
  * that direction. 1 is a default sensitivity that is considered to feel good. The values can be
  * set higher or lower than 1 to tune the sensitivity. Defaults to [1, 1].
  * @property {number} horizontalScrollbarVisibility Controls whether the horizontal scrollbar
  * should be visible all the time, or only visible when the content exceeds the size of the
  * viewport.
  * @property {number} verticalScrollbarVisibility Controls whether the vertical scrollbar should be
  * visible all the time, or only visible when the content exceeds the size of the viewport.
  * @property {import('../../entity.js').Entity} viewportEntity The entity to be used as the masked
  * viewport area, within which the content will scroll. This entity must have an ElementGroup
  * component.
  * @property {import('../../entity.js').Entity} contentEntity The entity which contains the
  * scrolling content itself. This entity must have an Element component.
  * @property {import('../../entity.js').Entity} horizontalScrollbarEntity The entity to be used as
  * the vertical scrollbar. This entity must have a Scrollbar component.
  * @property {import('../../entity.js').Entity} verticalScrollbarEntity The entity to be used as
  * the vertical scrollbar. This entity must have a Scrollbar component.
  * @augments Component
  */
@JSGlobal("pc.ScrollViewComponent")
@js.native
open class ScrollViewComponent protected ()
  extends typings.playcanvas.mod.ScrollViewComponent {
  /**
    * Create a new ScrollViewComponent.
    *
    * @param {import('./system.js').ScrollViewComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this Component is
    * attached to.
    */
  def this(system: typings.playcanvas.mod.ScrollViewComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
