package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownRenderRawEndpoint extends js.Object {
  /**
    * data parameter
    */
  var data: String
  var headers: `5`
}

object MarkdownRenderRawEndpoint {
  @scala.inline
  def apply(data: String, headers: `5`): MarkdownRenderRawEndpoint = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownRenderRawEndpoint]
  }
}

