package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typings.mendixmodelsdk.srcCommonMod.common.IVoidCallback
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalDeltasMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas", "DeltaManager")
  @js.native
  open class DeltaManager protected ()
    extends typings.mendixmodelsdk.srcSdkInternalDeltasDeltaManagerMod.DeltaManager {
    def this(model: AbstractModel) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas", "DeltaProcessor")
  @js.native
  open class DeltaProcessor protected ()
    extends typings.mendixmodelsdk.srcSdkInternalDeltasDeltaProcessorMod.DeltaProcessor {
    def this(model: AbstractModel) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas", "DeltaSender")
  @js.native
  open class DeltaSender protected ()
    extends typings.mendixmodelsdk.srcSdkInternalDeltasDeltaSenderMod.DeltaSender {
    def this(model: AbstractModel, flushCallback: IVoidCallback, errorCallback: IErrorCallback) = this()
  }
}
