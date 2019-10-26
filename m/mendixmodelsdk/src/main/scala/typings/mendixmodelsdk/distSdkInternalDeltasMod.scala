package typings.mendixmodelsdk

import typings.mendixmodelsdk.distCommonMod.common.IErrorCallback
import typings.mendixmodelsdk.distCommonMod.common.IVoidCallback
import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas", JSImport.Namespace)
@js.native
object distSdkInternalDeltasMod extends js.Object {
  @js.native
  class DeltaManager protected ()
    extends typings.mendixmodelsdk.distSdkInternalDeltasDeltaDashManagerMod.DeltaManager {
    def this(model: AbstractModel) = this()
  }
  
  @js.native
  class DeltaProcessor protected ()
    extends typings.mendixmodelsdk.distSdkInternalDeltasDeltaDashProcessorMod.DeltaProcessor {
    def this(model: AbstractModel) = this()
  }
  
  @js.native
  class DeltaSender protected ()
    extends typings.mendixmodelsdk.distSdkInternalDeltasDeltaDashSenderMod.DeltaSender {
    def this(model: AbstractModel, flushCallback: IVoidCallback, errorCallback: IErrorCallback) = this()
  }
  
}

