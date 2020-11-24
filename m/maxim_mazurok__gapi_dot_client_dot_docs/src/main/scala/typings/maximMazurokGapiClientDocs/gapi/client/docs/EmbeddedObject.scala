package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedObject extends js.Object {
  
  /** The description of the embedded object. The `title` and `description` are both combined to display alt text. */
  var description: js.UndefOr[String] = js.native
  
  /** The properties of an embedded drawing. */
  var embeddedDrawingProperties: js.UndefOr[js.Any] = js.native
  
  /** The border of the embedded object. */
  var embeddedObjectBorder: js.UndefOr[EmbeddedObjectBorder] = js.native
  
  /** The properties of an image. */
  var imageProperties: js.UndefOr[ImageProperties] = js.native
  
  /**
    * A reference to the external linked source content. For example, it contains a reference to the source Sheets chart when the embedded object is a linked chart. If unset, then the
    * embedded object is not linked.
    */
  var linkedContentReference: js.UndefOr[LinkedContentReference] = js.native
  
  /** The bottom margin of the embedded object. */
  var marginBottom: js.UndefOr[Dimension] = js.native
  
  /** The left margin of the embedded object. */
  var marginLeft: js.UndefOr[Dimension] = js.native
  
  /** The right margin of the embedded object. */
  var marginRight: js.UndefOr[Dimension] = js.native
  
  /** The top margin of the embedded object. */
  var marginTop: js.UndefOr[Dimension] = js.native
  
  /** The visible size of the image after cropping. */
  var size: js.UndefOr[Size] = js.native
  
  /** The title of the embedded object. The `title` and `description` are both combined to display alt text. */
  var title: js.UndefOr[String] = js.native
}
object EmbeddedObject {
  
  @scala.inline
  def apply(): EmbeddedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObject]
  }
  
  @scala.inline
  implicit class EmbeddedObjectOps[Self <: EmbeddedObject] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEmbeddedDrawingProperties(value: js.Any): Self = this.set("embeddedDrawingProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedDrawingProperties: Self = this.set("embeddedDrawingProperties", js.undefined)
    
    @scala.inline
    def setEmbeddedObjectBorder(value: EmbeddedObjectBorder): Self = this.set("embeddedObjectBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedObjectBorder: Self = this.set("embeddedObjectBorder", js.undefined)
    
    @scala.inline
    def setImageProperties(value: ImageProperties): Self = this.set("imageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageProperties: Self = this.set("imageProperties", js.undefined)
    
    @scala.inline
    def setLinkedContentReference(value: LinkedContentReference): Self = this.set("linkedContentReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedContentReference: Self = this.set("linkedContentReference", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: Dimension): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Dimension): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: Dimension): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Dimension): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
