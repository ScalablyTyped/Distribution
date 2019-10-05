package typings.parse.Parse.Cloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Cloud.job")
@js.native
object job extends js.Object {
  def apply(name: String): HttpResponse = js.native
  def apply(name: String, func: js.Function1[/* request */ JobRequest, js.Promise[Unit] | Unit]): HttpResponse = js.native
}

