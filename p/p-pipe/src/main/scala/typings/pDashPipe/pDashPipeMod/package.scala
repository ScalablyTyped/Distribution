package typings.pDashPipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashPipeMod {
  type Pipeline[ValueType, ReturnType] = js.Function1[/* value */ ValueType, js.Promise[ReturnType]]
  type UnaryFunction[ValueType, ReturnType] = js.Function1[/* value */ ValueType, ReturnType | js.Thenable[ReturnType]]
}
