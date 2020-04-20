package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgorithm extends js.Object {
  var algorithm: String
  var digest: String
}

object AnonAlgorithm {
  @scala.inline
  def apply(algorithm: String, digest: String): AnonAlgorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlgorithm]
  }
}

