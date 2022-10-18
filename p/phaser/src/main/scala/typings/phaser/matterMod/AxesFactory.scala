package typings.phaser.matterMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter", "AxesFactory")
@js.native
open class AxesFactory ()
  extends StObject
     with typings.phaser.MatterJS.AxesFactory {
  
  /**
    * Creates a new set of axes from the given vertices.
    * @method fromVertices
    * @param {vertices} vertices
    * @return {axes} A new axes from the given vertices
    */
  /* CompleteClass */
  override def fromVertices(vertices: js.Array[typings.phaser.MatterJS.Vector]): js.Array[typings.phaser.MatterJS.Vector] = js.native
  
  /**
    * Rotates a set of axes by the given angle.
    * @method rotate
    * @param {axes} axes
    * @param {number} angle
    */
  /* CompleteClass */
  override def rotate(axes: js.Array[typings.phaser.MatterJS.Vector], angle: Double): Unit = js.native
}
