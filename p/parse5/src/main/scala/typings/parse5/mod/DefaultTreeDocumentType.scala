package typings.parse5.mod

import typings.parse5.parse5Strings.NumbersigndocumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTreeDocumentType extends DefaultTreeNode {
  /**
    * Document type name.
    */
  var name: String = js.native
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeDocumentType: NumbersigndocumentType = js.native
  /**
    * Document type public identifier.
    */
  var publicId: String = js.native
  /**
    * Document type system identifier.
    */
  var systemId: String = js.native
}

object DefaultTreeDocumentType {
  @scala.inline
  def apply(name: String, nodeName: NumbersigndocumentType, publicId: String, systemId: String): DefaultTreeDocumentType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeDocumentType]
  }
  @scala.inline
  implicit class DefaultTreeDocumentTypeOps[Self <: DefaultTreeDocumentType] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeName(value: NumbersigndocumentType): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicId(value: String): Self = this.set("publicId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemId(value: String): Self = this.set("systemId", value.asInstanceOf[js.Any])
  }
  
}

