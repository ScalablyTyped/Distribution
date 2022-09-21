package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the shape collection that raised the SelectionChanged event.
  *
  * [Api set:  1.1]
  */
trait SelectionChangedEventArgs extends StObject {
  
  /**
    *
    * Gets the name of the page which has the ShapeCollection object that raised the SelectionChanged event.
    *
    * [Api set:  1.1]
    */
  var pageName: String
  
  /**
    *
    * Gets the array of shape names that raised the SelectionChanged event.
    *
    * [Api set:  1.1]
    */
  var shapeNames: js.Array[String]
}
object SelectionChangedEventArgs {
  
  inline def apply(pageName: String, shapeNames: js.Array[String]): SelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(pageName = pageName.asInstanceOf[js.Any], shapeNames = shapeNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionChangedEventArgs]
  }
  
  extension [Self <: SelectionChangedEventArgs](x: Self) {
    
    inline def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
    
    inline def setShapeNames(value: js.Array[String]): Self = StObject.set(x, "shapeNames", value.asInstanceOf[js.Any])
    
    inline def setShapeNamesVarargs(value: String*): Self = StObject.set(x, "shapeNames", js.Array(value*))
  }
}
