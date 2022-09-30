package typings.pixiJs.mod

import typings.pixiMath.mod.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "SimpleRope")
@js.native
open class SimpleRope protected ()
  extends typings.pixiMeshExtras.mod.SimpleRope {
  /**
    * @param texture - The texture to use on the rope.
    * @param points - An array of {@link PIXI.Point} objects to construct this rope.
    * @param {number} textureScale - Optional. Positive values scale rope texture
    * keeping its aspect ratio. You can reduce alpha channel artifacts by providing a larger texture
    * and downsampling here. If set to zero, texture will be stretched instead.
    */
  def this(texture: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource], points: js.Array[IPoint]) = this()
  def this(
    texture: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource],
    points: js.Array[IPoint],
    textureScale: Double
  ) = this()
}
