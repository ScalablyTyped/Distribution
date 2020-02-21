package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectionPage extends js.Object {
  var direction: AnonEnum
  var page: AnonType
  var per_page: AnonType
  var sort: AnonEnum
  var username: AnonRequired
}

object AnonDirectionPage {
  @scala.inline
  def apply(direction: AnonEnum, page: AnonType, per_page: AnonType, sort: AnonEnum, username: AnonRequired): AnonDirectionPage = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirectionPage]
  }
}

