package typings.naverDashWhale.whaleNs.devtoolsNs.panelsNs

import typings.chrome.chromeNs.devtoolsNs.inspectedWindowNs.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("whale.devtools.panels")
@js.native
object ^ extends js.Object {
  var elements: typings.chrome.chromeNs.devtoolsNs.panelsNs.ElementsPanel = js.native
  var sources: typings.chrome.chromeNs.devtoolsNs.panelsNs.SourcesPanel = js.native
  def create(title: String, iconPath: String, pagePath: String): Unit = js.native
  def create(
    title: String,
    iconPath: String,
    pagePath: String,
    callback: js.Function1[/* panel */ typings.chrome.chromeNs.devtoolsNs.panelsNs.ExtensionPanel, Unit]
  ): Unit = js.native
  def openResource(url: String, lineNumber: Double, callback: js.Function0[Unit]): Unit = js.native
  def setOpenResourceHandler(): Unit = js.native
  def setOpenResourceHandler(callback: js.Function1[/* resource */ Resource, Unit]): Unit = js.native
}

