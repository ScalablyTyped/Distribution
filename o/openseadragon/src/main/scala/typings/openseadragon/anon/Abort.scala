package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Abort extends js.Object {
  var abort: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ajaxHeaders: js.UndefOr[String] = js.undefined
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.undefined
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var crossOriginPolicy: js.UndefOr[String | Boolean] = js.undefined
  var loadWithAjax: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object Abort {
  @scala.inline
  def apply(
    abort: () => Unit = null,
    ajaxHeaders: String = null,
    ajaxWithCredentials: js.UndefOr[Boolean] = js.undefined,
    callback: () => Unit = null,
    crossOriginPolicy: String | Boolean = null,
    loadWithAjax: String = null,
    src: String = null
  ): Abort = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction0(abort))
    if (ajaxHeaders != null) __obj.updateDynamic("ajaxHeaders")(ajaxHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(ajaxWithCredentials)) __obj.updateDynamic("ajaxWithCredentials")(ajaxWithCredentials.get.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (crossOriginPolicy != null) __obj.updateDynamic("crossOriginPolicy")(crossOriginPolicy.asInstanceOf[js.Any])
    if (loadWithAjax != null) __obj.updateDynamic("loadWithAjax")(loadWithAjax.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abort]
  }
}

