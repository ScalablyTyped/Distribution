package typings
package muicssLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps
  extends reactLib.reactMod.ReactNs.FormHTMLAttributes[reactLib.HTMLFormElement] {
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    FormHTMLAttributes: reactLib.reactMod.ReactNs.FormHTMLAttributes[reactLib.HTMLFormElement] = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FormHTMLAttributes)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[FormProps]
  }
}

