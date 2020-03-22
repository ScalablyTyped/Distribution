package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 上报的自定义数据。 */
trait Data extends js.Object {
  /** 配置中的字段名 */
  var key: String
  /** 上报的数据 */
  var value: js.Any
}

object Data {
  @scala.inline
  def apply(key: String, value: js.Any): Data = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Data]
  }
}

