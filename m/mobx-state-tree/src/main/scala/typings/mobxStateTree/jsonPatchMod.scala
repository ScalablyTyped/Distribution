package typings.mobxStateTree

import typings.mobxStateTree.mobxStateTreeStrings.add
import typings.mobxStateTree.mobxStateTreeStrings.remove
import typings.mobxStateTree.mobxStateTreeStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonPatchMod {
  
  @JSImport("mobx-state-tree/dist/core/json-patch", "escapeJsonPath")
  @js.native
  def escapeJsonPath(path: String): String = js.native
  
  @JSImport("mobx-state-tree/dist/core/json-patch", "joinJsonPath")
  @js.native
  def joinJsonPath(path: js.Array[String]): String = js.native
  
  @JSImport("mobx-state-tree/dist/core/json-patch", "splitJsonPath")
  @js.native
  def splitJsonPath(path: String): js.Array[String] = js.native
  
  @JSImport("mobx-state-tree/dist/core/json-patch", "unescapeJsonPath")
  @js.native
  def unescapeJsonPath(path: String): String = js.native
  
  @js.native
  trait IJsonPatch extends StObject {
    
    val op: replace | add | remove = js.native
    
    val path: String = js.native
    
    val value: js.UndefOr[js.Any] = js.native
  }
  object IJsonPatch {
    
    @scala.inline
    def apply(op: replace | add | remove, path: String): IJsonPatch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJsonPatch]
    }
    
    @scala.inline
    implicit class IJsonPatchMutableBuilder[Self <: IJsonPatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: replace | add | remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait IReversibleJsonPatch extends IJsonPatch {
    
    val oldValue: js.Any = js.native
  }
  object IReversibleJsonPatch {
    
    @scala.inline
    def apply(oldValue: js.Any, op: replace | add | remove, path: String): IReversibleJsonPatch = {
      val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReversibleJsonPatch]
    }
    
    @scala.inline
    implicit class IReversibleJsonPatchMutableBuilder[Self <: IReversibleJsonPatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
}
