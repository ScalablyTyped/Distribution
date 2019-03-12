package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps
  extends reactLib.reactMod.ReactNs.AnchorHTMLAttributes[stdLib.HTMLAnchorElement] {
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var to: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]
}

object LinkProps {
  @scala.inline
  def apply(
    to: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    AnchorHTMLAttributes: reactLib.reactMod.ReactNs.AnchorHTMLAttributes[stdLib.HTMLAnchorElement] = null,
    replace: js.UndefOr[scala.Boolean] = js.undefined
  ): LinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, AnchorHTMLAttributes)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    __obj.asInstanceOf[LinkProps]
  }
}

