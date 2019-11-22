package typings.mendixmodelsdk.distSdkInternalVersionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVersionRange extends js.Object {
  var end: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object IVersionRange {
  @scala.inline
  def apply(end: String = null, start: String = null): IVersionRange = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[IVersionRange]
  }
}

