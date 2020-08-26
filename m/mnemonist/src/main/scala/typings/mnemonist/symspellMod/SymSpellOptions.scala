package typings.mnemonist.symspellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymSpellOptions extends js.Object {
  var maxDistance: js.UndefOr[Double] = js.native
  var verbosity: js.UndefOr[SymSpellVerbosity] = js.native
}

object SymSpellOptions {
  @scala.inline
  def apply(): SymSpellOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymSpellOptions]
  }
  @scala.inline
  implicit class SymSpellOptionsOps[Self <: SymSpellOptions] (val x: Self) extends AnyVal {
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
    def setMaxDistance(value: Double): Self = this.set("maxDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDistance: Self = this.set("maxDistance", js.undefined)
    @scala.inline
    def setVerbosity(value: SymSpellVerbosity): Self = this.set("verbosity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbosity: Self = this.set("verbosity", js.undefined)
  }
  
}

