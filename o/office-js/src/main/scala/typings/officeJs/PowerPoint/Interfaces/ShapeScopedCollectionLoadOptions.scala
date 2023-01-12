package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of shapes.
  *
  * @remarks
  * [Api set: PowerPointApi 1.3]
  */
trait ShapeScopedCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Returns the fill formatting of this shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var fill: js.UndefOr[ShapeFillLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the height, in points, of the shape. Throws an `InvalidArgument` exception when set with a negative value.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the unique ID of the shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The distance, in points, from the left side of the shape to the left side of the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Returns the line formatting of this shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var lineFormat: js.UndefOr[ShapeLineFormatLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the name of this shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Returns the text frame object of this shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var textFrame: js.UndefOr[TextFrameLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The distance, in points, from the top edge of the shape to the top edge of the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Returns the type of this shape. See {@link PowerPoint.ShapeType} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the width, in points, of the shape. Throws an `InvalidArgument` exception when set with a negative value.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}
object ShapeScopedCollectionLoadOptions {
  
  inline def apply(): ShapeScopedCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeScopedCollectionLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeScopedCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setFill(value: ShapeFillLoadOptions): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLineFormat(value: ShapeLineFormatLoadOptions): Self = StObject.set(x, "lineFormat", value.asInstanceOf[js.Any])
    
    inline def setLineFormatUndefined: Self = StObject.set(x, "lineFormat", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTextFrame(value: TextFrameLoadOptions): Self = StObject.set(x, "textFrame", value.asInstanceOf[js.Any])
    
    inline def setTextFrameUndefined: Self = StObject.set(x, "textFrame", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
