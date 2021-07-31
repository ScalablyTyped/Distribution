package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Restorable
import typings.phaser.spine.webgl.VertexAttributeType
import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.OffscreenCanvas
import typings.std.Uint16Array
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgl {
  
  @JSGlobal("spine.webgl.AssetManager")
  @js.native
  class AssetManager protected ()
    extends StObject
       with typings.phaser.spine.AssetManager {
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(context: WebGLRenderingContext) = this()
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext, pathPrefix: String) = this()
    def this(context: WebGLRenderingContext, pathPrefix: String) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  @JSGlobal("spine.webgl.Color2Attribute")
  @js.native
  class Color2Attribute ()
    extends StObject
       with typings.phaser.spine.webgl.VertexAttribute {
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var numElements: Double = js.native
    
    /* CompleteClass */
    var `type`: VertexAttributeType = js.native
  }
  
  @JSGlobal("spine.webgl.ColorAttribute")
  @js.native
  class ColorAttribute ()
    extends StObject
       with typings.phaser.spine.webgl.VertexAttribute {
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var numElements: Double = js.native
    
    /* CompleteClass */
    var `type`: VertexAttributeType = js.native
  }
  
  @JSGlobal("spine.webgl.GLTexture")
  @js.native
  class GLTexture protected ()
    extends StObject
       with typings.phaser.spine.webgl.GLTexture {
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext, image: HTMLImageElement) = this()
    def this(context: WebGLRenderingContext, image: HTMLImageElement) = this()
    def this(
      context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
      image: HTMLImageElement,
      useMipMaps: Boolean
    ) = this()
    def this(context: WebGLRenderingContext, image: HTMLImageElement, useMipMaps: Boolean) = this()
    
    /* CompleteClass */
    var _image: HTMLImageElement = js.native
    
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def getImage(): HTMLImageElement = js.native
    
    /* CompleteClass */
    override def restore(): Unit = js.native
    
    /* CompleteClass */
    override def setFilters(minFilter: typings.phaser.spine.TextureFilter, magFilter: typings.phaser.spine.TextureFilter): Unit = js.native
    
    /* CompleteClass */
    override def setWraps(uWrap: typings.phaser.spine.TextureWrap, vWrap: typings.phaser.spine.TextureWrap): Unit = js.native
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
    extends StObject
       with typings.phaser.spine.webgl.ManagedWebGLRenderingContext {
    def this(canvasOrContext: HTMLCanvasElement) = this()
    def this(canvasOrContext: WebGLRenderingContext) = this()
    def this(canvasOrContext: HTMLCanvasElement, contextConfig: js.Any) = this()
    def this(canvasOrContext: WebGLRenderingContext, contextConfig: js.Any) = this()
    
    /* CompleteClass */
    override def addRestorable(restorable: Restorable): Unit = js.native
    
    /* CompleteClass */
    var canvas: HTMLCanvasElement | OffscreenCanvas = js.native
    
    /* CompleteClass */
    var gl: WebGLRenderingContext = js.native
    
    /* CompleteClass */
    override def removeRestorable(restorable: Restorable): Unit = js.native
    
    /* CompleteClass */
    var restorables: js.Any = js.native
  }
  
  @JSGlobal("spine.webgl.Matrix4")
  @js.native
  class Matrix4 ()
    extends StObject
       with typings.phaser.spine.webgl.Matrix4 {
    
    /* CompleteClass */
    override def copy(): typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def determinant(): Double = js.native
    
    /* CompleteClass */
    override def identity(): typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def invert(): typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def lookAt(
      position: typings.phaser.spine.webgl.Vector3,
      direction: typings.phaser.spine.webgl.Vector3,
      up: typings.phaser.spine.webgl.Vector3
    ): this.type = js.native
    
    /* CompleteClass */
    override def multiply(matrix: typings.phaser.spine.webgl.Matrix4): typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def multiplyLeft(matrix: typings.phaser.spine.webgl.Matrix4): typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def ortho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def ortho2d(x: Double, y: Double, width: Double, height: Double): typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def projection(near: Double, far: Double, fovy: Double, aspectRatio: Double): typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def set(values: ArrayLike[Double]): typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    var temp: Float32Array = js.native
    
    /* CompleteClass */
    override def translate(x: Double, y: Double, z: Double): typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def transpose(): typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    var values: Float32Array = js.native
  }
  object Matrix4 {
    
    @JSGlobal("spine.webgl.Matrix4")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def initTemps(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initTemps")().asInstanceOf[Unit]
    
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
    extends StObject
       with typings.phaser.spine.webgl.Mesh {
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
    
    /* CompleteClass */
    var attributes: js.Any = js.native
    
    /* CompleteClass */
    override def bind(shader: typings.phaser.spine.webgl.Shader): Unit = js.native
    
    /* CompleteClass */
    var context: js.Any = js.native
    
    /* CompleteClass */
    var dirtyIndices: js.Any = js.native
    
    /* CompleteClass */
    var dirtyVertices: js.Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def draw(shader: typings.phaser.spine.webgl.Shader, primitiveType: Double): Unit = js.native
    
    /* CompleteClass */
    override def drawWithOffset(shader: typings.phaser.spine.webgl.Shader, primitiveType: Double, offset: Double, count: Double): Unit = js.native
    
    /* CompleteClass */
    var elementsPerVertex: js.Any = js.native
    
    /* CompleteClass */
    override def getAttributes(): js.Array[typings.phaser.spine.webgl.VertexAttribute] = js.native
    
    /* CompleteClass */
    override def getIndices(): Uint16Array = js.native
    
    /* CompleteClass */
    override def getVertexSizeInFloats(): Double = js.native
    
    /* CompleteClass */
    override def getVertices(): Float32Array = js.native
    
    /* CompleteClass */
    var indices: js.Any = js.native
    
    /* CompleteClass */
    var indicesBuffer: js.Any = js.native
    
    /* CompleteClass */
    var indicesLength: js.Any = js.native
    
    /* CompleteClass */
    override def maxIndices(): Double = js.native
    
    /* CompleteClass */
    override def maxVertices(): Double = js.native
    
    /* CompleteClass */
    override def numIndices(): Double = js.native
    
    /* CompleteClass */
    override def numVertices(): Double = js.native
    
    /* CompleteClass */
    override def restore(): Unit = js.native
    
    /* CompleteClass */
    override def setIndices(indices: js.Array[Double]): Unit = js.native
    
    /* CompleteClass */
    override def setIndicesLength(length: Double): Unit = js.native
    
    /* CompleteClass */
    override def setVertices(vertices: js.Array[Double]): Unit = js.native
    
    /* CompleteClass */
    override def setVerticesLength(length: Double): Unit = js.native
    
    /* CompleteClass */
    override def unbind(shader: typings.phaser.spine.webgl.Shader): Unit = js.native
    
    /* CompleteClass */
    var update: js.Any = js.native
    
    /* CompleteClass */
    var vertices: js.Any = js.native
    
    /* CompleteClass */
    var verticesBuffer: js.Any = js.native
    
    /* CompleteClass */
    var verticesLength: js.Any = js.native
  }
  
  @JSGlobal("spine.webgl.OrthoCamera")
  @js.native
  class OrthoCamera protected ()
    extends StObject
       with typings.phaser.spine.webgl.OrthoCamera {
    def this(viewportWidth: Double, viewportHeight: Double) = this()
    
    /* CompleteClass */
    var direction: typings.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    var far: Double = js.native
    
    /* CompleteClass */
    var inverseProjectionView: typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    var near: Double = js.native
    
    /* CompleteClass */
    var position: typings.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    var projection: typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    var projectionView: typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def screenToWorld(screenCoords: typings.phaser.spine.webgl.Vector3, screenWidth: Double, screenHeight: Double): typings.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def setViewport(viewportWidth: Double, viewportHeight: Double): Unit = js.native
    
    /* CompleteClass */
    var tmp: js.Any = js.native
    
    /* CompleteClass */
    var up: typings.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /* CompleteClass */
    var view: typings.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    var viewportHeight: Double = js.native
    
    /* CompleteClass */
    var viewportWidth: Double = js.native
    
    /* CompleteClass */
    var zoom: Double = js.native
  }
  
  @JSGlobal("spine.webgl.PolygonBatcher")
  @js.native
  class PolygonBatcher protected ()
    extends StObject
       with typings.phaser.spine.webgl.PolygonBatcher {
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(context: WebGLRenderingContext) = this()
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext, twoColorTint: Boolean) = this()
    def this(context: WebGLRenderingContext, twoColorTint: Boolean) = this()
    def this(
      context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
      twoColorTint: Boolean,
      maxVertices: Double
    ) = this()
    def this(
      context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
      twoColorTint: Unit,
      maxVertices: Double
    ) = this()
    def this(context: WebGLRenderingContext, twoColorTint: Boolean, maxVertices: Double) = this()
    def this(context: WebGLRenderingContext, twoColorTint: Unit, maxVertices: Double) = this()
    
    /* CompleteClass */
    override def begin(shader: typings.phaser.spine.webgl.Shader): Unit = js.native
    
    /* CompleteClass */
    var context: js.Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def draw(
      texture: typings.phaser.spine.webgl.GLTexture,
      vertices: ArrayLike[Double],
      indices: js.Array[Double]
    ): Unit = js.native
    
    /* CompleteClass */
    var drawCalls: js.Any = js.native
    
    /* CompleteClass */
    var dstBlend: js.Any = js.native
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    /* CompleteClass */
    var flush: js.Any = js.native
    
    /* CompleteClass */
    override def getDrawCalls(): Double = js.native
    
    /* CompleteClass */
    var indicesLength: js.Any = js.native
    
    /* CompleteClass */
    var isDrawing: js.Any = js.native
    
    /* CompleteClass */
    var lastTexture: js.Any = js.native
    
    /* CompleteClass */
    var mesh: js.Any = js.native
    
    /* CompleteClass */
    override def setBlendMode(srcBlend: Double, dstBlend: Double): Unit = js.native
    
    /* CompleteClass */
    var shader: js.Any = js.native
    
    /* CompleteClass */
    var srcBlend: js.Any = js.native
    
    /* CompleteClass */
    var verticesLength: js.Any = js.native
  }
  
  @JSGlobal("spine.webgl.Position2Attribute")
  @js.native
  class Position2Attribute ()
    extends StObject
       with typings.phaser.spine.webgl.VertexAttribute {
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var numElements: Double = js.native
    
    /* CompleteClass */
    var `type`: VertexAttributeType = js.native
  }
  
  @JSGlobal("spine.webgl.Position3Attribute")
  @js.native
  class Position3Attribute ()
    extends StObject
       with typings.phaser.spine.webgl.VertexAttribute {
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var numElements: Double = js.native
    
    /* CompleteClass */
    var `type`: VertexAttributeType = js.native
  }
  
  @JSGlobal("spine.webgl.ResizeMode")
  @js.native
  object ResizeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.phaser.spine.webgl.ResizeMode & Double] = js.native
    
    /* 1 */ val Expand: typings.phaser.spine.webgl.ResizeMode.Expand & Double = js.native
    
    /* 2 */ val Fit: typings.phaser.spine.webgl.ResizeMode.Fit & Double = js.native
    
    /* 0 */ val Stretch: typings.phaser.spine.webgl.ResizeMode.Stretch & Double = js.native
  }
  
  @JSGlobal("spine.webgl.SceneRenderer")
  @js.native
  class SceneRenderer protected ()
    extends StObject
       with typings.phaser.spine.webgl.SceneRenderer {
    def this(canvas: HTMLCanvasElement, context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(canvas: HTMLCanvasElement, context: WebGLRenderingContext) = this()
    def this(
      canvas: HTMLCanvasElement,
      context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
      twoColorTint: Boolean
    ) = this()
    def this(canvas: HTMLCanvasElement, context: WebGLRenderingContext, twoColorTint: Boolean) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  @JSGlobal("spine.webgl.Shader")
  @js.native
  class Shader protected ()
    extends StObject
       with typings.phaser.spine.webgl.Shader {
    def this(
      context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
      vertexShader: String,
      fragmentShader: String
    ) = this()
    def this(context: WebGLRenderingContext, vertexShader: String, fragmentShader: String) = this()
    
    /* CompleteClass */
    override def bind(): Unit = js.native
    
    /* CompleteClass */
    var compile: js.Any = js.native
    
    /* CompleteClass */
    var compileProgram: js.Any = js.native
    
    /* CompleteClass */
    var compileShader: js.Any = js.native
    
    /* CompleteClass */
    var context: js.Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    var fragmentShader: js.Any = js.native
    
    /* CompleteClass */
    var fs: js.Any = js.native
    
    /* CompleteClass */
    var fsSource: js.Any = js.native
    
    /* CompleteClass */
    override def getAttributeLocation(attribute: String): Double = js.native
    
    /* CompleteClass */
    override def getFragmentShader(): String = js.native
    
    /* CompleteClass */
    override def getFragmentSource(): String = js.native
    
    /* CompleteClass */
    override def getProgram(): WebGLProgram = js.native
    
    /* CompleteClass */
    override def getUniformLocation(uniform: String): WebGLUniformLocation = js.native
    
    /* CompleteClass */
    override def getVertexShader(): String = js.native
    
    /* CompleteClass */
    override def getVertexShaderSource(): String = js.native
    
    /* CompleteClass */
    var program: js.Any = js.native
    
    /* CompleteClass */
    override def restore(): Unit = js.native
    
    /* CompleteClass */
    override def setUniform2f(uniform: String, value: Double, value2: Double): Unit = js.native
    
    /* CompleteClass */
    override def setUniform2x2f(uniform: String, value: ArrayLike[Double]): Unit = js.native
    
    /* CompleteClass */
    override def setUniform3f(uniform: String, value: Double, value2: Double, value3: Double): Unit = js.native
    
    /* CompleteClass */
    override def setUniform3x3f(uniform: String, value: ArrayLike[Double]): Unit = js.native
    
    /* CompleteClass */
    override def setUniform4f(uniform: String, value: Double, value2: Double, value3: Double, value4: Double): Unit = js.native
    
    /* CompleteClass */
    override def setUniform4x4f(uniform: String, value: ArrayLike[Double]): Unit = js.native
    
    /* CompleteClass */
    override def setUniformf(uniform: String, value: Double): Unit = js.native
    
    /* CompleteClass */
    override def setUniformi(uniform: String, value: Double): Unit = js.native
    
    /* CompleteClass */
    var tmp2x2: js.Any = js.native
    
    /* CompleteClass */
    var tmp3x3: js.Any = js.native
    
    /* CompleteClass */
    var tmp4x4: js.Any = js.native
    
    /* CompleteClass */
    override def unbind(): Unit = js.native
    
    /* CompleteClass */
    var vertexShader: js.Any = js.native
    
    /* CompleteClass */
    var vs: js.Any = js.native
    
    /* CompleteClass */
    var vsSource: js.Any = js.native
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
    @scala.inline
    def newColored(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext): typings.phaser.spine.webgl.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("newColored")(context.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.spine.webgl.Shader]
    @scala.inline
    def newColored(context: WebGLRenderingContext): typings.phaser.spine.webgl.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("newColored")(context.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.spine.webgl.Shader]
    
    /* static member */
    @scala.inline
    def newColoredTextured(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext): typings.phaser.spine.webgl.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("newColoredTextured")(context.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.spine.webgl.Shader]
    @scala.inline
    def newColoredTextured(context: WebGLRenderingContext): typings.phaser.spine.webgl.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("newColoredTextured")(context.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.spine.webgl.Shader]
    
    /* static member */
    @scala.inline
    def newTwoColoredTextured(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext): typings.phaser.spine.webgl.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("newTwoColoredTextured")(context.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.spine.webgl.Shader]
    @scala.inline
    def newTwoColoredTextured(context: WebGLRenderingContext): typings.phaser.spine.webgl.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("newTwoColoredTextured")(context.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.spine.webgl.Shader]
  }
  
  @JSGlobal("spine.webgl.ShapeRenderer")
  @js.native
  class ShapeRenderer protected ()
    extends StObject
       with typings.phaser.spine.webgl.ShapeRenderer {
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(context: WebGLRenderingContext) = this()
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext, maxVertices: Double) = this()
    def this(context: WebGLRenderingContext, maxVertices: Double) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  @JSGlobal("spine.webgl.ShapeType")
  @js.native
  object ShapeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.phaser.spine.webgl.ShapeType & Double] = js.native
    
    /* 4 */ val Filled: typings.phaser.spine.webgl.ShapeType.Filled & Double = js.native
    
    /* 1 */ val Line: typings.phaser.spine.webgl.ShapeType.Line & Double = js.native
    
    /* 0 */ val Point: typings.phaser.spine.webgl.ShapeType.Point & Double = js.native
  }
  
  @JSGlobal("spine.webgl.SkeletonDebugRenderer")
  @js.native
  class SkeletonDebugRenderer protected ()
    extends StObject
       with typings.phaser.spine.webgl.SkeletonDebugRenderer {
    def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(context: WebGLRenderingContext) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
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
    extends StObject
       with typings.phaser.spine.webgl.SkeletonRenderer {
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
    extends StObject
       with typings.phaser.spine.webgl.VertexAttribute {
    def this(unit: Double) = this()
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var numElements: Double = js.native
    
    /* CompleteClass */
    var `type`: VertexAttributeType = js.native
  }
  
  @JSGlobal("spine.webgl.Vector3")
  @js.native
  class Vector3 ()
    extends StObject
       with typings.phaser.spine.webgl.Vector3 {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
    
    /* CompleteClass */
    override def add(v: typings.phaser.spine.webgl.Vector3): typings.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def cross(v: typings.phaser.spine.webgl.Vector3): typings.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def distance(v: typings.phaser.spine.webgl.Vector3): Double = js.native
    
    /* CompleteClass */
    override def dot(v: typings.phaser.spine.webgl.Vector3): Double = js.native
    
    /* CompleteClass */
    override def length(): Double = js.native
    
    /* CompleteClass */
    override def multiply(matrix: typings.phaser.spine.webgl.Matrix4): typings.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def normalize(): typings.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def project(matrix: typings.phaser.spine.webgl.Matrix4): typings.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def scale(s: Double): typings.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def set(x: Double, y: Double, z: Double): typings.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def setFrom(v: typings.phaser.spine.webgl.Vector3): typings.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def sub(v: typings.phaser.spine.webgl.Vector3): typings.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
    
    /* CompleteClass */
    var z: Double = js.native
  }
  
  @JSGlobal("spine.webgl.VertexAttribute")
  @js.native
  class VertexAttribute protected ()
    extends StObject
       with typings.phaser.spine.webgl.VertexAttribute {
    def this(name: String, `type`: VertexAttributeType, numElements: Double) = this()
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var numElements: Double = js.native
    
    /* CompleteClass */
    var `type`: VertexAttributeType = js.native
  }
  
  @JSGlobal("spine.webgl.VertexAttributeType")
  @js.native
  object VertexAttributeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.phaser.spine.webgl.VertexAttributeType & Double] = js.native
    
    /* 0 */ val Float: typings.phaser.spine.webgl.VertexAttributeType.Float & Double = js.native
  }
  
  @JSGlobal("spine.webgl.WebGLBlendModeConverter")
  @js.native
  class WebGLBlendModeConverter ()
    extends StObject
       with typings.phaser.spine.webgl.WebGLBlendModeConverter
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
    @scala.inline
    def getDestGLBlendMode(blendMode: typings.phaser.spine.BlendMode): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDestGLBlendMode")(blendMode.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* static member */
    @scala.inline
    def getSourceGLBlendMode(blendMode: typings.phaser.spine.BlendMode): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceGLBlendMode")(blendMode.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def getSourceGLBlendMode(blendMode: typings.phaser.spine.BlendMode, premultipliedAlpha: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceGLBlendMode")(blendMode.asInstanceOf[js.Any], premultipliedAlpha.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
