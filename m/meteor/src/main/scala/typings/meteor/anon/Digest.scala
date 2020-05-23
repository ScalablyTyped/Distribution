package typings.meteor.anon

import typings.meteor.meteorStrings.`sha-256`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Digest extends js.Object {
  var algorithm: `sha-256`
  var digest: String
}

object Digest {
  @scala.inline
  def apply(algorithm: `sha-256`, digest: String): Digest = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digest]
  }
}

