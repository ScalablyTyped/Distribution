package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autotriggerchecks extends js.Object {
  var auto_trigger_checks: js.Array[Appid] = js.native
}

object Autotriggerchecks {
  @scala.inline
  def apply(auto_trigger_checks: js.Array[Appid]): Autotriggerchecks = {
    val __obj = js.Dynamic.literal(auto_trigger_checks = auto_trigger_checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autotriggerchecks]
  }
  @scala.inline
  implicit class AutotriggerchecksOps[Self <: Autotriggerchecks] (val x: Self) extends AnyVal {
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
    def setAuto_trigger_checksVarargs(value: Appid*): Self = this.set("auto_trigger_checks", js.Array(value :_*))
    @scala.inline
    def setAuto_trigger_checks(value: js.Array[Appid]): Self = this.set("auto_trigger_checks", value.asInstanceOf[js.Any])
  }
  
}

