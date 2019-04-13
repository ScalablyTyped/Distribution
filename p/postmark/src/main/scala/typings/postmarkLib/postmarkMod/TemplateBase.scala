package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// templates
trait TemplateBase extends js.Object {
  var Active: scala.Boolean
  var Name: java.lang.String
  var TemplateId: scala.Double
}

object TemplateBase {
  @scala.inline
  def apply(Active: scala.Boolean, Name: java.lang.String, TemplateId: scala.Double): TemplateBase = {
    val __obj = js.Dynamic.literal(Active = Active, Name = Name, TemplateId = TemplateId)
  
    __obj.asInstanceOf[TemplateBase]
  }
}

