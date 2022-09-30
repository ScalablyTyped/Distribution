package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.deltasDeltasMod.Delta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaReverserMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas/DeltaReverser", "DeltaReverser")
  @js.native
  open class DeltaReverser protected () extends StObject {
    def this(model: AbstractModel) = this()
    
    /* private */ var getUnit: Any = js.native
    
    var model: AbstractModel = js.native
    
    def reverse(delta: Delta): Delta = js.native
    
    /* private */ var reverseAttachElementDelta: Any = js.native
    
    /* private */ var reverseCreateElementTreeDelta: Any = js.native
    
    /* private */ var reverseCreateUnitTreeDelta: Any = js.native
    
    /* private */ var reverseDeleteElementDelta: Any = js.native
    
    /* private */ var reverseDeleteUnitDelta: Any = js.native
    
    /* private */ var reverseDetachElementDelta: Any = js.native
    
    /* private */ var reverseUpdatePropertyValueDelta: Any = js.native
  }
}
