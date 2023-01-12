package typings.mediapipeFaceMesh.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mesh extends StObject {
  
  def getIndexBufferList(): js.typedarray.Uint32Array
  
  def getPrimitiveType(): PrimitiveType
  
  def getVertexBufferList(): js.typedarray.Float32Array
  
  def getVertexType(): VertexType
}
object Mesh {
  
  inline def apply(
    getIndexBufferList: () => js.typedarray.Uint32Array,
    getPrimitiveType: () => PrimitiveType,
    getVertexBufferList: () => js.typedarray.Float32Array,
    getVertexType: () => VertexType
  ): Mesh = {
    val __obj = js.Dynamic.literal(getIndexBufferList = js.Any.fromFunction0(getIndexBufferList), getPrimitiveType = js.Any.fromFunction0(getPrimitiveType), getVertexBufferList = js.Any.fromFunction0(getVertexBufferList), getVertexType = js.Any.fromFunction0(getVertexType))
    __obj.asInstanceOf[Mesh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mesh] (val x: Self) extends AnyVal {
    
    inline def setGetIndexBufferList(value: () => js.typedarray.Uint32Array): Self = StObject.set(x, "getIndexBufferList", js.Any.fromFunction0(value))
    
    inline def setGetPrimitiveType(value: () => PrimitiveType): Self = StObject.set(x, "getPrimitiveType", js.Any.fromFunction0(value))
    
    inline def setGetVertexBufferList(value: () => js.typedarray.Float32Array): Self = StObject.set(x, "getVertexBufferList", js.Any.fromFunction0(value))
    
    inline def setGetVertexType(value: () => VertexType): Self = StObject.set(x, "getVertexType", js.Any.fromFunction0(value))
  }
}
