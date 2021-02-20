package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeMessageParts extends StObject {
  
  /** if known, the total number of messages in the sequence */
  var count: js.UndefOr[Double] = js.native
  
  /** a unique identifier for the sequence */
  var id: String = js.native
  
  /** the message's position within the sequence */
  var index: Double = js.native
}
object NodeMessageParts {
  
  @scala.inline
  def apply(id: String, index: Double): NodeMessageParts = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMessageParts]
  }
  
  @scala.inline
  implicit class NodeMessagePartsMutableBuilder[Self <: NodeMessageParts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
