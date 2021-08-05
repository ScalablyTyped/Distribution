package typings.mdast.mod

import typings.mdast.mdastStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List
  extends StObject
     with Parent
     with BlockContent {
  
  @JSName("children")
  var children_List: js.Array[ListContent]
  
  var ordered: js.UndefOr[Boolean] = js.undefined
  
  var spread: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_List: list
}
object List {
  
  inline def apply(children: js.Array[ListContent]): List = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[List]
  }
  
  extension [Self <: List](x: Self) {
    
    inline def setChildren(value: js.Array[ListContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ListContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    
    inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
