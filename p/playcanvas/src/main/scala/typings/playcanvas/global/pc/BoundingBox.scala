package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Axis-Aligned Bounding Box.
  */
@JSGlobal("pc.BoundingBox")
@js.native
/**
  * Create a new BoundingBox instance. The bounding box is axis-aligned.
  *
  * @param {Vec3} [center] - Center of box. The constructor takes a reference of this parameter.
  * @param {Vec3} [halfExtents] - Half the distance across the box in each axis. The constructor
  * takes a reference of this parameter. Defaults to 0.5 on each axis.
  */
open class BoundingBox ()
  extends typings.playcanvas.mod.BoundingBox {
  def this(center: typings.playcanvas.mod.Vec3) = this()
  def this(center: Unit, halfExtents: typings.playcanvas.mod.Vec3) = this()
  def this(center: typings.playcanvas.mod.Vec3, halfExtents: typings.playcanvas.mod.Vec3) = this()
}
object BoundingBox {
  
  @JSGlobal("pc.BoundingBox")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Compute the min and max bounding values to encapsulate all specified vertices.
    *
    * @param {number[]|Float32Array} vertices - The vertices used to compute the new size for the
    * AABB.
    * @param {Vec3} min - Stored computed min value.
    * @param {Vec3} max - Stored computed max value.
    * @param {number} [numVerts] - Number of vertices to use from the beginning of vertices array.
    * All vertices are used if not specified.
    */
  /* static member */
  inline def computeMinMax(vertices: js.Array[Double], min: typings.playcanvas.mod.Vec3, max: typings.playcanvas.mod.Vec3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMinMax")(vertices.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def computeMinMax(
    vertices: js.Array[Double],
    min: typings.playcanvas.mod.Vec3,
    max: typings.playcanvas.mod.Vec3,
    numVerts: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMinMax")(vertices.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], numVerts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def computeMinMax(
    vertices: js.typedarray.Float32Array,
    min: typings.playcanvas.mod.Vec3,
    max: typings.playcanvas.mod.Vec3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMinMax")(vertices.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def computeMinMax(
    vertices: js.typedarray.Float32Array,
    min: typings.playcanvas.mod.Vec3,
    max: typings.playcanvas.mod.Vec3,
    numVerts: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMinMax")(vertices.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], numVerts.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
