package typings.pkijs

import typings.std.Algorithm
import typings.std.KeyUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgorithm extends js.Object {
  var algorithm: Algorithm
  var usages: js.Array[KeyUsage]
}

object AnonAlgorithm {
  @scala.inline
  def apply(algorithm: Algorithm, usages: js.Array[KeyUsage]): AnonAlgorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlgorithm]
  }
}

