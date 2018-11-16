package typings
package ngtoasterLib.ngtoasterMod.ngtoasterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IToast extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var bodyOutputType: js.UndefOr[java.lang.String] = js.undefined
  var clickHandler: js.UndefOr[stdLib.EventListener] = js.undefined
  var closeHtml: js.UndefOr[java.lang.String] = js.undefined
  var directiveData: js.UndefOr[js.Any] = js.undefined
  /**
           * Called when the toast has been removed.
           * @param toast the displayed toast
           */
  var onHideCallback: js.UndefOr[IToastCallback] = js.undefined
  /**
           * Called when the toast has been displayed.
           * @param toast the displayed toast
           */
  var onShowCallback: js.UndefOr[IToastCallback] = js.undefined
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  var tapToDismiss: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var toastId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
           * Acceptable types are:
           * 'error', 'info', 'wait', 'success', and 'warning'
           */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

