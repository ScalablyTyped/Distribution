package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderStyle extends StObject {
  
  var borderStyle: String = js.native
  
  var padding: Double = js.native
}
object BorderStyle {
  
  @scala.inline
  def apply(borderStyle: String, padding: Double): BorderStyle = {
    val __obj = js.Dynamic.literal(borderStyle = borderStyle.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderStyle]
  }
  
  @scala.inline
  implicit class BorderStyleMutableBuilder[Self <: BorderStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
