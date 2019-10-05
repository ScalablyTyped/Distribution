package typings.ol

import typings.ol.webglVertexMod.WebGLVertex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/Vertex", JSImport.Namespace)
@js.native
object webglVertexMod extends js.Object {
  @js.native
  class default protected () extends WebGLVertex {
    def this(source: String) = this()
  }
  
  type WebGLVertex = typings.ol.webglShaderMod.default
}

