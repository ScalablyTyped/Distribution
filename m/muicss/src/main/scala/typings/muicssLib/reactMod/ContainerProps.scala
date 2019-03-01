package typings
package muicssLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
}

object ContainerProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] = null,
    fluid: js.UndefOr[scala.Boolean] = js.undefined
  ): ContainerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    __obj.asInstanceOf[ContainerProps]
  }
}

