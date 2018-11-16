package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.Mesh")
@js.native
class Mesh protected ()
  extends phaserLib.spineNs.Disposable
     with phaserLib.spineNs.Restorable {
  def this(context: ManagedWebGLRenderingContext, attributes: js.Array[VertexAttribute], maxVertices: scala.Double, maxIndices: scala.Double) = this()
  def this(context: stdLib.WebGLRenderingContext, attributes: js.Array[VertexAttribute], maxVertices: scala.Double, maxIndices: scala.Double) = this()
  var attributes: js.Any = js.native
  var context: js.Any = js.native
  var dirtyIndices: js.Any = js.native
  var dirtyVertices: js.Any = js.native
  var elementsPerVertex: js.Any = js.native
  var indices: js.Any = js.native
  var indicesBuffer: js.Any = js.native
  var indicesLength: js.Any = js.native
  var vertices: js.Any = js.native
  var verticesBuffer: js.Any = js.native
  var verticesLength: js.Any = js.native
  def bind(shader: Shader): scala.Unit = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def draw(shader: Shader, primitiveType: scala.Double): scala.Unit = js.native
  def drawWithOffset(shader: Shader, primitiveType: scala.Double, offset: scala.Double, count: scala.Double): scala.Unit = js.native
  def getAttributes(): js.Array[VertexAttribute] = js.native
  def getIndices(): stdLib.Uint16Array = js.native
  def getVertexSizeInFloats(): scala.Double = js.native
  def getVertices(): stdLib.Float32Array = js.native
  def maxIndices(): scala.Double = js.native
  def maxVertices(): scala.Double = js.native
  def numIndices(): scala.Double = js.native
  def numVertices(): scala.Double = js.native
  /* CompleteClass */
  override def restore(): scala.Unit = js.native
  def setIndices(indices: js.Array[scala.Double]): scala.Unit = js.native
  def setIndicesLength(length: scala.Double): scala.Unit = js.native
  def setVertices(vertices: js.Array[scala.Double]): scala.Unit = js.native
  def setVerticesLength(length: scala.Double): scala.Unit = js.native
  def unbind(shader: Shader): scala.Unit = js.native
  /* private */ def update(): js.Any = js.native
}

