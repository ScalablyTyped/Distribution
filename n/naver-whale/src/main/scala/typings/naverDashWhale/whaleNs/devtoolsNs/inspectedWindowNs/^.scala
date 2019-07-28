package typings.naverDashWhale.whaleNs.devtoolsNs.inspectedWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("whale.devtools.inspectedWindow")
@js.native
object ^ extends js.Object {
  var onResourceAdded: typings.chrome.chromeNs.devtoolsNs.inspectedWindowNs.ResourceAddedEvent = js.native
  var onResourceContentCommitted: typings.chrome.chromeNs.devtoolsNs.inspectedWindowNs.ResourceContentCommittedEvent = js.native
  var tabId: Double = js.native
  def eval[T](expression: String): Unit = js.native
  def eval[T](
    expression: String,
    callback: js.Function2[
      /* result */ T, 
      /* exceptionInfo */ typings.chrome.chromeNs.devtoolsNs.inspectedWindowNs.EvaluationExceptionInfo, 
      Unit
    ]
  ): Unit = js.native
  def eval[T](expression: String, options: typings.chrome.chromeNs.devtoolsNs.inspectedWindowNs.EvalOptions): Unit = js.native
  def eval[T](
    expression: String,
    options: typings.chrome.chromeNs.devtoolsNs.inspectedWindowNs.EvalOptions,
    callback: js.Function2[
      /* result */ T, 
      /* exceptionInfo */ typings.chrome.chromeNs.devtoolsNs.inspectedWindowNs.EvaluationExceptionInfo, 
      Unit
    ]
  ): Unit = js.native
  def getResources(
    callback: js.Function1[
      /* resources */ js.Array[typings.chrome.chromeNs.devtoolsNs.inspectedWindowNs.Resource], 
      Unit
    ]
  ): Unit = js.native
  def reload(reloadOptions: typings.chrome.chromeNs.devtoolsNs.inspectedWindowNs.ReloadOptions): Unit = js.native
}

