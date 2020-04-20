package typings.phin

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForm extends js.Object {
  var form: StringDictionary[String]
}

object AnonForm {
  @scala.inline
  def apply(form: StringDictionary[String]): AnonForm = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForm]
  }
}

