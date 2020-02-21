package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGistidPage extends js.Object {
  var gist_id: AnonRequired
  var page: AnonType
  var per_page: AnonType
}

object AnonGistidPage {
  @scala.inline
  def apply(gist_id: AnonRequired, page: AnonType, per_page: AnonType): AnonGistidPage = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGistidPage]
  }
}

