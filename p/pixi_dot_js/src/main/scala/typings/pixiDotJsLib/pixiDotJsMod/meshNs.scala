package typings
package pixiDotJsLib.pixiDotJsMod

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
    extends pixiDotJsLib.PIXINs.meshNs.CanvasMeshRenderer {
    def this(renderer: pixiDotJsLib.PIXINs.CanvasRenderer) = this()
  }
  
  @js.native
  class Mesh protected ()
    extends pixiDotJsLib.PIXINs.meshNs.Mesh {
    def this(texture: pixiDotJsLib.PIXINs.Texture) = this()
    def this(texture: pixiDotJsLib.PIXINs.Texture, vertices: stdLib.Float32Array) = this()
    def this(texture: pixiDotJsLib.PIXINs.Texture, vertices: stdLib.Float32Array, uvs: stdLib.Float32Array) = this()
    def this(texture: pixiDotJsLib.PIXINs.Texture, vertices: stdLib.Float32Array, uvs: stdLib.Float32Array, indices: stdLib.Uint16Array) = this()
    def this(texture: pixiDotJsLib.PIXINs.Texture, vertices: stdLib.Float32Array, uvs: stdLib.Float32Array, indices: stdLib.Uint16Array, drawMode: scala.Double) = this()
  }
  
  @js.native
  class MeshRenderer protected ()
    extends pixiDotJsLib.PIXINs.meshNs.MeshRenderer {
    def this(renderer: pixiDotJsLib.PIXINs.WebGLRenderer) = this()
  }
  
  @js.native
  class NineSlicePlane protected ()
    extends pixiDotJsLib.PIXINs.meshNs.NineSlicePlane {
    def this(texture: pixiDotJsLib.PIXINs.Texture) = this()
    def this(texture: pixiDotJsLib.PIXINs.Texture, leftWidth: scala.Double) = this()
    def this(texture: pixiDotJsLib.PIXINs.Texture, leftWidth: scala.Double, topHeight: scala.Double) = this()
    def this(texture: pixiDotJsLib.PIXINs.Texture, leftWidth: scala.Double, topHeight: scala.Double, rightWidth: scala.Double) = this()
    def this(texture: pixiDotJsLib.PIXINs.Texture, leftWidth: scala.Double, topHeight: scala.Double, rightWidth: scala.Double, bottomHeight: scala.Double) = this()
  }
  
  @js.native
  class Plane protected ()
    extends pixiDotJsLib.PIXINs.meshNs.Plane {
    def this(texture: pixiDotJsLib.PIXINs.Texture) = this()
    def this(texture: pixiDotJsLib.PIXINs.Texture, verticesX: scala.Double) = this()
    def this(texture: pixiDotJsLib.PIXINs.Texture, verticesX: scala.Double, verticesY: scala.Double) = this()
  }
  
  @js.native
  class Rope protected ()
    extends pixiDotJsLib.PIXINs.meshNs.Rope {
    def this(texture: pixiDotJsLib.PIXINs.Texture, points: js.Array[pixiDotJsLib.PIXINs.Point]) = this()
  }
  
  @js.native
  object Mesh extends js.Object {
    var DRAW_MODES: pixiDotJsLib.Anon_TRIANGLEMESH = js.native
  }
  
}

