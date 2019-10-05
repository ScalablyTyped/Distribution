package typings.pleasejs.PleaseJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeSchemeOption extends js.Object {
  var format: String
  var scheme_type: String
}

object MakeSchemeOption {
  @scala.inline
  def apply(format: String, scheme_type: String): MakeSchemeOption = {
    val __obj = js.Dynamic.literal(format = format, scheme_type = scheme_type)
  
    __obj.asInstanceOf[MakeSchemeOption]
  }
}

