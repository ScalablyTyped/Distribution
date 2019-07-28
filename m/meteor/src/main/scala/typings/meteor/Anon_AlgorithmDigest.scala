package typings.meteor

import typings.meteor.meteorStrings.`sha-256`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgorithmDigest extends js.Object {
  var algorithm: `sha-256`
  var digest: String
}

object Anon_AlgorithmDigest {
  @scala.inline
  def apply(algorithm: `sha-256`, digest: String): Anon_AlgorithmDigest = {
    val __obj = js.Dynamic.literal(algorithm = algorithm, digest = digest)
  
    __obj.asInstanceOf[Anon_AlgorithmDigest]
  }
}

