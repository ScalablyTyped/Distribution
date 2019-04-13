package typings
package natsDashHemeraLib.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrioConfig extends js.Object {
  var exclude: js.UndefOr[js.Any] = js.undefined
  var include: js.UndefOr[js.Any] = js.undefined
  var inherited: js.UndefOr[scala.Boolean] = js.undefined
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
  var stack: js.UndefOr[scala.Boolean] = js.undefined
}

object ErrioConfig {
  @scala.inline
  def apply(
    exclude: js.Any = null,
    include: js.Any = null,
    inherited: js.UndefOr[scala.Boolean] = js.undefined,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    recursive: js.UndefOr[scala.Boolean] = js.undefined,
    stack: js.UndefOr[scala.Boolean] = js.undefined
  ): ErrioConfig = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (include != null) __obj.updateDynamic("include")(include)
    if (!js.isUndefined(inherited)) __obj.updateDynamic("inherited")(inherited)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ErrioConfig]
  }
}

