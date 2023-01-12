package typings.mdastCommentMarker

import org.scalablytyped.runtime.StringDictionary
import typings.mdastCommentMarker.mdastCommentMarkerStrings.comment
import typings.mdastUtilMdxExpression.mod.MDXFlowExpression_
import typings.mdastUtilMdxExpression.mod.MDXTextExpression_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-comment-marker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def commentMarker(value: Any): Marker | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("commentMarker")(value.asInstanceOf[js.Any]).asInstanceOf[Marker | Null]
  
  type Content = typings.mdast.mod.Content
  
  type HTML = typings.mdast.mod.HTML
  
  type MDXFlowExpression = MDXFlowExpression_
  
  type MDXTextExpression = MDXTextExpression_
  
  trait Marker extends StObject {
    
    var attributes: String
    
    var name: String
    
    var node: HTML | Mdx1CommentNode | MDXFlowExpression | MDXTextExpression
    
    var parameters: MarkerParameters | Null
  }
  object Marker {
    
    inline def apply(
      attributes: String,
      name: String,
      node: HTML | Mdx1CommentNode | MDXFlowExpression | MDXTextExpression
    ): Marker = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parameters = null)
      __obj.asInstanceOf[Marker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Marker] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNode(value: HTML | Mdx1CommentNode | MDXFlowExpression | MDXTextExpression): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: MarkerParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    }
  }
  
  type MarkerParameterValue = String | Double | Boolean
  
  type MarkerParameters = StringDictionary[MarkerParameterValue]
  
  trait Mdx1CommentNode extends StObject {
    
    var `type`: comment
    
    var value: String
  }
  object Mdx1CommentNode {
    
    inline def apply(value: String): Mdx1CommentNode = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("comment")
      __obj.asInstanceOf[Mdx1CommentNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mdx1CommentNode] (val x: Self) extends AnyVal {
      
      inline def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Node = Root | Content
  
  type Root = typings.mdast.mod.Root
}
