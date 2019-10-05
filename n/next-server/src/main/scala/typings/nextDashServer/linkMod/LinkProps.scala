package typings.nextDashServer.linkMod

import typings.nextDashServer.routerMod.UrlLike
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends js.Object {
  var as: js.UndefOr[String | UrlLike] = js.undefined
  var children: ReactNode
  var href: js.UndefOr[String | UrlLike] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.undefined
  var passHref: js.UndefOr[Boolean] = js.undefined
  var prefetch: js.UndefOr[Boolean] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var scroll: js.UndefOr[Boolean] = js.undefined
  var shallow: js.UndefOr[Boolean] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    as: String | UrlLike = null,
    children: ReactNode = null,
    href: String | UrlLike = null,
    onError: /* error */ js.Any => Unit = null,
    passHref: js.UndefOr[Boolean] = js.undefined,
    prefetch: js.UndefOr[Boolean] = js.undefined,
    replace: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined,
    shallow: js.UndefOr[Boolean] = js.undefined
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (!js.isUndefined(passHref)) __obj.updateDynamic("passHref")(passHref)
    if (!js.isUndefined(prefetch)) __obj.updateDynamic("prefetch")(prefetch)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow)
    __obj.asInstanceOf[LinkProps]
  }
}

