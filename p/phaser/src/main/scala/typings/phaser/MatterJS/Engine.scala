package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Engine` module contains methods for creating and manipulating engines.
  * An engine is a controller that manages updating the simulation of the world.
  * See `Matter.Runner` for an optional game loop utility.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Engine
  */
@js.native
trait Engine extends js.Object {
  
  /**
    * An instance of a broadphase controller. The default value is a `Matter.Grid` instance created by `Engine.create`.
    *
    * @property broadphase
    * @type grid
    * @default a Matter.Grid instance
    */
  var broadphase: Grid = js.native
  
  /**
    * An integer `Number` that specifies the number of constraint iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    * The default value of `2` is usually very adequate.
    *
    * @property constraintIterations
    * @type number
    * @default 2
    */
  var constraintIterations: Double = js.native
  
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module.
    * Sleeping can improve stability and performance, but often at the expense of accuracy.
    *
    * @property enableSleeping
    * @type boolean
    * @default false
    */
  var enableSleeping: Boolean = js.native
  
  /**
    * A flag that specifies whether the engine is running or not.
    */
  var enabled: Boolean = js.native
  
  /**
    * Collision pair set for this `Engine`.
    */
  var pairs: js.Any = js.native
  
  /**
    * An integer `Number` that specifies the number of position iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property positionIterations
    * @type number
    * @default 6
    */
  var positionIterations: Double = js.native
  
  /**
    * An `Object` containing properties regarding the timing systems of the engine.
    *
    * @property timing
    * @type object
    */
  var timing: IEngineTimingOptions = js.native
  
  /**
    * An integer `Number` that specifies the number of velocity iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property velocityIterations
    * @type number
    * @default 4
    */
  var velocityIterations: Double = js.native
  
  /**
    * A `World` composite object that will contain all simulated bodies and constraints.
    *
    * @property world
    * @type world
    * @default a Matter.World instance
    */
  var world: World = js.native
}
object Engine {
  
  @scala.inline
  def apply(
    broadphase: Grid,
    constraintIterations: Double,
    enableSleeping: Boolean,
    enabled: Boolean,
    pairs: js.Any,
    positionIterations: Double,
    timing: IEngineTimingOptions,
    velocityIterations: Double,
    world: World
  ): Engine = {
    val __obj = js.Dynamic.literal(broadphase = broadphase.asInstanceOf[js.Any], constraintIterations = constraintIterations.asInstanceOf[js.Any], enableSleeping = enableSleeping.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], positionIterations = positionIterations.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any], velocityIterations = velocityIterations.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engine]
  }
  
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
    
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
    def setBroadphase(value: Grid): Self = this.set("broadphase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintIterations(value: Double): Self = this.set("constraintIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSleeping(value: Boolean): Self = this.set("enableSleeping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPairs(value: js.Any): Self = this.set("pairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionIterations(value: Double): Self = this.set("positionIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiming(value: IEngineTimingOptions): Self = this.set("timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityIterations(value: Double): Self = this.set("velocityIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorld(value: World): Self = this.set("world", value.asInstanceOf[js.Any])
  }
}
