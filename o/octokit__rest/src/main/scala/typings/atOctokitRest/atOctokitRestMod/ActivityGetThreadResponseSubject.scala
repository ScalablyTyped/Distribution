package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityGetThreadResponseSubject extends js.Object {
  var latest_comment_url: String
  var title: String
  var `type`: String
  var url: String
}

object ActivityGetThreadResponseSubject {
  @scala.inline
  def apply(latest_comment_url: String, title: String, `type`: String, url: String): ActivityGetThreadResponseSubject = {
    val __obj = js.Dynamic.literal(latest_comment_url = latest_comment_url, title = title, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivityGetThreadResponseSubject]
  }
}

