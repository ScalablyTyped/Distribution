package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.commonMod.common.IVoidCallback
import typings.mendixmodelsdk.deltasDeltasMod.Delta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/DeltaSender", JSImport.Namespace)
@js.native
object deltaSenderMod extends js.Object {
  
  @js.native
  class DeltaSender protected () extends js.Object {
    def this(model: AbstractModel, flushCallback: IVoidCallback, errorCallback: IErrorCallback) = this()
    
    def closeConnection(): Unit = js.native
    
    var errorCallback: js.Any = js.native
    
    def flush(): Unit = js.native
    
    var flushCallback: js.Any = js.native
    
    var hasError: js.Any = js.native
    
    var isClosing: Boolean = js.native
    
    var model: js.Any = js.native
    
    var pending: Boolean = js.native
    
    var processQueue: js.Any = js.native
    
    var queue: js.Any = js.native
    
    def scheduleDeltas(deltas: js.Array[Delta]): Unit = js.native
    
    var sendDeltas: js.Any = js.native
  }
}
