package typings.phaser.matterMod

import typings.phaser.MatterJS.IBound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Bounds` module contains methods for creating and manipulating axis-aligned bounding boxes (AABB).
  *
  * @class Bounds
  */
@JSImport("matter", "Bounds")
@js.native
open class Bounds ()
  extends StObject
     with typings.phaser.MatterJS.Bounds
object Bounds {
  
  @JSImport("matter", "Bounds")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns true if the bounds contains the given point.
    * @method contains
    * @param {IBound} bounds
    * @param {vector} point
    * @return {boolean} True if the bounds contain the point, otherwise false
    */
  /* static member */
  inline def contains(bounds: IBound, point: typings.phaser.MatterJS.Vector): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(bounds.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Creates a new axis-aligned bounding box (AABB) for the given vertices.
    * @method create
    * @param {vertices} vertices
    * @return {IBound} A new bounds object
    */
  /* static member */
  inline def create(vertices: typings.phaser.MatterJS.Vertices): IBound = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(vertices.asInstanceOf[js.Any]).asInstanceOf[IBound]
  
  /**
    * Returns true if the two bounds intersect.
    * @method overlaps
    * @param {IBound} boundsA
    * @param {IBound} boundsB
    * @return {boolean} True if the bounds overlap, otherwise false
    */
  /* static member */
  inline def overlaps(boundsA: IBound, boundsB: IBound): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("overlaps")(boundsA.asInstanceOf[js.Any], boundsB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Shifts the bounds to the given position.
    * @method shift
    * @param {IBound} bounds
    * @param {vector} position
    */
  /* static member */
  inline def shift(bounds: IBound, position: typings.phaser.MatterJS.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shift")(bounds.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Translates the bounds by the given vector.
    * @method translate
    * @param {IBound} bounds
    * @param {vector} vector
    */
  /* static member */
  inline def translate(bounds: IBound, vector: typings.phaser.MatterJS.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(bounds.asInstanceOf[js.Any], vector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Updates bounds using the given vertices and extends the bounds given a velocity.
    * @method update
    * @param {IBound} bounds
    * @param {vertices} vertices
    * @param {vector} velocity
    */
  /* static member */
  inline def update(
    bounds: IBound,
    vertices: typings.phaser.MatterJS.Vertices,
    velocity: typings.phaser.MatterJS.Vector
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(bounds.asInstanceOf[js.Any], vertices.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
