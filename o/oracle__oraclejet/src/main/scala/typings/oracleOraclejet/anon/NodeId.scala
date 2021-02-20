package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeId
  extends /* key */ StringDictionary[js.Any] {
  
  var nodeId: js.Any = js.native
}
object NodeId {
  
  @scala.inline
  def apply(nodeId: js.Any): NodeId = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeId]
  }
  
  @scala.inline
  implicit class NodeIdMutableBuilder[Self <: NodeId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: js.Any): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
