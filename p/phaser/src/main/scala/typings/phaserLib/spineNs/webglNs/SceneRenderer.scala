package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.SceneRenderer")
@js.native
class SceneRenderer protected ()
  extends phaserLib.spineNs.Disposable {
  def this(canvas: stdLib.HTMLCanvasElement, context: ManagedWebGLRenderingContext) = this()
  def this(canvas: stdLib.HTMLCanvasElement, context: stdLib.WebGLRenderingContext) = this()
  def this(canvas: stdLib.HTMLCanvasElement, context: ManagedWebGLRenderingContext, twoColorTint: scala.Boolean) = this()
  def this(canvas: stdLib.HTMLCanvasElement, context: stdLib.WebGLRenderingContext, twoColorTint: scala.Boolean) = this()
  var QUAD: js.Any = js.native
  var QUAD_TRIANGLES: js.Any = js.native
  var WHITE: js.Any = js.native
  var activeRenderer: js.Any = js.native
  var batcher: PolygonBatcher = js.native
  var batcherShader: js.Any = js.native
  var camera: OrthoCamera = js.native
  var canvas: stdLib.HTMLCanvasElement = js.native
  var context: ManagedWebGLRenderingContext = js.native
  var shapes: js.Any = js.native
  var shapesShader: js.Any = js.native
  var skeletonDebugRenderer: SkeletonDebugRenderer = js.native
  var skeletonRenderer: SkeletonRenderer = js.native
  var twoColorTint: js.Any = js.native
  def begin(): scala.Unit = js.native
  def circle(filled: scala.Boolean, x: scala.Double, y: scala.Double, radius: scala.Double): scala.Unit = js.native
  def circle(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def circle(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    color: phaserLib.spineNs.Color,
    segments: scala.Double
  ): scala.Unit = js.native
  def curve(
    x1: scala.Double,
    y1: scala.Double,
    cx1: scala.Double,
    cy1: scala.Double,
    cx2: scala.Double,
    cy2: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    segments: scala.Double
  ): scala.Unit = js.native
  def curve(
    x1: scala.Double,
    y1: scala.Double,
    cx1: scala.Double,
    cy1: scala.Double,
    cx2: scala.Double,
    cy2: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    segments: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def drawRegion(
    region: phaserLib.spineNs.TextureAtlasRegion,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): scala.Unit = js.native
  def drawRegion(
    region: phaserLib.spineNs.TextureAtlasRegion,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def drawRegion(
    region: phaserLib.spineNs.TextureAtlasRegion,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    color: phaserLib.spineNs.Color,
    premultipliedAlpha: scala.Boolean
  ): scala.Unit = js.native
  def drawSkeleton(skeleton: phaserLib.spineNs.Skeleton): scala.Unit = js.native
  def drawSkeleton(skeleton: phaserLib.spineNs.Skeleton, premultipliedAlpha: scala.Boolean): scala.Unit = js.native
  def drawSkeleton(
    skeleton: phaserLib.spineNs.Skeleton,
    premultipliedAlpha: scala.Boolean,
    slotRangeStart: scala.Double
  ): scala.Unit = js.native
  def drawSkeleton(
    skeleton: phaserLib.spineNs.Skeleton,
    premultipliedAlpha: scala.Boolean,
    slotRangeStart: scala.Double,
    slotRangeEnd: scala.Double
  ): scala.Unit = js.native
  def drawSkeletonDebug(skeleton: phaserLib.spineNs.Skeleton): scala.Unit = js.native
  def drawSkeletonDebug(skeleton: phaserLib.spineNs.Skeleton, premultipliedAlpha: scala.Boolean): scala.Unit = js.native
  def drawSkeletonDebug(
    skeleton: phaserLib.spineNs.Skeleton,
    premultipliedAlpha: scala.Boolean,
    ignoredBones: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def drawTexture(texture: GLTexture, x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def drawTexture(
    texture: GLTexture,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def drawTextureRotated(
    texture: GLTexture,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    pivotX: scala.Double,
    pivotY: scala.Double,
    angle: scala.Double
  ): scala.Unit = js.native
  def drawTextureRotated(
    texture: GLTexture,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    pivotX: scala.Double,
    pivotY: scala.Double,
    angle: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def drawTextureRotated(
    texture: GLTexture,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    pivotX: scala.Double,
    pivotY: scala.Double,
    angle: scala.Double,
    color: phaserLib.spineNs.Color,
    premultipliedAlpha: scala.Boolean
  ): scala.Unit = js.native
  def drawTextureUV(
    texture: GLTexture,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    u: scala.Double,
    v: scala.Double,
    u2: scala.Double,
    v2: scala.Double
  ): scala.Unit = js.native
  def drawTextureUV(
    texture: GLTexture,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    u: scala.Double,
    v: scala.Double,
    u2: scala.Double,
    v2: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  /* private */ def enableRenderer(renderer: js.Any): js.Any = js.native
  def end(): scala.Unit = js.native
  def line(x: scala.Double, y: scala.Double, x2: scala.Double, y2: scala.Double): scala.Unit = js.native
  def line(
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def line(
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    color: phaserLib.spineNs.Color,
    color2: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def polygon(
    polygonVertices: phaserLib.spineNs.ArrayLike[scala.Double],
    offset: scala.Double,
    count: scala.Double
  ): scala.Unit = js.native
  def polygon(
    polygonVertices: phaserLib.spineNs.ArrayLike[scala.Double],
    offset: scala.Double,
    count: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def quad(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double
  ): scala.Unit = js.native
  def quad(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def quad(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double,
    color: phaserLib.spineNs.Color,
    color2: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def quad(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double,
    color: phaserLib.spineNs.Color,
    color2: phaserLib.spineNs.Color,
    color3: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def quad(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double,
    color: phaserLib.spineNs.Color,
    color2: phaserLib.spineNs.Color,
    color3: phaserLib.spineNs.Color,
    color4: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def rect(filled: scala.Boolean, x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def rect(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def rectLine(
    filled: scala.Boolean,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    width: scala.Double
  ): scala.Unit = js.native
  def rectLine(
    filled: scala.Boolean,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    width: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def resize(resizeMode: ResizeMode): scala.Unit = js.native
  def triangle(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double
  ): scala.Unit = js.native
  def triangle(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def triangle(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    color: phaserLib.spineNs.Color,
    color2: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def triangle(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    color: phaserLib.spineNs.Color,
    color2: phaserLib.spineNs.Color,
    color3: phaserLib.spineNs.Color
  ): scala.Unit = js.native
}

