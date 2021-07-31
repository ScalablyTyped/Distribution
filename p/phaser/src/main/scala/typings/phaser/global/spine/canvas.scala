package typings.phaser.global.spine

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvas {
  
  @JSGlobal("spine.canvas.AssetManager")
  @js.native
  class AssetManager ()
    extends StObject
       with typings.phaser.spine.AssetManager {
    def this(pathPrefix: String) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  @JSGlobal("spine.canvas.CanvasTexture")
  @js.native
  class CanvasTexture protected ()
    extends StObject
       with typings.phaser.spine.canvas.CanvasTexture {
    def this(image: HTMLImageElement) = this()
    
    /* CompleteClass */
    var _image: HTMLImageElement = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def getImage(): HTMLImageElement = js.native
    
    /* CompleteClass */
    override def setFilters(minFilter: typings.phaser.spine.TextureFilter, magFilter: typings.phaser.spine.TextureFilter): Unit = js.native
    
    /* CompleteClass */
    override def setWraps(uWrap: typings.phaser.spine.TextureWrap, vWrap: typings.phaser.spine.TextureWrap): Unit = js.native
  }
  
  @JSGlobal("spine.canvas.SkeletonRenderer")
  @js.native
  class SkeletonRenderer protected ()
    extends StObject
       with typings.phaser.spine.canvas.SkeletonRenderer {
    def this(context: CanvasRenderingContext2D) = this()
    
    /* CompleteClass */
    var computeMeshVertices: js.Any = js.native
    
    /* CompleteClass */
    var computeRegionVertices: js.Any = js.native
    
    /* CompleteClass */
    var ctx: js.Any = js.native
    
    /* CompleteClass */
    var debugRendering: Boolean = js.native
    
    /* CompleteClass */
    override def draw(skeleton: typings.phaser.spine.Skeleton): Unit = js.native
    
    /* CompleteClass */
    var drawImages: js.Any = js.native
    
    /* CompleteClass */
    var drawTriangle: js.Any = js.native
    
    /* CompleteClass */
    var drawTriangles: js.Any = js.native
    
    /* CompleteClass */
    var tempColor: js.Any = js.native
    
    /* CompleteClass */
    var triangleRendering: Boolean = js.native
    
    /* CompleteClass */
    var vertices: js.Any = js.native
  }
  object SkeletonRenderer {
    
    @JSGlobal("spine.canvas.SkeletonRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("spine.canvas.SkeletonRenderer.QUAD_TRIANGLES")
    @js.native
    def QUAD_TRIANGLES: js.Array[Double] = js.native
    @scala.inline
    def QUAD_TRIANGLES_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUAD_TRIANGLES")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.canvas.SkeletonRenderer.VERTEX_SIZE")
    @js.native
    def VERTEX_SIZE: Double = js.native
    @scala.inline
    def VERTEX_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTEX_SIZE")(x.asInstanceOf[js.Any])
  }
}
