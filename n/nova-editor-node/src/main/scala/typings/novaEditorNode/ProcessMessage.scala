package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/process-message/
trait ProcessMessage[P, R, E] extends js.Object {
  val errorCode: Double | Null
  val errorData: E | Null
  val errorReason: String | Null
  val method: String | Null
  val parameters: js.UndefOr[P] = js.undefined
  val result: js.UndefOr[R | Null] = js.undefined
}

object ProcessMessage {
  @scala.inline
  def apply[P, R, E](
    errorCode: Double = null.asInstanceOf[Double],
    errorData: E = null,
    errorReason: String = null,
    method: String = null,
    parameters: P = null,
    result: js.UndefOr[Null | R] = js.undefined
  ): ProcessMessage[P, R, E] = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorData = errorData.asInstanceOf[js.Any], errorReason = errorReason.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (!js.isUndefined(result)) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessMessage[P, R, E]]
  }
}

