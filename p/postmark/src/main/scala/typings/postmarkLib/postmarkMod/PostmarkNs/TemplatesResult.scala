package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplatesResult extends PaginatedResult {
  var Templates: js.Array[TemplateBase]
}

object TemplatesResult {
  @scala.inline
  def apply(Templates: js.Array[TemplateBase], TotalCount: scala.Double): TemplatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Templates")(Templates)
    __obj.updateDynamic("TotalCount")(TotalCount)
    __obj.asInstanceOf[TemplatesResult]
  }
}

