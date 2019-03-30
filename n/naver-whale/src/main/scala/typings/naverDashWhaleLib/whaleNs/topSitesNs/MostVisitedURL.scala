package typings
package naverDashWhaleLib.whaleNs.topSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MostVisitedURL extends js.Object {
  /**
    * 방문기록에서 판단한 여부입니다.
    * api로 추가한 경우에는 false입니다.
    */
  var from_history: scala.Boolean
  /** 페이지 제목 */
  var title: java.lang.String
  /** 많이 방문한 url. */
  var url: java.lang.String
}

object MostVisitedURL {
  @scala.inline
  def apply(from_history: scala.Boolean, title: java.lang.String, url: java.lang.String): MostVisitedURL = {
    val __obj = js.Dynamic.literal(from_history = from_history, title = title, url = url)
  
    __obj.asInstanceOf[MostVisitedURL]
  }
}

