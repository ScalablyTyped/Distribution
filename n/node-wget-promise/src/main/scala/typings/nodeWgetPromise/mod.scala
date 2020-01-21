package typings.nodeWgetPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-wget-promise", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(source: String): js.Promise[Unit] = js.native
  def apply(source: String, options: AnonOnProgress): js.Promise[Unit] = js.native
}

