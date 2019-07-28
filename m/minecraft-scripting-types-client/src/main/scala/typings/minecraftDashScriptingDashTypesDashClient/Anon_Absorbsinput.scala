package typings.minecraftDashScriptingDashTypesDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Absorbsinput extends js.Object {
  /**
    * If true, input will not be passed down to any other screens underneath
    */
  var absorbs_input: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the screen will always accept and process input for as long as it is in the stack, even if other custom UI screens appear on top of it
    */
  var always_accepts_input: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, this screen will be rendered even if another screen is on top of it and will render over them, including the HUD
    */
  var force_render_below: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the screen will be treated as the pause menu and the pause menu won't be allowed to show on top of this screen
    */
  var is_showing_menu: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the game will continue to be rendered underneath this screen
    */
  var render_game_behind: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, this screen will only be rendered if it is the screen at the top of the stack
    */
  var render_only_when_topmost: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the screen will capture the mouse pointer and limit its movement to the UI screen
    */
  var should_steal_mouse: js.UndefOr[Boolean] = js.undefined
}

object Anon_Absorbsinput {
  @scala.inline
  def apply(
    absorbs_input: js.UndefOr[Boolean] = js.undefined,
    always_accepts_input: js.UndefOr[Boolean] = js.undefined,
    force_render_below: js.UndefOr[Boolean] = js.undefined,
    is_showing_menu: js.UndefOr[Boolean] = js.undefined,
    render_game_behind: js.UndefOr[Boolean] = js.undefined,
    render_only_when_topmost: js.UndefOr[Boolean] = js.undefined,
    should_steal_mouse: js.UndefOr[Boolean] = js.undefined
  ): Anon_Absorbsinput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absorbs_input)) __obj.updateDynamic("absorbs_input")(absorbs_input)
    if (!js.isUndefined(always_accepts_input)) __obj.updateDynamic("always_accepts_input")(always_accepts_input)
    if (!js.isUndefined(force_render_below)) __obj.updateDynamic("force_render_below")(force_render_below)
    if (!js.isUndefined(is_showing_menu)) __obj.updateDynamic("is_showing_menu")(is_showing_menu)
    if (!js.isUndefined(render_game_behind)) __obj.updateDynamic("render_game_behind")(render_game_behind)
    if (!js.isUndefined(render_only_when_topmost)) __obj.updateDynamic("render_only_when_topmost")(render_only_when_topmost)
    if (!js.isUndefined(should_steal_mouse)) __obj.updateDynamic("should_steal_mouse")(should_steal_mouse)
    __obj.asInstanceOf[Anon_Absorbsinput]
  }
}

