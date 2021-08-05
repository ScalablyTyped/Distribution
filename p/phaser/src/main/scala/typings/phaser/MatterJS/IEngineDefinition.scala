package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEngineDefinition extends StObject {
  
  /**
    * An integer `Number` that specifies the number of constraint iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    * The default value of `2` is usually very adequate.
    *
    * @property constraintIterations
    * @type number
    * @default 2
    */
  var constraintIterations: js.UndefOr[Double] = js.undefined
  
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module.
    * Sleeping can improve stability and performance, but often at the expense of accuracy.
    *
    * @property enableSleeping
    * @type boolean
    * @default false
    */
  var enableSleeping: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An instance of a broadphase controller. The default value is a `Matter.Grid` instance created by `Engine.create`.
    *
    * @property broadphase
    * @type grid
    * @default a Matter.Grid instance
    */
  var grid: js.UndefOr[Grid] = js.undefined
  
  /**
    * An integer `Number` that specifies the number of position iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property positionIterations
    * @type number
    * @default 6
    */
  var positionIterations: js.UndefOr[Double] = js.undefined
  
  /**
    * An `Object` containing properties regarding the timing systems of the engine.
    *
    * @property timing
    * @type object
    */
  var timing: js.UndefOr[IEngineTimingOptions] = js.undefined
  
  /**
    * An integer `Number` that specifies the number of velocity iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property velocityIterations
    * @type number
    * @default 4
    */
  var velocityIterations: js.UndefOr[Double] = js.undefined
  
  /**
    * A `World` composite object that will contain all simulated bodies and constraints.
    *
    * @property world
    * @type world
    * @default a Matter.World instance
    */
  var world: js.UndefOr[World] = js.undefined
}
object IEngineDefinition {
  
  inline def apply(): IEngineDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEngineDefinition]
  }
  
  extension [Self <: IEngineDefinition](x: Self) {
    
    inline def setConstraintIterations(value: Double): Self = StObject.set(x, "constraintIterations", value.asInstanceOf[js.Any])
    
    inline def setConstraintIterationsUndefined: Self = StObject.set(x, "constraintIterations", js.undefined)
    
    inline def setEnableSleeping(value: Boolean): Self = StObject.set(x, "enableSleeping", value.asInstanceOf[js.Any])
    
    inline def setEnableSleepingUndefined: Self = StObject.set(x, "enableSleeping", js.undefined)
    
    inline def setGrid(value: Grid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setPositionIterations(value: Double): Self = StObject.set(x, "positionIterations", value.asInstanceOf[js.Any])
    
    inline def setPositionIterationsUndefined: Self = StObject.set(x, "positionIterations", js.undefined)
    
    inline def setTiming(value: IEngineTimingOptions): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    
    inline def setVelocityIterations(value: Double): Self = StObject.set(x, "velocityIterations", value.asInstanceOf[js.Any])
    
    inline def setVelocityIterationsUndefined: Self = StObject.set(x, "velocityIterations", js.undefined)
    
    inline def setWorld(value: World): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
    
    inline def setWorldUndefined: Self = StObject.set(x, "world", js.undefined)
  }
}
