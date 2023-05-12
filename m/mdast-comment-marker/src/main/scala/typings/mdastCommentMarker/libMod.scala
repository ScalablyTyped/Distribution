package typings.mdastCommentMarker

import typings.mdastCommentMarker.mdastCommentMarkerStrings.comment
import typings.mdastUtilMdxExpression.mod.MDXFlowExpression_
import typings.mdastUtilMdxExpression.mod.MDXTextExpression_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-comment-marker/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def commentMarker(value: Any): Marker | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("commentMarker")(value.asInstanceOf[js.Any]).asInstanceOf[Marker | Null]
  
  type Content = typings.mdast.mod.Content
  
  type HTML = typings.mdast.mod.HTML
  
  type MDXFlowExpression = MDXFlowExpression_
  
  type MDXTextExpression = MDXTextExpression_
  
  trait Marker extends StObject {
    
    /**
      * Value after name.
      */
    var attributes: String
    
    /**
      * Name of marker.
      */
    var name: String
    
    /**
      * Reference to given node.
      */
    var node: HTML | Mdx1CommentNode | MDXFlowExpression | MDXTextExpression
    
    /**
      * Parsed attributes.
      */
    var parameters: MarkerParameters
  }
  object Marker {
    
    inline def apply(
      attributes: String,
      name: String,
      node: HTML | Mdx1CommentNode | MDXFlowExpression | MDXTextExpression,
      parameters: MarkerParameters
    ): Marker = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Marker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Marker] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNode(value: HTML | Mdx1CommentNode | MDXFlowExpression | MDXTextExpression): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: MarkerParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    }
  }
  
  type MarkerParameterValue = String | Double | Boolean
  
  type MarkerParameters = Record[String, MarkerParameterValue]
  
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
