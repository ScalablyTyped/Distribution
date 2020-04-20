package typings.meteorAstronomy.MeteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumModel[T] extends js.Object {
  var identifiers: js.Array[String] | T
  var name: String
}

object EnumModel {
  @scala.inline
  def apply[T](identifiers: js.Array[String] | T, name: String): EnumModel[T] = {
    val __obj = js.Dynamic.literal(identifiers = identifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumModel[T]]
  }
}

