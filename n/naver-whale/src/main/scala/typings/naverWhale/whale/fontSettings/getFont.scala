package typings.naverWhale.whale.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fontSettings.getFont")
@js.native
object getFont extends js.Object {
  def apply(details: typings.chrome.chrome.fontSettings.FontDetails): Unit = js.native
  def apply(
    details: typings.chrome.chrome.fontSettings.FontDetails,
    callback: js.Function1[/* details */ typings.chrome.chrome.fontSettings.FontDetailsResult, Unit]
  ): Unit = js.native
}

