package typings.pixiDotJs.PIXI

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiDotJs.Anon_TRIANGLEMESH
import typings.pixiDotJs.PIXI.mesh.Mesh
import typings.pixiDotJs.PIXI.mesh.Plane
import typings.std.CanvasRenderingContext2D
import typings.std.Float32Array
import typings.std.Uint16Array
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
///////////////////////////////MESH///////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSGlobal("PIXI.mesh")
@js.native
object mesh extends js.Object {
  @js.native
  class CanvasMeshRenderer protected () extends js.Object {
    def this(renderer: CanvasRenderer) = this()
    var renderer: CanvasRenderer = js.native
    /* protected */ def _renderDrawTriangle(mesh: Mesh, index0: Double, index1: Double, index2: Double): Unit = js.native
    /* protected */ def _renderTriangleMesh(mesh: Mesh): Unit = js.native
    /* protected */ def _renderTriangles(mesh: Mesh): Unit = js.native
    def destroy(): Unit = js.native
    def render(mesh: Mesh): Unit = js.native
    /* protected */ def renderMeshFlat(mesh: Mesh): Unit = js.native
  }
  
  @js.native
  class Mesh protected () extends Container {
    def this(texture: Texture) = this()
    def this(texture: Texture, vertices: Float32Array) = this()
    def this(texture: Texture, vertices: Float32Array, uvs: Float32Array) = this()
    def this(texture: Texture, vertices: Float32Array, uvs: Float32Array, indices: Uint16Array) = this()
    def this(
      texture: Texture,
      vertices: Float32Array,
      uvs: Float32Array,
      indices: Uint16Array,
      drawMode: Double
    ) = this()
    var _geometryVersion: Double = js.native
    var _glDatas: NumberDictionary[js.Any] = js.native
    var _texture: Texture = js.native
    var _uvTransform: typings.pixiDotJs.PIXI.extras.TextureMatrix = js.native
    var autoUpdate: Boolean = js.native
    var blendMode: Double = js.native
    var canvasPadding: Double = js.native
    var dirty: Double = js.native
    var dirtyVertex: Boolean = js.native
    var drawMode: Double = js.native
    var indexDirty: Double = js.native
    var indices: Uint16Array = js.native
    var pluginName: String = js.native
    var texture: Texture = js.native
    var tint: Double = js.native
    var tintRgb: Float32Array = js.native
    var uploadUvTransform: Boolean = js.native
    var uvs: Float32Array = js.native
    var vertexDirty: Double = js.native
    var vertices: Float32Array = js.native
    /* protected */ def _onTextureUpdate(): Unit = js.native
    /* protected */ def _refresh(): Unit = js.native
    def containsPoint(point: Point): Boolean = js.native
    def multiplyUvs(): Unit = js.native
    def refresh(): Unit = js.native
    def refresh(forceUpdate: Boolean): Unit = js.native
  }
  
  @js.native
  class MeshRenderer protected () extends ObjectRenderer {
    def this(renderer: WebGLRenderer) = this()
    var shader: Shader = js.native
    def render(mesh: Mesh): Unit = js.native
  }
  
  @js.native
  class NineSlicePlane protected () extends Plane {
    def this(texture: Texture) = this()
    def this(texture: Texture, leftWidth: Double) = this()
    def this(texture: Texture, leftWidth: Double, topHeight: Double) = this()
    def this(texture: Texture, leftWidth: Double, topHeight: Double, rightWidth: Double) = this()
    def this(texture: Texture, leftWidth: Double, topHeight: Double, rightWidth: Double, bottomHeight: Double) = this()
    var _bottomHeight: Double = js.native
    var _height: Double = js.native
    var _leftWidth: Double = js.native
    var _origHeight: Double = js.native
    var _origWidth: Double = js.native
    var _rightWidth: Double = js.native
    var _topHeight: Double = js.native
    var _uvh: Double = js.native
    var _uvw: Double = js.native
    var _width: Double = js.native
    var bottomHeight: Double = js.native
    var leftWidth: Double = js.native
    var rightWidth: Double = js.native
    var topHeight: Double = js.native
    /* protected */ def drawSegment(
      context: CanvasRenderingContext2D,
      textureSource: js.Any,
      w: Double,
      h: Double,
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double
    ): Unit = js.native
    /* protected */ def drawSegment(
      context: WebGLRenderingContext,
      textureSource: js.Any,
      w: Double,
      h: Double,
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double
    ): Unit = js.native
    def updateHorizontalVertices(): Unit = js.native
    def updateVerticalVertices(): Unit = js.native
  }
  
  @js.native
  class Plane protected () extends Mesh {
    def this(texture: Texture) = this()
    def this(texture: Texture, verticesX: Double) = this()
    def this(texture: Texture, verticesX: Double, verticesY: Double) = this()
    var _ready: Boolean = js.native
    var verticesX: Double = js.native
    var verticesY: Double = js.native
    /* protected */ def _onTexureUpdate(): Unit = js.native
  }
  
  @js.native
  class Rope protected () extends Mesh {
    def this(texture: Texture, points: js.Array[Point]) = this()
    var colors: js.Array[Double] = js.native
    var points: js.Array[Point] = js.native
    def refreshVertices(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Mesh extends js.Object {
    var DRAW_MODES: Anon_TRIANGLEMESH = js.native
  }
  
}

