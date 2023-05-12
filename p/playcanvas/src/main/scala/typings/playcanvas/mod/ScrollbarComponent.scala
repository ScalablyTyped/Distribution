package typings.playcanvas.mod

import typings.playcanvas.playcanvasInts.`-1`
import typings.playcanvas.playcanvasInts.`1`
import typings.playcanvas.playcanvasStrings.height
import typings.playcanvas.playcanvasStrings.width
import typings.playcanvas.playcanvasStrings.x
import typings.playcanvas.playcanvasStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ScrollbarComponent enables a group of entities to behave like a draggable scrollbar.
  *
  * @property {number} orientation Whether the scrollbar moves horizontally or vertically. Can be:
  *
  * - {@link ORIENTATION_HORIZONTAL}: The scrollbar animates in the horizontal axis.
  * - {@link ORIENTATION_VERTICAL}: The scrollbar animates in the vertical axis.
  *
  * Defaults to {@link ORIENTATION_HORIZONTAL}.
  * @property {number} value The current position value of the scrollbar, in the range 0 to 1.
  * Defaults to 0.
  * @property {number} handleSize The size of the handle relative to the size of the track, in the
  * range 0 to 1. For a vertical scrollbar, a value of 1 means that the handle will take up the full
  * height of the track.
  * @property {import('../../entity.js').Entity} handleEntity The entity to be used as the scrollbar
  * handle. This entity must have a Scrollbar component.
  * @augments Component
  */
@JSImport("playcanvas", "ScrollbarComponent")
@js.native
open class ScrollbarComponent protected () extends Component {
  /**
    * Create a new ScrollbarComponent.
    *
    * @param {import('./system.js').ScrollbarComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this Component is
    * attached to.
    */
  def this(system: ScrollbarComponentSystem, entity: Entity) = this()
  
  def _destroyDragHelper(): Unit = js.native
  
  def _getAxis(): x | y = js.native
  
  def _getDimension(): height | width = js.native
  
  def _getHandleLength(): Double = js.native
  
  def _getHandlePosition(): Double = js.native
  
  def _getOppositeDimension(): height | width = js.native
  
  def _getSign(): `1` | `-1` = js.native
  
  def _getTrackLength(): Double = js.native
  
  def _getUsableTrackLength(): Double = js.native
  
  var _handleDragHelper: ElementDragHelper = js.native
  
  def _handlePositionToScrollValue(handlePosition: Any): Double = js.native
  
  var _handleReference: EntityReference = js.native
  
  def _onHandleDrag(position: Any): Unit = js.native
  
  def _onHandleElementGain(): Unit = js.native
  
  def _onHandleElementLose(): Unit = js.native
  
  def _onSetHandleAlignment(): Unit = js.native
  
  def _onSetHandleSize(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def _onSetOrientation(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def _onSetValue(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def _scrollValueToHandlePosition(value: Any): Double = js.native
  
  def _setHandleDraggingEnabled(enabled: Any): Unit = js.native
  
  /**
    * Fired whenever the scroll value changes.
    *
    * @event ScrollbarComponent#set:value
    * @param {number} value - The current scroll value.
    */
  /**
    * @param {string} onOrOff - 'on' or 'off'.
    * @private
    */
  /* private */ var _toggleLifecycleListeners: Any = js.native
  
  def _updateHandlePositionAndSize(): Unit = js.native
  
  def handleEntity: Entity = js.native
  def handleEntity_=(arg: Entity): Unit = js.native
  
  def handleSize: Double = js.native
  def handleSize_=(arg: Double): Unit = js.native
  
  def onRemove(): Unit = js.native
  
  def orientation: Double = js.native
  def orientation_=(arg: Double): Unit = js.native
  
  var value: Double = js.native
}
