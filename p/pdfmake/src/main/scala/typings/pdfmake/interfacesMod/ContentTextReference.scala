package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentTextReference
  extends ContentBase
     with _Content {
  var textReference: String = js.native
}

object ContentTextReference {
  @scala.inline
  def apply(textReference: String): ContentTextReference = {
    val __obj = js.Dynamic.literal(textReference = textReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTextReference]
  }
  @scala.inline
  implicit class ContentTextReferenceOps[Self <: ContentTextReference] (val x: Self) extends AnyVal {
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
    def setTextReference(value: String): Self = this.set("textReference", value.asInstanceOf[js.Any])
  }
  
}

