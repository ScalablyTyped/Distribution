package typings.naverDashWhale.whale.devtools.panels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("whale.devtools.panels.create")
@js.native
object create extends js.Object {
  def apply(title: String, iconPath: String, pagePath: String): Unit = js.native
  def apply(
    title: String,
    iconPath: String,
    pagePath: String,
    callback: js.Function1[/* panel */ typings.chrome.chrome.devtools.panels.ExtensionPanel, Unit]
  ): Unit = js.native
}

