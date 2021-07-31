package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPageSize
  extends StObject
     with PageSize {
  
  var height: Double | auto
  
  var width: Double
}
object CustomPageSize {
  
  @scala.inline
  def apply(height: Double | auto, width: Double): CustomPageSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPageSize]
  }
  
  @scala.inline
  implicit class CustomPageSizeMutableBuilder[Self <: CustomPageSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double | auto): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
