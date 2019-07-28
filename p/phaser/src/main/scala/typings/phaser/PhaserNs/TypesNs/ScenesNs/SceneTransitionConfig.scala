package typings.phaser.PhaserNs.TypesNs.ScenesNs

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneTransitionConfig extends js.Object {
  /**
    * Will the Scenes Input system be able to process events while it is transitioning in or out?
    */
  var allowInput: js.UndefOr[Boolean] = js.undefined
  /**
    * An object containing any data you wish to be passed to the target Scenes init / create methods.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * The duration, in ms, for the transition to last.
    */
  var duration: js.UndefOr[integer] = js.undefined
  /**
    * Move the target Scene to be above this one before the transition starts.
    */
  var moveAbove: js.UndefOr[Boolean] = js.undefined
  /**
    * Move the target Scene to be below this one before the transition starts.
    */
  var moveBelow: js.UndefOr[Boolean] = js.undefined
  /**
    * This callback is invoked every frame for the duration of the transition.
    */
  var onUpdate: js.UndefOr[js.Function] = js.undefined
  /**
    * The context in which the callback is invoked.
    */
  var onUpdateScope: js.UndefOr[js.Any] = js.undefined
  /**
    * Will the Scene responsible for the transition be sent to sleep on completion (`true`), or stopped? (`false`)
    */
  var sleep: js.UndefOr[Boolean] = js.undefined
  /**
    * The Scene key to transition to.
    */
  var target: String
}

object SceneTransitionConfig {
  @scala.inline
  def apply(
    target: String,
    allowInput: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    duration: js.UndefOr[integer] = js.undefined,
    moveAbove: js.UndefOr[Boolean] = js.undefined,
    moveBelow: js.UndefOr[Boolean] = js.undefined,
    onUpdate: js.Function = null,
    onUpdateScope: js.Any = null,
    sleep: js.UndefOr[Boolean] = js.undefined
  ): SceneTransitionConfig = {
    val __obj = js.Dynamic.literal(target = target)
    if (!js.isUndefined(allowInput)) __obj.updateDynamic("allowInput")(allowInput)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration)
    if (!js.isUndefined(moveAbove)) __obj.updateDynamic("moveAbove")(moveAbove)
    if (!js.isUndefined(moveBelow)) __obj.updateDynamic("moveBelow")(moveBelow)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (onUpdateScope != null) __obj.updateDynamic("onUpdateScope")(onUpdateScope)
    if (!js.isUndefined(sleep)) __obj.updateDynamic("sleep")(sleep)
    __obj.asInstanceOf[SceneTransitionConfig]
  }
}

