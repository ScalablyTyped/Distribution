package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal data structure used to store data used by hardware instancing.
  *
  * @ignore
  */
trait InstancingData extends StObject {
  
  var count: Double
  
  /** @type {VertexBuffer|null} */
  var vertexBuffer: VertexBuffer | Null
}
object InstancingData {
  
  inline def apply(count: Double): InstancingData = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], vertexBuffer = null)
    __obj.asInstanceOf[InstancingData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstancingData] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setVertexBuffer(value: VertexBuffer): Self = StObject.set(x, "vertexBuffer", value.asInstanceOf[js.Any])
    
    inline def setVertexBufferNull: Self = StObject.set(x, "vertexBuffer", null)
  }
}
