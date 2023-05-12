package typings.mdastZone

import typings.mdastZone.mdastZoneStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-zone/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zone(node: Node, name: String, handler: Handler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zone")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Content = typings.mdast.mod.Content
  
  type Handler = js.Function4[
    /* start */ Node, 
    /* between */ js.Array[Node], 
    /* end */ Node, 
    /* info */ Info, 
    js.UndefOr[(js.Array[js.UndefOr[Node | Null]]) | Null | Unit]
  ]
  
  trait Info extends StObject {
    
    /**
      * Index of `end` in `parent`.
      */
    var end: Double
    
    /**
      * Parent of the section.
      */
    var parent: Parent
    
    /**
      * Index of `start` in `parent`.
      */
    var start: Double
  }
  object Info {
    
    inline def apply(end: Double, parent: Parent, start: Double): Info = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Parent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  type MdastParent = typings.mdast.mod.Parent
  
  type Node = Root | Content
  
  /* Inlined std.Extract<mdast-zone.mdast-zone/lib.Node, mdast-zone.mdast-zone/lib.MdastParent> */
  type Parent = children
  
  type Root = typings.mdast.mod.Root
}
