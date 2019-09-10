package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.LayoutChildComponent
  * @extends pc.Component
  * @description Create a new LayoutChildComponent
  * @classdesc A LayoutChildComponent enables the Entity to control the sizing applied to it by its parent {@link pc.LayoutGroupComponent}.
  * @param {pc.LayoutChildComponentSystem} system The ComponentSystem that created this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to.
  * @property {Number} minWidth The minimum width the element should be rendered at.
  * @property {Number} minHeight The minimum height the element should be rendered at.
  * @property {Number} maxWidth The maximum width the element should be rendered at.
  * @property {Number} maxHeight The maximum height the element should be rendered at.
  * @property {Number} fitWidthProportion The amount of additional horizontal space that the element should take up, if necessary to satisfy a Stretch/Shrink fitting calculation. This is specified as a proportion, taking into account the proportion values of other siblings.
  * @property {Number} fitHeightProportion The amount of additional vertical space that the element should take up, if necessary to satisfy a Stretch/Shrink fitting calculation. This is specified as a proportion, taking into account the proportion values of other siblings.
  * @property {Number} excludeFromLayout If set to true, the child will be excluded from all layout calculations.
  */
@JSGlobal("pc.LayoutChildComponent")
@js.native
class LayoutChildComponent protected () extends Component {
  def this(system: LayoutChildComponentSystem, entity: Entity) = this()
  /**
    * If set to true, the child will be excluded from all layout calculations.
    */
  var excludeFromLayout: Double = js.native
  /**
    * The amount of additional vertical space that the element should take up, if necessary to satisfy a Stretch/Shrink fitting calculation. This is specified as a proportion, taking into account the proportion values of other siblings.
    */
  var fitHeightProportion: Double = js.native
  /**
    * The amount of additional horizontal space that the element should take up, if necessary to satisfy a Stretch/Shrink fitting calculation. This is specified as a proportion, taking into account the proportion values of other siblings.
    */
  var fitWidthProportion: Double = js.native
  /**
    * The maximum height the element should be rendered at.
    */
  var maxHeight: Double = js.native
  /**
    * The maximum width the element should be rendered at.
    */
  var maxWidth: Double = js.native
  /**
    * The minimum height the element should be rendered at.
    */
  var minHeight: Double = js.native
  /**
    * The minimum width the element should be rendered at.
    */
  var minWidth: Double = js.native
}

