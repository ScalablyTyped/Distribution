package typings.naverDashWhale.whaleNs.devtoolsNs.panelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionSidebarPane extends js.Object {
  /** Fired when the sidebar pane becomes hidden as a result of the user switching away from the panel that hosts the sidebar pane. */
  var onHidden: typings.chrome.chromeNs.devtoolsNs.panelsNs.ExtensionSidebarPaneHiddenEvent = js.native
  /** Fired when the sidebar pane becomes visible as a result of user switching to the panel that hosts it. */
  var onShown: typings.chrome.chromeNs.devtoolsNs.panelsNs.ExtensionSidebarPaneShownEvent = js.native
  /**
    * Sets an expression that is evaluated within the inspected page. The result is displayed in the sidebar pane.
    * @param expression An expression to be evaluated in context of the inspected page. JavaScript objects and DOM nodes are displayed in an expandable tree similar to the console/watch.
    * @param rootTitle An optional title for the root of the expression tree.
    * @param callback A callback invoked after the sidebar pane is updated with the expression evaluation results.
    * If you specify the callback parameter, it should be a function that looks like this:
    * function() {...};
    */
  def setExpression(expression: String): Unit = js.native
  def setExpression(expression: String, callback: js.Function0[Unit]): Unit = js.native
  def setExpression(expression: String, rootTitle: String): Unit = js.native
  def setExpression(expression: String, rootTitle: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Sets the height of the sidebar.
    * @param height A CSS-like size specification, such as '100px' or '12ex'.
    */
  def setHeight(height: String): Unit = js.native
  /**
    * Sets a JSON-compliant object to be displayed in the sidebar pane.
    * @param jsonObject An object to be displayed in context of the inspected page. Evaluated in the context of the caller (API client).
    * @param rootTitle An optional title for the root of the expression tree.
    * @param callback A callback invoked after the sidebar is updated with the object.
    * If you specify the callback parameter, it should be a function that looks like this:
    * function() {...};
    */
  def setObject(jsonObject: js.Object): Unit = js.native
  def setObject(jsonObject: js.Object, callback: js.Function0[Unit]): Unit = js.native
  def setObject(jsonObject: js.Object, rootTitle: String): Unit = js.native
  def setObject(jsonObject: js.Object, rootTitle: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Sets an HTML page to be displayed in the sidebar pane.
    * @param path Relative path of an extension page to display within the sidebar.
    */
  def setPage(path: String): Unit = js.native
}

