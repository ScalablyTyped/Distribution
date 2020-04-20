package typings.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGenerateEtags extends js.Object {
  var generateEtags: Boolean
  var poweredByHeader: Boolean
}

object AnonGenerateEtags {
  @scala.inline
  def apply(generateEtags: Boolean, poweredByHeader: Boolean): AnonGenerateEtags = {
    val __obj = js.Dynamic.literal(generateEtags = generateEtags.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGenerateEtags]
  }
}

