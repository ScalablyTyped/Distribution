package typings.muicss.reactMod

import typings.react.reactMod.FormHTMLAttributes
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps extends FormHTMLAttributes[HTMLFormElement] {
  var `inline`: js.UndefOr[Boolean] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    FormHTMLAttributes: FormHTMLAttributes[HTMLFormElement] = null,
    `inline`: js.UndefOr[Boolean] = js.undefined
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FormHTMLAttributes)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[FormProps]
  }
}

