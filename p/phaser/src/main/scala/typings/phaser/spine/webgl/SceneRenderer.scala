package typings.phaser.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Color
import typings.phaser.spine.Disposable
import typings.phaser.spine.Skeleton
import typings.phaser.spine.TextureAtlasRegion
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneRenderer
  extends StObject
     with Disposable {
  
  var QUAD: js.Any = js.native
  
  var QUAD_TRIANGLES: js.Any = js.native
  
  var WHITE: js.Any = js.native
  
  var activeRenderer: js.Any = js.native
  
  var batcher: PolygonBatcher = js.native
  
  var batcherShader: js.Any = js.native
  
  def begin(): Unit = js.native
  
  var camera: OrthoCamera = js.native
  
  var canvas: HTMLCanvasElement = js.native
  
  def circle(filled: Boolean, x: Double, y: Double, radius: Double): Unit = js.native
  def circle(filled: Boolean, x: Double, y: Double, radius: Double, color: Unit, segments: Double): Unit = js.native
  def circle(filled: Boolean, x: Double, y: Double, radius: Double, color: Color): Unit = js.native
  def circle(filled: Boolean, x: Double, y: Double, radius: Double, color: Color, segments: Double): Unit = js.native
  
  var context: ManagedWebGLRenderingContext = js.native
  
  def curve(
    x1: Double,
    y1: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double,
    x2: Double,
    y2: Double,
    segments: Double
  ): Unit = js.native
  def curve(
    x1: Double,
    y1: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double,
    x2: Double,
    y2: Double,
    segments: Double,
    color: Color
  ): Unit = js.native
  
  def drawRegion(region: TextureAtlasRegion, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def drawRegion(
    region: TextureAtlasRegion,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    color: Unit,
    premultipliedAlpha: Boolean
  ): Unit = js.native
  def drawRegion(region: TextureAtlasRegion, x: Double, y: Double, width: Double, height: Double, color: Color): Unit = js.native
  def drawRegion(
    region: TextureAtlasRegion,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    color: Color,
    premultipliedAlpha: Boolean
  ): Unit = js.native
  
  def drawSkeleton(skeleton: Skeleton): Unit = js.native
  def drawSkeleton(skeleton: Skeleton, premultipliedAlpha: Boolean): Unit = js.native
  def drawSkeleton(skeleton: Skeleton, premultipliedAlpha: Boolean, slotRangeStart: Double): Unit = js.native
  def drawSkeleton(skeleton: Skeleton, premultipliedAlpha: Boolean, slotRangeStart: Double, slotRangeEnd: Double): Unit = js.native
  def drawSkeleton(skeleton: Skeleton, premultipliedAlpha: Boolean, slotRangeStart: Unit, slotRangeEnd: Double): Unit = js.native
  def drawSkeleton(skeleton: Skeleton, premultipliedAlpha: Unit, slotRangeStart: Double): Unit = js.native
  def drawSkeleton(skeleton: Skeleton, premultipliedAlpha: Unit, slotRangeStart: Double, slotRangeEnd: Double): Unit = js.native
  def drawSkeleton(skeleton: Skeleton, premultipliedAlpha: Unit, slotRangeStart: Unit, slotRangeEnd: Double): Unit = js.native
  
  def drawSkeletonDebug(skeleton: Skeleton): Unit = js.native
  def drawSkeletonDebug(skeleton: Skeleton, premultipliedAlpha: Boolean): Unit = js.native
  def drawSkeletonDebug(skeleton: Skeleton, premultipliedAlpha: Boolean, ignoredBones: js.Array[String]): Unit = js.native
  def drawSkeletonDebug(skeleton: Skeleton, premultipliedAlpha: Unit, ignoredBones: js.Array[String]): Unit = js.native
  
  def drawTexture(texture: GLTexture, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def drawTexture(texture: GLTexture, x: Double, y: Double, width: Double, height: Double, color: Color): Unit = js.native
  
  def drawTextureRotated(
    texture: GLTexture,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    pivotX: Double,
    pivotY: Double,
    angle: Double
  ): Unit = js.native
  def drawTextureRotated(
    texture: GLTexture,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    pivotX: Double,
    pivotY: Double,
    angle: Double,
    color: Unit,
    premultipliedAlpha: Boolean
  ): Unit = js.native
  def drawTextureRotated(
    texture: GLTexture,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    pivotX: Double,
    pivotY: Double,
    angle: Double,
    color: Color
  ): Unit = js.native
  def drawTextureRotated(
    texture: GLTexture,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    pivotX: Double,
    pivotY: Double,
    angle: Double,
    color: Color,
    premultipliedAlpha: Boolean
  ): Unit = js.native
  
  def drawTextureUV(
    texture: GLTexture,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    u: Double,
    v: Double,
    u2: Double,
    v2: Double
  ): Unit = js.native
  def drawTextureUV(
    texture: GLTexture,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    u: Double,
    v: Double,
    u2: Double,
    v2: Double,
    color: Color
  ): Unit = js.native
  
  var enableRenderer: js.Any = js.native
  
  def end(): Unit = js.native
  
  def line(x: Double, y: Double, x2: Double, y2: Double): Unit = js.native
  def line(x: Double, y: Double, x2: Double, y2: Double, color: Unit, color2: Color): Unit = js.native
  def line(x: Double, y: Double, x2: Double, y2: Double, color: Color): Unit = js.native
  def line(x: Double, y: Double, x2: Double, y2: Double, color: Color, color2: Color): Unit = js.native
  
  def polygon(polygonVertices: ArrayLike[Double], offset: Double, count: Double): Unit = js.native
  def polygon(polygonVertices: ArrayLike[Double], offset: Double, count: Double, color: Color): Unit = js.native
  
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Unit,
    color2: Unit,
    color3: Unit,
    color4: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Unit,
    color2: Unit,
    color3: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Unit,
    color2: Unit,
    color3: Color,
    color4: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Unit,
    color2: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Unit,
    color2: Color,
    color3: Unit,
    color4: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Unit,
    color2: Color,
    color3: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Unit,
    color2: Color,
    color3: Color,
    color4: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color,
    color2: Unit,
    color3: Unit,
    color4: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color,
    color2: Unit,
    color3: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color,
    color2: Unit,
    color3: Color,
    color4: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color,
    color2: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color,
    color2: Color,
    color3: Unit,
    color4: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color,
    color2: Color,
    color3: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color,
    color2: Color,
    color3: Color,
    color4: Color
  ): Unit = js.native
  
  def rect(filled: Boolean, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def rect(filled: Boolean, x: Double, y: Double, width: Double, height: Double, color: Color): Unit = js.native
  
  def rectLine(filled: Boolean, x1: Double, y1: Double, x2: Double, y2: Double, width: Double): Unit = js.native
  def rectLine(filled: Boolean, x1: Double, y1: Double, x2: Double, y2: Double, width: Double, color: Color): Unit = js.native
  
  def resize(resizeMode: ResizeMode): Unit = js.native
  
  var shapes: js.Any = js.native
  
  var shapesShader: js.Any = js.native
  
  var skeletonDebugRenderer: SkeletonDebugRenderer = js.native
  
  var skeletonRenderer: SkeletonRenderer = js.native
  
  def triangle(filled: Boolean, x: Double, y: Double, x2: Double, y2: Double, x3: Double, y3: Double): Unit = js.native
  def triangle(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    color: Unit,
    color2: Unit,
    color3: Color
  ): Unit = js.native
  def triangle(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    color: Unit,
    color2: Color
  ): Unit = js.native
  def triangle(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    color: Unit,
    color2: Color,
    color3: Color
  ): Unit = js.native
  def triangle(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    color: Color
  ): Unit = js.native
  def triangle(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    color: Color,
    color2: Unit,
    color3: Color
  ): Unit = js.native
  def triangle(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    color: Color,
    color2: Color
  ): Unit = js.native
  def triangle(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    color: Color,
    color2: Color,
    color3: Color
  ): Unit = js.native
  
  var twoColorTint: js.Any = js.native
}
