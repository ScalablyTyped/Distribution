package typings.openpgp.anon

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithm extends js.Object {
  var algorithm: String
  var data: Uint8Array
}

object Algorithm {
  @scala.inline
  def apply(algorithm: String, data: Uint8Array): Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
}

