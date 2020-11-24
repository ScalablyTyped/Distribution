package typings.mobxReactLite.reactionCleanupTrackingCommonMod

import typings.mobx.mod.Reaction_
import typings.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactionCleanupTracking extends js.Object {
  
  /**
    *
    * @param reaction The reaction to cleanup
    * @param objectRetainedByReact This will be in actual use only when FinalizationRegister is in use
    */
  def addReactionToTrack(
    reactionTrackingRef: MutableRefObject[IReactionTracking | Null],
    reaction: Reaction_,
    objectRetainedByReact: js.Object
  ): IReactionTracking = js.native
  
  def forceCleanupTimerToRunNowForTests(): Unit = js.native
  
  def recordReactionAsCommitted(reactionRef: MutableRefObject[IReactionTracking | Null]): Unit = js.native
  
  def resetCleanupScheduleForTests(): Unit = js.native
}
object ReactionCleanupTracking {
  
  @scala.inline
  def apply(
    addReactionToTrack: (MutableRefObject[IReactionTracking | Null], Reaction_, js.Object) => IReactionTracking,
    forceCleanupTimerToRunNowForTests: () => Unit,
    recordReactionAsCommitted: MutableRefObject[IReactionTracking | Null] => Unit,
    resetCleanupScheduleForTests: () => Unit
  ): ReactionCleanupTracking = {
    val __obj = js.Dynamic.literal(addReactionToTrack = js.Any.fromFunction3(addReactionToTrack), forceCleanupTimerToRunNowForTests = js.Any.fromFunction0(forceCleanupTimerToRunNowForTests), recordReactionAsCommitted = js.Any.fromFunction1(recordReactionAsCommitted), resetCleanupScheduleForTests = js.Any.fromFunction0(resetCleanupScheduleForTests))
    __obj.asInstanceOf[ReactionCleanupTracking]
  }
  
  @scala.inline
  implicit class ReactionCleanupTrackingOps[Self <: ReactionCleanupTracking] (val x: Self) extends AnyVal {
    
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
    def setAddReactionToTrack(value: (MutableRefObject[IReactionTracking | Null], Reaction_, js.Object) => IReactionTracking): Self = this.set("addReactionToTrack", js.Any.fromFunction3(value))
    
    @scala.inline
    def setForceCleanupTimerToRunNowForTests(value: () => Unit): Self = this.set("forceCleanupTimerToRunNowForTests", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecordReactionAsCommitted(value: MutableRefObject[IReactionTracking | Null] => Unit): Self = this.set("recordReactionAsCommitted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetCleanupScheduleForTests(value: () => Unit): Self = this.set("resetCleanupScheduleForTests", js.Any.fromFunction0(value))
  }
}
