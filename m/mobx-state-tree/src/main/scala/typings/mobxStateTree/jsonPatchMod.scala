package typings.mobxStateTree

import typings.mobxStateTree.mobxStateTreeStrings.add
import typings.mobxStateTree.mobxStateTreeStrings.remove
import typings.mobxStateTree.mobxStateTreeStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonPatchMod {
  
  @JSImport("mobx-state-tree/dist/core/json-patch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeJsonPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeJsonPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def joinJsonPath(path: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinJsonPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def splitJsonPath(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitJsonPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def unescapeJsonPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeJsonPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait IJsonPatch extends StObject {
    
    val op: replace | add | remove
    
    val path: String
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object IJsonPatch {
    
    inline def apply(op: replace | add | remove, path: String): IJsonPatch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJsonPatch]
    }
    
    extension [Self <: IJsonPatch](x: Self) {
      
      inline def setOp(value: replace | add | remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IReversibleJsonPatch
    extends StObject
       with IJsonPatch {
    
    val oldValue: Any
  }
  object IReversibleJsonPatch {
    
    inline def apply(oldValue: Any, op: replace | add | remove, path: String): IReversibleJsonPatch = {
      val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReversibleJsonPatch]
    }
    
    extension [Self <: IReversibleJsonPatch](x: Self) {
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
}
