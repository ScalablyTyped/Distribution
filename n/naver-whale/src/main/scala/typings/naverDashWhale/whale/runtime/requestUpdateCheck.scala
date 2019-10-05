package typings.naverDashWhale.whale.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.requestUpdateCheck")
@js.native
object requestUpdateCheck extends js.Object {
  def apply(
    callback: js.Function2[
      /* status */ typings.chrome.chrome.runtime.RequestUpdateCheckStatus, 
      /* details */ js.UndefOr[typings.chrome.chrome.runtime.UpdateCheckDetails], 
      Unit
    ]
  ): Unit = js.native
}

