package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.deltasDeltasMod.Delta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaProcessorMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas/DeltaProcessor", "DeltaProcessor")
  @js.native
  open class DeltaProcessor protected () extends StObject {
    def this(model: AbstractModel) = this()
    
    /* private */ var getUnit: Any = js.native
    
    var model: AbstractModel = js.native
    
    /* private */ var processAttachElementDelta: Any = js.native
    
    /* private */ var processCreateElementTreeDelta: Any = js.native
    
    /* private */ var processCreateUnitTreeDelta: Any = js.native
    
    /* private */ var processDeleteElementDelta: Any = js.native
    
    /* private */ var processDeleteUnitDelta: Any = js.native
    
    def processDeltas(deltas: js.Array[Delta]): Unit = js.native
    def processDeltas(deltas: js.Array[Delta], isReverting: Boolean): Unit = js.native
    
    /* private */ var processDetachElementDelta: Any = js.native
    
    /* private */ var processMutator: Any = js.native
    
    /* private */ var processUpdatePropertyValueDelta: Any = js.native
  }
}
