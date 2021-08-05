package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait Engine extends StObject {
  
  /**
    * An instance of a broadphase controller. The default value is a `Matter.Grid` instance created by `Engine.create`.
    *
    * @property broadphase
    * @type grid
    * @default a Matter.Grid instance
    */
  var broadphase: Grid
  
  /**
    * An integer `Number` that specifies the number of constraint iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    * The default value of `2` is usually very adequate.
    *
    * @property constraintIterations
    * @type number
    * @default 2
    */
  var constraintIterations: Double
  
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module.
    * Sleeping can improve stability and performance, but often at the expense of accuracy.
    *
    * @property enableSleeping
    * @type boolean
    * @default false
    */
  var enableSleeping: Boolean
  
  /**
    * A flag that specifies whether the engine is running or not.
    */
  var enabled: Boolean
  
  /**
    * Collision pair set for this `Engine`.
    */
  var pairs: js.Any
  
  /**
    * An integer `Number` that specifies the number of position iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property positionIterations
    * @type number
    * @default 6
    */
  var positionIterations: Double
  
  /**
    * An `Object` containing properties regarding the timing systems of the engine.
    *
    * @property timing
    * @type object
    */
  var timing: IEngineTimingOptions
  
  /**
    * An integer `Number` that specifies the number of velocity iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property velocityIterations
    * @type number
    * @default 4
    */
  var velocityIterations: Double
  
  /**
    * A `World` composite object that will contain all simulated bodies and constraints.
    *
    * @property world
    * @type world
    * @default a Matter.World instance
    */
  var world: World
}
object Engine {
  
  inline def apply(
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
  
  extension [Self <: Engine](x: Self) {
    
    inline def setBroadphase(value: Grid): Self = StObject.set(x, "broadphase", value.asInstanceOf[js.Any])
    
    inline def setConstraintIterations(value: Double): Self = StObject.set(x, "constraintIterations", value.asInstanceOf[js.Any])
    
    inline def setEnableSleeping(value: Boolean): Self = StObject.set(x, "enableSleeping", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setPairs(value: js.Any): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
    
    inline def setPositionIterations(value: Double): Self = StObject.set(x, "positionIterations", value.asInstanceOf[js.Any])
    
    inline def setTiming(value: IEngineTimingOptions): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    inline def setVelocityIterations(value: Double): Self = StObject.set(x, "velocityIterations", value.asInstanceOf[js.Any])
    
    inline def setWorld(value: World): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
  }
}
