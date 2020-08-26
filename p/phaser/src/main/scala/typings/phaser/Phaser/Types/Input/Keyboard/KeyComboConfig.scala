package typings.phaser.Phaser.Types.Input.Keyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyComboConfig extends js.Object {
  /**
    * If the combo matches, will it delete itself?
    */
  var deleteOnMatch: js.UndefOr[Boolean] = js.native
  /**
    * The max delay in ms between each key press. Above this the combo is reset. 0 means disabled.
    */
  var maxKeyDelay: js.UndefOr[Double] = js.native
  /**
    * If previously matched and they press the first key of the combo again, will it reset?
    */
  var resetOnMatch: js.UndefOr[Boolean] = js.native
  /**
    * If they press the wrong key do we reset the combo?
    */
  var resetOnWrongKey: js.UndefOr[Boolean] = js.native
}

object KeyComboConfig {
  @scala.inline
  def apply(): KeyComboConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyComboConfig]
  }
  @scala.inline
  implicit class KeyComboConfigOps[Self <: KeyComboConfig] (val x: Self) extends AnyVal {
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
    def setDeleteOnMatch(value: Boolean): Self = this.set("deleteOnMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOnMatch: Self = this.set("deleteOnMatch", js.undefined)
    @scala.inline
    def setMaxKeyDelay(value: Double): Self = this.set("maxKeyDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxKeyDelay: Self = this.set("maxKeyDelay", js.undefined)
    @scala.inline
    def setResetOnMatch(value: Boolean): Self = this.set("resetOnMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetOnMatch: Self = this.set("resetOnMatch", js.undefined)
    @scala.inline
    def setResetOnWrongKey(value: Boolean): Self = this.set("resetOnWrongKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetOnWrongKey: Self = this.set("resetOnWrongKey", js.undefined)
  }
  
}

