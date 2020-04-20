package typings.naverWhale.whale.topSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MostVisitedURL2 extends js.Object {
  /** 페이지 제목 */
  var title: String
  /** 많이 방문한 url. */
  var url: String
}

object MostVisitedURL2 {
  @scala.inline
  def apply(title: String, url: String): MostVisitedURL2 = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MostVisitedURL2]
  }
}

