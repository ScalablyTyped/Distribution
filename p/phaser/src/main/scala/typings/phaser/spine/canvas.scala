package typings.phaser.spine

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvas {
  
  type AssetManager = typings.phaser.spine.AssetManager
  
  trait CanvasTexture
    extends StObject
       with Texture
  object CanvasTexture {
    
    @scala.inline
    def apply(
      _image: HTMLImageElement,
      dispose: () => Unit,
      getImage: () => HTMLImageElement,
      setFilters: (TextureFilter, TextureFilter) => Unit,
      setWraps: (TextureWrap, TextureWrap) => Unit
    ): CanvasTexture = {
      val __obj = js.Dynamic.literal(_image = _image.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getImage = js.Any.fromFunction0(getImage), setFilters = js.Any.fromFunction2(setFilters), setWraps = js.Any.fromFunction2(setWraps))
      __obj.asInstanceOf[CanvasTexture]
    }
  }
  
  trait SkeletonRenderer extends StObject {
    
    var computeMeshVertices: js.Any
    
    var computeRegionVertices: js.Any
    
    var ctx: js.Any
    
    var debugRendering: Boolean
    
    def draw(skeleton: Skeleton): Unit
    
    var drawImages: js.Any
    
    var drawTriangle: js.Any
    
    var drawTriangles: js.Any
    
    var tempColor: js.Any
    
    var triangleRendering: Boolean
    
    var vertices: js.Any
  }
  object SkeletonRenderer {
    
    @scala.inline
    def apply(
      computeMeshVertices: js.Any,
      computeRegionVertices: js.Any,
      ctx: js.Any,
      debugRendering: Boolean,
      draw: Skeleton => Unit,
      drawImages: js.Any,
      drawTriangle: js.Any,
      drawTriangles: js.Any,
      tempColor: js.Any,
      triangleRendering: Boolean,
      vertices: js.Any
    ): SkeletonRenderer = {
      val __obj = js.Dynamic.literal(computeMeshVertices = computeMeshVertices.asInstanceOf[js.Any], computeRegionVertices = computeRegionVertices.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], debugRendering = debugRendering.asInstanceOf[js.Any], draw = js.Any.fromFunction1(draw), drawImages = drawImages.asInstanceOf[js.Any], drawTriangle = drawTriangle.asInstanceOf[js.Any], drawTriangles = drawTriangles.asInstanceOf[js.Any], tempColor = tempColor.asInstanceOf[js.Any], triangleRendering = triangleRendering.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonRenderer]
    }
    
    @scala.inline
    implicit class SkeletonRendererMutableBuilder[Self <: SkeletonRenderer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputeMeshVertices(value: js.Any): Self = StObject.set(x, "computeMeshVertices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputeRegionVertices(value: js.Any): Self = StObject.set(x, "computeRegionVertices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtx(value: js.Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugRendering(value: Boolean): Self = StObject.set(x, "debugRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraw(value: Skeleton => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawImages(value: js.Any): Self = StObject.set(x, "drawImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawTriangle(value: js.Any): Self = StObject.set(x, "drawTriangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawTriangles(value: js.Any): Self = StObject.set(x, "drawTriangles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempColor(value: js.Any): Self = StObject.set(x, "tempColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriangleRendering(value: Boolean): Self = StObject.set(x, "triangleRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertices(value: js.Any): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    }
  }
}
