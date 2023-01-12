package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridTreeExpandEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/TreeExpandEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with TreeExpandEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var nodeValue: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/TreeExpandEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TreeExpandEvent extends StObject {
    
    var nodeValue: Any
  }
  object TreeExpandEvent {
    
    inline def apply(nodeValue: Any): TreeExpandEvent = {
      val __obj = js.Dynamic.literal(nodeValue = nodeValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeExpandEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeExpandEvent] (val x: Self) extends AnyVal {
      
      inline def setNodeValue(value: Any): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    }
  }
}
