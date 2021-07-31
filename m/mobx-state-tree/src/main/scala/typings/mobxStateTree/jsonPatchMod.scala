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
  
  @scala.inline
  def escapeJsonPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeJsonPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def joinJsonPath(path: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinJsonPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def splitJsonPath(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitJsonPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def unescapeJsonPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeJsonPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait IJsonPatch extends StObject {
    
    val op: replace | add | remove
    
    val path: String
    
    val value: js.UndefOr[js.Any] = js.undefined
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
  
  trait IReversibleJsonPatch
    extends StObject
       with IJsonPatch {
    
    val oldValue: js.Any
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
