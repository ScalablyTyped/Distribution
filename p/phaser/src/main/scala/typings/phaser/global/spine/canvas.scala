package typings.phaser.global.spine

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
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  @js.native
  class CanvasTexture protected ()
    extends typings.phaser.spine.canvas.CanvasTexture {
    def this(image: HTMLImageElement) = this()
    /* CompleteClass */
    override var _image: HTMLImageElement = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /* CompleteClass */
    override def getImage(): HTMLImageElement = js.native
    /* CompleteClass */
    override def setFilters(minFilter: typings.phaser.spine.TextureFilter, magFilter: typings.phaser.spine.TextureFilter): Unit = js.native
    /* CompleteClass */
    override def setWraps(uWrap: typings.phaser.spine.TextureWrap, vWrap: typings.phaser.spine.TextureWrap): Unit = js.native
  }
  
  @js.native
  class SkeletonRenderer protected ()
    extends typings.phaser.spine.canvas.SkeletonRenderer {
    def this(context: CanvasRenderingContext2D) = this()
    /* CompleteClass */
    override var computeMeshVertices: js.Any = js.native
    /* CompleteClass */
    override var computeRegionVertices: js.Any = js.native
    /* CompleteClass */
    override var ctx: js.Any = js.native
    /* CompleteClass */
    override var debugRendering: Boolean = js.native
    /* CompleteClass */
    override var drawImages: js.Any = js.native
    /* CompleteClass */
    override var drawTriangle: js.Any = js.native
    /* CompleteClass */
    override var drawTriangles: js.Any = js.native
    /* CompleteClass */
    override var tempColor: js.Any = js.native
    /* CompleteClass */
    override var triangleRendering: Boolean = js.native
    /* CompleteClass */
    override var vertices: js.Any = js.native
    /* CompleteClass */
    override def draw(skeleton: typings.phaser.spine.Skeleton): Unit = js.native
  }
  
  /* static members */
  @js.native
  object SkeletonRenderer extends js.Object {
    var QUAD_TRIANGLES: js.Array[Double] = js.native
    var VERTEX_SIZE: Double = js.native
  }
  
}

