package typings.phaser.mod

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.CompositeType
import typings.phaser.MatterJS.ConstraintType
import typings.phaser.MatterJS.Gravity
import typings.phaser.MatterJS.IWorldDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.World` module contains methods for creating and manipulating the world composite.
  * A `Matter.World` is a `Matter.Composite` body, which is a collection of `Matter.Body`, `Matter.Constraint` and other `Matter.Composite`.
  * A `Matter.World` has a few additional properties including `gravity` and `bounds`.
  * It is important to use the functions in the `Matter.Composite` module to modify the world composite, rather than directly modifying its properties.
  * There are also a few methods here that alias those in `Matter.Composite` for easier readability.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class World
  * @extends Composite
  */
@JSImport("matter", "World")
@js.native
class World ()
  extends typings.phaser.MatterJS.World {
  /* CompleteClass */
  override var bounds: typings.phaser.MatterJS.Bounds = js.native
  /* CompleteClass */
  override var gravity: Gravity = js.native
}

/* static members */
@JSImport("matter", "World")
@js.native
object World extends js.Object {
  def add(world: typings.phaser.MatterJS.World, body: js.Array[BodyType | CompositeType | ConstraintType]): typings.phaser.MatterJS.World = js.native
  /**
    * Add objects or arrays of objects of types: Body, Constraint, Composite
    * @param world
    * @param body
    * @returns world
    */
  def add(world: typings.phaser.MatterJS.World, body: BodyType): typings.phaser.MatterJS.World = js.native
  def add(world: typings.phaser.MatterJS.World, body: CompositeType): typings.phaser.MatterJS.World = js.native
  def add(world: typings.phaser.MatterJS.World, body: ConstraintType): typings.phaser.MatterJS.World = js.native
  def add(world: typings.phaser.MatterJS.World, body: typings.phaser.MatterJS.MouseConstraint): typings.phaser.MatterJS.World = js.native
  /**
    * An alias for Composite.addBody since World is also a Composite
    * @method addBody
    * @param {world} world
    * @param {body} body
    * @return {world} The original world with the body added
    */
  def addBody(world: typings.phaser.MatterJS.World, body: BodyType): typings.phaser.MatterJS.World = js.native
  /**
    * An alias for Composite.add since World is also a Composite
    * @method addComposite
    * @param {world} world
    * @param {composite} composite
    * @return {world} The original world with the objects from composite added
    */
  def addComposite(world: typings.phaser.MatterJS.World, composite: CompositeType): typings.phaser.MatterJS.World = js.native
  /**
    * An alias for Composite.addConstraint since World is also a Composite
    * @method addConstraint
    * @param {world} world
    * @param {constraint} constraint
    * @return {world} The original world with the constraint added
    */
  def addConstraint(world: typings.phaser.MatterJS.World, constraint: ConstraintType): typings.phaser.MatterJS.World = js.native
  /**
    * An alias for Composite.clear since World is also a Composite
    * @method clear
    * @param {world} world
    * @param {boolean} keepStatic
    */
  def clear(world: typings.phaser.MatterJS.World, keepStatic: Boolean): Unit = js.native
  /**
    * Creates a new world composite. The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @constructor
    * @param {} options
    * @return {world} A new world
    */
  def create(options: IWorldDefinition): typings.phaser.MatterJS.World = js.native
}

