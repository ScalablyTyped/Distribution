package typings.nodal.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayMetadata
  extends /* item */ StringDictionary[js.Any] {
  var offset: js.UndefOr[Double] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object IArrayMetadata {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    offset: js.UndefOr[Double] = js.undefined,
    total: js.UndefOr[Double] = js.undefined
  ): IArrayMetadata = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArrayMetadata]
  }
}

