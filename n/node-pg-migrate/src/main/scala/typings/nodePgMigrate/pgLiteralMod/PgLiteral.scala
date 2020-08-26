package typings.nodePgMigrate.pgLiteralMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PgLiteral extends js.Object {
  val _str: js.Any = js.native
}

object PgLiteral {
  @scala.inline
  def apply(_str: js.Any): PgLiteral = {
    val __obj = js.Dynamic.literal(_str = _str.asInstanceOf[js.Any])
    __obj.asInstanceOf[PgLiteral]
  }
  @scala.inline
  implicit class PgLiteralOps[Self <: PgLiteral] (val x: Self) extends AnyVal {
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
    def set_str(value: js.Any): Self = this.set("_str", value.asInstanceOf[js.Any])
  }
  
}

