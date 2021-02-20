package typings.minecraftScriptingTypesServer

import typings.std.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Controls the entity's explosion, timer until the explosion, and whether the timer is counting down or not.
  */
@js.native
trait IExplodeComponent extends StObject {
  
  /**
    * If true, the explosion will destroy blocks in the explosion radius
    * @default true
    */
  var breaks_blocks: Boolean = js.native
  
  /**
    * If true, blocks in the explosion radius will be set on fire
    * @default false
    */
  var causesFire: Boolean = js.native
  
  /**
    * If true, whether the explosion breaks blocks is affected by the mob griefing game rule
    * @default false
    */
  var destroyAffectedByGriefing: Boolean = js.native
  
  /**
    * If true, whether the explosion causes fire is affected by the mob griefing game rule
    * @default false
    */
  var fireAffectedByGriefing: Boolean = js.native
  
  /**
    * The range for the random amount of time the fuse will be lit before exploding, a negative value means the explosion will be immediate
    * @default [0.0, 0.0]
    */
  var fuseLength: Range = js.native
  
  /**
    * If true, the fuse is already lit when this component is added to the entity
    * @default false
    */
  var fuseLit: Boolean = js.native
  
  /**
    * A blocks explosion resistance will be capped at this value when an explosion occurs
    * @default Infinite
    */
  var maxResistance: Double = js.native
  
  /**
    * The radius of the explosion in blocks and the amount of damage the explosion deals
    * @default 3.0
    */
  var power: Double = js.native
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
    val __obj = js.Dynamic.literal(breaks_blocks = breaks_blocks.asInstanceOf[js.Any], causesFire = causesFire.asInstanceOf[js.Any], destroyAffectedByGriefing = destroyAffectedByGriefing.asInstanceOf[js.Any], fireAffectedByGriefing = fireAffectedByGriefing.asInstanceOf[js.Any], fuseLength = fuseLength.asInstanceOf[js.Any], fuseLit = fuseLit.asInstanceOf[js.Any], maxResistance = maxResistance.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExplodeComponent]
  }
  
  @scala.inline
  implicit class IExplodeComponentMutableBuilder[Self <: IExplodeComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreaks_blocks(value: Boolean): Self = StObject.set(x, "breaks_blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCausesFire(value: Boolean): Self = StObject.set(x, "causesFire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyAffectedByGriefing(value: Boolean): Self = StObject.set(x, "destroyAffectedByGriefing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFireAffectedByGriefing(value: Boolean): Self = StObject.set(x, "fireAffectedByGriefing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuseLength(value: Range): Self = StObject.set(x, "fuseLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuseLit(value: Boolean): Self = StObject.set(x, "fuseLit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResistance(value: Double): Self = StObject.set(x, "maxResistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
  }
}
