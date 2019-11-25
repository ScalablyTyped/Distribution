package typings.pkijs

import typings.std.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithm extends js.Object {
  var algorithm: Algorithm
  var usages: js.Array[String]
}

object Anon_Algorithm {
  @scala.inline
  def apply(algorithm: Algorithm, usages: js.Array[String]): Anon_Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Algorithm]
  }
}

