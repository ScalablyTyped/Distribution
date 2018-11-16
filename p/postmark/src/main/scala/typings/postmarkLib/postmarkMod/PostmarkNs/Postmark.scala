package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Postmark extends js.Object {
  var AdminClient: AdminClientClass = js.native
  var Client: ClientClass = js.native
  var defaults: Options = js.native
  def apply(apiKey: java.lang.String, options: stdLib.Partial[Options]): Client = js.native
}

