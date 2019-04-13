package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListFeedsResponse extends js.Object {
  var _links: ActivityListFeedsResponseLinks
  var current_user_actor_url: java.lang.String
  var current_user_organization_url: java.lang.String
  var current_user_organization_urls: js.Array[java.lang.String]
  var current_user_public_url: java.lang.String
  var current_user_url: java.lang.String
  var security_advisories_url: java.lang.String
  var timeline_url: java.lang.String
  var user_url: java.lang.String
}

object ActivityListFeedsResponse {
  @scala.inline
  def apply(
    _links: ActivityListFeedsResponseLinks,
    current_user_actor_url: java.lang.String,
    current_user_organization_url: java.lang.String,
    current_user_organization_urls: js.Array[java.lang.String],
    current_user_public_url: java.lang.String,
    current_user_url: java.lang.String,
    security_advisories_url: java.lang.String,
    timeline_url: java.lang.String,
    user_url: java.lang.String
  ): ActivityListFeedsResponse = {
    val __obj = js.Dynamic.literal(_links = _links, current_user_actor_url = current_user_actor_url, current_user_organization_url = current_user_organization_url, current_user_organization_urls = current_user_organization_urls, current_user_public_url = current_user_public_url, current_user_url = current_user_url, security_advisories_url = security_advisories_url, timeline_url = timeline_url, user_url = user_url)
  
    __obj.asInstanceOf[ActivityListFeedsResponse]
  }
}

