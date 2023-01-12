package typings.mdarea

import typings.mdarea.mod.EditorAction
import typings.mdarea.mod.KeyCombo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    var action: EditorAction
    
    var key: KeyCombo
  }
  object Action {
    
    inline def apply(action: EditorAction, key: KeyCombo): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      inline def setAction(value: EditorAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setKey(value: KeyCombo): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<mdarea.mdarea.Keymap> */
  trait PartialKeymap extends StObject {
    
    var enter: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var indent: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var `inline`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var outdent: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object PartialKeymap {
    
    inline def apply(): PartialKeymap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialKeymap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialKeymap] (val x: Self) extends AnyVal {
      
      inline def setEnter(value: String | js.Array[String]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setEnterVarargs(value: String*): Self = StObject.set(x, "enter", js.Array(value*))
      
      inline def setIndent(value: String | js.Array[String]): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setIndentVarargs(value: String*): Self = StObject.set(x, "indent", js.Array(value*))
      
      inline def setInline(value: String | js.Array[String]): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInlineVarargs(value: String*): Self = StObject.set(x, "inline", js.Array(value*))
      
      inline def setOutdent(value: String | js.Array[String]): Self = StObject.set(x, "outdent", value.asInstanceOf[js.Any])
      
      inline def setOutdentUndefined: Self = StObject.set(x, "outdent", js.undefined)
      
      inline def setOutdentVarargs(value: String*): Self = StObject.set(x, "outdent", js.Array(value*))
    }
  }
}
