package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new ScrollViewComponent.
  * @property horizontal - Whether to enable horizontal scrolling.
  * @property vertical - Whether to enable vertical scrolling.
  * @property scrollMode - Specifies how the scroll view should behave when the user scrolls past the end of the content. Modes are defined as follows:
  *
  * * {@link pc.SCROLL_MODE_CLAMP}: Content does not scroll any further than its bounds.
  * * {@link pc.SCROLL_MODE_BOUNCE}: Content scrolls past its bounds and then gently bounces back.
  * * {@link pc.SCROLL_MODE_INFINITE}: Content can scroll forever.
  * @property bounceAmount - Controls how far the content should move before bouncing back.
  * @property friction - Controls how freely the content should move if thrown, i.e. By flicking on a phone or by flinging the scroll wheel on a mouse. A value of 1 means that content will stop immediately; 0 means that content will continue moving forever (or until the bounds of the content are reached, depending on the scrollMode).
  * @property horizontalScrollbarVisibility - Controls whether the horizontal scrollbar should be visible all the time, or only visible when the content exceeds the size of the viewport.
  * @property verticalScrollbarVisibility - Controls whether the vertical scrollbar should be visible all the time, or only visible when the content exceeds the size of the viewport.
  * @property viewportEntity - The entity to be used as the masked viewport area, within which the content will scroll. This entity must have an ElementGroup component.
  * @property contentEntity - The entity which contains the scrolling content itself. This entity must have an Element component.
  * @property horizontalScrollbarEntity - The entity to be used as the vertical scrollbar. This entity must have a Scrollbar component.
  * @property verticalScrollbarEntity - The entity to be used as the vertical scrollbar. This entity must have a Scrollbar component.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@js.native
trait ScrollViewComponent extends Component {
  /**
    * Controls how far the content should move before bouncing back.
    */
  var bounceAmount: Double = js.native
  /**
    * The entity which contains the scrolling content itself. This entity must have an Element component.
    */
  var contentEntity: Entity = js.native
  /**
    * Controls how freely the content should move if thrown, i.e. By flicking on a phone or by flinging the scroll wheel on a mouse. A value of 1 means that content will stop immediately; 0 means that content will continue moving forever (or until the bounds of the content are reached, depending on the scrollMode).
    */
  var friction: Double = js.native
  /**
    * Whether to enable horizontal scrolling.
    */
  var horizontal: Boolean = js.native
  /**
    * The entity to be used as the vertical scrollbar. This entity must have a Scrollbar component.
    */
  var horizontalScrollbarEntity: Entity = js.native
  /**
    * Controls whether the horizontal scrollbar should be visible all the time, or only visible when the content exceeds the size of the viewport.
    */
  var horizontalScrollbarVisibility: Double = js.native
  /**
    * Specifies how the scroll view should behave when the user scrolls past the end of the content. Modes are defined as follows:
    
    * {@link pc.SCROLL_MODE_CLAMP}: Content does not scroll any further than its bounds.
    * {@link pc.SCROLL_MODE_BOUNCE}: Content scrolls past its bounds and then gently bounces back.
    * {@link pc.SCROLL_MODE_INFINITE}: Content can scroll forever.
    */
  var scrollMode: Double = js.native
  /**
    * Whether to enable vertical scrolling.
    */
  var vertical: Boolean = js.native
  /**
    * The entity to be used as the vertical scrollbar. This entity must have a Scrollbar component.
    */
  var verticalScrollbarEntity: Entity = js.native
  /**
    * Controls whether the vertical scrollbar should be visible all the time, or only visible when the content exceeds the size of the viewport.
    */
  var verticalScrollbarVisibility: Double = js.native
  /**
    * The entity to be used as the masked viewport area, within which the content will scroll. This entity must have an ElementGroup component.
    */
  var viewportEntity: Entity = js.native
}

