package typings.minecraftScriptingTypesClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Absorbsinput extends js.Object {
  /**
    * If true, input will not be passed down to any other screens underneath
    */
  var absorbs_input: js.UndefOr[Boolean] = js.native
  /**
    * If true, the screen will always accept and process input for as long as it is in the stack, even if other custom UI screens appear on top of it
    */
  var always_accepts_input: js.UndefOr[Boolean] = js.native
  /**
    * If true, this screen will be rendered even if another screen is on top of it and will render over them, including the HUD
    */
  var force_render_below: js.UndefOr[Boolean] = js.native
  /**
    * If true, the screen will be treated as the pause menu and the pause menu won't be allowed to show on top of this screen
    */
  var is_showing_menu: js.UndefOr[Boolean] = js.native
  /**
    * If true, the game will continue to be rendered underneath this screen
    */
  var render_game_behind: js.UndefOr[Boolean] = js.native
  /**
    * If true, this screen will only be rendered if it is the screen at the top of the stack
    */
  var render_only_when_topmost: js.UndefOr[Boolean] = js.native
  /**
    * If true, the screen will capture the mouse pointer and limit its movement to the UI screen
    */
  var should_steal_mouse: js.UndefOr[Boolean] = js.native
}

object Absorbsinput {
  @scala.inline
  def apply(): Absorbsinput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Absorbsinput]
  }
  @scala.inline
  implicit class AbsorbsinputOps[Self <: Absorbsinput] (val x: Self) extends AnyVal {
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
    def setAbsorbs_input(value: Boolean): Self = this.set("absorbs_input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsorbs_input: Self = this.set("absorbs_input", js.undefined)
    @scala.inline
    def setAlways_accepts_input(value: Boolean): Self = this.set("always_accepts_input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlways_accepts_input: Self = this.set("always_accepts_input", js.undefined)
    @scala.inline
    def setForce_render_below(value: Boolean): Self = this.set("force_render_below", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce_render_below: Self = this.set("force_render_below", js.undefined)
    @scala.inline
    def setIs_showing_menu(value: Boolean): Self = this.set("is_showing_menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs_showing_menu: Self = this.set("is_showing_menu", js.undefined)
    @scala.inline
    def setRender_game_behind(value: Boolean): Self = this.set("render_game_behind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRender_game_behind: Self = this.set("render_game_behind", js.undefined)
    @scala.inline
    def setRender_only_when_topmost(value: Boolean): Self = this.set("render_only_when_topmost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRender_only_when_topmost: Self = this.set("render_only_when_topmost", js.undefined)
    @scala.inline
    def setShould_steal_mouse(value: Boolean): Self = this.set("should_steal_mouse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShould_steal_mouse: Self = this.set("should_steal_mouse", js.undefined)
  }
  
}

