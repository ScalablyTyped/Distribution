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
  
  @scala.inline
  def apply(children: js.Array[ListContent]): List = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[List]
  }
  
  @scala.inline
  implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[ListContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: ListContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    
    @scala.inline
    def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
