package typings.pacote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pacote", "manifest")
@js.native
object manifest extends js.Object {
  
  def apply(spec: String): js.Promise[ManifestResult] = js.native
  def apply(spec: String, opts: Options): js.Promise[ManifestResult] = js.native
}
