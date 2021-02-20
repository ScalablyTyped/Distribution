package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeMatcher extends StObject {
  
  /** Specifies match criteria on the node id. */
  var nodeId: js.UndefOr[StringMatcher] = js.native
  
  /** Specifies match criteria on the node metadata. */
  var nodeMetadatas: js.UndefOr[js.Array[StructMatcher]] = js.native
}
object NodeMatcher {
  
  @scala.inline
  def apply(): NodeMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeMatcher]
  }
  
  @scala.inline
  implicit class NodeMatcherMutableBuilder[Self <: NodeMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: StringMatcher): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    @scala.inline
    def setNodeMetadatas(value: js.Array[StructMatcher]): Self = StObject.set(x, "nodeMetadatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeMetadatasUndefined: Self = StObject.set(x, "nodeMetadatas", js.undefined)
    
    @scala.inline
    def setNodeMetadatasVarargs(value: StructMatcher*): Self = StObject.set(x, "nodeMetadatas", js.Array(value :_*))
  }
}
