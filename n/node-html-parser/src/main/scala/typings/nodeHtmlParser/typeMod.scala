package typings.nodeHtmlParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-html-parser/dist/nodes/type", JSImport.Namespace)
@js.native
object typeMod extends js.Object {
  
  @js.native
  sealed trait NodeType extends js.Object
  @js.native
  object NodeType extends js.Object {
    
    @js.native
    sealed trait COMMENT_NODE extends NodeType
    
    @js.native
    sealed trait ELEMENT_NODE extends NodeType
    
    @js.native
    sealed trait TEXT_NODE extends NodeType
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
    
    /* 8 */ val COMMENT_NODE: typings.nodeHtmlParser.typeMod.NodeType.COMMENT_NODE with Double = js.native
    
    /* 1 */ val ELEMENT_NODE: typings.nodeHtmlParser.typeMod.NodeType.ELEMENT_NODE with Double = js.native
    
    /* 3 */ val TEXT_NODE: typings.nodeHtmlParser.typeMod.NodeType.TEXT_NODE with Double = js.native
  }
}
