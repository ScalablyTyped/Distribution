package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typings.mendixmodelsdk.srcCommonMod.common.IVoidCallback
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.Delta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalDeltasDeltaSenderMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas/DeltaSender", "DeltaSender")
  @js.native
  open class DeltaSender protected () extends StObject {
    def this(model: AbstractModel, flushCallback: IVoidCallback, errorCallback: IErrorCallback) = this()
    
    def closeConnection(): Unit = js.native
    
    /* private */ var errorCallback: Any = js.native
    
    def flush(): Unit = js.native
    
    /* private */ var flushCallback: Any = js.native
    
    /* private */ var hasError: Any = js.native
    
    var isClosing: Boolean = js.native
    
    /* private */ var model: Any = js.native
    
    var pending: Boolean = js.native
    
    /* private */ var processQueue: Any = js.native
    
    /* private */ var queue: Any = js.native
    
    def scheduleDeltas(deltas: js.Array[Delta]): Unit = js.native
    
    /* private */ var sendDeltas: Any = js.native
  }
}
