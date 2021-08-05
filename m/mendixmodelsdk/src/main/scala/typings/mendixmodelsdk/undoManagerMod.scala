package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.deltaManagerMod.IDeltaManager
import typings.mendixmodelsdk.deltasDeltasMod.Delta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undoManagerMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/UndoManager", "UndoManager")
  @js.native
  class UndoManager protected () extends StObject {
    def this(_model: IAbstractModel) = this()
    
    /* private */ val deltaManager: js.Any = js.native
    
    def getUndoState(modelUnitId: String): UndoState = js.native
    
    /* private */ var onChangeCompleted: js.Any = js.native
    
    /* private */ var onChangeDiscarded: js.Any = js.native
    
    /* private */ var onNewDelta: js.Any = js.native
    
    /* private */ var onUnitLoaded: js.Any = js.native
    
    def withoutUndo[T](performAction: js.Function0[T]): T = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/UndoManager", "UndoState")
  @js.native
  class UndoState protected () extends StObject {
    def this(deltaManager: IDeltaManager) = this()
    
    def canRedo: Boolean = js.native
    
    def canUndo: Boolean = js.native
    
    def clear(): Unit = js.native
    
    /* private */ var deltaManager: js.Any = js.native
    
    def redo(): Unit = js.native
    
    def undo(): Unit = js.native
  }
  
  type Change = js.Array[IDeltaChange]
  
  trait IDeltaChange extends StObject {
    
    var delta: Delta
    
    var reversedDelta: Delta
  }
  object IDeltaChange {
    
    inline def apply(delta: Delta, reversedDelta: Delta): IDeltaChange = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], reversedDelta = reversedDelta.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDeltaChange]
    }
    
    extension [Self <: IDeltaChange](x: Self) {
      
      inline def setDelta(value: Delta): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setReversedDelta(value: Delta): Self = StObject.set(x, "reversedDelta", value.asInstanceOf[js.Any])
    }
  }
}
