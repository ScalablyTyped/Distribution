package typings.nodal.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayMetadata
  extends /* other */ StringDictionary[js.Any] {
  var offset: js.UndefOr[Double] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object IArrayMetadata {
  @scala.inline
  def apply(
    StringDictionary: /* other */ StringDictionary[js.Any] = null,
    offset: Int | Double = null,
    total: Int | Double = null
  ): IArrayMetadata = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArrayMetadata]
  }
}

