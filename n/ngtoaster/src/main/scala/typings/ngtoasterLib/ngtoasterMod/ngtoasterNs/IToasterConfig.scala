package typings
package ngtoasterLib.ngtoasterMod.ngtoasterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IToasterConfig extends js.Object {
  /**
           * Options include:
           * '', 'trustedHtml', 'template', 'templateWithData'
           */
  var `body-output-type`: js.UndefOr[java.lang.String] = js.undefined
  var `body-template`: js.UndefOr[java.lang.String] = js.undefined
  var `close-button`: js.UndefOr[scala.Boolean] = js.undefined
  var `close-html`: js.UndefOr[java.lang.String] = js.undefined
  var `icon-class`: js.UndefOr[java.lang.String] = js.undefined
  var `icon-classes`: js.UndefOr[IIconClasses] = js.undefined
  /**
           * limits max number of toasts
           */
  var limit: js.UndefOr[scala.Double] = js.undefined
  var `message-class`: js.UndefOr[java.lang.String] = js.undefined
  /**
           * stop timeout on mouseover and restart timer on mouseout
           */
  var `mouseover-timer-stop`: js.UndefOr[scala.Boolean] = js.undefined
  var `newest-on-top`: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Options include:
           * 'toast-top-full-width', 'toast-bottom-full-width', 'toast-center',
           * 'toast-top-left', 'toast-top-center', 'toast-top-rigt',
           * 'toast-bottom-left', 'toast-bottom-center', 'toast-bottom-rigt',
           */
  var `position-class`: js.UndefOr[java.lang.String] = js.undefined
  var `prevent-duplicates`: js.UndefOr[scala.Boolean] = js.undefined
  var `tap-to-dismiss`: js.UndefOr[scala.Boolean] = js.undefined
  var `time-out`: js.UndefOr[scala.Double] = js.undefined
  var `title-class`: js.UndefOr[java.lang.String] = js.undefined
}

