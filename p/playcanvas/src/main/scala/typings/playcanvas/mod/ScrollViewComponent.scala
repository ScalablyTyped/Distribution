package typings.playcanvas.mod

import typings.playcanvas.playcanvasInts.`-1`
import typings.playcanvas.playcanvasInts.`0`
import typings.playcanvas.playcanvasInts.`1`
import typings.playcanvas.playcanvasStrings.calculatedHeight
import typings.playcanvas.playcanvasStrings.calculatedWidth
import typings.playcanvas.playcanvasStrings.x
import typings.playcanvas.playcanvasStrings.y
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
  * @property {Entity} viewportEntity The entity to be used as the masked viewport area, within
  * which the content will scroll. This entity must have an ElementGroup component.
  * @property {Entity} contentEntity The entity which contains the scrolling content itself. This
  * entity must have an Element component.
  * @property {Entity} horizontalScrollbarEntity The entity to be used as the vertical scrollbar.
  * This entity must have a Scrollbar component.
  * @property {Entity} verticalScrollbarEntity The entity to be used as the vertical scrollbar. This
  * entity must have a Scrollbar component.
  * @augments Component
  */
@JSImport("playcanvas", "ScrollViewComponent")
@js.native
open class ScrollViewComponent protected () extends Component {
  /**
    * Create a new ScrollViewComponent.
    *
    * @param {ScrollViewComponentSystem} system - The ComponentSystem that created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: ScrollViewComponentSystem, entity: Entity) = this()
  
  def _applyScrollValueTension(scrollValue: Any): Any = js.native
  
  var _contentDragHelper: ElementDragHelper = js.native
  
  def _contentIsLargerThanViewport(orientation: Any): Boolean = js.native
  
  def _contentPositionToScrollValue(contentPosition: Any): Vec2 = js.native
  
  var _contentReference: EntityReference = js.native
  
  def _destroyDragHelper(): Unit = js.native
  
  def _determineNewScrollValue(scrollValue: Any, axis: Any, orientation: Any): Any = js.native
  
  def _disableContentInput(): Unit = js.native
  
  var _disabledContentInput: Boolean = js.native
  
  var _disabledContentInputEntities: js.Array[Any] = js.native
  
  var _dragStartPosition: Vec3 = js.native
  
  def _enableContentInput(): Unit = js.native
  
  def _getAxis(orientation: Any): x | y = js.native
  
  def _getCalculatedDimension(orientation: Any): calculatedWidth | calculatedHeight = js.native
  
  def _getContentSize(orientation: Any): Any = js.native
  
  def _getMaxOffset(orientation: Any, contentSize: Any): Double = js.native
  
  def _getMaxScrollValue(orientation: Any): `1` | `0` = js.native
  
  def _getScrollbarHandleSize(axis: Any, orientation: Any): Double = js.native
  
  def _getScrollbarVisibility(orientation: Any): Any = js.native
  
  def _getScrollingEnabled(orientation: Any): Any = js.native
  
  def _getSign(orientation: Any): `1` | `-1` = js.native
  
  def _getSize(orientation: Any, entityReference: Any): Any = js.native
  
  def _getViewportSize(orientation: Any): Any = js.native
  
  var _hasElementListeners: Boolean = js.native
  
  def _hasOvershoot(axis: Any, orientation: Any): Boolean = js.native
  
  def _isDragging(): Boolean = js.native
  
  def _onContentDragEnd(): Unit = js.native
  
  def _onContentDragMove(position: Any): Unit = js.native
  
  def _onContentDragStart(): Unit = js.native
  
  def _onContentElementGain(): Unit = js.native
  
  def _onContentElementLose(): Unit = js.native
  
  def _onElementComponentAdd(entity: Any): Unit = js.native
  
  def _onElementComponentRemove(entity: Any): Unit = js.native
  
  def _onHorizontalScrollbarGain(): Unit = js.native
  
  def _onMouseWheel(event: Any): Unit = js.native
  
  def _onSetContentOrViewportSize(): Unit = js.native
  
  def _onSetHorizontalScrollbarValue(scrollValueX: Any): Unit = js.native
  
  def _onSetHorizontalScrollingEnabled(): Unit = js.native
  
  def _onSetScroll(x: Any, y: Any, resetVelocity: Any): Unit = js.native
  
  def _onSetVerticalScrollbarValue(scrollValueY: Any): Unit = js.native
  
  def _onSetVerticalScrollingEnabled(): Unit = js.native
  
  def _onVerticalScrollbarGain(): Unit = js.native
  
  def _onViewportElementGain(): Unit = js.native
  
  var _prevContentDragPosition: Any = js.native
  
  var _scroll: Vec2 = js.native
  
  def _setContentDraggingEnabled(enabled: Any): Unit = js.native
  
  def _setScrollFromContentPosition(position: Any): Unit = js.native
  
  def _setScrollbarComponentsEnabled(enabled: Any): Unit = js.native
  
  def _setVelocityFromContentPositionDelta(position: Any): Unit = js.native
  
  def _setVelocityFromOvershoot(scrollValue: Any, axis: Any, orientation: Any): Unit = js.native
  
  def _syncAll(): Unit = js.native
  
  def _syncContentPosition(orientation: Any): Unit = js.native
  
  def _syncScrollbarEnabledState(orientation: Any): Unit = js.native
  
  def _syncScrollbarPosition(orientation: Any): Unit = js.native
  
  def _toOvershoot(scrollValue: Any, orientation: Any): Any = js.native
  
  /**
    * @param {string} onOrOff - 'on' or 'off'.
    * @private
    */
  /* private */ var _toggleElementListeners: Any = js.native
  
  /**
    * Fired whenever the scroll position changes.
    *
    * @event ScrollViewComponent#set:scroll
    * @param {Vec2} scrollPosition - Horizontal and vertical scroll values in the range 0...1.
    */
  /**
    * @param {string} onOrOff - 'on' or 'off'.
    * @param {ScrollViewComponentSystem} system - The ComponentSystem that created this Component.
    * @private
    */
  /* private */ var _toggleLifecycleListeners: Any = js.native
  
  def _updateAxis(scrollValue: Any, axis: Any, orientation: Any): Boolean = js.native
  
  def _updateVelocity(): Unit = js.native
  
  var _velocity: Vec3 = js.native
  
  var _viewportReference: EntityReference = js.native
  
  var _wasDragged: Boolean = js.native
  
  def bounceAmount: Double = js.native
  def bounceAmount_=(arg: Double): Unit = js.native
  
  def contentEntity: Entity = js.native
  def contentEntity_=(arg: Entity): Unit = js.native
  
  def friction: Double = js.native
  def friction_=(arg: Double): Unit = js.native
  
  def horizontal: Boolean = js.native
  
  def horizontalScrollbarEntity: Entity = js.native
  def horizontalScrollbarEntity_=(arg: Entity): Unit = js.native
  
  def horizontalScrollbarVisibility: Double = js.native
  def horizontalScrollbarVisibility_=(arg: Double): Unit = js.native
  
  def horizontal_=(arg: Boolean): Unit = js.native
  
  def mouseWheelSensitivity: Vec2 = js.native
  def mouseWheelSensitivity_=(arg: Vec2): Unit = js.native
  
  def onRemove(): Unit = js.native
  
  def onUpdate(): Unit = js.native
  
  def scroll: Vec2 = js.native
  
  def scrollMode: Double = js.native
  def scrollMode_=(arg: Double): Unit = js.native
  
  def scroll_=(arg: Vec2): Unit = js.native
  
  def useMouseWheel: Boolean = js.native
  def useMouseWheel_=(arg: Boolean): Unit = js.native
  
  def vertical: Boolean = js.native
  
  def verticalScrollbarEntity: Entity = js.native
  def verticalScrollbarEntity_=(arg: Entity): Unit = js.native
  
  def verticalScrollbarVisibility: Double = js.native
  def verticalScrollbarVisibility_=(arg: Double): Unit = js.native
  
  def vertical_=(arg: Boolean): Unit = js.native
  
  def viewportEntity: Entity = js.native
  def viewportEntity_=(arg: Entity): Unit = js.native
}
