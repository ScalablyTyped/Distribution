package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Width extends StObject {
  
  var Height: String
  
  var Width: String
}
object Width {
  
  @scala.inline
  def apply(Height: String, Width: String): Width = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
  
  @scala.inline
  implicit class WidthMutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
