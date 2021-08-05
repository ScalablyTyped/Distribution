package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.commonMod.common.IVoidCallback
import typings.mendixmodelsdk.deltasDeltasMod.Delta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaSenderMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/DeltaSender", "DeltaSender")
  @js.native
  class DeltaSender protected () extends StObject {
    def this(model: AbstractModel, flushCallback: IVoidCallback, errorCallback: IErrorCallback) = this()
    
    def closeConnection(): Unit = js.native
    
    /* private */ var errorCallback: js.Any = js.native
    
    def flush(): Unit = js.native
    
    /* private */ var flushCallback: js.Any = js.native
    
    /* private */ var hasError: js.Any = js.native
    
    var isClosing: Boolean = js.native
    
    /* private */ var model: js.Any = js.native
    
    var pending: Boolean = js.native
    
    /* private */ var processQueue: js.Any = js.native
    
    /* private */ var queue: js.Any = js.native
    
    def scheduleDeltas(deltas: js.Array[Delta]): Unit = js.native
    
    /* private */ var sendDeltas: js.Any = js.native
  }
}
