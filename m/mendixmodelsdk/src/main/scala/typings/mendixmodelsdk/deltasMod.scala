package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.commonMod.common.IVoidCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltasMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas", "DeltaManager")
  @js.native
  open class DeltaManager protected ()
    extends typings.mendixmodelsdk.deltaManagerMod.DeltaManager {
    def this(model: AbstractModel) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas", "DeltaProcessor")
  @js.native
  open class DeltaProcessor protected ()
    extends typings.mendixmodelsdk.deltaProcessorMod.DeltaProcessor {
    def this(model: AbstractModel) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas", "DeltaSender")
  @js.native
  open class DeltaSender protected ()
    extends typings.mendixmodelsdk.deltaSenderMod.DeltaSender {
    def this(model: AbstractModel, flushCallback: IVoidCallback, errorCallback: IErrorCallback) = this()
  }
}
