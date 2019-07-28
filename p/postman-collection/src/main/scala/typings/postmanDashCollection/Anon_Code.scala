package typings.postmanDashCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: Double
  var detail: String
  var name: String
  var standardName: String
}

object Anon_Code {
  @scala.inline
  def apply(code: Double, detail: String, name: String, standardName: String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, detail = detail, name = name, standardName = standardName)
  
    __obj.asInstanceOf[Anon_Code]
  }
}

