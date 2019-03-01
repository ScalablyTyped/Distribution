package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithm extends js.Object {
  var algorithm: java.lang.String
  var digest: java.lang.String
}

object Anon_Algorithm {
  @scala.inline
  def apply(algorithm: java.lang.String, digest: java.lang.String): Anon_Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("algorithm")(algorithm)
    __obj.updateDynamic("digest")(digest)
    __obj.asInstanceOf[Anon_Algorithm]
  }
}

