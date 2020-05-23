package typings.phaser.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonBatcher extends Disposable {
  var context: js.Any
  var drawCalls: js.Any
  var dstBlend: js.Any
  var flush: js.Any
  var indicesLength: js.Any
  var isDrawing: js.Any
  var lastTexture: js.Any
  var mesh: js.Any
  var shader: js.Any
  var srcBlend: js.Any
  var verticesLength: js.Any
  def begin(shader: Shader): Unit
  def draw(texture: GLTexture, vertices: ArrayLike[Double], indices: js.Array[Double]): Unit
  def end(): Unit
  def getDrawCalls(): Double
  def setBlendMode(srcBlend: Double, dstBlend: Double): Unit
}

object PolygonBatcher {
  @scala.inline
  def apply(
    begin: Shader => Unit,
    context: js.Any,
    dispose: () => Unit,
    draw: (GLTexture, ArrayLike[Double], js.Array[Double]) => Unit,
    drawCalls: js.Any,
    dstBlend: js.Any,
    end: () => Unit,
    flush: js.Any,
    getDrawCalls: () => Double,
    indicesLength: js.Any,
    isDrawing: js.Any,
    lastTexture: js.Any,
    mesh: js.Any,
    setBlendMode: (Double, Double) => Unit,
    shader: js.Any,
    srcBlend: js.Any,
    verticesLength: js.Any
  ): PolygonBatcher = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), context = context.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction3(draw), drawCalls = drawCalls.asInstanceOf[js.Any], dstBlend = dstBlend.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), flush = flush.asInstanceOf[js.Any], getDrawCalls = js.Any.fromFunction0(getDrawCalls), indicesLength = indicesLength.asInstanceOf[js.Any], isDrawing = isDrawing.asInstanceOf[js.Any], lastTexture = lastTexture.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any], setBlendMode = js.Any.fromFunction2(setBlendMode), shader = shader.asInstanceOf[js.Any], srcBlend = srcBlend.asInstanceOf[js.Any], verticesLength = verticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonBatcher]
  }
}

