package typings.popoto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataModelMod {
  
  trait DataModel extends StObject {
    
    def generateId(): Double
    
    def getRootNode(): Any
    
    var idGen: Double
    
    var links: js.Array[Any]
    
    var nodes: js.Array[Any]
  }
  object DataModel {
    
    inline def apply(
      generateId: () => Double,
      getRootNode: () => Any,
      idGen: Double,
      links: js.Array[Any],
      nodes: js.Array[Any]
    ): DataModel = {
      val __obj = js.Dynamic.literal(generateId = js.Any.fromFunction0(generateId), getRootNode = js.Any.fromFunction0(getRootNode), idGen = idGen.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataModel] (val x: Self) extends AnyVal {
      
      inline def setGenerateId(value: () => Double): Self = StObject.set(x, "generateId", js.Any.fromFunction0(value))
      
      inline def setGetRootNode(value: () => Any): Self = StObject.set(x, "getRootNode", js.Any.fromFunction0(value))
      
      inline def setIdGen(value: Double): Self = StObject.set(x, "idGen", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: js.Array[Any]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: Any*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setNodes(value: js.Array[Any]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: Any*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
}
