package typings.naverWhale

import typings.chrome.chrome.devtools.inspectedWindow.Resource
import typings.chrome.chrome.devtools.panels.ElementsPanel
import typings.chrome.chrome.devtools.panels.ExtensionPanel
import typings.chrome.chrome.devtools.panels.SourcesPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpanels extends js.Object {
  var elements: ElementsPanel = js.native
  var sources: SourcesPanel = js.native
  def create(title: String, iconPath: String, pagePath: String): Unit = js.native
  def create(
    title: String,
    iconPath: String,
    pagePath: String,
    callback: js.Function1[/* panel */ ExtensionPanel, Unit]
  ): Unit = js.native
  def openResource(url: String, lineNumber: Double, callback: js.Function0[Unit]): Unit = js.native
  def setOpenResourceHandler(): Unit = js.native
  def setOpenResourceHandler(callback: js.Function1[/* resource */ Resource, Unit]): Unit = js.native
}

