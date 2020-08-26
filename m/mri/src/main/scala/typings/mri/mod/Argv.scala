package typings.mri.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Argv
  extends DictionaryObject[js.Any] {
  /** anything after `--` or between options */
  @JSName("_")
  var _underscore: js.Array[String] = js.native
}

object Argv {
  @scala.inline
  def apply(_underscore: js.Array[String]): Argv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argv]
  }
  @scala.inline
  implicit class ArgvOps[Self <: Argv] (val x: Self) extends AnyVal {
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
    def set_underscoreVarargs(value: String*): Self = this.set("_", js.Array(value :_*))
    @scala.inline
    def set_underscore(value: js.Array[String]): Self = this.set("_", value.asInstanceOf[js.Any])
  }
  
}

