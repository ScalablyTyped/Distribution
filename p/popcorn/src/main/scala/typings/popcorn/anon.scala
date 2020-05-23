package typings.popcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Call extends js.Object {
    var debug: Boolean = js.native
    var errors: js.Array[_] = js.native
    def apply(pluginName: String, info: PopcornPlugin): js.Any = js.native
    def apply(pluginName: String, info: PopcornPlugin, manifest: js.Any): js.Any = js.native
  }
  
  @js.native
  trait ToSeconds extends js.Object {
    def toSeconds(smpte: String): Double = js.native
    def toSeconds(smpte: String, fps: Double): Double = js.native
  }
  
}

