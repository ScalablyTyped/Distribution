package typings.nextReactDevOverlay.runtimeErrorMod

import typings.nextReactDevOverlay.errorsMod.ReadyRuntimeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeErrorProps extends js.Object {
  var error: ReadyRuntimeError
}

object RuntimeErrorProps {
  @scala.inline
  def apply(error: ReadyRuntimeError): RuntimeErrorProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeErrorProps]
  }
}

