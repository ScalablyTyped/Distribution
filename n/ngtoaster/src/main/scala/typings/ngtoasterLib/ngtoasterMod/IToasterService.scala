package typings
package ngtoasterLib.ngtoasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToasterService extends js.Object {
  var toast: IToast = js.native
  def clear(): scala.Unit = js.native
  def clear(toasterId: scala.Double): scala.Unit = js.native
  def clear(toasterId: scala.Double, toastId: java.lang.String): scala.Unit = js.native
  def clear(toasterId: scala.Double, toastId: scala.Double): scala.Unit = js.native
  def error(params: IPopParams): scala.Unit = js.native
  def error(
    title: js.UndefOr[java.lang.String],
    body: js.UndefOr[java.lang.String],
    timeout: js.UndefOr[scala.Double],
    bodyOutputType: js.UndefOr[java.lang.String],
    clickHandler: js.UndefOr[stdLib.EventListener],
    toasterId: js.UndefOr[scala.Double],
    showCloseButton: js.UndefOr[scala.Boolean],
    toastId: js.UndefOr[scala.Double | java.lang.String],
    onHideCallback: js.UndefOr[IToastCallback]
  ): IPopReturn = js.native
  def info(params: IPopParams): scala.Unit = js.native
  def info(
    title: js.UndefOr[java.lang.String],
    body: js.UndefOr[java.lang.String],
    timeout: js.UndefOr[scala.Double],
    bodyOutputType: js.UndefOr[java.lang.String],
    clickHandler: js.UndefOr[stdLib.EventListener],
    toasterId: js.UndefOr[scala.Double],
    showCloseButton: js.UndefOr[scala.Boolean],
    toastId: js.UndefOr[scala.Double | java.lang.String],
    onHideCallback: js.UndefOr[IToastCallback]
  ): IPopReturn = js.native
  def pop(params: IPopParams): scala.Unit = js.native
  /**
    * @param type Type of toaster  -- 'error', 'info', 'wait', 'success', and 'warning'
    */
  def pop(
    `type`: js.UndefOr[java.lang.String],
    title: js.UndefOr[java.lang.String],
    body: js.UndefOr[java.lang.String],
    timeout: js.UndefOr[scala.Double],
    bodyOutputType: js.UndefOr[java.lang.String],
    clickHandler: js.UndefOr[stdLib.EventListener],
    toasterId: js.UndefOr[scala.Double],
    showCloseButton: js.UndefOr[scala.Boolean],
    toastId: js.UndefOr[scala.Double | java.lang.String],
    onHideCallback: js.UndefOr[IToastCallback]
  ): IPopReturn = js.native
  def success(params: IPopParams): scala.Unit = js.native
  def success(
    title: js.UndefOr[java.lang.String],
    body: js.UndefOr[java.lang.String],
    timeout: js.UndefOr[scala.Double],
    bodyOutputType: js.UndefOr[java.lang.String],
    clickHandler: js.UndefOr[stdLib.EventListener],
    toasterId: js.UndefOr[scala.Double],
    showCloseButton: js.UndefOr[scala.Boolean],
    toastId: js.UndefOr[scala.Double | java.lang.String],
    onHideCallback: js.UndefOr[IToastCallback]
  ): IPopReturn = js.native
  def wait(params: IPopParams): scala.Unit = js.native
  def wait(
    title: js.UndefOr[java.lang.String],
    body: js.UndefOr[java.lang.String],
    timeout: js.UndefOr[scala.Double],
    bodyOutputType: js.UndefOr[java.lang.String],
    clickHandler: js.UndefOr[stdLib.EventListener],
    toasterId: js.UndefOr[scala.Double],
    showCloseButton: js.UndefOr[scala.Boolean],
    toastId: js.UndefOr[scala.Double | java.lang.String],
    onHideCallback: js.UndefOr[IToastCallback]
  ): IPopReturn = js.native
  def warning(params: IPopParams): scala.Unit = js.native
  def warning(
    title: js.UndefOr[java.lang.String],
    body: js.UndefOr[java.lang.String],
    timeout: js.UndefOr[scala.Double],
    bodyOutputType: js.UndefOr[java.lang.String],
    clickHandler: js.UndefOr[stdLib.EventListener],
    toasterId: js.UndefOr[scala.Double],
    showCloseButton: js.UndefOr[scala.Boolean],
    toastId: js.UndefOr[scala.Double | java.lang.String],
    onHideCallback: js.UndefOr[IToastCallback]
  ): IPopReturn = js.native
}

