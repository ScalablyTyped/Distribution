package typings.pixiDotJs.pixiDotJsMod

import typings.pixiDotJs.Anon_TRIANGLEMESH
import typings.std.Float32Array
import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
///////////////////////////////MESH///////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "mesh")
@js.native
object meshNs extends js.Object {
  @js.native
  class CanvasMeshRenderer protected ()
    extends typings.pixiDotJs.PIXINs.meshNs.CanvasMeshRenderer {
    def this(renderer: typings.pixiDotJs.PIXINs.CanvasRenderer) = this()
  }
  
  @js.native
  class Mesh protected ()
    extends typings.pixiDotJs.PIXINs.meshNs.Mesh {
    def this(texture: typings.pixiDotJs.PIXINs.Texture) = this()
    def this(texture: typings.pixiDotJs.PIXINs.Texture, vertices: Float32Array) = this()
    def this(texture: typings.pixiDotJs.PIXINs.Texture, vertices: Float32Array, uvs: Float32Array) = this()
    def this(
      texture: typings.pixiDotJs.PIXINs.Texture,
      vertices: Float32Array,
      uvs: Float32Array,
      indices: Uint16Array
    ) = this()
    def this(
      texture: typings.pixiDotJs.PIXINs.Texture,
      vertices: Float32Array,
      uvs: Float32Array,
      indices: Uint16Array,
      drawMode: Double
    ) = this()
  }
  
  @js.native
  class MeshRenderer protected ()
    extends typings.pixiDotJs.PIXINs.meshNs.MeshRenderer {
    def this(renderer: typings.pixiDotJs.PIXINs.WebGLRenderer) = this()
  }
  
  @js.native
  class NineSlicePlane protected ()
    extends typings.pixiDotJs.PIXINs.meshNs.NineSlicePlane {
    def this(texture: typings.pixiDotJs.PIXINs.Texture) = this()
    def this(texture: typings.pixiDotJs.PIXINs.Texture, leftWidth: Double) = this()
    def this(texture: typings.pixiDotJs.PIXINs.Texture, leftWidth: Double, topHeight: Double) = this()
    def this(
      texture: typings.pixiDotJs.PIXINs.Texture,
      leftWidth: Double,
      topHeight: Double,
      rightWidth: Double
    ) = this()
    def this(
      texture: typings.pixiDotJs.PIXINs.Texture,
      leftWidth: Double,
      topHeight: Double,
      rightWidth: Double,
      bottomHeight: Double
    ) = this()
  }
  
  @js.native
  class Plane protected ()
    extends typings.pixiDotJs.PIXINs.meshNs.Plane {
    def this(texture: typings.pixiDotJs.PIXINs.Texture) = this()
    def this(texture: typings.pixiDotJs.PIXINs.Texture, verticesX: Double) = this()
    def this(texture: typings.pixiDotJs.PIXINs.Texture, verticesX: Double, verticesY: Double) = this()
  }
  
  @js.native
  class Rope protected ()
    extends typings.pixiDotJs.PIXINs.meshNs.Rope {
    def this(texture: typings.pixiDotJs.PIXINs.Texture, points: js.Array[typings.pixiDotJs.PIXINs.Point]) = this()
  }
  
  /* static members */
  @js.native
  object Mesh extends js.Object {
    var DRAW_MODES: Anon_TRIANGLEMESH = js.native
  }
  
}

