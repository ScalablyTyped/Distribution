package typings
package pDashLoadingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PLoadingOptions extends js.Object {
  var action: js.UndefOr[
    pDashLoadingLib.pDashLoadingLibStrings.show | pDashLoadingLib.pDashLoadingLibStrings.hide | pDashLoadingLib.pDashLoadingLibStrings.destroy
  ] = js.undefined
  var containerAttrs: js.UndefOr[js.Object] = js.undefined
  var containerClass: js.UndefOr[java.lang.String] = js.undefined
  var containerHTML: js.UndefOr[java.lang.String] = js.undefined
  var destroyAfterHide: js.UndefOr[scala.Boolean] = js.undefined
  var hideAnimation: js.UndefOr[js.Function1[/* $container */ JQuery, scala.Unit]] = js.undefined
  var idPrefix: js.UndefOr[java.lang.String] = js.undefined
  var maskColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @deprecated
    */
  var onDestroyContainer: js.UndefOr[js.Function1[/* $container */ JQuery, scala.Unit]] = js.undefined
  /**
    * @deprecated
    */
  var onHideContainer: js.UndefOr[js.Function2[/* $pluginElement */ JQuery, /* $container */ JQuery, scala.Unit]] = js.undefined
  /**
    * @deprecated
    */
  var onShowContainer: js.UndefOr[js.Function2[/* $pluginElement */ JQuery, /* $container */ JQuery, scala.Unit]] = js.undefined
  var pluginNameSpace: js.UndefOr[java.lang.String] = js.undefined
  var showAnimation: js.UndefOr[js.Function1[/* $container */ JQuery, scala.Unit]] = js.undefined
  var spinnerAttrs: js.UndefOr[js.Object] = js.undefined
  var spinnerClass: js.UndefOr[java.lang.String] = js.undefined
  var spinnerHTML: js.UndefOr[java.lang.String] = js.undefined
  var useAddOns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PLoadingOptions {
  @scala.inline
  def apply(
    action: pDashLoadingLib.pDashLoadingLibStrings.show | pDashLoadingLib.pDashLoadingLibStrings.hide | pDashLoadingLib.pDashLoadingLibStrings.destroy = null,
    containerAttrs: js.Object = null,
    containerClass: java.lang.String = null,
    containerHTML: java.lang.String = null,
    destroyAfterHide: js.UndefOr[scala.Boolean] = js.undefined,
    hideAnimation: /* $container */ JQuery => scala.Unit = null,
    idPrefix: java.lang.String = null,
    maskColor: java.lang.String = null,
    onDestroyContainer: /* $container */ JQuery => scala.Unit = null,
    onHideContainer: (/* $pluginElement */ JQuery, /* $container */ JQuery) => scala.Unit = null,
    onShowContainer: (/* $pluginElement */ JQuery, /* $container */ JQuery) => scala.Unit = null,
    pluginNameSpace: java.lang.String = null,
    showAnimation: /* $container */ JQuery => scala.Unit = null,
    spinnerAttrs: js.Object = null,
    spinnerClass: java.lang.String = null,
    spinnerHTML: java.lang.String = null,
    useAddOns: js.Array[java.lang.String] = null
  ): PLoadingOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (containerAttrs != null) __obj.updateDynamic("containerAttrs")(containerAttrs)
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass)
    if (containerHTML != null) __obj.updateDynamic("containerHTML")(containerHTML)
    if (!js.isUndefined(destroyAfterHide)) __obj.updateDynamic("destroyAfterHide")(destroyAfterHide)
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(js.Any.fromFunction1(hideAnimation))
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix)
    if (maskColor != null) __obj.updateDynamic("maskColor")(maskColor)
    if (onDestroyContainer != null) __obj.updateDynamic("onDestroyContainer")(js.Any.fromFunction1(onDestroyContainer))
    if (onHideContainer != null) __obj.updateDynamic("onHideContainer")(js.Any.fromFunction2(onHideContainer))
    if (onShowContainer != null) __obj.updateDynamic("onShowContainer")(js.Any.fromFunction2(onShowContainer))
    if (pluginNameSpace != null) __obj.updateDynamic("pluginNameSpace")(pluginNameSpace)
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(js.Any.fromFunction1(showAnimation))
    if (spinnerAttrs != null) __obj.updateDynamic("spinnerAttrs")(spinnerAttrs)
    if (spinnerClass != null) __obj.updateDynamic("spinnerClass")(spinnerClass)
    if (spinnerHTML != null) __obj.updateDynamic("spinnerHTML")(spinnerHTML)
    if (useAddOns != null) __obj.updateDynamic("useAddOns")(useAddOns)
    __obj.asInstanceOf[PLoadingOptions]
  }
}

