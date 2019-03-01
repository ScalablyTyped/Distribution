package typings
package pgwmodalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PgwModalOption extends js.Object {
  var ajaxOptions: js.UndefOr[js.Any] = js.undefined
  var angular: js.UndefOr[scala.Boolean] = js.undefined
  var backdropClassName: js.UndefOr[java.lang.String] = js.undefined
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  var closeContent: js.UndefOr[java.lang.String] = js.undefined
  var closeOnBackgroundClick: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var errorContent: js.UndefOr[java.lang.String] = js.undefined
  var loadingContent: js.UndefOr[java.lang.String] = js.undefined
  var mainClassName: js.UndefOr[java.lang.String] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var modalData: js.UndefOr[js.Any] = js.undefined
  var pushContent: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleBar: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object PgwModalOption {
  @scala.inline
  def apply(
    ajaxOptions: js.Any = null,
    angular: js.UndefOr[scala.Boolean] = js.undefined,
    backdropClassName: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    closeContent: java.lang.String = null,
    closeOnBackgroundClick: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined,
    content: java.lang.String = null,
    errorContent: java.lang.String = null,
    loadingContent: java.lang.String = null,
    mainClassName: java.lang.String = null,
    maxWidth: scala.Int | scala.Double = null,
    modalData: js.Any = null,
    pushContent: java.lang.String = null,
    target: java.lang.String = null,
    title: java.lang.String = null,
    titleBar: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
  ): PgwModalOption = {
    val __obj = js.Dynamic.literal()
    if (ajaxOptions != null) __obj.updateDynamic("ajaxOptions")(ajaxOptions)
    if (!js.isUndefined(angular)) __obj.updateDynamic("angular")(angular)
    if (backdropClassName != null) __obj.updateDynamic("backdropClassName")(backdropClassName)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (closeContent != null) __obj.updateDynamic("closeContent")(closeContent)
    if (!js.isUndefined(closeOnBackgroundClick)) __obj.updateDynamic("closeOnBackgroundClick")(closeOnBackgroundClick)
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape)
    if (content != null) __obj.updateDynamic("content")(content)
    if (errorContent != null) __obj.updateDynamic("errorContent")(errorContent)
    if (loadingContent != null) __obj.updateDynamic("loadingContent")(loadingContent)
    if (mainClassName != null) __obj.updateDynamic("mainClassName")(mainClassName)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (modalData != null) __obj.updateDynamic("modalData")(modalData)
    if (pushContent != null) __obj.updateDynamic("pushContent")(pushContent)
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(titleBar)) __obj.updateDynamic("titleBar")(titleBar)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PgwModalOption]
  }
}

