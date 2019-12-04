package typings.nextDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GenerateEtags extends js.Object {
  var generateEtags: Boolean
  var poweredByHeader: Boolean
}

object Anon_GenerateEtags {
  @scala.inline
  def apply(generateEtags: Boolean, poweredByHeader: Boolean): Anon_GenerateEtags = {
    val __obj = js.Dynamic.literal(generateEtags = generateEtags.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GenerateEtags]
  }
}

