package typings.ol.sourceUTFGridMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UTFGridJSON extends js.Object {
  var data: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  var grid: js.Array[String]
  var keys: js.Array[String]
}

object UTFGridJSON {
  @scala.inline
  def apply(grid: js.Array[String], keys: js.Array[String], data: StringDictionary[js.Object] = null): UTFGridJSON = {
    val __obj = js.Dynamic.literal(grid = grid, keys = keys)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[UTFGridJSON]
  }
}

