package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @class
  * @name pc.LayoutChildComponent
  * @augments pc.Component
  * @description Create a new LayoutChildComponent.
  * @classdesc A LayoutChildComponent enables the Entity to control the sizing applied to it by its parent {@link pc.LayoutGroupComponent}.
  * @param {pc.LayoutChildComponentSystem} system - The ComponentSystem that created this Component.
  * @param {pc.Entity} entity - The Entity that this Component is attached to.
  * @property {number} minWidth The minimum width the element should be rendered at.
  * @property {number} minHeight The minimum height the element should be rendered at.
  * @property {number} maxWidth The maximum width the element should be rendered at.
  * @property {number} maxHeight The maximum height the element should be rendered at.
  * @property {number} fitWidthProportion The amount of additional horizontal space that the element should take up, if necessary to satisfy a Stretch/Shrink fitting calculation. This is specified as a proportion, taking into account the proportion values of other siblings.
  * @property {number} fitHeightProportion The amount of additional vertical space that the element should take up, if necessary to satisfy a Stretch/Shrink fitting calculation. This is specified as a proportion, taking into account the proportion values of other siblings.
  * @property {number} excludeFromLayout If set to true, the child will be excluded from all layout calculations.
  */
@JSImport("playcanvas", "LayoutChildComponent")
@js.native
class LayoutChildComponent protected ()
  extends typings.playcanvas.pc.LayoutChildComponent {
  def this(system: typings.playcanvas.pc.LayoutChildComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

