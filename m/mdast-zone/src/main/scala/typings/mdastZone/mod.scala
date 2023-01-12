package typings.mdastZone

import typings.mdast.mod.Content
import typings.mdast.mod.Root
import typings.mdastZone.mdastZoneStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-zone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zone(node: Node, name: String, callback: Handler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zone")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Handler = js.Function4[
    /* start */ Node, 
    /* between */ js.Array[Node], 
    /* end */ Node, 
    /* info */ ZoneInfo, 
    js.UndefOr[js.Array[Node] | Null | Unit]
  ]
  
  type Node = Root | Content
  
  /* Inlined std.Extract<mdast-zone.mdast-zone.Node, mdast.mdast.Parent> */
  type Parent = children
  
  trait ZoneInfo extends StObject {
    
    var end: Double
    
    var parent: Parent | Null
    
    var start: Double
  }
  object ZoneInfo {
    
    inline def apply(end: Double, start: Double): ZoneInfo = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parent = null)
      __obj.asInstanceOf[ZoneInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoneInfo] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Parent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
