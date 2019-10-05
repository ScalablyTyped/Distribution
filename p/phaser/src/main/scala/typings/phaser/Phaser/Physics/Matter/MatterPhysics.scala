package typings.phaser.Phaser.Physics.Matter

import typings.phaser.MatterJS.Bodies
import typings.phaser.MatterJS.Body
import typings.phaser.MatterJS.Vertices
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.Systems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@JSGlobal("Phaser.Physics.Matter.MatterPhysics")
@js.native
class MatterPhysics protected () extends js.Object {
  /**
    * 
    * @param scene [description]
    */
  def this(scene: Scene) = this()
  /**
    * [description]
    */
  var add: Factory = js.native
  /**
    * A reference to the `Matter.Bodies` module which contains methods for creating bodies.
    */
  var bodies: Bodies = js.native
  /**
    * A reference to the `Matter.Body` module which contains methods for creating and manipulating body models.
    */
  var body: Body = js.native
  /**
    * [description]
    */
  var config: js.Object = js.native
  /**
    * [description]
    */
  var scene: Scene = js.native
  /**
    * [description]
    */
  var systems: Systems = js.native
  /**
    * A reference to the `Matter.Vertices` module which contains methods for creating and manipulating sets of vertices.
    * A set of vertices is an array of `Matter.Vector` with additional indexing properties inserted by `Vertices.create`.
    * A `Matter.Body` maintains a set of vertices to represent the shape of the object (its convex hull).
    */
  var verts: Vertices = js.native
  /**
    * [description]
    */
  var world: World = js.native
  /**
    * [description]
    */
  def enableAttractorPlugin(): MatterPhysics = js.native
  /**
    * [description]
    */
  def enableWrapPlugin(): MatterPhysics = js.native
  /**
    * [description]
    */
  def getConfig(): js.Object = js.native
  /**
    * [description]
    */
  def pause(): World = js.native
  /**
    * [description]
    */
  def resume(): World = js.native
  /**
    * Sets the Matter Engine to run at fixed timestep of 30Hz and enables `autoUpdate`.
    * If you have set a custom `getDelta` function then this will override it.
    */
  def set30Hz(): MatterPhysics = js.native
  /**
    * Sets the Matter Engine to run at fixed timestep of 60Hz and enables `autoUpdate`.
    * If you have set a custom `getDelta` function then this will override it.
    */
  def set60Hz(): MatterPhysics = js.native
  /**
    * Manually advances the physics simulation by one iteration.
    * 
    * You can optionally pass in the `delta` and `correction` values to be used by Engine.update.
    * If undefined they use the Matter defaults of 60Hz and no correction.
    * 
    * Calling `step` directly bypasses any checks of `enabled` or `autoUpdate`.
    * 
    * It also ignores any custom `getDelta` functions, as you should be passing the delta
    * value in to this call.
    * 
    * You can adjust the number of iterations that Engine.update performs internally.
    * Use the Scene Matter Physics config object to set the following properties:
    * 
    * positionIterations (defaults to 6)
    * velocityIterations (defaults to 4)
    * constraintIterations (defaults to 2)
    * 
    * Adjusting these values can help performance in certain situations, depending on the physics requirements
    * of your game.
    * @param delta [description] Default 16.666.
    * @param correction [description] Default 1.
    */
  def step(): Unit = js.native
  def step(delta: Double): Unit = js.native
  def step(delta: Double, correction: Double): Unit = js.native
}

