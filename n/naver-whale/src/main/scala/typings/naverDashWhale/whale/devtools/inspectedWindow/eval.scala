package typings.naverDashWhale.whale.devtools.inspectedWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("whale.devtools.inspectedWindow.eval")
@js.native
object eval extends js.Object {
  def apply[T](expression: String): Unit = js.native
  def apply[T](
    expression: String,
    callback: js.Function2[
      /* result */ T, 
      /* exceptionInfo */ typings.chrome.chrome.devtools.inspectedWindow.EvaluationExceptionInfo, 
      Unit
    ]
  ): Unit = js.native
  def apply[T](expression: String, options: typings.chrome.chrome.devtools.inspectedWindow.EvalOptions): Unit = js.native
  def apply[T](
    expression: String,
    options: typings.chrome.chrome.devtools.inspectedWindow.EvalOptions,
    callback: js.Function2[
      /* result */ T, 
      /* exceptionInfo */ typings.chrome.chrome.devtools.inspectedWindow.EvaluationExceptionInfo, 
      Unit
    ]
  ): Unit = js.native
}

