package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCompassChangeCallbackResult extends js.Object {
  /** 精度
    *
    * 最低基础库： `2.4.0` */
  var accuracy: Double | String
  /** 面对的方向度数 */
  var direction: Double
}

object OnCompassChangeCallbackResult {
  @scala.inline
  def apply(accuracy: Double | String, direction: Double): OnCompassChangeCallbackResult = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnCompassChangeCallbackResult]
  }
}

