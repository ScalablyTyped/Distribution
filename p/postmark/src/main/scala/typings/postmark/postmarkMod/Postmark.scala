package typings.postmark.postmarkMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Postmark extends js.Object {
  var AdminClient: AdminClientClass = js.native
  var Client: ClientClass = js.native
  var defaults: Options = js.native
  def apply(apiKey: String, options: Partial[Options]): Client = js.native
}

