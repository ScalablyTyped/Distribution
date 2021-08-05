package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedObject extends StObject {
  
  /** The description of the embedded object. The `title` and `description` are both combined to display alt text. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The properties of an embedded drawing. */
  var embeddedDrawingProperties: js.UndefOr[js.Any] = js.undefined
  
  /** The border of the embedded object. */
  var embeddedObjectBorder: js.UndefOr[EmbeddedObjectBorder] = js.undefined
  
  /** The properties of an image. */
  var imageProperties: js.UndefOr[ImageProperties] = js.undefined
  
  /**
    * A reference to the external linked source content. For example, it contains a reference to the source Sheets chart when the embedded object is a linked chart. If unset, then the
    * embedded object is not linked.
    */
  var linkedContentReference: js.UndefOr[LinkedContentReference] = js.undefined
  
  /** The bottom margin of the embedded object. */
  var marginBottom: js.UndefOr[Dimension] = js.undefined
  
  /** The left margin of the embedded object. */
  var marginLeft: js.UndefOr[Dimension] = js.undefined
  
  /** The right margin of the embedded object. */
  var marginRight: js.UndefOr[Dimension] = js.undefined
  
  /** The top margin of the embedded object. */
  var marginTop: js.UndefOr[Dimension] = js.undefined
  
  /** The visible size of the image after cropping. */
  var size: js.UndefOr[Size] = js.undefined
  
  /** The title of the embedded object. The `title` and `description` are both combined to display alt text. */
  var title: js.UndefOr[String] = js.undefined
}
object EmbeddedObject {
  
  inline def apply(): EmbeddedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObject]
  }
  
  extension [Self <: EmbeddedObject](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEmbeddedDrawingProperties(value: js.Any): Self = StObject.set(x, "embeddedDrawingProperties", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedDrawingPropertiesUndefined: Self = StObject.set(x, "embeddedDrawingProperties", js.undefined)
    
    inline def setEmbeddedObjectBorder(value: EmbeddedObjectBorder): Self = StObject.set(x, "embeddedObjectBorder", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedObjectBorderUndefined: Self = StObject.set(x, "embeddedObjectBorder", js.undefined)
    
    inline def setImageProperties(value: ImageProperties): Self = StObject.set(x, "imageProperties", value.asInstanceOf[js.Any])
    
    inline def setImagePropertiesUndefined: Self = StObject.set(x, "imageProperties", js.undefined)
    
    inline def setLinkedContentReference(value: LinkedContentReference): Self = StObject.set(x, "linkedContentReference", value.asInstanceOf[js.Any])
    
    inline def setLinkedContentReferenceUndefined: Self = StObject.set(x, "linkedContentReference", js.undefined)
    
    inline def setMarginBottom(value: Dimension): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginLeft(value: Dimension): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginRight(value: Dimension): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    inline def setMarginTop(value: Dimension): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
