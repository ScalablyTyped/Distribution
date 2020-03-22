package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListFeedsResponse extends js.Object {
  var _links: ActivityListFeedsResponseLinks
  var current_user_actor_url: String
  var current_user_organization_url: String
  var current_user_organization_urls: js.Array[String]
  var current_user_public_url: String
  var current_user_url: String
  var security_advisories_url: String
  var timeline_url: String
  var user_url: String
}

object ActivityListFeedsResponse {
  @scala.inline
  def apply(
    _links: ActivityListFeedsResponseLinks,
    current_user_actor_url: String,
    current_user_organization_url: String,
    current_user_organization_urls: js.Array[String],
    current_user_public_url: String,
    current_user_url: String,
    security_advisories_url: String,
    timeline_url: String,
    user_url: String
  ): ActivityListFeedsResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], current_user_actor_url = current_user_actor_url.asInstanceOf[js.Any], current_user_organization_url = current_user_organization_url.asInstanceOf[js.Any], current_user_organization_urls = current_user_organization_urls.asInstanceOf[js.Any], current_user_public_url = current_user_public_url.asInstanceOf[js.Any], current_user_url = current_user_url.asInstanceOf[js.Any], security_advisories_url = security_advisories_url.asInstanceOf[js.Any], timeline_url = timeline_url.asInstanceOf[js.Any], user_url = user_url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivityListFeedsResponse]
  }
}

