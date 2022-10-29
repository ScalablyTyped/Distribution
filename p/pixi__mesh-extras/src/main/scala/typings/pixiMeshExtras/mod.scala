package typings.pixiMeshExtras

import typings.pixiConstants.mod.DRAW_MODES
import typings.pixiCore.libGeometryBufferMod.IArrayBuffer
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiMath.libIpointMod.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/mesh-extras", "NineSlicePlane")
  @js.native
  open class NineSlicePlane protected ()
    extends typings.pixiMeshExtras.libNineSlicePlaneMod.NineSlicePlane {
    /**
      * @param texture - The texture to use on the NineSlicePlane.
      * @param {number} [leftWidth=10] - size of the left vertical bar (A)
      * @param {number} [topHeight=10] - size of the top horizontal bar (C)
      * @param {number} [rightWidth=10] - size of the right vertical bar (B)
      * @param {number} [bottomHeight=10] - size of the bottom horizontal bar (D)
      */
    def this(texture: Texture[Resource]) = this()
    def this(texture: Texture[Resource], leftWidth: Double) = this()
    def this(texture: Texture[Resource], leftWidth: Double, topHeight: Double) = this()
    def this(texture: Texture[Resource], leftWidth: Unit, topHeight: Double) = this()
    def this(texture: Texture[Resource], leftWidth: Double, topHeight: Double, rightWidth: Double) = this()
    def this(texture: Texture[Resource], leftWidth: Double, topHeight: Unit, rightWidth: Double) = this()
    def this(texture: Texture[Resource], leftWidth: Unit, topHeight: Double, rightWidth: Double) = this()
    def this(texture: Texture[Resource], leftWidth: Unit, topHeight: Unit, rightWidth: Double) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Double,
      topHeight: Double,
      rightWidth: Double,
      bottomHeight: Double
    ) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Double,
      topHeight: Double,
      rightWidth: Unit,
      bottomHeight: Double
    ) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Double,
      topHeight: Unit,
      rightWidth: Double,
      bottomHeight: Double
    ) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Double,
      topHeight: Unit,
      rightWidth: Unit,
      bottomHeight: Double
    ) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Unit,
      topHeight: Double,
      rightWidth: Double,
      bottomHeight: Double
    ) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Unit,
      topHeight: Double,
      rightWidth: Unit,
      bottomHeight: Double
    ) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Unit,
      topHeight: Unit,
      rightWidth: Double,
      bottomHeight: Double
    ) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Unit,
      topHeight: Unit,
      rightWidth: Unit,
      bottomHeight: Double
    ) = this()
  }
  
  @JSImport("@pixi/mesh-extras", "PlaneGeometry")
  @js.native
  /**
    * @param width - The width of the plane.
    * @param height - The height of the plane.
    * @param segWidth - Number of horizontal segments.
    * @param segHeight - Number of vertical segments.
    */
  open class PlaneGeometry ()
    extends typings.pixiMeshExtras.libGeometryPlaneGeometryMod.PlaneGeometry {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Unit, height: Double) = this()
    def this(width: Double, height: Double, segWidth: Double) = this()
    def this(width: Double, height: Unit, segWidth: Double) = this()
    def this(width: Unit, height: Double, segWidth: Double) = this()
    def this(width: Unit, height: Unit, segWidth: Double) = this()
    def this(width: Double, height: Double, segWidth: Double, segHeight: Double) = this()
    def this(width: Double, height: Double, segWidth: Unit, segHeight: Double) = this()
    def this(width: Double, height: Unit, segWidth: Double, segHeight: Double) = this()
    def this(width: Double, height: Unit, segWidth: Unit, segHeight: Double) = this()
    def this(width: Unit, height: Double, segWidth: Double, segHeight: Double) = this()
    def this(width: Unit, height: Double, segWidth: Unit, segHeight: Double) = this()
    def this(width: Unit, height: Unit, segWidth: Double, segHeight: Double) = this()
    def this(width: Unit, height: Unit, segWidth: Unit, segHeight: Double) = this()
  }
  
  @JSImport("@pixi/mesh-extras", "RopeGeometry")
  @js.native
  open class RopeGeometry protected ()
    extends typings.pixiMeshExtras.libGeometryRopeGeometryMod.RopeGeometry {
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
  
  @JSImport("@pixi/mesh-extras", "SimpleMesh")
  @js.native
  /**
    * @param texture - The texture to use
    * @param {Float32Array} [vertices] - if you want to specify the vertices
    * @param {Float32Array} [uvs] - if you want to specify the uvs
    * @param {Uint16Array} [indices] - if you want to specify the indices
    * @param drawMode - the drawMode, can be any of the Mesh.DRAW_MODES consts
    */
  open class SimpleMesh ()
    extends typings.pixiMeshExtras.libSimpleMeshMod.SimpleMesh {
    def this(texture: Texture[Resource]) = this()
    def this(texture: Unit, vertices: IArrayBuffer) = this()
    def this(texture: Texture[Resource], vertices: IArrayBuffer) = this()
    def this(texture: Unit, vertices: Unit, uvs: IArrayBuffer) = this()
    def this(texture: Unit, vertices: IArrayBuffer, uvs: IArrayBuffer) = this()
    def this(texture: Texture[Resource], vertices: Unit, uvs: IArrayBuffer) = this()
    def this(texture: Texture[Resource], vertices: IArrayBuffer, uvs: IArrayBuffer) = this()
    def this(texture: Unit, vertices: Unit, uvs: Unit, indices: IArrayBuffer) = this()
    def this(texture: Unit, vertices: Unit, uvs: IArrayBuffer, indices: IArrayBuffer) = this()
    def this(texture: Unit, vertices: IArrayBuffer, uvs: Unit, indices: IArrayBuffer) = this()
    def this(texture: Unit, vertices: IArrayBuffer, uvs: IArrayBuffer, indices: IArrayBuffer) = this()
    def this(texture: Texture[Resource], vertices: Unit, uvs: Unit, indices: IArrayBuffer) = this()
    def this(texture: Texture[Resource], vertices: Unit, uvs: IArrayBuffer, indices: IArrayBuffer) = this()
    def this(texture: Texture[Resource], vertices: IArrayBuffer, uvs: Unit, indices: IArrayBuffer) = this()
    def this(texture: Texture[Resource], vertices: IArrayBuffer, uvs: IArrayBuffer, indices: IArrayBuffer) = this()
    def this(texture: Unit, vertices: Unit, uvs: Unit, indices: Unit, drawMode: DRAW_MODES) = this()
    def this(texture: Unit, vertices: Unit, uvs: Unit, indices: IArrayBuffer, drawMode: DRAW_MODES) = this()
    def this(texture: Unit, vertices: Unit, uvs: IArrayBuffer, indices: Unit, drawMode: DRAW_MODES) = this()
    def this(texture: Unit, vertices: Unit, uvs: IArrayBuffer, indices: IArrayBuffer, drawMode: DRAW_MODES) = this()
    def this(texture: Unit, vertices: IArrayBuffer, uvs: Unit, indices: Unit, drawMode: DRAW_MODES) = this()
    def this(texture: Unit, vertices: IArrayBuffer, uvs: Unit, indices: IArrayBuffer, drawMode: DRAW_MODES) = this()
    def this(texture: Unit, vertices: IArrayBuffer, uvs: IArrayBuffer, indices: Unit, drawMode: DRAW_MODES) = this()
    def this(
      texture: Unit,
      vertices: IArrayBuffer,
      uvs: IArrayBuffer,
      indices: IArrayBuffer,
      drawMode: DRAW_MODES
    ) = this()
    def this(texture: Texture[Resource], vertices: Unit, uvs: Unit, indices: Unit, drawMode: DRAW_MODES) = this()
    def this(texture: Texture[Resource], vertices: Unit, uvs: Unit, indices: IArrayBuffer, drawMode: DRAW_MODES) = this()
    def this(texture: Texture[Resource], vertices: Unit, uvs: IArrayBuffer, indices: Unit, drawMode: DRAW_MODES) = this()
    def this(
      texture: Texture[Resource],
      vertices: Unit,
      uvs: IArrayBuffer,
      indices: IArrayBuffer,
      drawMode: DRAW_MODES
    ) = this()
    def this(texture: Texture[Resource], vertices: IArrayBuffer, uvs: Unit, indices: Unit, drawMode: DRAW_MODES) = this()
    def this(
      texture: Texture[Resource],
      vertices: IArrayBuffer,
      uvs: Unit,
      indices: IArrayBuffer,
      drawMode: DRAW_MODES
    ) = this()
    def this(
      texture: Texture[Resource],
      vertices: IArrayBuffer,
      uvs: IArrayBuffer,
      indices: Unit,
      drawMode: DRAW_MODES
    ) = this()
    def this(
      texture: Texture[Resource],
      vertices: IArrayBuffer,
      uvs: IArrayBuffer,
      indices: IArrayBuffer,
      drawMode: DRAW_MODES
    ) = this()
  }
  
  @JSImport("@pixi/mesh-extras", "SimplePlane")
  @js.native
  open class SimplePlane protected ()
    extends typings.pixiMeshExtras.libSimplePlaneMod.SimplePlane {
    /**
      * @param texture - The texture to use on the SimplePlane.
      * @param verticesX - The number of vertices in the x-axis
      * @param verticesY - The number of vertices in the y-axis
      */
    def this(texture: Texture[Resource]) = this()
    def this(texture: Texture[Resource], verticesX: Double) = this()
    def this(texture: Texture[Resource], verticesX: Double, verticesY: Double) = this()
    def this(texture: Texture[Resource], verticesX: Unit, verticesY: Double) = this()
  }
  
  @JSImport("@pixi/mesh-extras", "SimpleRope")
  @js.native
  open class SimpleRope protected ()
    extends typings.pixiMeshExtras.libSimpleRopeMod.SimpleRope {
    /**
      * Note: The wrap mode of the texture is set to REPEAT if `textureScale` is positive.
      * @param texture - The texture to use on the rope.
      * @param points - An array of {@link PIXI.Point} objects to construct this rope.
      * @param {number} textureScale - Optional. Positive values scale rope texture
      * keeping its aspect ratio. You can reduce alpha channel artifacts by providing a larger texture
      * and downsampling here. If set to zero, texture will be stretched instead.
      */
    def this(texture: Texture[Resource], points: js.Array[IPoint]) = this()
    def this(texture: Texture[Resource], points: js.Array[IPoint], textureScale: Double) = this()
  }
}
