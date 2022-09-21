package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the properties and event handlers for a custom tool.
  */
trait ToolDesc extends StObject {
  
  var cursor: js.UndefOr[CursorType] = js.undefined
  
  /**
    * What types of object in the game can be selected with the tool.
    * E.g. only specify terrain if you only want a tile selection.
    */
  var filter: js.UndefOr[js.Array[ToolFilter]] = js.undefined
  
  var id: String
  
  var onDown: js.UndefOr[js.Function1[/* e */ ToolEventArgs, Unit]] = js.undefined
  
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onMove: js.UndefOr[js.Function1[/* e */ ToolEventArgs, Unit]] = js.undefined
  
  var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onUp: js.UndefOr[js.Function1[/* e */ ToolEventArgs, Unit]] = js.undefined
}
object ToolDesc {
  
  inline def apply(id: String): ToolDesc = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolDesc]
  }
  
  extension [Self <: ToolDesc](x: Self) {
    
    inline def setCursor(value: CursorType): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setFilter(value: js.Array[ToolFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: ToolFilter*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnDown(value: /* e */ ToolEventArgs => Unit): Self = StObject.set(x, "onDown", js.Any.fromFunction1(value))
    
    inline def setOnDownUndefined: Self = StObject.set(x, "onDown", js.undefined)
    
    inline def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
    
    inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
    
    inline def setOnMove(value: /* e */ ToolEventArgs => Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction1(value))
    
    inline def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
    
    inline def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setOnUp(value: /* e */ ToolEventArgs => Unit): Self = StObject.set(x, "onUp", js.Any.fromFunction1(value))
    
    inline def setOnUpUndefined: Self = StObject.set(x, "onUp", js.undefined)
  }
}
