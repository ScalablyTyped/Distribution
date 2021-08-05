package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.deltasDeltasMod.Delta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaReverserMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/DeltaReverser", "DeltaReverser")
  @js.native
  class DeltaReverser protected () extends StObject {
    def this(model: AbstractModel) = this()
    
    /* private */ var getUnit: js.Any = js.native
    
    var model: AbstractModel = js.native
    
    def reverse(delta: Delta): Delta = js.native
    
    /* private */ var reverseAttachElementDelta: js.Any = js.native
    
    /* private */ var reverseCreateElementTreeDelta: js.Any = js.native
    
    /* private */ var reverseCreateUnitTreeDelta: js.Any = js.native
    
    /* private */ var reverseDeleteElementDelta: js.Any = js.native
    
    /* private */ var reverseDeleteUnitDelta: js.Any = js.native
    
    /* private */ var reverseDetachElementDelta: js.Any = js.native
    
    /* private */ var reverseUpdatePropertyValueDelta: js.Any = js.native
  }
}
