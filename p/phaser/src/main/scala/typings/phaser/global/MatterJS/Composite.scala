package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.CompositeType
import typings.phaser.MatterJS.ConstraintType
import typings.phaser.MatterJS.ICompositeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Composite` module contains methods for creating and manipulating composite bodies.
  * A composite body is a collection of `Matter.Body`, `Matter.Constraint` and other `Matter.Composite`, therefore composites form a tree structure.
  * It is important to use the functions in this module to modify composites, rather than directly modifying their properties.
  * Note that the `Matter.World` object is also a type of `Matter.Composite` and as such all composite methods here can also operate on a `Matter.World`.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Composite
  */
@JSGlobal("MatterJS.Composite")
@js.native
class Composite ()
  extends typings.phaser.MatterJS.Composite
object Composite {
  
  /**
    * Generic add function. Adds one or many body(s), constraint(s) or a composite(s) to the given composite.
    * Triggers `beforeAdd` and `afterAdd` events on the `composite`.
    * @method add
    * @param {ICompositeDefinition} composite
    * @param {} object
    * @return {composite} The original composite with the objects added
    */
  /* static member */
  @JSGlobal("MatterJS.Composite.add")
  @js.native
  def add(composite: CompositeType, `object`: BodyType): CompositeType = js.native
  @JSGlobal("MatterJS.Composite.add")
  @js.native
  def add(composite: CompositeType, `object`: CompositeType): CompositeType = js.native
  @JSGlobal("MatterJS.Composite.add")
  @js.native
  def add(composite: CompositeType, `object`: ConstraintType): CompositeType = js.native
  
  /**
    * Returns all bodies in the given composite, including all bodies in its children, recursively.
    * @method allBodies
    * @param {composite} composite
    * @return {body[]} All the bodies
    */
  /* static member */
  @JSGlobal("MatterJS.Composite.allBodies")
  @js.native
  def allBodies(composite: CompositeType): js.Array[BodyType] = js.native
  
  /**
    * Returns all composites in the given composite, including all composites in its children, recursively.
    * @method allComposites
    * @param {composite} composite
    * @return {composite[]} All the composites
    */
  /* static member */
  @JSGlobal("MatterJS.Composite.allComposites")
  @js.native
  def allComposites(composite: CompositeType): js.Array[CompositeType] = js.native
  
  /**
    * Returns all constraints in the given composite, including all constraints in its children, recursively.
    * @method allConstraints
    * @param {composite} composite
    * @return {constraint[]} All the constraints
    */
  /* static member */
  @JSGlobal("MatterJS.Composite.allConstraints")
  @js.native
  def allConstraints(composite: CompositeType): js.Array[ConstraintType] = js.native
  
  /**
    * Removes all bodies, constraints and composites from the given composite.
    * Optionally clearing its children recursively.
    * @method clear
    * @param {composite} composite
    * @param {boolean} keepStatic
    * @param {boolean} [deep=false]
    */
  /* static member */
  @JSGlobal("MatterJS.Composite.clear")
  @js.native
  def clear(composite: CompositeType, keepStatic: Boolean): Unit = js.native
  @JSGlobal("MatterJS.Composite.clear")
  @js.native
  def clear(composite: CompositeType, keepStatic: Boolean, deep: Boolean): Unit = js.native
  
  /**
    * Creates a new composite. The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properites section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} [options]
    * @return {composite} A new composite
    */
  /* static member */
  @JSGlobal("MatterJS.Composite.create")
  @js.native
  def create(): CompositeType = js.native
  @JSGlobal("MatterJS.Composite.create")
  @js.native
  def create(options: ICompositeDefinition): CompositeType = js.native
  
  /**
    * Searches the composite recursively for an object matching the type and id supplied, null if not found.
    * @method get
    * @param {composite} composite
    * @param {number} id
    * @param {string} type
    * @return {object} The requested object, if found
    */
  /* static member */
  @JSGlobal("MatterJS.Composite.get")
  @js.native
  def get(composite: CompositeType, id: Double, `type`: String): BodyType | CompositeType | ConstraintType = js.native
  
  /**
    * Moves the given object(s) from compositeA to compositeB (equal to a remove followed by an add).
    * @method move
    * @param {compositeA} compositeA
    * @param {object[]} objects
    * @param {compositeB} compositeB
    * @return {composite} Returns compositeA
    */
  /* static member */
  @JSGlobal("MatterJS.Composite.move")
  @js.native
  def move(
    compositeA: CompositeType,
    objects: js.Array[BodyType | CompositeType | ConstraintType],
    compositeB: CompositeType
  ): CompositeType = js.native
  
  /**
    * Assigns new ids for all objects in the composite, recursively.
    * @method rebase
    * @param {composite} composite
    * @return {composite} Returns composite
    */
  /* static member */
  @JSGlobal("MatterJS.Composite.rebase")
  @js.native
  def rebase(composite: CompositeType): CompositeType = js.native
  
  /**
    * Generic remove function. Removes one or many body(s), constraint(s) or a composite(s) to the given composite.
    * Optionally searching its children recursively.
    * Triggers `beforeRemove` and `afterRemove` events on the `composite`.
    * @method remove
    * @param {composite} composite
    * @param {} object
    * @param {boolean} [deep=false]
    * @return {composite} The original composite with the objects removed
    */
  /* static member */
  @JSGlobal("MatterJS.Composite.remove")
  @js.native
  def remove(composite: CompositeType, `object`: BodyType): CompositeType = js.native
  @JSGlobal("MatterJS.Composite.remove")
  @js.native
  def remove(composite: CompositeType, `object`: BodyType, deep: Boolean): CompositeType = js.native
  @JSGlobal("MatterJS.Composite.remove")
  @js.native
  def remove(composite: CompositeType, `object`: CompositeType): CompositeType = js.native
  @JSGlobal("MatterJS.Composite.remove")
  @js.native
  def remove(composite: CompositeType, `object`: CompositeType, deep: Boolean): CompositeType = js.native
  @JSGlobal("MatterJS.Composite.remove")
  @js.native
  def remove(composite: CompositeType, `object`: ConstraintType): CompositeType = js.native
  @JSGlobal("MatterJS.Composite.remove")
  @js.native
  def remove(composite: CompositeType, `object`: ConstraintType, deep: Boolean): CompositeType = js.native
  
  /**
    * Rotates all children in the composite by a given angle about the given point, without imparting any angular velocity.
    * @method rotate
    * @param {composite} composite
    * @param {number} rotation
    * @param {vector} point
    * @param {bool} [recursive=true]
    */
  /* static member */
  @JSGlobal("MatterJS.Composite.rotate")
  @js.native
  def rotate(composite: CompositeType, rotation: Double, point: typings.phaser.MatterJS.Vector): Unit = js.native
  @JSGlobal("MatterJS.Composite.rotate")
  @js.native
  def rotate(
    composite: CompositeType,
    rotation: Double,
    point: typings.phaser.MatterJS.Vector,
    recursive: Boolean
  ): Unit = js.native
  
  /**
    * Scales all children in the composite, including updating physical properties (mass, area, axes, inertia), from a world-space point.
    * @method scale
    * @param {composite} composite
    * @param {number} scaleX
    * @param {number} scaleY
    * @param {vector} point
    * @param {bool} [recursive=true]
    */
  /* static member */
  @JSGlobal("MatterJS.Composite.scale")
  @js.native
  def scale(composite: CompositeType, scaleX: Double, scaleY: Double, point: typings.phaser.MatterJS.Vector): Unit = js.native
  @JSGlobal("MatterJS.Composite.scale")
  @js.native
  def scale(
    composite: CompositeType,
    scaleX: Double,
    scaleY: Double,
    point: typings.phaser.MatterJS.Vector,
    recursive: Boolean
  ): Unit = js.native
  
  /**
    * Sets the composite's `isModified` flag.
    * If `updateParents` is true, all parents will be set (default: false).
    * If `updateChildren` is true, all children will be set (default: false).
    * @method setModified
    * @param {composite} composite
    * @param {boolean} isModified
    * @param {boolean} [updateParents=false]
    * @param {boolean} [updateChildren=false]
    */
  /* static member */
  @JSGlobal("MatterJS.Composite.setModified")
  @js.native
  def setModified(composite: CompositeType, isModified: Boolean): Unit = js.native
  @JSGlobal("MatterJS.Composite.setModified")
  @js.native
  def setModified(
    composite: CompositeType,
    isModified: Boolean,
    updateParents: js.UndefOr[scala.Nothing],
    updateChildren: Boolean
  ): Unit = js.native
  @JSGlobal("MatterJS.Composite.setModified")
  @js.native
  def setModified(composite: CompositeType, isModified: Boolean, updateParents: Boolean): Unit = js.native
  @JSGlobal("MatterJS.Composite.setModified")
  @js.native
  def setModified(composite: CompositeType, isModified: Boolean, updateParents: Boolean, updateChildren: Boolean): Unit = js.native
  
  /**
    * Translates all children in the composite by a given vector relative to their current positions,
    * without imparting any velocity.
    * @method translate
    * @param {composite} composite
    * @param {vector} translation
    * @param {bool} [recursive=true]
    */
  /* static member */
  @JSGlobal("MatterJS.Composite.translate")
  @js.native
  def translate(composite: CompositeType, translation: typings.phaser.MatterJS.Vector): Unit = js.native
  @JSGlobal("MatterJS.Composite.translate")
  @js.native
  def translate(composite: CompositeType, translation: typings.phaser.MatterJS.Vector, recursive: Boolean): Unit = js.native
}
