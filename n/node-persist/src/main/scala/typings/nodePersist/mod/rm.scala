package typings.nodePersist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-persist", "rm")
@js.native
object rm extends js.Object {
  def apply(key: String): js.Promise[DeleteFileResult] = js.native
}

