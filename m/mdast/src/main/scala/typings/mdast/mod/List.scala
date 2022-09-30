package typings.mdast.mod

import typings.mdast.mdastStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List
  extends StObject
     with Parent {
  
  @JSName("children")
  var children_List: js.Array[ListContent]
  
  var ordered: js.UndefOr[Boolean | Null] = js.undefined
  
  var spread: js.UndefOr[Boolean | Null] = js.undefined
  
  var start: js.UndefOr[Double | Null] = js.undefined
  
  @JSName("type")
  var type_List: list
}
object List {
  
  inline def apply(children: js.Array[ListContent]): typings.mdast.mod.List = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[typings.mdast.mod.List]
  }
  
  extension [Self <: typings.mdast.mod.List](x: Self) {
    
    inline def setChildren(value: js.Array[ListContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ListContent*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOrderedNull: Self = StObject.set(x, "ordered", null)
    
    inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    
    inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    inline def setSpreadNull: Self = StObject.set(x, "spread", null)
    
    inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
