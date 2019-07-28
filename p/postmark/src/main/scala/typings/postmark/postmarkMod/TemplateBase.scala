package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// templates
trait TemplateBase extends js.Object {
  var Active: Boolean
  var Name: String
  var TemplateId: Double
}

object TemplateBase {
  @scala.inline
  def apply(Active: Boolean, Name: String, TemplateId: Double): TemplateBase = {
    val __obj = js.Dynamic.literal(Active = Active, Name = Name, TemplateId = TemplateId)
  
    __obj.asInstanceOf[TemplateBase]
  }
}

