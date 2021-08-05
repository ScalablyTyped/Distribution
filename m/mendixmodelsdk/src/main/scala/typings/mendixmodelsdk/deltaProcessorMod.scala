package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.deltasDeltasMod.Delta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaProcessorMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/DeltaProcessor", "DeltaProcessor")
  @js.native
  class DeltaProcessor protected () extends StObject {
    def this(model: AbstractModel) = this()
    
    /* private */ var getUnit: js.Any = js.native
    
    var model: AbstractModel = js.native
    
    /* private */ var processAttachElementDelta: js.Any = js.native
    
    /* private */ var processCreateElementTreeDelta: js.Any = js.native
    
    /* private */ var processCreateUnitTreeDelta: js.Any = js.native
    
    /* private */ var processDeleteElementDelta: js.Any = js.native
    
    /* private */ var processDeleteUnitDelta: js.Any = js.native
    
    def processDeltas(deltas: js.Array[Delta]): Unit = js.native
    def processDeltas(deltas: js.Array[Delta], isReverting: Boolean): Unit = js.native
    
    /* private */ var processDetachElementDelta: js.Any = js.native
    
    /* private */ var processMutator: js.Any = js.native
    
    /* private */ var processUpdatePropertyValueDelta: js.Any = js.native
  }
}
