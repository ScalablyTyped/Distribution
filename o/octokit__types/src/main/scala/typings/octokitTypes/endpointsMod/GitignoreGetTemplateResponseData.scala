package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitignoreGetTemplateResponseData extends js.Object {
  var name: String
  var source: String
}

object GitignoreGetTemplateResponseData {
  @scala.inline
  def apply(name: String, source: String): GitignoreGetTemplateResponseData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitignoreGetTemplateResponseData]
  }
}

