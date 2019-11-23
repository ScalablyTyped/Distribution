package typings.muicss.reactMod

import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProps extends HTMLAttributes[HTMLDivElement] {
  var fluid: js.UndefOr[Boolean] = js.undefined
}

object ContainerProps {
  @scala.inline
  def apply(HTMLAttributes: HTMLAttributes[HTMLDivElement] = null, fluid: js.UndefOr[Boolean] = js.undefined): ContainerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    __obj.asInstanceOf[ContainerProps]
  }
}

