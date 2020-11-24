package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEngineDefinition extends js.Object {
  
  /**
    * An integer `Number` that specifies the number of constraint iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    * The default value of `2` is usually very adequate.
    *
    * @property constraintIterations
    * @type number
    * @default 2
    */
  var constraintIterations: js.UndefOr[Double] = js.native
  
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module.
    * Sleeping can improve stability and performance, but often at the expense of accuracy.
    *
    * @property enableSleeping
    * @type boolean
    * @default false
    */
  var enableSleeping: js.UndefOr[Boolean] = js.native
  
  /**
    * An instance of a broadphase controller. The default value is a `Matter.Grid` instance created by `Engine.create`.
    *
    * @property broadphase
    * @type grid
    * @default a Matter.Grid instance
    */
  var grid: js.UndefOr[Grid] = js.native
  
  /**
    * An integer `Number` that specifies the number of position iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property positionIterations
    * @type number
    * @default 6
    */
  var positionIterations: js.UndefOr[Double] = js.native
  
  /**
    * An `Object` containing properties regarding the timing systems of the engine.
    *
    * @property timing
    * @type object
    */
  var timing: js.UndefOr[IEngineTimingOptions] = js.native
  
  /**
    * An integer `Number` that specifies the number of velocity iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property velocityIterations
    * @type number
    * @default 4
    */
  var velocityIterations: js.UndefOr[Double] = js.native
  
  /**
    * A `World` composite object that will contain all simulated bodies and constraints.
    *
    * @property world
    * @type world
    * @default a Matter.World instance
    */
  var world: js.UndefOr[World] = js.native
}
object IEngineDefinition {
  
  @scala.inline
  def apply(): IEngineDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEngineDefinition]
  }
  
  @scala.inline
  implicit class IEngineDefinitionOps[Self <: IEngineDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConstraintIterations(value: Double): Self = this.set("constraintIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraintIterations: Self = this.set("constraintIterations", js.undefined)
    
    @scala.inline
    def setEnableSleeping(value: Boolean): Self = this.set("enableSleeping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSleeping: Self = this.set("enableSleeping", js.undefined)
    
    @scala.inline
    def setGrid(value: Grid): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setPositionIterations(value: Double): Self = this.set("positionIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionIterations: Self = this.set("positionIterations", js.undefined)
    
    @scala.inline
    def setTiming(value: IEngineTimingOptions): Self = this.set("timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
    
    @scala.inline
    def setVelocityIterations(value: Double): Self = this.set("velocityIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVelocityIterations: Self = this.set("velocityIterations", js.undefined)
    
    @scala.inline
    def setWorld(value: World): Self = this.set("world", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorld: Self = this.set("world", js.undefined)
  }
}
