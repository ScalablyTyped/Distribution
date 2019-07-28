package typings.minecraftDashScriptingDashTypesDashServer

import typings.std.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Controls the entity's explosion, timer until the explosion, and whether the timer is counting down or not.
  */
trait IExplodeComponent extends js.Object {
  /**
    * If true, the explosion will destroy blocks in the explosion radius
    * @default true
    */
  var breaks_blocks: Boolean
  /**
    * If true, blocks in the explosion radius will be set on fire
    * @default false
    */
  var causesFire: Boolean
  /**
    * If true, whether the explosion breaks blocks is affected by the mob griefing game rule
    * @default false
    */
  var destroyAffectedByGriefing: Boolean
  /**
    * If true, whether the explosion causes fire is affected by the mob griefing game rule
    * @default false
    */
  var fireAffectedByGriefing: Boolean
  /**
    * The range for the random amount of time the fuse will be lit before exploding, a negative value means the explosion will be immediate
    * @default [0.0, 0.0]
    */
  var fuseLength: Range
  /**
    * If true, the fuse is already lit when this component is added to the entity
    * @default false
    */
  var fuseLit: Boolean
  /**
    * A blocks explosion resistance will be capped at this value when an explosion occurs
    * @default Infinite
    */
  var maxResistance: Double
  /**
    * The radius of the explosion in blocks and the amount of damage the explosion deals
    * @default 3.0
    */
  var power: Double
}

object IExplodeComponent {
  @scala.inline
  def apply(
    breaks_blocks: Boolean,
    causesFire: Boolean,
    destroyAffectedByGriefing: Boolean,
    fireAffectedByGriefing: Boolean,
    fuseLength: Range,
    fuseLit: Boolean,
    maxResistance: Double,
    power: Double
  ): IExplodeComponent = {
    val __obj = js.Dynamic.literal(breaks_blocks = breaks_blocks, causesFire = causesFire, destroyAffectedByGriefing = destroyAffectedByGriefing, fireAffectedByGriefing = fireAffectedByGriefing, fuseLength = fuseLength, fuseLit = fuseLit, maxResistance = maxResistance, power = power)
  
    __obj.asInstanceOf[IExplodeComponent]
  }
}

