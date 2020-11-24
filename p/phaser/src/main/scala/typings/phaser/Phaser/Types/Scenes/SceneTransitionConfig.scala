package typings.phaser.Phaser.Types.Scenes

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneTransitionConfig extends js.Object {
  
  /**
    * Will the Scenes Input system be able to process events while it is transitioning in or out?
    */
  var allowInput: js.UndefOr[Boolean] = js.native
  
  /**
    * An object containing any data you wish to be passed to the target scene's init / create methods (if sleep is false) or to the target scene's wake event callback (if sleep is true).
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * The duration, in ms, for the transition to last.
    */
  var duration: js.UndefOr[integer] = js.native
  
  /**
    * Move the target Scene to be above this one before the transition starts.
    */
  var moveAbove: js.UndefOr[Boolean] = js.native
  
  /**
    * Move the target Scene to be below this one before the transition starts.
    */
  var moveBelow: js.UndefOr[Boolean] = js.native
  
  /**
    * This callback is invoked every frame for the duration of the transition.
    */
  var onUpdate: js.UndefOr[js.Function] = js.native
  
  /**
    * The context in which the callback is invoked.
    */
  var onUpdateScope: js.UndefOr[js.Any] = js.native
  
  /**
    * Will the Scene responsible for the transition be removed from the Scene Manager after the transition completes?
    */
  var remove: js.UndefOr[Boolean] = js.native
  
  /**
    * Will the Scene responsible for the transition be sent to sleep on completion (`true`), or stopped? (`false`)
    */
  var sleep: js.UndefOr[Boolean] = js.native
  
  /**
    * The Scene key to transition to.
    */
  var target: String = js.native
}
object SceneTransitionConfig {
  
  @scala.inline
  def apply(target: String): SceneTransitionConfig = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneTransitionConfig]
  }
  
  @scala.inline
  implicit class SceneTransitionConfigOps[Self <: SceneTransitionConfig] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInput(value: Boolean): Self = this.set("allowInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInput: Self = this.set("allowInput", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDuration(value: integer): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setMoveAbove(value: Boolean): Self = this.set("moveAbove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveAbove: Self = this.set("moveAbove", js.undefined)
    
    @scala.inline
    def setMoveBelow(value: Boolean): Self = this.set("moveBelow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveBelow: Self = this.set("moveBelow", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: js.Function): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setOnUpdateScope(value: js.Any): Self = this.set("onUpdateScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdateScope: Self = this.set("onUpdateScope", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setSleep(value: Boolean): Self = this.set("sleep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSleep: Self = this.set("sleep", js.undefined)
  }
}
