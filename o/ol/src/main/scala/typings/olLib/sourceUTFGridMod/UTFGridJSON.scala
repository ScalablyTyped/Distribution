package typings
package olLib.sourceUTFGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UTFGridJSON extends js.Object {
  var data: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]]
  ] = js.undefined
  var grid: js.Array[java.lang.String]
  var keys: js.Array[java.lang.String]
}

object UTFGridJSON {
  @scala.inline
  def apply(
    grid: js.Array[java.lang.String],
    keys: js.Array[java.lang.String],
    data: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]] = null
  ): UTFGridJSON = {
    val __obj = js.Dynamic.literal(grid = grid, keys = keys)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[UTFGridJSON]
  }
}

