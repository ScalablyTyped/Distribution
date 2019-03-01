package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayMetadata
  extends /* other */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var offset: js.UndefOr[scala.Double] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
}

object IArrayMetadata {
  @scala.inline
  def apply(
    StringDictionary: /* other */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    offset: scala.Int | scala.Double = null,
    total: scala.Int | scala.Double = null
  ): IArrayMetadata = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArrayMetadata]
  }
}

