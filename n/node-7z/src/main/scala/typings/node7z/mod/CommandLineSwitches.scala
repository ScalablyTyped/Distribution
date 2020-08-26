package typings.node7z.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Options are mapped to the 7z program so there is no idea to define all possible types here
@js.native
trait CommandLineSwitches
  extends /* key */ StringDictionary[js.Any] {
  var raw: js.UndefOr[js.Array[String]] = js.native
}

object CommandLineSwitches {
  @scala.inline
  def apply(): CommandLineSwitches = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandLineSwitches]
  }
  @scala.inline
  implicit class CommandLineSwitchesOps[Self <: CommandLineSwitches] (val x: Self) extends AnyVal {
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
    def setRawVarargs(value: String*): Self = this.set("raw", js.Array(value :_*))
    @scala.inline
    def setRaw(value: js.Array[String]): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
  
}

