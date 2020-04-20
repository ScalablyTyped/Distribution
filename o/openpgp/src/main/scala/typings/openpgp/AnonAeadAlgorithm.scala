package typings.openpgp

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAeadAlgorithm extends js.Object {
  var aeadAlgorithm: String
  var algorithm: String
  var data: Uint8Array
}

object AnonAeadAlgorithm {
  @scala.inline
  def apply(aeadAlgorithm: String, algorithm: String, data: Uint8Array): AnonAeadAlgorithm = {
    val __obj = js.Dynamic.literal(aeadAlgorithm = aeadAlgorithm.asInstanceOf[js.Any], algorithm = algorithm.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAeadAlgorithm]
  }
}

