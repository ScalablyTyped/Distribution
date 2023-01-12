package typings.officeJsPreview.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Shape object, for use in `shape.set({ ... })`. */
trait ShapeUpdateData extends StObject {
  
  /**
    * Specifies the height, in points, of the shape. Throws an `InvalidArgument` exception when set with a negative value.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance, in points, from the left side of the shape to the left side of the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the name of this shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The distance, in points, from the top edge of the shape to the top edge of the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the width, in points, of the shape. Throws an `InvalidArgument` exception when set with a negative value.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ShapeUpdateData {
  
  inline def apply(): ShapeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeUpdateData] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
