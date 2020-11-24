package typings.mobxReactLite

import typings.mobxReactLite.reactionCleanupTrackingCommonMod.ReactionCleanupTracking
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-react-lite/dist/utils/createReactionCleanupTrackingUsingFinalizationRegister", JSImport.Namespace)
@js.native
object createReactionCleanupTrackingUsingFinalizationRegisterMod extends js.Object {
  
  def createReactionCleanupTrackingUsingFinalizationRegister(
    FinalizationRegistry: NonNullable[
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FinalizationRegistryType */ js.Any
      ]
    ]
  ): ReactionCleanupTracking = js.native
}
