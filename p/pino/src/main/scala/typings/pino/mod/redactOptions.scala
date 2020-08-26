package typings.pino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait redactOptions extends js.Object {
  var censor: js.UndefOr[String | (js.Function1[/* v */ js.Any, _])] = js.native
  var paths: js.Array[String] = js.native
  var remove: js.UndefOr[Boolean] = js.native
}

object redactOptions {
  @scala.inline
  def apply(paths: js.Array[String]): redactOptions = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[redactOptions]
  }
  @scala.inline
  implicit class redactOptionsOps[Self <: redactOptions] (val x: Self) extends AnyVal {
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
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def setCensorFunction1(value: /* v */ js.Any => _): Self = this.set("censor", js.Any.fromFunction1(value))
    @scala.inline
    def setCensor(value: String | (js.Function1[/* v */ js.Any, _])): Self = this.set("censor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCensor: Self = this.set("censor", js.undefined)
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
  }
  
}

