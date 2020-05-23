package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.IRunnerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Runner` module is an optional utility which provides a game loop,
  * that handles updating and rendering a `Matter.Engine` for you within a browser.
  * It is intended for demo and testing purposes, but may be adequate for simple games.
  * If you are using your own game loop instead, then you do not need the `Matter.Runner` module.
  * Instead just call `Engine.update(engine, delta)` in your own loop.
  * Note that the method `Engine.run` is an alias for `Runner.run`.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Runner
  */
@JSGlobal("MatterJS.Runner")
@js.native
class Runner ()
  extends typings.phaser.MatterJS.Runner {
  /**
    * A `Number` that specifies the time step between updates in milliseconds.
    * If `engine.timing.isFixed` is set to `true`, then `delta` is fixed.
    * If it is `false`, then `delta` can dynamically change to maintain the correct apparent simulation speed.
    *
    * @property delta
    * @type number
    * @default 1000 / 60
    */
  /* CompleteClass */
  override var delta: Double = js.native
  /**
    * A flag that specifies whether the runner is running or not.
    *
    * @property enabled
    * @type boolean
    * @default true
    */
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /**
    * A `Boolean` that specifies if the runner should use a fixed timestep (otherwise it is variable).
    * If timing is fixed, then the apparent simulation speed will change depending on the frame rate (but behaviour will be deterministic).
    * If the timing is variable, then the apparent simulation speed will be constant (approximately, but at the cost of determininism).
    *
    * @property isFixed
    * @type boolean
    * @default false
    */
  /* CompleteClass */
  override var isFixed: Boolean = js.native
}

/* static members */
@JSGlobal("MatterJS.Runner")
@js.native
object Runner extends js.Object {
  /**
    * Creates a new Runner. The options parameter is an object that specifies any properties you wish to override the defaults.
    * @method create
    * @param {} options
    */
  def create(options: IRunnerOptions): typings.phaser.MatterJS.Runner = js.native
  /**
    * Continuously ticks a `Matter.Engine` by calling `Runner.tick` on the `requestAnimationFrame` event.
    * @method run
    * @param {engine} engine
    */
  def run(engine: typings.phaser.MatterJS.Engine): typings.phaser.MatterJS.Runner = js.native
  /**
    * Continuously ticks a `Matter.Engine` by calling `Runner.tick` on the `requestAnimationFrame` event.
    * @method run
    * @param {engine} engine
    */
  def run(runner: typings.phaser.MatterJS.Runner, engine: typings.phaser.MatterJS.Engine): typings.phaser.MatterJS.Runner = js.native
  /**
    * Alias for `Runner.run`.
    * @method start
    * @param {runner} runner
    * @param {engine} engine
    */
  def start(runner: typings.phaser.MatterJS.Runner, engine: typings.phaser.MatterJS.Engine): Unit = js.native
  /**
    * Ends execution of `Runner.run` on the given `runner`, by canceling the animation frame request event loop.
    * If you wish to only temporarily pause the engine, see `engine.enabled` instead.
    * @method stop
    * @param {runner} runner
    */
  def stop(runner: typings.phaser.MatterJS.Runner): Unit = js.native
  /**
    * A game loop utility that updates the engine and renderer by one step (a 'tick').
    * Features delta smoothing, time correction and fixed or dynamic timing.
    * Triggers `beforeTick`, `tick` and `afterTick` events on the engine.
    * Consider just `Engine.update(engine, delta)` if you're using your own loop.
    * @method tick
    * @param {runner} runner
    * @param {engine} engine
    * @param {number} time
    */
  def tick(runner: typings.phaser.MatterJS.Runner, engine: typings.phaser.MatterJS.Engine, time: Double): Unit = js.native
}

