package typings
package minecraftDashScriptingDashTypesDashServerLib

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
  var breaks_blocks: scala.Boolean
  /**
    * If true, blocks in the explosion radius will be set on fire
    * @default false
    */
  var causesFire: scala.Boolean
  /**
    * If true, whether the explosion breaks blocks is affected by the mob griefing game rule
    * @default false
    */
  var destroyAffectedByGriefing: scala.Boolean
  /**
    * If true, whether the explosion causes fire is affected by the mob griefing game rule
    * @default false
    */
  var fireAffectedByGriefing: scala.Boolean
  /**
    * The range for the random amount of time the fuse will be lit before exploding, a negative value means the explosion will be immediate
    * @default [0.0, 0.0]
    */
  var fuseLength: stdLib.Range
  /**
    * If true, the fuse is already lit when this component is added to the entity
    * @default false
    */
  var fuseLit: scala.Boolean
  /**
    * A blocks explosion resistance will be capped at this value when an explosion occurs
    * @default Infinite
    */
  var maxResistance: scala.Double
  /**
    * The radius of the explosion in blocks and the amount of damage the explosion deals
    * @default 3.0
    */
  var power: scala.Double
}

object IExplodeComponent {
  @scala.inline
  def apply(
    breaks_blocks: scala.Boolean,
    causesFire: scala.Boolean,
    destroyAffectedByGriefing: scala.Boolean,
    fireAffectedByGriefing: scala.Boolean,
    fuseLength: stdLib.Range,
    fuseLit: scala.Boolean,
    maxResistance: scala.Double,
    power: scala.Double
  ): IExplodeComponent = {
    val __obj = js.Dynamic.literal(breaks_blocks = breaks_blocks, causesFire = causesFire, destroyAffectedByGriefing = destroyAffectedByGriefing, fireAffectedByGriefing = fireAffectedByGriefing, fuseLength = fuseLength, fuseLit = fuseLit, maxResistance = maxResistance, power = power)
  
    __obj.asInstanceOf[IExplodeComponent]
  }
}

