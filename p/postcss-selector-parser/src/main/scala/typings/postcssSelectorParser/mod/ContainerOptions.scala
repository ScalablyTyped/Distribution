package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerOptions extends NodeOptions[String] {
  
  var nodes: js.UndefOr[js.Array[Node]] = js.native
}
object ContainerOptions {
  
  @scala.inline
  def apply(value: String): ContainerOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerOptions]
  }
  
  @scala.inline
  implicit class ContainerOptionsMutableBuilder[Self <: ContainerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
