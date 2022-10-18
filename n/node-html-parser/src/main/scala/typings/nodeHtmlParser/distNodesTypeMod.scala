package typings.nodeHtmlParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesTypeMod {
  
  @JSImport("node-html-parser/dist/nodes/type", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeType & Double] = js.native
    
    /* 8 */ val COMMENT_NODE: typings.nodeHtmlParser.distNodesTypeMod.NodeType.COMMENT_NODE & Double = js.native
    
    /* 1 */ val ELEMENT_NODE: typings.nodeHtmlParser.distNodesTypeMod.NodeType.ELEMENT_NODE & Double = js.native
    
    /* 3 */ val TEXT_NODE: typings.nodeHtmlParser.distNodesTypeMod.NodeType.TEXT_NODE & Double = js.native
  }
  
  @js.native
  sealed trait NodeType extends StObject
  @JSImport("node-html-parser/dist/nodes/type", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @js.native
    sealed trait COMMENT_NODE
      extends StObject
         with NodeType
    
    @js.native
    sealed trait ELEMENT_NODE
      extends StObject
         with NodeType
    
    @js.native
    sealed trait TEXT_NODE
      extends StObject
         with NodeType
  }
}
