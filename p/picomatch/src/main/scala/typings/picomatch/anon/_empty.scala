package typings.picomatch.anon

import typings.picomatch.picomatchStrings.Asterisk
import typings.picomatch.picomatchStrings.AsteriskAsterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _empty extends js.Object {
  @JSName("***")
  var AsteriskAsteriskAsterisk: Asterisk = js.native
  @JSName("**/**")
  var AsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk = js.native
  @JSName("**/**/**")
  var AsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk = js.native
}

object _empty {
  @scala.inline
  def apply(
    AsteriskAsteriskAsterisk: Asterisk,
    AsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk,
    AsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk
  ): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("***")(AsteriskAsteriskAsterisk.asInstanceOf[js.Any])
    __obj.updateDynamic("**/**")(AsteriskAsteriskSlashAsteriskAsterisk.asInstanceOf[js.Any])
    __obj.updateDynamic("**/**/**")(AsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  @scala.inline
  implicit class _emptyOps[Self <: _empty] (val x: Self) extends AnyVal {
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
    def setAsteriskAsteriskAsterisk(value: Asterisk): Self = this.set("***", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsteriskAsteriskSlashAsteriskAsterisk(value: AsteriskAsterisk): Self = this.set("**/**", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk(value: AsteriskAsterisk): Self = this.set("**/**/**", value.asInstanceOf[js.Any])
  }
  
}

