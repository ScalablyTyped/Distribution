package typings.ol

import typings.ol.webglFragmentMod.WebGLFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/Fragment", JSImport.Namespace)
@js.native
object webglFragmentMod extends js.Object {
  @js.native
  class default protected () extends WebGLFragment {
    def this(source: String) = this()
  }
  
  type WebGLFragment = typings.ol.webglShaderMod.default
}

