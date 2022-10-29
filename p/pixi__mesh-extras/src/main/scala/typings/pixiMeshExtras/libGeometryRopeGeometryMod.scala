package typings.pixiMeshExtras

import typings.pixiMath.libIpointMod.IPoint
import typings.pixiMesh.mod.MeshGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryRopeGeometryMod {
  
  @JSImport("@pixi/mesh-extras/lib/geometry/RopeGeometry", "RopeGeometry")
  @js.native
  open class RopeGeometry protected () extends MeshGeometry {
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
    
    /**
      * The width (i.e., thickness) of the rope.
      * @readonly
      */
    var _width: Double = js.native
    
    /** Refreshes Rope indices and uvs */
    /* private */ var build: Any = js.native
    
    /** An array of points that determine the rope. */
    var points: js.Array[IPoint] = js.native
    
    /** Rope texture scale, if zero then the rope texture is stretched. */
    val textureScale: Double = js.native
    
    def update(): Unit = js.native
    
    /** refreshes vertices of Rope mesh */
    def updateVertices(): Unit = js.native
    
    /**
      * The width (i.e., thickness) of the rope.
      * @readonly
      */
    def width: Double = js.native
  }
}
