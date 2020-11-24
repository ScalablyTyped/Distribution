package typings.parse5Htmlparser2TreeAdapter.mod

import typings.parse5Htmlparser2TreeAdapter.parse5Htmlparser2TreeAdapterStrings.Exclamationmarkdoctype
import typings.parse5Htmlparser2TreeAdapter.parse5Htmlparser2TreeAdapterStrings.directive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * htmlparser2 tree adapter DocumentType interface.
  */
@js.native
trait DocumentType extends Node {
  
  /**
    * Serialized doctype {@link name}, {@link publicId} and {@link systemId}.
    */
  var data: String = js.native
  
  /**
    * Node name.
    */
  var name: Exclamationmarkdoctype = js.native
  
  /**
    * The type of the node.
    */
  @JSName("type")
  var type_DocumentType: directive = js.native
  
  /**
    * Document type name.
    */
  var `x-name`: String = js.native
  
  /**
    * Document type public identifier.
    */
  var `x-publicId`: String = js.native
  
  /**
    * Document type system identifier.
    */
  var `x-systemId`: String = js.native
}
object DocumentType {
  
  @scala.inline
  def apply(
    data: String,
    name: Exclamationmarkdoctype,
    next: Node,
    nextSibling: Node,
    nodeType: Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: directive,
    `x-name`: String,
    `x-publicId`: String,
    `x-systemId`: String
  ): DocumentType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-name")(`x-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-publicId")(`x-publicId`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-systemId")(`x-systemId`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentType]
  }
  
  @scala.inline
  implicit class DocumentTypeOps[Self <: DocumentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Exclamationmarkdoctype): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: directive): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-name`(value: String): Self = this.set("x-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-publicId`(value: String): Self = this.set("x-publicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-systemId`(value: String): Self = this.set("x-systemId", value.asInstanceOf[js.Any])
  }
}
