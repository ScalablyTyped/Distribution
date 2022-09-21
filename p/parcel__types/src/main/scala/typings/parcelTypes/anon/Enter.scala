package typings.parcelTypes.anon

import typings.parcelTypes.mod.GraphTraversalCallback
import typings.parcelTypes.mod.TraversalActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enter[TNode, TContext] extends StObject {
  
  var enter: js.UndefOr[GraphTraversalCallback[TNode, TContext]] = js.undefined
  
  var exit: js.UndefOr[GraphTraversalCallback[TNode, TContext]] = js.undefined
}
object Enter {
  
  inline def apply[TNode, TContext](): Enter[TNode, TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enter[TNode, TContext]]
  }
  
  extension [Self <: Enter[?, ?], TNode, TContext](x: Self & (Enter[TNode, TContext])) {
    
    inline def setEnter(
      value: (TNode, /* context */ js.UndefOr[TContext | Null], /* actions */ TraversalActions) => js.UndefOr[TContext | Null]
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (TNode, /* context */ js.UndefOr[TContext | Null], /* actions */ TraversalActions) => js.UndefOr[TContext | Null]
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
