package typings.parse5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AttributesLocation = org.scalablytyped.runtime.StringDictionary[typings.parse5.mod.Location]
  
  type ChildNode = typings.parse5.mod.DefaultTreeChildNode | js.Object
  
  type CommentNode = typings.parse5.mod.DefaultTreeCommentNode | js.Object
  
  type Document = typings.parse5.mod.DefaultTreeDocument | js.Object
  
  type DocumentFragment = typings.parse5.mod.DefaultTreeDocumentFragment | js.Object
  
  type DocumentType = typings.parse5.mod.DefaultTreeDocumentType | js.Object
  
  type Element = typings.parse5.mod.DefaultTreeElement | js.Object
  
  type Node = typings.parse5.mod.DefaultTreeNode | js.Object
  
  type ParentNode = typings.parse5.mod.DefaultTreeParentNode | js.Object
  
  type TextNode = typings.parse5.mod.DefaultTreeTextNode | js.Object
  
  @scala.inline
  def parse(html: java.lang.String): typings.parse5.mod.Document = typings.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(html.asInstanceOf[js.Any]).asInstanceOf[typings.parse5.mod.Document]
  @scala.inline
  def parse(html: java.lang.String, options: typings.parse5.mod.ParserOptions): typings.parse5.mod.Document = (typings.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.parse5.mod.Document]
  
  @scala.inline
  def parseFragment(fragmentContext: typings.parse5.mod.Element, html: java.lang.String): typings.parse5.mod.DocumentFragment = (typings.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(fragmentContext.asInstanceOf[js.Any], html.asInstanceOf[js.Any])).asInstanceOf[typings.parse5.mod.DocumentFragment]
  @scala.inline
  def parseFragment(
    fragmentContext: typings.parse5.mod.Element,
    html: java.lang.String,
    options: typings.parse5.mod.ParserOptions
  ): typings.parse5.mod.DocumentFragment = (typings.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(fragmentContext.asInstanceOf[js.Any], html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.parse5.mod.DocumentFragment]
  @scala.inline
  def parseFragment(html: java.lang.String): typings.parse5.mod.DocumentFragment = typings.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(html.asInstanceOf[js.Any]).asInstanceOf[typings.parse5.mod.DocumentFragment]
  @scala.inline
  def parseFragment(html: java.lang.String, options: typings.parse5.mod.ParserOptions): typings.parse5.mod.DocumentFragment = (typings.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.parse5.mod.DocumentFragment]
  
  @scala.inline
  def serialize(node: typings.parse5.mod.Node): java.lang.String = typings.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(node.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def serialize(node: typings.parse5.mod.Node, options: typings.parse5.mod.SerializerOptions): java.lang.String = (typings.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
