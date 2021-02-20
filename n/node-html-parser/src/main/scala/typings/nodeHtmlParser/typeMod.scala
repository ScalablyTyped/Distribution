package typings.nodeHtmlParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeMod {
  
  @JSImport("node-html-parser/dist/nodes/type", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
    
    /* 8 */ val COMMENT_NODE: typings.nodeHtmlParser.typeMod.NodeType.COMMENT_NODE with Double = js.native
    
    /* 1 */ val ELEMENT_NODE: typings.nodeHtmlParser.typeMod.NodeType.ELEMENT_NODE with Double = js.native
    
    /* 3 */ val TEXT_NODE: typings.nodeHtmlParser.typeMod.NodeType.TEXT_NODE with Double = js.native
  }
  
  @js.native
  sealed trait NodeType extends StObject
  @JSImport("node-html-parser/dist/nodes/type", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @js.native
    sealed trait COMMENT_NODE extends NodeType
    
    @js.native
    sealed trait ELEMENT_NODE extends NodeType
    
    @js.native
    sealed trait TEXT_NODE extends NodeType
  }
}
