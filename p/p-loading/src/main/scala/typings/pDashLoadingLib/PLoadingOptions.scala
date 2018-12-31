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

