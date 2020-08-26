package typings.meteor.anon

import typings.meteor.meteorStrings.`sha-256`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Digest extends js.Object {
  var algorithm: `sha-256` = js.native
  var digest: String = js.native
}

object Digest {
  @scala.inline
  def apply(algorithm: `sha-256`, digest: String): Digest = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digest]
  }
  @scala.inline
  implicit class DigestOps[Self <: Digest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithm(value: `sha-256`): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setDigest(value: String): Self = this.set("digest", value.asInstanceOf[js.Any])
  }
  
}

