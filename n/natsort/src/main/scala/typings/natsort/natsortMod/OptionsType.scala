package typings.natsort.natsortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsType extends js.Object {
  var desc: js.UndefOr[Boolean] = js.undefined
  var insensitive: js.UndefOr[Boolean] = js.undefined
}

object OptionsType {
  @scala.inline
  def apply(desc: js.UndefOr[Boolean] = js.undefined, insensitive: js.UndefOr[Boolean] = js.undefined): OptionsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc)
    if (!js.isUndefined(insensitive)) __obj.updateDynamic("insensitive")(insensitive)
    __obj.asInstanceOf[OptionsType]
  }
}

