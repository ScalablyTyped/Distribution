package typings.meteorAstronomy.MeteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumModel[T] extends js.Object {
  var identifiers: js.Array[String] | T = js.native
  var name: String = js.native
}

object EnumModel {
  @scala.inline
  def apply[T](identifiers: js.Array[String] | T, name: String): EnumModel[T] = {
    val __obj = js.Dynamic.literal(identifiers = identifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumModel[T]]
  }
  @scala.inline
  implicit class EnumModelOps[Self <: EnumModel[_], T] (val x: Self with EnumModel[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentifiersVarargs(value: String*): Self = this.set("identifiers", js.Array(value :_*))
    @scala.inline
    def setIdentifiers(value: js.Array[String] | T): Self = this.set("identifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

