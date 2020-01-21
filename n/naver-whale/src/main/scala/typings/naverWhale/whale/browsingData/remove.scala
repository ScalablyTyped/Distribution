package typings.naverWhale.whale.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.browsingData.remove")
@js.native
object remove extends js.Object {
  def apply(
    options: typings.chrome.chrome.browsingData.RemovalOptions,
    dataToRemove: typings.chrome.chrome.browsingData.DataTypeSet
  ): Unit = js.native
  def apply(
    options: typings.chrome.chrome.browsingData.RemovalOptions,
    dataToRemove: typings.chrome.chrome.browsingData.DataTypeSet,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

