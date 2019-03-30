package typings
package naverDashWhaleLib.whaleNs.sidebarActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeBackgroundColorDetails extends js.Object {
  /** 색상값 배열([255, 0, 0, 255]) 혹은 HEX 색상 표현 문자열(#FF0000). */
  var color: java.lang.String | ColorArray
}

object BadgeBackgroundColorDetails {
  @scala.inline
  def apply(color: java.lang.String | ColorArray): BadgeBackgroundColorDetails = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BadgeBackgroundColorDetails]
  }
}

