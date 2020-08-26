package typings.phaser.spine.webgl

import typings.phaser.spine.Disposable
import typings.phaser.spine.Restorable
import typings.std.Float32Array
import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mesh
  extends Disposable
     with Restorable {
  var attributes: js.Any = js.native
  var context: js.Any = js.native
  var dirtyIndices: js.Any = js.native
  var dirtyVertices: js.Any = js.native
  var elementsPerVertex: js.Any = js.native
  var indices: js.Any = js.native
  var indicesBuffer: js.Any = js.native
  var indicesLength: js.Any = js.native
  var update: js.Any = js.native
  var vertices: js.Any = js.native
  var verticesBuffer: js.Any = js.native
  var verticesLength: js.Any = js.native
  def bind(shader: Shader): Unit = js.native
  def draw(shader: Shader, primitiveType: Double): Unit = js.native
  def drawWithOffset(shader: Shader, primitiveType: Double, offset: Double, count: Double): Unit = js.native
  def getAttributes(): js.Array[VertexAttribute] = js.native
  def getIndices(): Uint16Array = js.native
  def getVertexSizeInFloats(): Double = js.native
  def getVertices(): Float32Array = js.native
  def maxIndices(): Double = js.native
  def maxVertices(): Double = js.native
  def numIndices(): Double = js.native
  def numVertices(): Double = js.native
  def setIndices(indices: js.Array[Double]): Unit = js.native
  def setIndicesLength(length: Double): Unit = js.native
  def setVertices(vertices: js.Array[Double]): Unit = js.native
  def setVerticesLength(length: Double): Unit = js.native
  def unbind(shader: Shader): Unit = js.native
}

object Mesh {
  @scala.inline
  def apply(
    attributes: js.Any,
    bind: Shader => Unit,
    context: js.Any,
    dirtyIndices: js.Any,
    dirtyVertices: js.Any,
    dispose: () => Unit,
    draw: (Shader, Double) => Unit,
    drawWithOffset: (Shader, Double, Double, Double) => Unit,
    elementsPerVertex: js.Any,
    getAttributes: () => js.Array[VertexAttribute],
    getIndices: () => Uint16Array,
    getVertexSizeInFloats: () => Double,
    getVertices: () => Float32Array,
    indices: js.Any,
    indicesBuffer: js.Any,
    indicesLength: js.Any,
    maxIndices: () => Double,
    maxVertices: () => Double,
    numIndices: () => Double,
    numVertices: () => Double,
    restore: () => Unit,
    setIndices: js.Array[Double] => Unit,
    setIndicesLength: Double => Unit,
    setVertices: js.Array[Double] => Unit,
    setVerticesLength: Double => Unit,
    unbind: Shader => Unit,
    update: js.Any,
    vertices: js.Any,
    verticesBuffer: js.Any,
    verticesLength: js.Any
  ): Mesh = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], bind = js.Any.fromFunction1(bind), context = context.asInstanceOf[js.Any], dirtyIndices = dirtyIndices.asInstanceOf[js.Any], dirtyVertices = dirtyVertices.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), drawWithOffset = js.Any.fromFunction4(drawWithOffset), elementsPerVertex = elementsPerVertex.asInstanceOf[js.Any], getAttributes = js.Any.fromFunction0(getAttributes), getIndices = js.Any.fromFunction0(getIndices), getVertexSizeInFloats = js.Any.fromFunction0(getVertexSizeInFloats), getVertices = js.Any.fromFunction0(getVertices), indices = indices.asInstanceOf[js.Any], indicesBuffer = indicesBuffer.asInstanceOf[js.Any], indicesLength = indicesLength.asInstanceOf[js.Any], maxIndices = js.Any.fromFunction0(maxIndices), maxVertices = js.Any.fromFunction0(maxVertices), numIndices = js.Any.fromFunction0(numIndices), numVertices = js.Any.fromFunction0(numVertices), restore = js.Any.fromFunction0(restore), setIndices = js.Any.fromFunction1(setIndices), setIndicesLength = js.Any.fromFunction1(setIndicesLength), setVertices = js.Any.fromFunction1(setVertices), setVerticesLength = js.Any.fromFunction1(setVerticesLength), unbind = js.Any.fromFunction1(unbind), update = update.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], verticesBuffer = verticesBuffer.asInstanceOf[js.Any], verticesLength = verticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mesh]
  }
  @scala.inline
  implicit class MeshOps[Self <: Mesh] (val x: Self) extends AnyVal {
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
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setBind(value: Shader => Unit): Self = this.set("bind", js.Any.fromFunction1(value))
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirtyIndices(value: js.Any): Self = this.set("dirtyIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirtyVertices(value: js.Any): Self = this.set("dirtyVertices", value.asInstanceOf[js.Any])
    @scala.inline
    def setDraw(value: (Shader, Double) => Unit): Self = this.set("draw", js.Any.fromFunction2(value))
    @scala.inline
    def setDrawWithOffset(value: (Shader, Double, Double, Double) => Unit): Self = this.set("drawWithOffset", js.Any.fromFunction4(value))
    @scala.inline
    def setElementsPerVertex(value: js.Any): Self = this.set("elementsPerVertex", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAttributes(value: () => js.Array[VertexAttribute]): Self = this.set("getAttributes", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIndices(value: () => Uint16Array): Self = this.set("getIndices", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVertexSizeInFloats(value: () => Double): Self = this.set("getVertexSizeInFloats", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVertices(value: () => Float32Array): Self = this.set("getVertices", js.Any.fromFunction0(value))
    @scala.inline
    def setIndices(value: js.Any): Self = this.set("indices", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndicesBuffer(value: js.Any): Self = this.set("indicesBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndicesLength(value: js.Any): Self = this.set("indicesLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxIndices(value: () => Double): Self = this.set("maxIndices", js.Any.fromFunction0(value))
    @scala.inline
    def setMaxVertices(value: () => Double): Self = this.set("maxVertices", js.Any.fromFunction0(value))
    @scala.inline
    def setNumIndices(value: () => Double): Self = this.set("numIndices", js.Any.fromFunction0(value))
    @scala.inline
    def setNumVertices(value: () => Double): Self = this.set("numVertices", js.Any.fromFunction0(value))
    @scala.inline
    def setSetIndices(value: js.Array[Double] => Unit): Self = this.set("setIndices", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIndicesLength(value: Double => Unit): Self = this.set("setIndicesLength", js.Any.fromFunction1(value))
    @scala.inline
    def setSetVertices(value: js.Array[Double] => Unit): Self = this.set("setVertices", js.Any.fromFunction1(value))
    @scala.inline
    def setSetVerticesLength(value: Double => Unit): Self = this.set("setVerticesLength", js.Any.fromFunction1(value))
    @scala.inline
    def setUnbind(value: Shader => Unit): Self = this.set("unbind", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: js.Any): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertices(value: js.Any): Self = this.set("vertices", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticesBuffer(value: js.Any): Self = this.set("verticesBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticesLength(value: js.Any): Self = this.set("verticesLength", value.asInstanceOf[js.Any])
  }
  
}

