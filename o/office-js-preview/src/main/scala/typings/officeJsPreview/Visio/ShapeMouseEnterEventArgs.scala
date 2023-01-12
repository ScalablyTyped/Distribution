package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the shape that raised the ShapeMouseEnter event.
  *
  * [Api set:  1.1]
  */
trait ShapeMouseEnterEventArgs extends StObject {
  
  /**
    *
    * Gets the name of the page which has the shape object that raised the ShapeMouseEnter event.
    *
    * [Api set:  1.1]
    */
  var pageName: String
  
  /**
    *
    * Gets the name of the shape object that raised the ShapeMouseEnter event.
    *
    * [Api set:  1.1]
    */
  var shapeName: String
}
object ShapeMouseEnterEventArgs {
  
  inline def apply(pageName: String, shapeName: String): ShapeMouseEnterEventArgs = {
    val __obj = js.Dynamic.literal(pageName = pageName.asInstanceOf[js.Any], shapeName = shapeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeMouseEnterEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeMouseEnterEventArgs] (val x: Self) extends AnyVal {
    
    inline def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
    
    inline def setShapeName(value: String): Self = StObject.set(x, "shapeName", value.asInstanceOf[js.Any])
  }
}
