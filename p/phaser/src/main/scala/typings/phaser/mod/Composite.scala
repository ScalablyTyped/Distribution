package typings.phaser.mod

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.CompositeType
import typings.phaser.MatterJS.ConstraintType
import typings.phaser.MatterJS.ICompositeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
@JSImport("matter", "Composite")
@js.native
open class Composite ()
  extends StObject
     with typings.phaser.MatterJS.Composite
object Composite {
  
  @JSImport("matter", "Composite")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generic add function. Adds one or many body(s), constraint(s) or a composite(s) to the given composite.
    * Triggers `beforeAdd` and `afterAdd` events on the `composite`.
    * @method add
    * @param {ICompositeDefinition} composite
    * @param {} object
    * @return {composite} The original composite with the objects added
    */
  /* static member */
  inline def add(composite: CompositeType, `object`: BodyType): CompositeType = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[CompositeType]
  inline def add(composite: CompositeType, `object`: CompositeType): CompositeType = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[CompositeType]
  inline def add(composite: CompositeType, `object`: ConstraintType): CompositeType = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[CompositeType]
  
  /**
    * Returns all bodies in the given composite, including all bodies in its children, recursively.
    * @method allBodies
    * @param {composite} composite
    * @return {body[]} All the bodies
    */
  /* static member */
  inline def allBodies(composite: CompositeType): js.Array[BodyType] = ^.asInstanceOf[js.Dynamic].applyDynamic("allBodies")(composite.asInstanceOf[js.Any]).asInstanceOf[js.Array[BodyType]]
  
  /**
    * Returns all composites in the given composite, including all composites in its children, recursively.
    * @method allComposites
    * @param {composite} composite
    * @return {composite[]} All the composites
    */
  /* static member */
  inline def allComposites(composite: CompositeType): js.Array[CompositeType] = ^.asInstanceOf[js.Dynamic].applyDynamic("allComposites")(composite.asInstanceOf[js.Any]).asInstanceOf[js.Array[CompositeType]]
  
  /**
    * Returns all constraints in the given composite, including all constraints in its children, recursively.
    * @method allConstraints
    * @param {composite} composite
    * @return {constraint[]} All the constraints
    */
  /* static member */
  inline def allConstraints(composite: CompositeType): js.Array[ConstraintType] = ^.asInstanceOf[js.Dynamic].applyDynamic("allConstraints")(composite.asInstanceOf[js.Any]).asInstanceOf[js.Array[ConstraintType]]
  
  /**
    * Removes all bodies, constraints and composites from the given composite.
    * Optionally clearing its children recursively.
    * @method clear
    * @param {composite} composite
    * @param {boolean} keepStatic
    * @param {boolean} [deep=false]
    */
  /* static member */
  inline def clear(composite: CompositeType, keepStatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(composite.asInstanceOf[js.Any], keepStatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def clear(composite: CompositeType, keepStatic: Boolean, deep: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(composite.asInstanceOf[js.Any], keepStatic.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new composite. The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properites section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} [options]
    * @return {composite} A new composite
    */
  /* static member */
  inline def create(): CompositeType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CompositeType]
  inline def create(options: ICompositeDefinition): CompositeType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[CompositeType]
  
  /**
    * Searches the composite recursively for an object matching the type and id supplied, null if not found.
    * @method get
    * @param {composite} composite
    * @param {number} id
    * @param {string} type
    * @return {object} The requested object, if found
    */
  /* static member */
  inline def get(composite: CompositeType, id: Double, `type`: String): BodyType | CompositeType | ConstraintType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(composite.asInstanceOf[js.Any], id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[BodyType | CompositeType | ConstraintType]
  
  /**
    * Moves the given object(s) from compositeA to compositeB (equal to a remove followed by an add).
    * @method move
    * @param {compositeA} compositeA
    * @param {object[]} objects
    * @param {compositeB} compositeB
    * @return {composite} Returns compositeA
    */
  /* static member */
  inline def move(
    compositeA: CompositeType,
    objects: js.Array[BodyType | CompositeType | ConstraintType],
    compositeB: CompositeType
  ): CompositeType = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(compositeA.asInstanceOf[js.Any], objects.asInstanceOf[js.Any], compositeB.asInstanceOf[js.Any])).asInstanceOf[CompositeType]
  
  /**
    * Assigns new ids for all objects in the composite, recursively.
    * @method rebase
    * @param {composite} composite
    * @return {composite} Returns composite
    */
  /* static member */
  inline def rebase(composite: CompositeType): CompositeType = ^.asInstanceOf[js.Dynamic].applyDynamic("rebase")(composite.asInstanceOf[js.Any]).asInstanceOf[CompositeType]
  
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
  inline def remove(composite: CompositeType, `object`: BodyType): CompositeType = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[CompositeType]
  inline def remove(composite: CompositeType, `object`: BodyType, deep: Boolean): CompositeType = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[CompositeType]
  inline def remove(composite: CompositeType, `object`: CompositeType): CompositeType = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[CompositeType]
  inline def remove(composite: CompositeType, `object`: CompositeType, deep: Boolean): CompositeType = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[CompositeType]
  inline def remove(composite: CompositeType, `object`: ConstraintType): CompositeType = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[CompositeType]
  inline def remove(composite: CompositeType, `object`: ConstraintType, deep: Boolean): CompositeType = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[CompositeType]
  
  /**
    * Rotates all children in the composite by a given angle about the given point, without imparting any angular velocity.
    * @method rotate
    * @param {composite} composite
    * @param {number} rotation
    * @param {vector} point
    * @param {bool} [recursive=true]
    */
  /* static member */
  inline def rotate(composite: CompositeType, rotation: Double, point: typings.phaser.MatterJS.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(composite.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rotate(
    composite: CompositeType,
    rotation: Double,
    point: typings.phaser.MatterJS.Vector,
    recursive: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(composite.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], point.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def scale(composite: CompositeType, scaleX: Double, scaleY: Double, point: typings.phaser.MatterJS.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(composite.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scale(
    composite: CompositeType,
    scaleX: Double,
    scaleY: Double,
    point: typings.phaser.MatterJS.Vector,
    recursive: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(composite.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], point.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def setModified(composite: CompositeType, isModified: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setModified")(composite.asInstanceOf[js.Any], isModified.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setModified(composite: CompositeType, isModified: Boolean, updateParents: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setModified")(composite.asInstanceOf[js.Any], isModified.asInstanceOf[js.Any], updateParents.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setModified(composite: CompositeType, isModified: Boolean, updateParents: Boolean, updateChildren: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setModified")(composite.asInstanceOf[js.Any], isModified.asInstanceOf[js.Any], updateParents.asInstanceOf[js.Any], updateChildren.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setModified(composite: CompositeType, isModified: Boolean, updateParents: Unit, updateChildren: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setModified")(composite.asInstanceOf[js.Any], isModified.asInstanceOf[js.Any], updateParents.asInstanceOf[js.Any], updateChildren.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Translates all children in the composite by a given vector relative to their current positions,
    * without imparting any velocity.
    * @method translate
    * @param {composite} composite
    * @param {vector} translation
    * @param {bool} [recursive=true]
    */
  /* static member */
  inline def translate(composite: CompositeType, translation: typings.phaser.MatterJS.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(composite.asInstanceOf[js.Any], translation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def translate(composite: CompositeType, translation: typings.phaser.MatterJS.Vector, recursive: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(composite.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
