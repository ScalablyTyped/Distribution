package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomNodeListMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dom/NodeList", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with NodeList {
    
    /* CompleteClass */
    override def item(index: Double): Node = js.native
    
    /* CompleteClass */
    override val length: Double = js.native
  }
  @JSImport("@nginstack/engine/lib/dom/NodeList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Node = typings.nginstackEngine.libDomNodeMod.^
  
  trait NodeList extends StObject {
    
    def item(index: Double): Node
    
    val length: Double
  }
  object NodeList {
    
    inline def apply(item: Double => Node, length: Double): NodeList = {
      val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeList]
    }
    
    extension [Self <: NodeList](x: Self) {
      
      inline def setItem(value: Double => Node): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
