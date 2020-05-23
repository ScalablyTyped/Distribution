package typings.phaser.spine.webgl

import typings.phaser.spine.Disposable
import typings.phaser.spine.Restorable
import typings.std.Float32Array
import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mesh
  extends Disposable
     with Restorable {
  var attributes: js.Any
  var context: js.Any
  var dirtyIndices: js.Any
  var dirtyVertices: js.Any
  var elementsPerVertex: js.Any
  var indices: js.Any
  var indicesBuffer: js.Any
  var indicesLength: js.Any
  var update: js.Any
  var vertices: js.Any
  var verticesBuffer: js.Any
  var verticesLength: js.Any
  def bind(shader: Shader): Unit
  def draw(shader: Shader, primitiveType: Double): Unit
  def drawWithOffset(shader: Shader, primitiveType: Double, offset: Double, count: Double): Unit
  def getAttributes(): js.Array[VertexAttribute]
  def getIndices(): Uint16Array
  def getVertexSizeInFloats(): Double
  def getVertices(): Float32Array
  def maxIndices(): Double
  def maxVertices(): Double
  def numIndices(): Double
  def numVertices(): Double
  def setIndices(indices: js.Array[Double]): Unit
  def setIndicesLength(length: Double): Unit
  def setVertices(vertices: js.Array[Double]): Unit
  def setVerticesLength(length: Double): Unit
  def unbind(shader: Shader): Unit
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
}

