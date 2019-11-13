package typings.next.distClientLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends js.Object {
  var as: js.UndefOr[Url] = js.undefined
  var href: Url
  var passHref: js.UndefOr[Boolean] = js.undefined
  var prefetch: js.UndefOr[Boolean] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var scroll: js.UndefOr[Boolean] = js.undefined
  var shallow: js.UndefOr[Boolean] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    href: Url,
    as: Url = null,
    passHref: js.UndefOr[Boolean] = js.undefined,
    prefetch: js.UndefOr[Boolean] = js.undefined,
    replace: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined,
    shallow: js.UndefOr[Boolean] = js.undefined
  ): LinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(passHref)) __obj.updateDynamic("passHref")(passHref)
    if (!js.isUndefined(prefetch)) __obj.updateDynamic("prefetch")(prefetch)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow)
    __obj.asInstanceOf[LinkProps]
  }
}

