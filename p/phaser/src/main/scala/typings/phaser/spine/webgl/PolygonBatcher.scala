package typings.phaser.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonBatcher extends Disposable {
  var context: js.Any = js.native
  var drawCalls: js.Any = js.native
  var dstBlend: js.Any = js.native
  var flush: js.Any = js.native
  var indicesLength: js.Any = js.native
  var isDrawing: js.Any = js.native
  var lastTexture: js.Any = js.native
  var mesh: js.Any = js.native
  var shader: js.Any = js.native
  var srcBlend: js.Any = js.native
  var verticesLength: js.Any = js.native
  def begin(shader: Shader): Unit = js.native
  def draw(texture: GLTexture, vertices: ArrayLike[Double], indices: js.Array[Double]): Unit = js.native
  def end(): Unit = js.native
  def getDrawCalls(): Double = js.native
  def setBlendMode(srcBlend: Double, dstBlend: Double): Unit = js.native
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
  @scala.inline
  implicit class PolygonBatcherOps[Self <: PolygonBatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBegin(value: Shader => Unit): Self = this.set("begin", js.Any.fromFunction1(value))
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDraw(value: (GLTexture, ArrayLike[Double], js.Array[Double]) => Unit): Self = this.set("draw", js.Any.fromFunction3(value))
    @scala.inline
    def setDrawCalls(value: js.Any): Self = this.set("drawCalls", value.asInstanceOf[js.Any])
    @scala.inline
    def setDstBlend(value: js.Any): Self = this.set("dstBlend", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def setFlush(value: js.Any): Self = this.set("flush", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDrawCalls(value: () => Double): Self = this.set("getDrawCalls", js.Any.fromFunction0(value))
    @scala.inline
    def setIndicesLength(value: js.Any): Self = this.set("indicesLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDrawing(value: js.Any): Self = this.set("isDrawing", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastTexture(value: js.Any): Self = this.set("lastTexture", value.asInstanceOf[js.Any])
    @scala.inline
    def setMesh(value: js.Any): Self = this.set("mesh", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetBlendMode(value: (Double, Double) => Unit): Self = this.set("setBlendMode", js.Any.fromFunction2(value))
    @scala.inline
    def setShader(value: js.Any): Self = this.set("shader", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcBlend(value: js.Any): Self = this.set("srcBlend", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticesLength(value: js.Any): Self = this.set("verticesLength", value.asInstanceOf[js.Any])
  }
  
}

