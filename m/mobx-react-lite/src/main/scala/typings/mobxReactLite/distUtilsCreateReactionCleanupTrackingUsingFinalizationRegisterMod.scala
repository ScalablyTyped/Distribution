package typings.mobxReactLite

import typings.mobxReactLite.distUtilsReactionCleanupTrackingCommonMod.ReactionCleanupTracking
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsCreateReactionCleanupTrackingUsingFinalizationRegisterMod {
  
  @JSImport("mobx-react-lite/dist/utils/createReactionCleanupTrackingUsingFinalizationRegister", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createReactionCleanupTrackingUsingFinalizationRegister(
    FinalizationRegistry: NonNullable[
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FinalizationRegistryType */ js.Any
      ]
    ]
  ): ReactionCleanupTracking = ^.asInstanceOf[js.Dynamic].applyDynamic("createReactionCleanupTrackingUsingFinalizationRegister")(FinalizationRegistry.asInstanceOf[js.Any]).asInstanceOf[ReactionCleanupTracking]
}
