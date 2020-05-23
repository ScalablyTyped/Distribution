package typings.phin.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Form extends js.Object {
  var form: StringDictionary[String]
}

object Form {
  @scala.inline
  def apply(form: StringDictionary[String]): Form = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[Form]
  }
}

