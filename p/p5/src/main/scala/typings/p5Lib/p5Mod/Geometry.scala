package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Geometry")
@js.native
class Geometry ()
  extends p5Lib.p5Mod.p5Ns.Geometry {
  /**
       *   p5 Geometry class
       *
       *   @param [detailX] number of vertices on horizontal
       *   surface
       *   @param [detailY] number of vertices on horizontal
       *   surface
       *   @param [callback] function to call upon object
       *   instantiation.
       */
  def this(detailX: scala.Double) = this()
  /**
       *   p5 Geometry class
       *
       *   @param [detailX] number of vertices on horizontal
       *   surface
       *   @param [detailY] number of vertices on horizontal
       *   surface
       *   @param [callback] function to call upon object
       *   instantiation.
       */
  def this(detailX: scala.Double, detailY: scala.Double) = this()
  /**
       *   p5 Geometry class
       *
       *   @param [detailX] number of vertices on horizontal
       *   surface
       *   @param [detailY] number of vertices on horizontal
       *   surface
       *   @param [callback] function to call upon object
       *   instantiation.
       */
  def this(detailX: scala.Double, detailY: scala.Double, callback: js.Function1[/* repeated */js.Any, _]) = this()
  /**
       *   Averages the vertex normals. Used in curved
       *   surfaces
       *   @chainable
       */
  /* CompleteClass */
  override def averageNormals(): Geometry = js.native
  /**
       *   Averages pole normals. Used in spherical
       *   primitives
       *   @chainable
       */
  /* CompleteClass */
  override def averagePoleNormals(): Geometry = js.native
  /* CompleteClass */
  override def computeFaces(): Geometry = js.native
  /**
       *   computes smooth normals per vertex as an average
       *   of each face.
       *   @chainable
       */
  /* CompleteClass */
  override def computeNormals(): Geometry = js.native
  /**
       *   Modifies all vertices to be centered within the
       *   range -100 to 100.
       *   @chainable
       */
  /* CompleteClass */
  override def normalize(): Geometry = js.native
}

