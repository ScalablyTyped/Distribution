package typings.phaser.mod

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.IChamferableBodyDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Body` module contains methods for creating and manipulating body models.
  * A `Matter.Body` is a rigid body that can be simulated by a `Matter.Engine`.
  * Factories for commonly used body configurations (such as rectangles, circles and other polygons) can be found in the module `Matter.Bodies`.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  * 
  * @class Body
  */
@JSImport("matter", "Body")
@js.native
open class Body ()
  extends StObject
     with typings.phaser.MatterJS.Body
object Body {
  
  @JSImport("matter", "Body")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Applies a force to a body from a given world-space position, including resulting torque.
    * @method applyForce
    * @param {body} body
    * @param {vector} position
    * @param {vector} force
    */
  /* static member */
  inline def applyForce(body: BodyType, position: typings.phaser.MatterJS.Vector, force: typings.phaser.MatterJS.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyForce")(body.asInstanceOf[js.Any], position.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new rigid body model. The options parameter is an object that specifies any properties you wish to override the defaults.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @return {body} body
    */
  /* static member */
  inline def create(options: IChamferableBodyDefinition): typings.phaser.MatterJS.Body = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.MatterJS.Body]
  
  /**
    * Returns the next unique category bitfield (starting after the initial default category `0x0001`).
    * There are 32 available. See `body.collisionFilter` for more information.
    * @method nextCategory
    * @return {Number} Unique category bitfield
    */
  /* static member */
  inline def nextCategory(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextCategory")().asInstanceOf[Double]
  
  /**
    * Returns the next unique group index for which bodies will collide.
    * If `isNonColliding` is `true`, returns the next unique group index for which bodies will _not_ collide.
    * See `body.collisionFilter` for more information.
    * @method nextGroup
    * @param {bool} [isNonColliding=false]
    * @return {Number} Unique group index
    */
  /* static member */
  inline def nextGroup(isNonColliding: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextGroup")(isNonColliding.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Rotates a body by a given angle relative to its current angle, without imparting any angular velocity.
    * @method rotate
    * @param {body} body
    * @param {number} rotation
    */
  /* static member */
  inline def rotate(body: BodyType, rotation: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(body.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Scales the body, including updating physical properties (mass, area, axes, inertia), from a world-space point (default is body centre).
    * @method scale
    * @param {body} body
    * @param {number} scaleX
    * @param {number} scaleY
    * @param {vector} [point]
    */
  /* static member */
  inline def scale(body: BodyType, scaleX: Double, scaleY: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(body.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scale(body: BodyType, scaleX: Double, scaleY: Double, point: typings.phaser.MatterJS.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(body.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Given a property and a value (or map of), sets the property(s) on the body, using the appropriate setter functions if they exist.
    * Prefer to use the actual setter functions in performance critical situations.
    * @method set
    * @param {body} body
    * @param {} settings A property name (or map of properties and values) to set on the body.
    * @param {} value The value to set if `settings` is a single property name.
    */
  /* static member */
  inline def set(body: BodyType, settings: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(body.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set(body: BodyType, settings: Any, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(body.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the angle of the body instantly. Angular velocity, position, force etc. are unchanged.
    * @method setAngle
    * @param {body} body
    * @param {number} angle
    */
  /* static member */
  inline def setAngle(body: BodyType, angle: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAngle")(body.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the angular velocity of the body instantly. Position, angle, force etc. are unchanged. See also `Body.applyForce`.
    * @method setAngularVelocity
    * @param {body} body
    * @param {number} velocity
    */
  /* static member */
  inline def setAngularVelocity(body: BodyType, velocity: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAngularVelocity")(body.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the density of the body. Mass is automatically updated to reflect the change.
    * @method setDensity
    * @param {body} body
    * @param {number} density
    */
  /* static member */
  inline def setDensity(body: BodyType, density: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDensity")(body.asInstanceOf[js.Any], density.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the moment of inertia (i.e. second moment of area) of the body of the body.
    * Inverse inertia is automatically updated to reflect the change. Mass is not changed.
    * @method setInertia
    * @param {body} body
    * @param {number} inertia
    */
  /* static member */
  inline def setInertia(body: BodyType, inertia: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setInertia")(body.asInstanceOf[js.Any], inertia.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the mass of the body. Inverse mass and density are automatically updated to reflect the change.
    * @method setMass
    * @param {body} body
    * @param {number} mass
    */
  /* static member */
  inline def setMass(body: BodyType, mass: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMass")(body.asInstanceOf[js.Any], mass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the parts of the `body` and updates mass, inertia and centroid.
    * Each part will have its parent set to `body`.
    * By default the convex hull will be automatically computed and set on `body`, unless `autoHull` is set to `false.`
    * Note that this method will ensure that the first part in `body.parts` will always be the `body`.
    * @method setParts
    * @param {body} body
    * @param [body] parts
    * @param {bool} [autoHull=true]
    */
  /* static member */
  inline def setParts(body: BodyType, parts: js.Array[BodyType]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setParts")(body.asInstanceOf[js.Any], parts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setParts(body: BodyType, parts: js.Array[BodyType], autoHull: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setParts")(body.asInstanceOf[js.Any], parts.asInstanceOf[js.Any], autoHull.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the position of the body instantly. Velocity, angle, force etc. are unchanged.
    * @method setPosition
    * @param {body} body
    * @param {vector} position
    */
  /* static member */
  inline def setPosition(body: BodyType, position: typings.phaser.MatterJS.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")(body.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the body as static, including isStatic flag and setting mass and inertia to Infinity.
    * @method setStatic
    * @param {body} body
    * @param {bool} isStatic
    */
  /* static member */
  inline def setStatic(body: BodyType, isStatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatic")(body.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the linear velocity of the body instantly. Position, angle, force etc. are unchanged. See also `Body.applyForce`.
    * @method setVelocity
    * @param {body} body
    * @param {vector} velocity
    */
  /* static member */
  inline def setVelocity(body: BodyType, velocity: typings.phaser.MatterJS.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVelocity")(body.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the body's vertices and updates body properties accordingly, including inertia, area and mass (with respect to `body.density`).
    * Vertices will be automatically transformed to be orientated around their centre of mass as the origin.
    * They are then automatically translated to world space based on `body.position`.
    *
    * The `vertices` argument should be passed as an array of `Matter.Vector` points (or a `Matter.Vertices` array).
    * Vertices must form a convex hull, concave hulls are not supported.
    *
    * @method setVertices
    * @param {body} body
    * @param {vector[]} vertices
    */
  /* static member */
  inline def setVertices(body: BodyType, vertices: js.Array[typings.phaser.MatterJS.Vector]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVertices")(body.asInstanceOf[js.Any], vertices.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Moves a body by a given vector relative to its current position, without imparting any velocity.
    * @method translate
    * @param {body} body
    * @param {vector} translation
    */
  /* static member */
  inline def translate(body: BodyType, translation: typings.phaser.MatterJS.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(body.asInstanceOf[js.Any], translation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Performs a simulation step for the given `body`, including updating position and angle using Verlet integration.
    * @method update
    * @param {body} body
    * @param {number} deltaTime
    * @param {number} timeScale
    * @param {number} correction
    */
  /* static member */
  inline def update(body: BodyType, deltaTime: Double, timeScale: Double, correction: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(body.asInstanceOf[js.Any], deltaTime.asInstanceOf[js.Any], timeScale.asInstanceOf[js.Any], correction.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
