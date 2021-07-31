package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonContainer
  extends StObject
     with JsonNode {
  
  /**
    * @returns The container's first child.
    */
  var first: js.UndefOr[ChildNode] = js.undefined
  
  /**
    * @returns The container's last child.
    */
  var last: js.UndefOr[ChildNode] = js.undefined
  
  /**
    * Contains the container's children.
    */
  var nodes: js.UndefOr[js.Array[ChildNode]] = js.undefined
}
object JsonContainer {
  
  @scala.inline
  def apply(): JsonContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonContainer]
  }
  
  @scala.inline
  implicit class JsonContainerMutableBuilder[Self <: JsonContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: ChildNode): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    @scala.inline
    def setLast(value: ChildNode): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    @scala.inline
    def setNodes(value: js.Array[ChildNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: ChildNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
