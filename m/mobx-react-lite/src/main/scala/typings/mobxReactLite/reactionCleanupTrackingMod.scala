package typings.mobxReactLite

import typings.mobx.mod.Reaction_
import typings.mobxReactLite.reactionCleanupTrackingCommonMod.IReactionTracking
import typings.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-react-lite/dist/utils/reactionCleanupTracking", JSImport.Namespace)
@js.native
object reactionCleanupTrackingMod extends js.Object {
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(recordReactionAsCommitted, resetCleanupScheduleForTests, forceCleanupTimerToRunNowForTests) */ def addReactionToTrack(
    reactionTrackingRef: MutableRefObject[IReactionTracking | Null],
    reaction: Reaction_,
    objectRetainedByReact: js.Object
  ): IReactionTracking = js.native
}
