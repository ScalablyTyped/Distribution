package typings.pixiMeshExtras

import typings.pixiConstants.mod.DRAW_MODES
import typings.pixiCore.mod.IArrayBuffer
import typings.pixiCore.mod.ITypedArray
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiMath.mod.IPoint
import typings.pixiMesh.mod.Mesh
import typings.pixiMesh.mod.MeshGeometry
import typings.pixiMesh.mod.MeshMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/mesh-extras", "NineSlicePlane")
  @js.native
  open class NineSlicePlane protected ()
    extends SimplePlane
       with typings.pixiMeshExtras.GlobalMixins.NineSlicePlane {
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
    
    /**
      * The height of the bottom row (d)
      * @private
      */
    var _bottomHeight: Double = js.native
    
    /**
      * Returns the smaller of a set of vertical and horizontal scale of nine slice corners.
      * @returns Smaller number of vertical and horizontal scale.
      */
    /* private */ var _getMinScale: Any = js.native
    
    /**
      * The width of the left column (a).
      * @private
      */
    var _leftWidth: Double = js.native
    
    /* private */ var _origHeight: Any = js.native
    
    /* private */ var _origWidth: Any = js.native
    
    /** Refreshes NineSlicePlane coords. All of them. */
    /* private */ var _refresh: Any = js.native
    
    /**
      * The width of the right column (b)
      * @private
      */
    var _rightWidth: Double = js.native
    
    /**
      * The height of the top row (c)
      * @private
      */
    var _topHeight: Double = js.native
    
    /** The height of the bottom row. */
    def bottomHeight: Double = js.native
    def bottomHeight_=(value: Double): Unit = js.native
    
    /** The width of the left column. */
    def leftWidth: Double = js.native
    def leftWidth_=(value: Double): Unit = js.native
    
    /** The width of the right column. */
    def rightWidth: Double = js.native
    def rightWidth_=(value: Double): Unit = js.native
    
    /** The height of the top row. */
    def topHeight: Double = js.native
    def topHeight_=(value: Double): Unit = js.native
    
    /** Updates the horizontal vertices. */
    def updateHorizontalVertices(): Unit = js.native
    
    /** Updates the vertical vertices. */
    def updateVerticalVertices(): Unit = js.native
    
    def vertices: ITypedArray = js.native
    def vertices_=(value: ITypedArray): Unit = js.native
  }
  
  @JSImport("@pixi/mesh-extras", "PlaneGeometry")
  @js.native
  /**
    * @param width - The width of the plane.
    * @param height - The height of the plane.
    * @param segWidth - Number of horizontal segments.
    * @param segHeight - Number of vertical segments.
    */
  open class PlaneGeometry () extends MeshGeometry {
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
    
    /**
      * Refreshes plane coordinates
      * @private
      */
    def build(): Unit = js.native
    
    var height: Double = js.native
    
    var segHeight: Double = js.native
    
    var segWidth: Double = js.native
    
    var width: Double = js.native
  }
  
  @JSImport("@pixi/mesh-extras", "RopeGeometry")
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
  
  @JSImport("@pixi/mesh-extras", "SimpleMesh")
  @js.native
  /**
    * @param texture - The texture to use
    * @param {Float32Array} [vertices] - if you want to specify the vertices
    * @param {Float32Array} [uvs] - if you want to specify the uvs
    * @param {Uint16Array} [indices] - if you want to specify the indices
    * @param drawMode - the drawMode, can be any of the Mesh.DRAW_MODES consts
    */
  open class SimpleMesh () extends Mesh[MeshMaterial] {
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
    
    /** Upload vertices buffer each frame. */
    var autoUpdate: Boolean = js.native
    
    /**
      * Collection of vertices data.
      * @type {Float32Array}
      */
    def vertices: ITypedArray = js.native
    def vertices_=(value: ITypedArray): Unit = js.native
  }
  
  @JSImport("@pixi/mesh-extras", "SimplePlane")
  @js.native
  open class SimplePlane protected () extends Mesh[MeshMaterial] {
    /**
      * @param texture - The texture to use on the SimplePlane.
      * @param verticesX - The number of vertices in the x-axis
      * @param verticesY - The number of vertices in the y-axis
      */
    def this(texture: Texture[Resource]) = this()
    def this(texture: Texture[Resource], verticesX: Double) = this()
    def this(texture: Texture[Resource], verticesX: Double, verticesY: Double) = this()
    def this(texture: Texture[Resource], verticesX: Unit, verticesY: Double) = this()
    
    /* protected */ var _textureID: Double = js.native
    
    /** The geometry is automatically updated when the texture size changes. */
    var autoResize: Boolean = js.native
    
    /**
      * Method used for overrides, to do something in case texture frame was changed.
      * Meshes based on plane can override it and change more details based on texture.
      */
    def textureUpdated(): Unit = js.native
  }
  
  @JSImport("@pixi/mesh-extras", "SimpleRope")
  @js.native
  open class SimpleRope protected () extends Mesh[MeshMaterial] {
    /**
      * @param texture - The texture to use on the rope.
      * @param points - An array of {@link PIXI.Point} objects to construct this rope.
      * @param {number} textureScale - Optional. Positive values scale rope texture
      * keeping its aspect ratio. You can reduce alpha channel artifacts by providing a larger texture
      * and downsampling here. If set to zero, texture will be stretched instead.
      */
    def this(texture: Texture[Resource], points: js.Array[IPoint]) = this()
    def this(texture: Texture[Resource], points: js.Array[IPoint], textureScale: Double) = this()
    
    var autoUpdate: Boolean = js.native
  }
}
