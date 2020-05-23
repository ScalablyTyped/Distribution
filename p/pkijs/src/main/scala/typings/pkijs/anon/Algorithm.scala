package typings.pkijs.anon

import typings.std.KeyUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithm extends js.Object {
  var algorithm: typings.std.Algorithm
  var usages: js.Array[KeyUsage]
}

object Algorithm {
  @scala.inline
  def apply(algorithm: typings.std.Algorithm, usages: js.Array[KeyUsage]): Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
}

