package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeNodeEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/TreeNodeEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with TreeNodeEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var node: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/classdef/TreeNodeEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TreeNodeEvent extends StObject {
    
    var node: Any
  }
  object TreeNodeEvent {
    
    inline def apply(node: Any): TreeNodeEvent = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNodeEvent]
    }
    
    extension [Self <: TreeNodeEvent](x: Self) {
      
      inline def setNode(value: Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
