package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedObject extends StObject {
  
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
  implicit class EmbeddedObjectMutableBuilder[Self <: EmbeddedObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEmbeddedDrawingProperties(value: js.Any): Self = StObject.set(x, "embeddedDrawingProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedDrawingPropertiesUndefined: Self = StObject.set(x, "embeddedDrawingProperties", js.undefined)
    
    @scala.inline
    def setEmbeddedObjectBorder(value: EmbeddedObjectBorder): Self = StObject.set(x, "embeddedObjectBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedObjectBorderUndefined: Self = StObject.set(x, "embeddedObjectBorder", js.undefined)
    
    @scala.inline
    def setImageProperties(value: ImageProperties): Self = StObject.set(x, "imageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePropertiesUndefined: Self = StObject.set(x, "imageProperties", js.undefined)
    
    @scala.inline
    def setLinkedContentReference(value: LinkedContentReference): Self = StObject.set(x, "linkedContentReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedContentReferenceUndefined: Self = StObject.set(x, "linkedContentReference", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: Dimension): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Dimension): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: Dimension): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Dimension): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
