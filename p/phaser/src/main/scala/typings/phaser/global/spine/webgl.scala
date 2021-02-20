package typings.phaser.global.spine

import typings.phaser.spine.webgl.VertexAttributeType
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgl {
  
  @JSGlobal("spine.webgl.AssetManager")
  @js.native
  class AssetManager protected ()
    extends typings.phaser.spine.AssetManager {
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(context: WebGLRenderingContext) = this()
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext, pathPrefix: String) = this()
    def this(context: WebGLRenderingContext, pathPrefix: String) = this()
  }
  
  @JSGlobal("spine.webgl.Color2Attribute")
  @js.native
  class Color2Attribute ()
    extends typings.phaser.spine.webgl.VertexAttribute
  
  @JSGlobal("spine.webgl.ColorAttribute")
  @js.native
  class ColorAttribute ()
    extends typings.phaser.spine.webgl.VertexAttribute
  
  @JSGlobal("spine.webgl.GLTexture")
  @js.native
  class GLTexture protected ()
    extends typings.phaser.spine.webgl.GLTexture {
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext, image: HTMLImageElement) = this()
    def this(context: WebGLRenderingContext, image: HTMLImageElement) = this()
    def this(
      context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
      image: HTMLImageElement,
      useMipMaps: Boolean
    ) = this()
    def this(context: WebGLRenderingContext, image: HTMLImageElement, useMipMaps: Boolean) = this()
  }
  
  @JSGlobal("spine.webgl.M00")
  @js.native
  val M00: /* 0 */ Double = js.native
  
  @JSGlobal("spine.webgl.M01")
  @js.native
  val M01: /* 4 */ Double = js.native
  
  @JSGlobal("spine.webgl.M02")
  @js.native
  val M02: /* 8 */ Double = js.native
  
  @JSGlobal("spine.webgl.M03")
  @js.native
  val M03: /* 12 */ Double = js.native
  
  @JSGlobal("spine.webgl.M10")
  @js.native
  val M10: /* 1 */ Double = js.native
  
  @JSGlobal("spine.webgl.M11")
  @js.native
  val M11: /* 5 */ Double = js.native
  
  @JSGlobal("spine.webgl.M12")
  @js.native
  val M12: /* 9 */ Double = js.native
  
  @JSGlobal("spine.webgl.M13")
  @js.native
  val M13: /* 13 */ Double = js.native
  
  @JSGlobal("spine.webgl.M20")
  @js.native
  val M20: /* 2 */ Double = js.native
  
  @JSGlobal("spine.webgl.M21")
  @js.native
  val M21: /* 6 */ Double = js.native
  
  @JSGlobal("spine.webgl.M22")
  @js.native
  val M22: /* 10 */ Double = js.native
  
  @JSGlobal("spine.webgl.M23")
  @js.native
  val M23: /* 14 */ Double = js.native
  
  @JSGlobal("spine.webgl.M30")
  @js.native
  val M30: /* 3 */ Double = js.native
  
  @JSGlobal("spine.webgl.M31")
  @js.native
  val M31: /* 7 */ Double = js.native
  
  @JSGlobal("spine.webgl.M32")
  @js.native
  val M32: /* 11 */ Double = js.native
  
  @JSGlobal("spine.webgl.M33")
  @js.native
  val M33: /* 15 */ Double = js.native
  
  @JSGlobal("spine.webgl.ManagedWebGLRenderingContext")
  @js.native
  class ManagedWebGLRenderingContext protected ()
    extends typings.phaser.spine.webgl.ManagedWebGLRenderingContext {
    def this(canvasOrContext: HTMLCanvasElement) = this()
    def this(canvasOrContext: WebGLRenderingContext) = this()
    def this(canvasOrContext: HTMLCanvasElement, contextConfig: js.Any) = this()
    def this(canvasOrContext: WebGLRenderingContext, contextConfig: js.Any) = this()
  }
  
  @JSGlobal("spine.webgl.Matrix4")
  @js.native
  class Matrix4 ()
    extends typings.phaser.spine.webgl.Matrix4
  object Matrix4 {
    
    @JSGlobal("spine.webgl.Matrix4")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.Matrix4.initTemps")
    @js.native
    def initTemps(): Unit = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.Matrix4.tmpMatrix")
    @js.native
    def tmpMatrix: js.Any = js.native
    @scala.inline
    def tmpMatrix_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tmpMatrix")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Matrix4.xAxis")
    @js.native
    def xAxis: js.Any = js.native
    @scala.inline
    def xAxis_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Matrix4.yAxis")
    @js.native
    def yAxis: js.Any = js.native
    @scala.inline
    def yAxis_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Matrix4.zAxis")
    @js.native
    def zAxis: js.Any = js.native
    @scala.inline
    def zAxis_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zAxis")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("spine.webgl.Mesh")
  @js.native
  class Mesh protected ()
    extends typings.phaser.spine.webgl.Mesh {
    def this(
      context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
      attributes: js.Array[typings.phaser.spine.webgl.VertexAttribute],
      maxVertices: Double,
      maxIndices: Double
    ) = this()
    def this(
      context: WebGLRenderingContext,
      attributes: js.Array[typings.phaser.spine.webgl.VertexAttribute],
      maxVertices: Double,
      maxIndices: Double
    ) = this()
  }
  
  @JSGlobal("spine.webgl.OrthoCamera")
  @js.native
  class OrthoCamera protected ()
    extends typings.phaser.spine.webgl.OrthoCamera {
    def this(viewportWidth: Double, viewportHeight: Double) = this()
  }
  
  @JSGlobal("spine.webgl.PolygonBatcher")
  @js.native
  class PolygonBatcher protected ()
    extends typings.phaser.spine.webgl.PolygonBatcher {
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(context: WebGLRenderingContext) = this()
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext, twoColorTint: Boolean) = this()
    def this(context: WebGLRenderingContext, twoColorTint: Boolean) = this()
    def this(
      context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
      twoColorTint: js.UndefOr[scala.Nothing],
      maxVertices: Double
    ) = this()
    def this(
      context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
      twoColorTint: Boolean,
      maxVertices: Double
    ) = this()
    def this(context: WebGLRenderingContext, twoColorTint: js.UndefOr[scala.Nothing], maxVertices: Double) = this()
    def this(context: WebGLRenderingContext, twoColorTint: Boolean, maxVertices: Double) = this()
  }
  
  @JSGlobal("spine.webgl.Position2Attribute")
  @js.native
  class Position2Attribute ()
    extends typings.phaser.spine.webgl.VertexAttribute
  
  @JSGlobal("spine.webgl.Position3Attribute")
  @js.native
  class Position3Attribute ()
    extends typings.phaser.spine.webgl.VertexAttribute
  
  @JSGlobal("spine.webgl.ResizeMode")
  @js.native
  object ResizeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.phaser.spine.webgl.ResizeMode with Double] = js.native
    
    /* 1 */ val Expand: typings.phaser.spine.webgl.ResizeMode.Expand with Double = js.native
    
    /* 2 */ val Fit: typings.phaser.spine.webgl.ResizeMode.Fit with Double = js.native
    
    /* 0 */ val Stretch: typings.phaser.spine.webgl.ResizeMode.Stretch with Double = js.native
  }
  
  @JSGlobal("spine.webgl.SceneRenderer")
  @js.native
  class SceneRenderer protected ()
    extends typings.phaser.spine.webgl.SceneRenderer {
    def this(canvas: HTMLCanvasElement, context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(canvas: HTMLCanvasElement, context: WebGLRenderingContext) = this()
    def this(
      canvas: HTMLCanvasElement,
      context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
      twoColorTint: Boolean
    ) = this()
    def this(canvas: HTMLCanvasElement, context: WebGLRenderingContext, twoColorTint: Boolean) = this()
  }
  
  @JSGlobal("spine.webgl.Shader")
  @js.native
  class Shader protected ()
    extends typings.phaser.spine.webgl.Shader {
    def this(
      context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
      vertexShader: String,
      fragmentShader: String
    ) = this()
    def this(context: WebGLRenderingContext, vertexShader: String, fragmentShader: String) = this()
  }
  object Shader {
    
    @JSGlobal("spine.webgl.Shader")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.COLOR")
    @js.native
    def COLOR: String = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.COLOR2")
    @js.native
    def COLOR2: String = js.native
    @scala.inline
    def COLOR2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLOR2")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def COLOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLOR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.MVP_MATRIX")
    @js.native
    def MVP_MATRIX: String = js.native
    @scala.inline
    def MVP_MATRIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MVP_MATRIX")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.POSITION")
    @js.native
    def POSITION: String = js.native
    @scala.inline
    def POSITION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.SAMPLER")
    @js.native
    def SAMPLER: String = js.native
    @scala.inline
    def SAMPLER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAMPLER")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.TEXCOORDS")
    @js.native
    def TEXCOORDS: String = js.native
    @scala.inline
    def TEXCOORDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXCOORDS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.newColored")
    @js.native
    def newColored(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext): typings.phaser.spine.webgl.Shader = js.native
    @JSGlobal("spine.webgl.Shader.newColored")
    @js.native
    def newColored(context: WebGLRenderingContext): typings.phaser.spine.webgl.Shader = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.newColoredTextured")
    @js.native
    def newColoredTextured(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext): typings.phaser.spine.webgl.Shader = js.native
    @JSGlobal("spine.webgl.Shader.newColoredTextured")
    @js.native
    def newColoredTextured(context: WebGLRenderingContext): typings.phaser.spine.webgl.Shader = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.newTwoColoredTextured")
    @js.native
    def newTwoColoredTextured(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext): typings.phaser.spine.webgl.Shader = js.native
    @JSGlobal("spine.webgl.Shader.newTwoColoredTextured")
    @js.native
    def newTwoColoredTextured(context: WebGLRenderingContext): typings.phaser.spine.webgl.Shader = js.native
  }
  
  @JSGlobal("spine.webgl.ShapeRenderer")
  @js.native
  class ShapeRenderer protected ()
    extends typings.phaser.spine.webgl.ShapeRenderer {
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(context: WebGLRenderingContext) = this()
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext, maxVertices: Double) = this()
    def this(context: WebGLRenderingContext, maxVertices: Double) = this()
  }
  
  @JSGlobal("spine.webgl.ShapeType")
  @js.native
  object ShapeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.phaser.spine.webgl.ShapeType with Double] = js.native
    
    /* 4 */ val Filled: typings.phaser.spine.webgl.ShapeType.Filled with Double = js.native
    
    /* 1 */ val Line: typings.phaser.spine.webgl.ShapeType.Line with Double = js.native
    
    /* 0 */ val Point: typings.phaser.spine.webgl.ShapeType.Point with Double = js.native
  }
  
  @JSGlobal("spine.webgl.SkeletonDebugRenderer")
  @js.native
  class SkeletonDebugRenderer protected ()
    extends typings.phaser.spine.webgl.SkeletonDebugRenderer {
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(context: WebGLRenderingContext) = this()
  }
  object SkeletonDebugRenderer {
    
    @JSGlobal("spine.webgl.SkeletonDebugRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.SkeletonDebugRenderer.GREEN")
    @js.native
    def GREEN: js.Any = js.native
    @scala.inline
    def GREEN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREEN")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.SkeletonDebugRenderer.LIGHT_GRAY")
    @js.native
    def LIGHT_GRAY: js.Any = js.native
    @scala.inline
    def LIGHT_GRAY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHT_GRAY")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("spine.webgl.SkeletonRenderer")
  @js.native
  class SkeletonRenderer protected ()
    extends typings.phaser.spine.webgl.SkeletonRenderer {
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext, twoColorTint: Boolean) = this()
  }
  object SkeletonRenderer {
    
    @JSGlobal("spine.webgl.SkeletonRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.SkeletonRenderer.QUAD_TRIANGLES")
    @js.native
    def QUAD_TRIANGLES: js.Array[Double] = js.native
    @scala.inline
    def QUAD_TRIANGLES_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUAD_TRIANGLES")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("spine.webgl.TexCoordAttribute")
  @js.native
  class TexCoordAttribute ()
    extends typings.phaser.spine.webgl.VertexAttribute {
    def this(unit: Double) = this()
  }
  
  @JSGlobal("spine.webgl.Vector3")
  @js.native
  class Vector3 ()
    extends typings.phaser.spine.webgl.Vector3 {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
  }
  
  @JSGlobal("spine.webgl.VertexAttribute")
  @js.native
  class VertexAttribute protected ()
    extends typings.phaser.spine.webgl.VertexAttribute {
    def this(name: String, `type`: VertexAttributeType, numElements: Double) = this()
  }
  
  @JSGlobal("spine.webgl.VertexAttributeType")
  @js.native
  object VertexAttributeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.phaser.spine.webgl.VertexAttributeType with Double] = js.native
    
    /* 0 */ val Float: typings.phaser.spine.webgl.VertexAttributeType.Float with Double = js.native
  }
  
  @JSGlobal("spine.webgl.WebGLBlendModeConverter")
  @js.native
  class WebGLBlendModeConverter ()
    extends typings.phaser.spine.webgl.WebGLBlendModeConverter
  object WebGLBlendModeConverter {
    
    @JSGlobal("spine.webgl.WebGLBlendModeConverter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.DST_ALPHA")
    @js.native
    def DST_ALPHA: Double = js.native
    @scala.inline
    def DST_ALPHA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DST_ALPHA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.DST_COLOR")
    @js.native
    def DST_COLOR: Double = js.native
    @scala.inline
    def DST_COLOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DST_COLOR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.ONE")
    @js.native
    def ONE: Double = js.native
    @scala.inline
    def ONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.ONE_MINUS_DST_ALPHA")
    @js.native
    def ONE_MINUS_DST_ALPHA: Double = js.native
    @scala.inline
    def ONE_MINUS_DST_ALPHA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE_MINUS_DST_ALPHA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.ONE_MINUS_SRC_ALPHA")
    @js.native
    def ONE_MINUS_SRC_ALPHA: Double = js.native
    @scala.inline
    def ONE_MINUS_SRC_ALPHA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE_MINUS_SRC_ALPHA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.ONE_MINUS_SRC_COLOR")
    @js.native
    def ONE_MINUS_SRC_COLOR: Double = js.native
    @scala.inline
    def ONE_MINUS_SRC_COLOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE_MINUS_SRC_COLOR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.SRC_ALPHA")
    @js.native
    def SRC_ALPHA: Double = js.native
    @scala.inline
    def SRC_ALPHA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SRC_ALPHA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.SRC_COLOR")
    @js.native
    def SRC_COLOR: Double = js.native
    @scala.inline
    def SRC_COLOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SRC_COLOR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.ZERO")
    @js.native
    def ZERO: Double = js.native
    @scala.inline
    def ZERO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.getDestGLBlendMode")
    @js.native
    def getDestGLBlendMode(blendMode: typings.phaser.spine.BlendMode): Double = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.getSourceGLBlendMode")
    @js.native
    def getSourceGLBlendMode(blendMode: typings.phaser.spine.BlendMode): Double = js.native
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.getSourceGLBlendMode")
    @js.native
    def getSourceGLBlendMode(blendMode: typings.phaser.spine.BlendMode, premultipliedAlpha: Boolean): Double = js.native
  }
}
