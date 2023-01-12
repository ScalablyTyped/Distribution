package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPageSize
  extends StObject
     with PageSize {
  
  /**
    * Page height in `pt`, or `auto` to adapt the page height to the document's content
    * (the document will always have a single page).
    */
  var height: Double | auto
  
  /**
    * Page width in `pt`.
    */
  var width: Double
}
object CustomPageSize {
  
  inline def apply(height: Double | auto, width: Double): CustomPageSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPageSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomPageSize] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double | auto): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
