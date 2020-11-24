package typings.phaser.global.spine.webgl

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
