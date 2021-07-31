package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shape extends StObject {
  
  /**
    * Placeholders are shapes that are inherit from corresponding placeholders on layouts and masters. If set, the shape is a placeholder shape and any inherited properties can be
    * resolved by looking at the parent placeholder identified by the Placeholder.parent_object_id field.
    */
  var placeholder: js.UndefOr[Placeholder] = js.undefined
  
  /** The properties of the shape. */
  var shapeProperties: js.UndefOr[ShapeProperties] = js.undefined
  
  /** The type of the shape. */
  var shapeType: js.UndefOr[String] = js.undefined
  
  /** The text content of the shape. */
  var text: js.UndefOr[TextContent] = js.undefined
}
object Shape {
  
  @scala.inline
  def apply(): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shape]
  }
  
  @scala.inline
  implicit class ShapeMutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaceholder(value: Placeholder): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setShapeProperties(value: ShapeProperties): Self = StObject.set(x, "shapeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapePropertiesUndefined: Self = StObject.set(x, "shapeProperties", js.undefined)
    
    @scala.inline
    def setShapeType(value: String): Self = StObject.set(x, "shapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeTypeUndefined: Self = StObject.set(x, "shapeType", js.undefined)
    
    @scala.inline
    def setText(value: TextContent): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
