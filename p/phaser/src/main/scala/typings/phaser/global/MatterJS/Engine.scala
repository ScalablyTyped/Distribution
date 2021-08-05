package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.IEngineDefinition
import typings.phaser.MatterJS.IEngineTimingOptions
import typings.std.HTMLElement
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
@JSGlobal("MatterJS.Engine")
@js.native
class Engine ()
  extends StObject
     with typings.phaser.MatterJS.Engine {
  
  /**
    * An instance of a broadphase controller. The default value is a `Matter.Grid` instance created by `Engine.create`.
    *
    * @property broadphase
    * @type grid
    * @default a Matter.Grid instance
    */
  /* CompleteClass */
  var broadphase: typings.phaser.MatterJS.Grid = js.native
  
  /**
    * An integer `Number` that specifies the number of constraint iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    * The default value of `2` is usually very adequate.
    *
    * @property constraintIterations
    * @type number
    * @default 2
    */
  /* CompleteClass */
  var constraintIterations: Double = js.native
  
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module.
    * Sleeping can improve stability and performance, but often at the expense of accuracy.
    *
    * @property enableSleeping
    * @type boolean
    * @default false
    */
  /* CompleteClass */
  var enableSleeping: Boolean = js.native
  
  /**
    * A flag that specifies whether the engine is running or not.
    */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /**
    * Collision pair set for this `Engine`.
    */
  /* CompleteClass */
  var pairs: js.Any = js.native
  
  /**
    * An integer `Number` that specifies the number of position iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property positionIterations
    * @type number
    * @default 6
    */
  /* CompleteClass */
  var positionIterations: Double = js.native
  
  /**
    * An `Object` containing properties regarding the timing systems of the engine.
    *
    * @property timing
    * @type object
    */
  /* CompleteClass */
  var timing: IEngineTimingOptions = js.native
  
  /**
    * An integer `Number` that specifies the number of velocity iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property velocityIterations
    * @type number
    * @default 4
    */
  /* CompleteClass */
  var velocityIterations: Double = js.native
  
  /**
    * A `World` composite object that will contain all simulated bodies and constraints.
    *
    * @property world
    * @type world
    * @default a Matter.World instance
    */
  /* CompleteClass */
  var world: typings.phaser.MatterJS.World = js.native
}
object Engine {
  
  @JSGlobal("MatterJS.Engine")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clears the engine including the world, pairs and broadphase.
    * @method clear
    * @param {engine} engine
    */
  /* static member */
  inline def clear(engine: typings.phaser.MatterJS.Engine): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(engine.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Creates a new engine. The options parameter is an object that specifies any properties you wish to override the defaults.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {HTMLElement} element
    * @param {object} [options]
    * @return {engine} engine
    * @deprecated
    */
  /* static member */
  /**
    * Creates a new engine. The options parameter is an object that specifies any properties you wish to override the defaults.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {object} [options]
    * @return {engine} engine
    * @deprecated
    */
  inline def create(): typings.phaser.MatterJS.Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.phaser.MatterJS.Engine]
  inline def create(element: Unit, options: IEngineDefinition): typings.phaser.MatterJS.Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.MatterJS.Engine]
  inline def create(element: IEngineDefinition): typings.phaser.MatterJS.Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.MatterJS.Engine]
  inline def create(element: IEngineDefinition, options: IEngineDefinition): typings.phaser.MatterJS.Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.MatterJS.Engine]
  inline def create(element: HTMLElement): typings.phaser.MatterJS.Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.MatterJS.Engine]
  inline def create(element: HTMLElement, options: IEngineDefinition): typings.phaser.MatterJS.Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.MatterJS.Engine]
  
  /**
    * Merges two engines by keeping the configuration of `engineA` but replacing the world with the one from `engineB`.
    * @method merge
    * @param {engine} engineA
    * @param {engine} engineB
    */
  /* static member */
  inline def merge(engineA: typings.phaser.MatterJS.Engine, engineB: typings.phaser.MatterJS.Engine): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(engineA.asInstanceOf[js.Any], engineB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * An alias for `Runner.run`, see `Matter.Runner` for more information.
    * @method run
    * @param {engine} engine
    */
  /* static member */
  inline def run(engine: typings.phaser.MatterJS.Engine): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(engine.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Moves the simulation forward in time by `delta` ms.
    * The `correction` argument is an optional `Number` that specifies the time correction factor to apply to the update.
    * This can help improve the accuracy of the simulation in cases where `delta` is changing between updates.
    * The value of `correction` is defined as `delta / lastDelta`, i.e. the percentage change of `delta` over the last step.
    * Therefore the value is always `1` (no correction) when `delta` constant (or when no correction is desired, which is the default).
    * See the paper on <a href="http://lonesock.net/article/verlet.html">Time Corrected Verlet</a> for more information.
    *
    * Triggers `beforeUpdate` and `afterUpdate` events.
    * Triggers `collisionStart`, `collisionActive` and `collisionEnd` events.
    * @method update
    * @param {engine} engine
    * @param {number} [delta=16.666]
    * @param {number} [correction=1]
    */
  /* static member */
  inline def update(engine: typings.phaser.MatterJS.Engine): typings.phaser.MatterJS.Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(engine.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.MatterJS.Engine]
  inline def update(engine: typings.phaser.MatterJS.Engine, delta: Double): typings.phaser.MatterJS.Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(engine.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.MatterJS.Engine]
  inline def update(engine: typings.phaser.MatterJS.Engine, delta: Double, correction: Double): typings.phaser.MatterJS.Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(engine.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], correction.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.MatterJS.Engine]
  inline def update(engine: typings.phaser.MatterJS.Engine, delta: Unit, correction: Double): typings.phaser.MatterJS.Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(engine.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], correction.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.MatterJS.Engine]
}
