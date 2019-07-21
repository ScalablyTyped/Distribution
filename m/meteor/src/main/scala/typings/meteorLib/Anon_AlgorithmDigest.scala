package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgorithmDigest extends js.Object {
  var algorithm: meteorLib.meteorLibStrings.`sha-256`
  var digest: java.lang.String
}

object Anon_AlgorithmDigest {
  @scala.inline
  def apply(algorithm: meteorLib.meteorLibStrings.`sha-256`, digest: java.lang.String): Anon_AlgorithmDigest = {
    val __obj = js.Dynamic.literal(algorithm = algorithm, digest = digest)
  
    __obj.asInstanceOf[Anon_AlgorithmDigest]
  }
}

