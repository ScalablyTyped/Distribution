package typings
package nextDashServerLib.linkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends js.Object {
  var as: js.UndefOr[java.lang.String | nextDashServerLib.routerMod.UrlLike] = js.undefined
  var children: reactLib.reactMod.ReactNs.ReactElement[_]
  var href: js.UndefOr[java.lang.String | nextDashServerLib.routerMod.UrlLike] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, scala.Unit]] = js.undefined
  var passHref: js.UndefOr[scala.Boolean] = js.undefined
  var prefetch: js.UndefOr[scala.Boolean] = js.undefined
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  var shallow: js.UndefOr[scala.Boolean] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactElement[_],
    as: java.lang.String | nextDashServerLib.routerMod.UrlLike = null,
    href: java.lang.String | nextDashServerLib.routerMod.UrlLike = null,
    onError: js.Function1[/* error */ js.Any, scala.Unit] = null,
    passHref: js.UndefOr[scala.Boolean] = js.undefined,
    prefetch: js.UndefOr[scala.Boolean] = js.undefined,
    replace: js.UndefOr[scala.Boolean] = js.undefined,
    scroll: js.UndefOr[scala.Boolean] = js.undefined,
    shallow: js.UndefOr[scala.Boolean] = js.undefined
  ): LinkProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (!js.isUndefined(passHref)) __obj.updateDynamic("passHref")(passHref)
    if (!js.isUndefined(prefetch)) __obj.updateDynamic("prefetch")(prefetch)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow)
    __obj.asInstanceOf[LinkProps]
  }
}

