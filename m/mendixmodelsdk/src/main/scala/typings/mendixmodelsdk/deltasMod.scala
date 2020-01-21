package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.commonMod.common.IVoidCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas", JSImport.Namespace)
@js.native
object deltasMod extends js.Object {
  @js.native
  class DeltaManager protected ()
    extends typings.mendixmodelsdk.deltaManagerMod.DeltaManager {
    def this(model: AbstractModel) = this()
  }
  
  @js.native
  class DeltaProcessor protected ()
    extends typings.mendixmodelsdk.deltaProcessorMod.DeltaProcessor {
    def this(model: AbstractModel) = this()
  }
  
  @js.native
  class DeltaSender protected ()
    extends typings.mendixmodelsdk.deltaSenderMod.DeltaSender {
    def this(model: AbstractModel, flushCallback: IVoidCallback, errorCallback: IErrorCallback) = this()
  }
  
}

