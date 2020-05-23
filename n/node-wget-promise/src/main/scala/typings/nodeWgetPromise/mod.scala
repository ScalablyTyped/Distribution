package typings.nodeWgetPromise

import typings.nodeWgetPromise.anon.OnProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-wget-promise", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(source: String): js.Promise[Unit] = js.native
  def apply(source: String, options: OnProgress): js.Promise[Unit] = js.native
}

