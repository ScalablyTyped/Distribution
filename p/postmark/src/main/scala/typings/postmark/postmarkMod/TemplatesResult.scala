package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplatesResult extends PaginatedResult {
  var Templates: js.Array[TemplateBase]
}

object TemplatesResult {
  @scala.inline
  def apply(Templates: js.Array[TemplateBase], TotalCount: Double): TemplatesResult = {
    val __obj = js.Dynamic.literal(Templates = Templates, TotalCount = TotalCount)
  
    __obj.asInstanceOf[TemplatesResult]
  }
}

