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
  }
  
  @js.native
  class CanvasTexture protected ()
    extends typings.phaser.spine.canvas.CanvasTexture {
    def this(image: HTMLImageElement) = this()
  }
  
  @js.native
  class SkeletonRenderer protected ()
    extends typings.phaser.spine.canvas.SkeletonRenderer {
    def this(context: CanvasRenderingContext2D) = this()
  }
  
  /* static members */
  @js.native
  object SkeletonRenderer extends js.Object {
    var QUAD_TRIANGLES: js.Array[Double] = js.native
    var VERTEX_SIZE: Double = js.native
  }
  
}

