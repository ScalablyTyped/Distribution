package typings
package naverDashWhaleLib.whaleNs.devtoolsNs.panelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementsPanel extends js.Object {
  /** Fired when an object is selected in the panel. */
  var onSelectionChanged: chromeLib.chromeNs.devtoolsNs.panelsNs.SelectionChangedEvent = js.native
  /**
    * Creates a pane within panel's sidebar.
    * @param title Text that is displayed in sidebar caption.
    * @param callback A callback invoked when the sidebar is created.
    * If you specify the callback parameter, it should be a function that looks like this:
    * function( ExtensionSidebarPane result) {...};
    * Parameter result: An ExtensionSidebarPane object for created sidebar pane.
    */
  def createSidebarPane(title: java.lang.String): scala.Unit = js.native
  def createSidebarPane(
    title: java.lang.String,
    callback: js.Function1[
      /* result */ chromeLib.chromeNs.devtoolsNs.panelsNs.ExtensionSidebarPane, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

