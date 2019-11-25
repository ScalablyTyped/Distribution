package typings.naverDashWhale.whale.topSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MostVisitedURL extends js.Object {
  /**
    * 방문기록에서 판단한 여부입니다.
    * api로 추가한 경우에는 false입니다.
    */
  var from_history: Boolean
  /** 페이지 제목 */
  var title: String
  /** 많이 방문한 url. */
  var url: String
}

object MostVisitedURL {
  @scala.inline
  def apply(from_history: Boolean, title: String, url: String): MostVisitedURL = {
    val __obj = js.Dynamic.literal(from_history = from_history.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MostVisitedURL]
  }
}

