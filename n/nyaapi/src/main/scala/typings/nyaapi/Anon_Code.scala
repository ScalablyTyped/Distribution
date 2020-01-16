package typings.nyaapi

import typings.nyaapi.nyaapiMod.si.Category
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: Category
  var label: String
}

object Anon_Code {
  @scala.inline
  def apply(code: Category, label: String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Code]
  }
}

