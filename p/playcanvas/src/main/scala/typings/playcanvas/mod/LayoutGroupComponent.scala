package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A LayoutGroupComponent enables the Entity to position and scale child {@link ElementComponent}s
  * according to configurable layout rules.
  *
  * @augments Component
  */
@JSImport("playcanvas", "LayoutGroupComponent")
@js.native
open class LayoutGroupComponent protected () extends Component {
  /**
    * Create a new LayoutGroupComponent instance.
    *
    * @param {LayoutGroupComponentSystem} system - The ComponentSystem that created this
    * Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: LayoutGroupComponentSystem, entity: Entity) = this()
  
  /** @private */
  /* private */ var _alignment: Any = js.native
  
  /** @private */
  /* private */ var _heightFitting: Any = js.native
  
  var _isPerformingReflow: Boolean = js.native
  
  def _isSelfOrChild(entity: Any): Boolean = js.native
  
  /** @private */
  /* private */ var _layoutCalculator: Any = js.native
  
  def _listenForReflowEvents(target: Any, onOff: Any): Unit = js.native
  
  def _onChildInsert(child: Any): Unit = js.native
  
  def _onChildRemove(child: Any): Unit = js.native
  
  def _onElementOrLayoutComponentAdd(entity: Any): Unit = js.native
  
  def _onElementOrLayoutComponentRemove(entity: Any): Unit = js.native
  
  /** @private */
  /* private */ var _orientation: Any = js.native
  
  /** @private */
  /* private */ var _padding: Any = js.native
  
  /** @private */
  /* private */ var _reverseX: Any = js.native
  
  /** @private */
  /* private */ var _reverseY: Any = js.native
  
  def _scheduleReflow(): Unit = js.native
  
  /** @private */
  /* private */ var _spacing: Any = js.native
  
  /** @private */
  /* private */ var _widthFitting: Any = js.native
  
  /** @private */
  /* private */ var _wrap: Any = js.native
  
  def alignment: Vec2 = js.native
  /**
    * Specifies the horizontal and vertical alignment of child elements. Values range from 0 to 1
    * where [0, 0] is the bottom left and [1, 1] is the top right. Defaults to [0, 1].
    *
    * @type {Vec2}
    */
  def alignment_=(arg: Vec2): Unit = js.native
  
  def heightFitting: Double = js.native
  /**
    * Identical to {@link LayoutGroupComponent#widthFitting} but for the Y axis. Defaults to
    * {@link FITTING_NONE}.
    *
    * @type {number}
    */
  def heightFitting_=(arg: Double): Unit = js.native
  
  def onRemove(): Unit = js.native
  
  def orientation: Double = js.native
  /**
    * Whether the layout should run horizontally or vertically. Can be:
    *
    * - {@link ORIENTATION_HORIZONTAL}
    * - {@link ORIENTATION_VERTICAL}
    *
    * Defaults to {@link ORIENTATION_HORIZONTAL}.
    *
    * @type {number}
    */
  def orientation_=(arg: Double): Unit = js.native
  
  def padding: Vec4 = js.native
  /**
    * Padding to be applied inside the container before positioning any children. Specified as
    * left, bottom, right and top values. Defaults to [0, 0, 0, 0] (no padding).
    *
    * @type {Vec4}
    */
  def padding_=(arg: Vec4): Unit = js.native
  
  def reflow(): Unit = js.native
  
  def reverseX: Boolean = js.native
  /**
    * Reverses the order of children along the x axis. Defaults to false.
    *
    * @type {boolean}
    */
  def reverseX_=(arg: Boolean): Unit = js.native
  
  def reverseY: Boolean = js.native
  /**
    * Reverses the order of children along the y axis. Defaults to true.
    *
    * @type {boolean}
    */
  def reverseY_=(arg: Boolean): Unit = js.native
  
  def spacing: Vec2 = js.native
  /**
    * Spacing to be applied between each child element. Defaults to [0, 0] (no spacing).
    *
    * @type {Vec2}
    */
  def spacing_=(arg: Vec2): Unit = js.native
  
  def widthFitting: Double = js.native
  /**
    * Fitting logic to be applied when positioning and scaling child elements. Can be:
    *
    * - {@link FITTING_NONE}: Child elements will be rendered at their natural size.
    * - {@link FITTING_STRETCH}: When the natural size of all child elements does not fill the width
    * of the container, children will be stretched to fit. The rules for how each child will be
    * stretched are outlined below:
    *   1. Sum the {@link LayoutChildComponent#fitWidthProportion} values of each child and normalize
    * so that all values sum to 1.
    *   2. Apply the natural width of each child.
    *   3. If there is space remaining in the container, distribute it to each child based on the
    * normalized {@link LayoutChildComponent#fitWidthProportion} values, but do not exceed the
    * {@link LayoutChildComponent#maxWidth} of each child.
    * - {@link FITTING_SHRINK}: When the natural size of all child elements overflows the width of the
    * container, children will be shrunk to fit. The rules for how each child will be stretched are
    * outlined below:
    *   1. Sum the {@link LayoutChildComponent#fitWidthProportion} values of each child and normalize
    * so that all values sum to 1.
    *   2. Apply the natural width of each child.
    *   3. If the new total width of all children exceeds the available space of the container, reduce
    * each child's width proportionally based on the normalized {@link
    * LayoutChildComponent#fitWidthProportion} values, but do not exceed the {@link
    * LayoutChildComponent#minWidth} of each child.
    * - {@link FITTING_BOTH}: Applies both STRETCH and SHRINK logic as necessary.
    *
    * Defaults to {@link FITTING_NONE}.
    *
    * @type {number}
    */
  def widthFitting_=(arg: Double): Unit = js.native
  
  def wrap: Boolean = js.native
  /**
    * Whether or not to wrap children onto a new row/column when the size of the container is
    * exceeded. Defaults to false, which means that children will be be rendered in a single row
    * (horizontal orientation) or column (vertical orientation). Note that setting wrap to true
    * makes it impossible for the {@link FITTING_BOTH} fitting mode to operate in any logical
    * manner. For this reason, when wrap is true, a {@link LayoutGroupComponent#widthFitting} or
    * {@link LayoutGroupComponent#heightFitting} mode of {@link FITTING_BOTH} will be coerced to
    * {@link FITTING_STRETCH}.
    *
    * @type {boolean}
    */
  def wrap_=(arg: Boolean): Unit = js.native
}
