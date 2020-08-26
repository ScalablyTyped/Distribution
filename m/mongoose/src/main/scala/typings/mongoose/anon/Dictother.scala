package typings.mongoose.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictother
  extends /* other */ StringDictionary[js.Any] {
  var expires: js.UndefOr[String] = js.native
}

object Dictother {
  @scala.inline
  def apply(): Dictother = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictother]
  }
  @scala.inline
  implicit class DictotherOps[Self <: Dictother] (val x: Self) extends AnyVal {
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
    def setExpires(value: String): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
  }
  
}

