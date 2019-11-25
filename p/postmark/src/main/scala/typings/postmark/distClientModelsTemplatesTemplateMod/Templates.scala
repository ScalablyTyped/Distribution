package typings.postmark.distClientModelsTemplatesTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Templates extends js.Object {
  var Templates: js.Array[TemplateInList]
  var TotalCount: Double
}

object Templates {
  @scala.inline
  def apply(Templates: js.Array[TemplateInList], TotalCount: Double): Templates = {
    val __obj = js.Dynamic.literal(Templates = Templates.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Templates]
  }
}

