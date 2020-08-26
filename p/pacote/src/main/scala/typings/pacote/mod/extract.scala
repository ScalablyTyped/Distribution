package typings.pacote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pacote", "extract")
@js.native
object extract extends js.Object {
  def apply(spec: String): js.Promise[FetchResult] = js.native
  def apply(spec: String, dest: js.UndefOr[scala.Nothing], opts: Options): js.Promise[FetchResult] = js.native
  def apply(spec: String, dest: String): js.Promise[FetchResult] = js.native
  def apply(spec: String, dest: String, opts: Options): js.Promise[FetchResult] = js.native
}

