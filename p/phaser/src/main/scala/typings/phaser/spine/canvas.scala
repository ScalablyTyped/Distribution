package typings.phaser.spine

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.canvas")
@js.native
object canvas extends js.Object {
  @js.native
  class AssetManager ()
    extends typings.phaser.spine.AssetManager {
    def this(pathPrefix: String) = this()
  }
  
  @js.native
  class CanvasTexture protected () extends Texture {
    def this(image: HTMLImageElement) = this()
  }
  
  @js.native
  class SkeletonRenderer protected () extends js.Object {
    def this(context: CanvasRenderingContext2D) = this()
    var computeMeshVertices: js.Any = js.native
    var computeRegionVertices: js.Any = js.native
    var ctx: js.Any = js.native
    var debugRendering: Boolean = js.native
    var drawImages: js.Any = js.native
    var drawTriangle: js.Any = js.native
    var drawTriangles: js.Any = js.native
    var tempColor: js.Any = js.native
    var triangleRendering: Boolean = js.native
    var vertices: js.Any = js.native
    def draw(skeleton: Skeleton): Unit = js.native
  }
  
  /* static members */
  @js.native
  object SkeletonRenderer extends js.Object {
    var QUAD_TRIANGLES: js.Array[Double] = js.native
    var VERTEX_SIZE: Double = js.native
  }
  
}

