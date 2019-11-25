package typings.pgwmodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PgwModalOption extends js.Object {
  var ajaxOptions: js.UndefOr[js.Any] = js.undefined
  var angular: js.UndefOr[Boolean] = js.undefined
  var backdropClassName: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var closeContent: js.UndefOr[String] = js.undefined
  var closeOnBackgroundClick: js.UndefOr[Boolean] = js.undefined
  var closeOnEscape: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var errorContent: js.UndefOr[String] = js.undefined
  var loadingContent: js.UndefOr[String] = js.undefined
  var mainClassName: js.UndefOr[String] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var modalData: js.UndefOr[js.Any] = js.undefined
  var pushContent: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleBar: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PgwModalOption {
  @scala.inline
  def apply(
    ajaxOptions: js.Any = null,
    angular: js.UndefOr[Boolean] = js.undefined,
    backdropClassName: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeContent: String = null,
    closeOnBackgroundClick: js.UndefOr[Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    errorContent: String = null,
    loadingContent: String = null,
    mainClassName: String = null,
    maxWidth: Int | Double = null,
    modalData: js.Any = null,
    pushContent: String = null,
    target: String = null,
    title: String = null,
    titleBar: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): PgwModalOption = {
    val __obj = js.Dynamic.literal()
    if (ajaxOptions != null) __obj.updateDynamic("ajaxOptions")(ajaxOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(angular)) __obj.updateDynamic("angular")(angular.asInstanceOf[js.Any])
    if (backdropClassName != null) __obj.updateDynamic("backdropClassName")(backdropClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (closeContent != null) __obj.updateDynamic("closeContent")(closeContent.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnBackgroundClick)) __obj.updateDynamic("closeOnBackgroundClick")(closeOnBackgroundClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (errorContent != null) __obj.updateDynamic("errorContent")(errorContent.asInstanceOf[js.Any])
    if (loadingContent != null) __obj.updateDynamic("loadingContent")(loadingContent.asInstanceOf[js.Any])
    if (mainClassName != null) __obj.updateDynamic("mainClassName")(mainClassName.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (modalData != null) __obj.updateDynamic("modalData")(modalData.asInstanceOf[js.Any])
    if (pushContent != null) __obj.updateDynamic("pushContent")(pushContent.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleBar)) __obj.updateDynamic("titleBar")(titleBar.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PgwModalOption]
  }
}

