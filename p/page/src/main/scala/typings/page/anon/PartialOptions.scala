package typings.page.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<page.PageJS.Options> */
trait PartialOptions extends js.Object {
  var click: js.UndefOr[Boolean] = js.undefined
  var decodeURLComponents: js.UndefOr[Boolean] = js.undefined
  var dispatch: js.UndefOr[Boolean] = js.undefined
  var hashbang: js.UndefOr[Boolean] = js.undefined
  var popstate: js.UndefOr[Boolean] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    click: js.UndefOr[Boolean] = js.undefined,
    decodeURLComponents: js.UndefOr[Boolean] = js.undefined,
    dispatch: js.UndefOr[Boolean] = js.undefined,
    hashbang: js.UndefOr[Boolean] = js.undefined,
    popstate: js.UndefOr[Boolean] = js.undefined
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(click)) __obj.updateDynamic("click")(click.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decodeURLComponents)) __obj.updateDynamic("decodeURLComponents")(decodeURLComponents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dispatch)) __obj.updateDynamic("dispatch")(dispatch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hashbang)) __obj.updateDynamic("hashbang")(hashbang.get.asInstanceOf[js.Any])
    if (!js.isUndefined(popstate)) __obj.updateDynamic("popstate")(popstate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

