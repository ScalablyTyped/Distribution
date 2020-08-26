package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.`textSlashplainSemicolon charsetEqualssignutf-8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `8` extends js.Object {
  var `content-type`: `textSlashplainSemicolon charsetEqualssignutf-8` = js.native
}

object `8` {
  @scala.inline
  def apply(`content-type`: `textSlashplainSemicolon charsetEqualssignutf-8`): `8` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  @scala.inline
  implicit class `8Ops`[Self <: `8`] (val x: Self) extends AnyVal {
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
    def `setContent-type`(value: `textSlashplainSemicolon charsetEqualssignutf-8`): Self = this.set("content-type", value.asInstanceOf[js.Any])
  }
  
}

