package typings.officeJs.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the available options when adding shapes.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
trait ShapeAddOptions extends StObject {
  
  /**
    * Specifies the height, in points, of the shape.
    When not provided, a default value will be used.
    Throws an `InvalidArgument` exception when set with a negative value.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the distance, in points, from the left side of the shape to the left side of the slide.
    When not provided, a default value will be used.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the distance, in points, from the top edge of the shape to the top edge of the slide.
    When not provided, a default value will be used.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the width, in points, of the shape.
    When not provided, a default value will be used.
    Throws an `InvalidArgument` exception when set with a negative value.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ShapeAddOptions {
  
  inline def apply(): ShapeAddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeAddOptions]
  }
  
  extension [Self <: ShapeAddOptions](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
