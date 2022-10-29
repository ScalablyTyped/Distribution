package typings.pixiJs.mod

import typings.pixiMath.libIpointMod.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "RopeGeometry")
@js.native
open class RopeGeometry protected ()
  extends typings.pixiMeshExtras.mod.RopeGeometry {
  /**
    * @param width - The width (i.e., thickness) of the rope.
    * @param points - An array of {@link PIXI.Point} objects to construct this rope.
    * @param textureScale - By default the rope texture will be stretched to match
    *     rope length. If textureScale is positive this value will be treated as a scaling
    *     factor and the texture will preserve its aspect ratio instead. To create a tiling rope
    *     set baseTexture.wrapMode to {@link PIXI.WRAP_MODES.REPEAT} and use a power of two texture,
    *     then set textureScale=1 to keep the original texture pixel size.
    *     In order to reduce alpha channel artifacts provide a larger texture and downsample -
    *     i.e. set textureScale=0.5 to scale it down twice.
    */
  def this(width: Double, points: js.Array[IPoint]) = this()
  def this(width: Double, points: js.Array[IPoint], textureScale: Double) = this()
}
