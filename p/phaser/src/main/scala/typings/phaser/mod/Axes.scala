package typings.phaser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Axes` module contains methods for creating and manipulating sets of axes.
  *
  * @class Axes
  */
@JSImport("matter", "Axes")
@js.native
class Axes ()
  extends StObject
     with typings.phaser.MatterJS.Axes
object Axes {
  
  @JSImport("matter", "Axes")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new set of axes from the given vertices.
    * @method fromVertices
    * @param {vertices} vertices
    * @return {axes} A new axes from the given vertices
    */
  /* static member */
  @scala.inline
  def fromVertices(vertices: js.Array[typings.phaser.MatterJS.Vector]): js.Array[typings.phaser.MatterJS.Vector] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(vertices.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.phaser.MatterJS.Vector]]
  
  /**
    * Rotates a set of axes by the given angle.
    * @method rotate
    * @param {axes} axes
    * @param {number} angle
    */
  /* static member */
  @scala.inline
  def rotate(axes: js.Array[typings.phaser.MatterJS.Vector], angle: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(axes.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
