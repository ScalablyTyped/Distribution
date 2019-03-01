package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtendedError
  extends nodeLib.Error {
  var details: js.UndefOr[js.Object] = js.undefined
  var notFound: js.UndefOr[scala.Boolean] = js.undefined
}

object IExtendedError {
  @scala.inline
  def apply(
    details: js.Object = null,
    notFound: js.UndefOr[scala.Boolean] = js.undefined,
    stack: java.lang.String = null
  ): IExtendedError = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    if (!js.isUndefined(notFound)) __obj.updateDynamic("notFound")(notFound)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[IExtendedError]
  }
}

