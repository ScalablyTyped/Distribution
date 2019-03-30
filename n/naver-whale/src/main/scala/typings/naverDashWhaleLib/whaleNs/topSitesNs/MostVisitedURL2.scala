package typings
package naverDashWhaleLib.whaleNs.topSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MostVisitedURL2 extends js.Object {
  /** 페이지 제목 */
  var title: java.lang.String
  /** 많이 방문한 url. */
  var url: java.lang.String
}

object MostVisitedURL2 {
  @scala.inline
  def apply(title: java.lang.String, url: java.lang.String): MostVisitedURL2 = {
    val __obj = js.Dynamic.literal(title = title, url = url)
  
    __obj.asInstanceOf[MostVisitedURL2]
  }
}

