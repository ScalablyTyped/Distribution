package typings
package nodalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: scala.Double
  var error: js.Any
  var offset: scala.Double
  var resource: js.Any
  var summary: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var total: scala.Double
}

object Anon_Count {
  @scala.inline
  def apply(
    count: scala.Double,
    error: js.Any,
    offset: scala.Double,
    resource: js.Any,
    total: scala.Double,
    summary: java.lang.String = null
  ): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count, error = error, offset = offset, resource = resource, total = total)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[Anon_Count]
  }
}

