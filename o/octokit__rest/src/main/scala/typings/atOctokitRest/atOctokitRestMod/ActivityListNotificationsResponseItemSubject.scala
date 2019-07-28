package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListNotificationsResponseItemSubject extends js.Object {
  var latest_comment_url: String
  var title: String
  var `type`: String
  var url: String
}

object ActivityListNotificationsResponseItemSubject {
  @scala.inline
  def apply(latest_comment_url: String, title: String, `type`: String, url: String): ActivityListNotificationsResponseItemSubject = {
    val __obj = js.Dynamic.literal(latest_comment_url = latest_comment_url, title = title, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivityListNotificationsResponseItemSubject]
  }
}

