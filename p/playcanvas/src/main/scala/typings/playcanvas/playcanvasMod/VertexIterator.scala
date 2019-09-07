package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.VertexIterator
  * @classdesc A vertex iterator simplifies the process of writing vertex data to a vertex buffer.
  * @description Returns a new pc.VertexIterator object.
  * @param {pc.VertexBuffer} vertexBuffer The vertex buffer to be iterated.
  * @property {Object} element The vertex buffer elements
  */
@JSImport("playcanvas", "VertexIterator")
@js.native
class VertexIterator protected ()
  extends typings.playcanvas.pcNs.VertexIterator {
  def this(vertexBuffer: typings.playcanvas.pcNs.VertexBuffer) = this()
}

