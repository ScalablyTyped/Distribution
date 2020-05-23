package typings.nextServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateEtags extends js.Object {
  var generateEtags: Boolean
  var poweredByHeader: Boolean
}

object GenerateEtags {
  @scala.inline
  def apply(generateEtags: Boolean, poweredByHeader: Boolean): GenerateEtags = {
    val __obj = js.Dynamic.literal(generateEtags = generateEtags.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateEtags]
  }
}

