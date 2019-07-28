package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithm extends js.Object {
  var algorithm: String
  var digest: String
}

object Anon_Algorithm {
  @scala.inline
  def apply(algorithm: String, digest: String): Anon_Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm, digest = digest)
  
    __obj.asInstanceOf[Anon_Algorithm]
  }
}

