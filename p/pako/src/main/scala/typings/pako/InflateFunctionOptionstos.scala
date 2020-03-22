package typings.pako

import typings.pako.pakoStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined pako.pako.InflateFunctionOptions & {  to  :'string'} */
trait InflateFunctionOptionstos extends js.Object {
  var raw: js.UndefOr[Boolean] = js.undefined
  var to: js.UndefOr[string] = js.undefined
  var windowBits: js.UndefOr[Double] = js.undefined
}

object InflateFunctionOptionstos {
  @scala.inline
  def apply(raw: js.UndefOr[Boolean] = js.undefined, to: string = null, windowBits: Int | Double = null): InflateFunctionOptionstos = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflateFunctionOptionstos]
  }
}

