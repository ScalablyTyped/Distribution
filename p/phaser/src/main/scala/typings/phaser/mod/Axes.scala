package typings.phaser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Axes` module contains methods for creating and manipulating sets of axes.
  *
  * @class Axes
  */
@JSImport("matter", "Axes")
@js.native
class Axes ()
  extends typings.phaser.MatterJS.Axes
object Axes {
  
  /**
    * Creates a new set of axes from the given vertices.
    * @method fromVertices
    * @param {vertices} vertices
    * @return {axes} A new axes from the given vertices
    */
  /* static member */
  @JSImport("matter", "Axes.fromVertices")
  @js.native
  def fromVertices(vertices: js.Array[typings.phaser.MatterJS.Vector]): js.Array[typings.phaser.MatterJS.Vector] = js.native
  
  /**
    * Rotates a set of axes by the given angle.
    * @method rotate
    * @param {axes} axes
    * @param {number} angle
    */
  /* static member */
  @JSImport("matter", "Axes.rotate")
  @js.native
  def rotate(axes: js.Array[typings.phaser.MatterJS.Vector], angle: Double): Unit = js.native
}
