package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextCallbackResult extends js.Object {
  /** 节点对应的 Context 对象 */
  var context: js.Object
}

object ContextCallbackResult {
  @scala.inline
  def apply(context: js.Object): ContextCallbackResult = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContextCallbackResult]
  }
}

